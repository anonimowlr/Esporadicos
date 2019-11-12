package model;

import entidades.Fiscalizar;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import util.Utils;


public class FiscalizacaoTableModel extends AbstractTableModel {

    private List<Fiscalizar> dados = new ArrayList<>();
    private String[] colunas = {"PROTOCOLO", "OBS","DATA_ENVIO", "NUMERO_MENSAGEM"};

    @Override
    public String getColumnName(int colunm) {
        return colunas[colunm];
    }

    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna) {

            case 0:
                return dados.get(linha).getCdPrc();

            case 1:
                return dados.get(linha).getObs();

            case 2:
                return  Utils.convertDateToString(dados.get(linha).getDataEnvioCorreio());

            case 3:
                return dados.get(linha).getNumeroCorreio();

           

            
           

        }
        return null;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void addRow(Fiscalizar s) {

        dados.add(s);
        fireTableDataChanged();

    }

    public void removeRow(int linha) {
        dados.remove(linha);
        fireTableRowsDeleted(linha, linha);
       

    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {

        return true;

    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {

        switch (coluna) {

            case 1:
                dados.get(linha).setObs((String) valor);
                break;

            case 3:
                dados.get(linha).setNumeroCorreio((String) valor);
                break;
          

        }

        fireTableRowsUpdated(linha, linha);

    }

}
