/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.paz1c.debilnicek;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kriza
 */
public class SuborovyUlohaDaoTest {
    
    public SuborovyUlohaDaoTest() {
    }

    @Test
    public void testDajUlohy() {
        System.out.println("dajUlohy");
        SuborovyUlohaDao instance = new SuborovyUlohaDao();
        
        List<Uloha> result = instance.dajUlohy();
        assertEquals(2, result.size());
    }
    
}
