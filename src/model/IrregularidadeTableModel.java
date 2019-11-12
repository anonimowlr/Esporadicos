package model;

import entidades.Fiscalizar;
import entidades.Irregularidade;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import util.Utils;


public class IrregularidadeTableModel extends AbstractTableModel {

    private List<Irregularidade> dados = new ArrayList<>();
    private String[] colunas = {"PROTOCOLO","ETAPA", "DATA_ETAPA", "OBS","DATA_ENVIO", "NUMERO_MENSAGEM", "SIT. SERVIÇO TÉCNICO"};

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
                return dados.get(linha).getEtapaAtual();
            case 2:
                return Utils.convertDateToString(dados.get(linha).getDtEtpAtual());
                

            case 3:
                return dados.get(linha).getObs();

            case 4:
                return  Utils.convertDateToString(dados.get(linha).getDataEnvioCorreio());

            case 5:
                return dados.get(linha).getNumeroCorreio();
            case 6:
                return dados.get(linha).getSituacaoGst();

           

            
           

        }
        return null;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void addRow(Irregularidade s) {

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

            case 3:
                dados.get(linha).setObs((String) valor);
                break;

            case 5:
                dados.get(linha).setNumeroCorreio((String) valor);
                break;
          

        }

        fireTableRowsUpdated(linha, linha);

    }

}
