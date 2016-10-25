package sk.upjs.ics.paz1c.debilnicek;

import java.util.Date;
import javax.swing.table.AbstractTableModel;

public class UlohaTabModel extends AbstractTableModel {

    private UlohaDao ulohaDao = UlohaDaoFactory.INSTANCE.getUlohaDao();

    private static final String[] NAZVY_STLPCOV = {"Popis", "Termin", "Stav"};

    private static  final int POCET_STLPCOV = NAZVY_STLPCOV.length;

    @Override
    public int getRowCount() {
        return ulohaDao.dajUlohy().size();
    }

    @Override
    public int getColumnCount() {
        return POCET_STLPCOV;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Uloha uloha = ulohaDao.dajUlohy().get(rowIndex);
        switch (columnIndex) {
            case 0:
                return uloha.getPopis();
            case 1:
                Date termin = uloha.getTermin();
                if (termin == null) {
                    return "ziadny";
                } else {
                    return termin;
                }
            case 2:
                return uloha.isStav();
            default:
                return "???";
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 2) {
            return Boolean.class;
        }

        return super.getColumnClass(columnIndex);
    }

    @Override
    public String getColumnName(int columnIndex) {
        return super.getColumnName(columnIndex);
    }

    void aktualizovat() {
        fireTableDataChanged();
    }

}
