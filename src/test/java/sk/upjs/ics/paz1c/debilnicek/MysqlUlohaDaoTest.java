/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.paz1c.debilnicek;

import com.mysql.cj.jdbc.*;
import java.util.List;
import javax.sql.DataSource;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author kriza
 */
public class MysqlUlohaDaoTest {

    public MysqlUlohaDaoTest() {
    }

    @Test
    public void testDajUlohy() {
        System.out.println("dajUlohy");
        UlohaDao instance = UlohaDaoFactory.INSTANCE.getUlohaDao();
        List<Uloha> result = instance.dajUlohy();
        System.out.println(result.get(0).getPopis());
        assertTrue(result.size() > 0);
    }

}
