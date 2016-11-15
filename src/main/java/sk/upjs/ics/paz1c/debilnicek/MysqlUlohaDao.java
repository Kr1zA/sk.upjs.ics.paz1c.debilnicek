package sk.upjs.ics.paz1c.debilnicek;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class MysqlUlohaDao implements UlohaDao {

    private JdbcTemplate jdbcTemplate;

    public MysqlUlohaDao(JdbcTemplate jDBCTemplate) {
        this.jdbcTemplate = jDBCTemplate;
    }

    @Override
    public List<Uloha> dajUlohy() {
        String sql = "SELECT id,popis,termin,stav FROM debilnicek.uloha;";
        return jdbcTemplate.query(sql, new UlohaRowMapper());
    }

    @Override
    public void pridaj(Uloha novaUloha) {
        jdbcTemplate.update("INSERT INTO uloha (popis, termin, stav) VALUES(?, ?, ?)",
                novaUloha.getPopis(), novaUloha.getTermin(), novaUloha.isStav());
    }

    private class UlohaRowMapper implements RowMapper<Uloha> {

        @Override
        public Uloha mapRow(ResultSet rs, int i) throws SQLException {
            Uloha uloha = new Uloha();
            uloha.setId(rs.getLong("id"));
            uloha.setPopis(rs.getString("popis"));
            uloha.setStav(rs.getBoolean("stav"));
            uloha.setTermin(rs.getDate("termin"));
            return uloha;
        }

    }
}
