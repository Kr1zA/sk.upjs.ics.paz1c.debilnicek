package sk.upjs.ics.paz1c.debilnicek;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SuborovyUlohaDao implements UlohaDao {

    @Override
    public List<Uloha> dajUlohy() {
        List<Uloha> ulohyNaUlozenie = new ArrayList<Uloha>();

        try (Scanner scanner = new Scanner(new File("ulohy.txt"))) {
            while (scanner.hasNextLine()) {
                String riadok = scanner.nextLine();
                String[] polozky = riadok.split(";");
                //System.out.println(Arrays.toString(polozky));
                Uloha uloha = new Uloha();
                uloha.setPopis(polozky[0]);
                ulohyNaUlozenie.add(uloha);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return ulohyNaUlozenie;
    }
//test
    @Override
    public void pridaj(Uloha novaUloha) {
        try (FileWriter writer = new FileWriter(new File("ulohy.txt"), true)) {
            writer.append(novaUloha.getPopis() + ";" + "11.10.2016;" + novaUloha.isStav() + "\n");
            //TODO zapisovat aktualny datum
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
