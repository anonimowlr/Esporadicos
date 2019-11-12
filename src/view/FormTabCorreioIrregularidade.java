/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import dao.FiscalizacaoDAO;
import dao.IrregularidadeDAO;
import entidades.Fiscalizar;
import entidades.Irregularidade;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import model.FiscalizacaoTableModel;
import model.IrregularidadeTableModel;

import util.Utils;

/**
 *
 * @author PC_LENOVO
 */
public class FormTabCorreioIrregularidade extends javax.swing.JFrame {

    IrregularidadeDAO d = new IrregularidadeDAO();

    IrregularidadeTableModel tableModel = new IrregularidadeTableModel();

    public FormTabCorreioIrregularidade(java.awt.Frame parent, boolean modal) {
        super();

        Utils.setPropriedades();
        initComponents();

        URL caminhoIcone = getClass().getResource("/imagens/banco do brasil.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcone);
        this.setIconImage(iconeTitulo);

        JTTarifa.setModel(tableModel);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTTarifa = new javax.swing.JTable();
        lblUsuario = new javax.swing.JLabel();
        txtProtocolo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        JTTarifa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        JTTarifa.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        JTTarifa.setGridColor(new java.awt.Color(153, 153, 255));
        JTTarifa.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JTTarifaMouseMoved(evt);
            }
        });
        JTTarifa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTTarifaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JTTarifaMouseExited(evt);
            }
        });
        JTTarifa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTTarifaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(JTTarifa);

        lblUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtProtocolo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProtocoloActionPerformed(evt);
            }
        });
        txtProtocolo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProtocoloKeyPressed(evt);
            }
        });

        jLabel2.setText("Consultar Protocolo:");

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblUsuario)
                        .addGap(89, 89, 89))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtProtocolo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addContainerGap(351, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsuario)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtProtocolo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                .addGap(39, 39, 39))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2, txtProtocolo});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

      
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        JTTarifa.setAutoResizeMode(JTTarifa.AUTO_RESIZE_ALL_COLUMNS);
        JTTarifa.getColumnModel().getColumn(0).setPreferredWidth(200);
        JTTarifa.getColumnModel().getColumn(1).setPreferredWidth(200);
        JTTarifa.getColumnModel().getColumn(2).setPreferredWidth(200);           //var
        JTTarifa.getColumnModel().getColumn(3).setPreferredWidth(200);
        JTTarifa.getColumnModel().getColumn(4).setPreferredWidth(200);
       
        

        List<Irregularidade> lista = d.buscarTudo();
        for (Irregularidade s : lista) {
            
            tableModel.addRow(s);
            
        }


    }//GEN-LAST:event_formWindowOpened

    private void JTTarifaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTTarifaMouseClicked
        tableModel.isCellEditable(JTTarifa.getSelectedRow(), JTTarifa.getSelectedColumn());
        tableModel.setValueAt(tableModel.getValueAt(JTTarifa.getSelectedRow(), JTTarifa.getSelectedColumn()), JTTarifa.getSelectedRow(), JTTarifa.getSelectedColumn());

    }//GEN-LAST:event_JTTarifaMouseClicked

    private void JTTarifaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTTarifaMouseMoved

    }//GEN-LAST:event_JTTarifaMouseMoved

    private void JTTarifaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTTarifaMouseExited

    }//GEN-LAST:event_JTTarifaMouseExited

    private void txtProtocoloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProtocoloKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            
            if(txtProtocolo.getText().equals("")){
                return;
            }
            
            JTTarifa.setAutoResizeMode(JTTarifa.AUTO_RESIZE_ALL_COLUMNS);
            JTTarifa.getColumnModel().getColumn(0).setPreferredWidth(200);

            JTTarifa.getColumnModel().getColumn(1).setPreferredWidth(200);
            JTTarifa.getColumnModel().getColumn(2).setPreferredWidth(200);
            JTTarifa.getColumnModel().getColumn(3).setPreferredWidth(200);
            JTTarifa.getColumnModel().getColumn(4).setPreferredWidth(200);
          
            String protocolo = txtProtocolo.getText();
            int qtdLinha = tableModel.getRowCount();

            while (qtdLinha > 0) {
                tableModel.removeRow(0);
                qtdLinha = tableModel.getRowCount();
            }

            List<Irregularidade> lista = d.consultaPorProtocolo(Integer.parseInt(protocolo));
            for (Irregularidade s : lista) {
                
                tableModel.addRow(s);
                
            }

        }

    }//GEN-LAST:event_txtProtocoloKeyPressed

    private void JTTarifaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTTarifaKeyPressed
        if (evt.getKeyCode() != evt.VK_ENTER) {
            return;

        }

        if (JTTarifa.getSelectedRow() == -1) {

            return;
        }

        int codigo = (int) tableModel.getValueAt(JTTarifa.getSelectedRow(), 0);
       String nomeColuna = tableModel.getColumnName(JTTarifa.getSelectedColumn());
       String valorCelula = tableModel.getValueAt(JTTarifa.getSelectedRow(), JTTarifa.getSelectedColumn()).toString();
       

    }//GEN-LAST:event_JTTarifaKeyPressed

    private void txtProtocoloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProtocoloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProtocoloActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        
        if(txtProtocolo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Informe o numero do protocolo GSV!!!");
            
            return;
        }
        
        
            JTTarifa.setAutoResizeMode(JTTarifa.AUTO_RESIZE_ALL_COLUMNS);
            JTTarifa.getColumnModel().getColumn(0).setPreferredWidth(200);

            JTTarifa.getColumnModel().getColumn(1).setPreferredWidth(200);
            JTTarifa.getColumnModel().getColumn(2).setPreferredWidth(200);
            JTTarifa.getColumnModel().getColumn(3).setPreferredWidth(200);
            JTTarifa.getColumnModel().getColumn(4).setPreferredWidth(200);
            
          
            String protocolo = txtProtocolo.getText();
            int qtdLinha = tableModel.getRowCount();

            while (qtdLinha > 0) {
                tableModel.removeRow(0);
                qtdLinha = tableModel.getRowCount();
            }

            List<Irregularidade> lista = d.consultaPorProtocolo(Integer.parseInt(protocolo));
            for (Irregularidade s : lista) {
                
                tableModel.addRow(s);
                
            }

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

             JTTarifa.setAutoResizeMode(JTTarifa.AUTO_RESIZE_ALL_COLUMNS);
            JTTarifa.getColumnModel().getColumn(0).setPreferredWidth(200);

            JTTarifa.getColumnModel().getColumn(1).setPreferredWidth(200);
            JTTarifa.getColumnModel().getColumn(2).setPreferredWidth(200);
            JTTarifa.getColumnModel().getColumn(3).setPreferredWidth(200);
            JTTarifa.getColumnModel().getColumn(4).setPreferredWidth(200);
        
       

        int qtdLinha = tableModel.getRowCount();

        while (qtdLinha > 0) {
            tableModel.removeRow(0);
            qtdLinha = tableModel.getRowCount();
        }

        List<Irregularidade> lista = d.buscarTudo();
        for (Irregularidade s : lista) {
            
            tableModel.addRow(s);
            
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormTabCorreioIrregularidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTabCorreioIrregularidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTabCorreioIrregularidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTabCorreioIrregularidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormTabCorreioIrregularidade dialog = new FormTabCorreioIrregularidade(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTTarifa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtProtocolo;
    // End of variables declaration//GEN-END:variables
}
