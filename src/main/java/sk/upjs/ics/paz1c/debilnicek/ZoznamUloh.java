package sk.upjs.ics.paz1c.debilnicek;

import java.util.*;

class ZoznamUloh implements UlohaDao {

    private List<Uloha> ulohy = new ArrayList<Uloha>();

    public ZoznamUloh() {
        Uloha uloha1 = new Uloha();
        uloha1.setPopis("Programovat test");
        uloha1.setTermin(new Date(2016 - 1999, Calendar.SEPTEMBER, 28));

        ulohy.add(uloha1);

        Uloha uloha2 = new Uloha();
        uloha2.setPopis("Naprog pouz roz");
        uloha2.setTermin(new Date(2016 - 1999, Calendar.OCTOBER, 5));

        ulohy.add(uloha2);
    }

    public List<Uloha> dajUlohy() {
        return ulohy;
    }

    public void pridaj(Uloha uloha) {
        ulohy.add(uloha);
    }

    List<Uloha> dajDoTerminu(Date date) {
        List<Uloha> ulohyDoTerminu = new ArrayList<>();
        for (Uloha uloha : ulohy) {
            if (uloha.getTermin().before(date)) {
                ulohyDoTerminu.add(uloha);
            }
        }
        return ulohyDoTerminu;
    }

}
