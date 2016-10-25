package sk.upjs.ics.paz1c.debilnicek;

import java.util.List;

public interface UlohaDao {

    List<Uloha> dajUlohy();
//test
    void pridaj(Uloha novaUloha);

}
