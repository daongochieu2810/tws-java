package twsjava.samples.apidemo;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import twsjava.lib.client.HistoricalTick;

class HistoricalTickModel extends AbstractTableModel {

    private List<HistoricalTick> m_rows;

    public HistoricalTickModel(List<HistoricalTick> rows) {
        m_rows = rows;
    }

    @Override
    public int getRowCount() {
        return m_rows.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        HistoricalTick row = m_rows.get(rowIndex);

        switch (columnIndex) {
            case 0: return row.time();
            case 1: return row.price();
            case 2: return row.size();
        }

        return null;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Time";
            case 1: return "Price";
            case 2: return "Size";
        }

        return super.getColumnName(column);
    }

}
