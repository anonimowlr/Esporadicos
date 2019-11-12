/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import rotinasportal.ColetaAjureResponsavel;
import rotinasportal.ColetaAssunto;
import rotinasportal.ColetaSituacaoServTecnico;
import rotinasportal.ColetaTJSC;
import rotinasportal.ColetaValorCausa;
import rotinassisbb.ColetaSituacaoPartida;
import rotinassisbb.ColetarSaldoDeb;
import rotinassisbb.EnviaCorreioSisbb;
import rotinassisbb.EnviaCorreioSisbbIrregularidade;
import rotinassisbb.GerarPartidataEGT;
import sisbbgeneric.Janela3270;
import util.Utils;

/**
 *
 * @author F4618689
 */
public class FormPrincipal extends javax.swing.JFrame {

    


    /**
     * Creates new form Tela
     */
    public FormPrincipal() {
        super();
        //Utils.setPropriedades();
        initComponents();

        URL caminhoIcone = getClass().getResource("/imagens/banco do brasil.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcone);
        this.setIconImage(iconeTitulo);
        

    }

    public void setPropriedades() {

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(FormPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem29 = new javax.swing.JMenuItem();
        jMenu15 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jPanel14 = new javax.swing.JPanel();
        icone5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        label7 = new java.awt.Label();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtAviso = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();

        jMenuItem29.setText("jMenuItem29");

        jMenu15.setText("jMenu15");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable);

        jMenu1.setText("jMenu1");

        jMenuItem8.setText("jMenuItem8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel14.setBackground(new java.awt.Color(24, 42, 69));

        icone5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icone5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bb.jpg"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(248, 209, 23));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Cenop Serviços Curitiba");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        label7.setAlignment(java.awt.Label.RIGHT);
        label7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label7.setForeground(new java.awt.Color(248, 209, 23));
        label7.setText("#interna");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Capturas e rotinas esporádicas");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Versão 1.0");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(icone5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel14Layout.createSequentialGroup()
                            .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel8))
                        .addComponent(icone5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        txtAviso.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        txtAviso.setForeground(new java.awt.Color(0, 0, 204));
        txtAviso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAviso.setAlignmentX(1.0F);
        txtAviso.setAlignmentY(2.0F);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        jMenu3.setText("Iniciar");

        jMenuItem2.setText("Capturar Advogado");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem1.setText("Coleta Valor Causa  NPJ  - ATVD CAD.");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem3.setText("Coletar saldo deb contabilização 23-03-2019");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Contabilizar Deb base 22-03-2019");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("Coletar sit egt");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Coleta Assunto/Origem CDC");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setText("Enviar Correio Sisbb Fisc. Validar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem11.setText("Enviar Correio Sisbb Fis. Trat. Irregularidade");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        jMenuItem12.setText("Coleta subcontas TJSC");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Relatórios");

        jMenuItem9.setText("Correios enviados Fiscalização Validar");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuItem10.setText("Correios Sisbb Fiscalização Tratar Irregulariades");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(538, 538, 538)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(txtAviso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(txtAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
      
        Thread thread = new Thread() {
            public void run() { // colocar rotina em try-catch
             
               try{
                   ColetaAjureResponsavel coletaAjureResponsavel = new ColetaAjureResponsavel();
                   txtAviso.setText("Consultando Portal Jurídico");
                   coletaAjureResponsavel.iniciar();
                   txtAviso.setText("Enviando Correio ....");
                   
                   
                   
                    txtAviso.setText("");
                    JOptionPane.showMessageDialog(null, "Fim de rotina");
                    
                   
                   
                   
                   
               }catch(Exception e){
                   JOptionPane.showMessageDialog(null, "Erro: " + e );
                   txtAviso.setText("");
               } catch (Throwable ex) {
                 JOptionPane.showMessageDialog(null, "Erro: " + ex );
                   txtAviso.setText("");
               
               }
                
            }
        };
        thread.start();
        txtAviso.setText("");

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      
        
         Thread thread = new Thread() {
            public void run() { // colocar rotina em try-catch
             
               try{
                   ColetaValorCausa coletaValorCausa = new ColetaValorCausa();
                   txtAviso.setText("Consultando Portal Jurídico");
                   coletaValorCausa.iniciar();
                   
                   
                   
                   
                    txtAviso.setText("");
                    JOptionPane.showMessageDialog(null, "Fim de rotina");
                    
                   
                   
                   
                   
               }catch(Exception e){
                   JOptionPane.showMessageDialog(null, "Erro: " + e );
                   txtAviso.setText("");
               } catch (Throwable ex) {
                 JOptionPane.showMessageDialog(null, "Erro: " + ex );
                   txtAviso.setText("");
               
               }
                
            }
        };
        thread.start();
        txtAviso.setText("");
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       
         Thread thread = new Thread() {

            public void run() {//double a, String b, int c, Date k
                try {
                    
                   
                    
                   Janela3270 sisbb = new Janela3270();
                   sisbb.setTamanho(700, 500);
                   
                   ColetarSaldoDeb coletaSisbb = new ColetarSaldoDeb();
                   
                   coletaSisbb.inicioRotinaSisbb(sisbb, "Deb");
                   
                   
                   
//                    ColetaSaldoDjoBaseWeb t = new ColetaSaldoDjoBaseWeb();
//                    PropriedadesPadraoSISBB sis = new PropriedadesPadraoSISBB();
//                    t.inicioRotinaSisbb(sisbb, "DJO");//, a, b, c, k
                    sisbb.rotinaEncerramento();

                    JOptionPane.showMessageDialog(null, "Captura Finalizada com Sucesso!");
                } catch (Throwable ex) {
                    Logger.getLogger(FormPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        };
        thread.start();


        
        
        
        
        
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       
         Thread thread = new Thread() {

            public void run() {//double a, String b, int c, Date k
                try {
                    
                   
                    
                   Janela3270 sisbb = new Janela3270();
                   sisbb.setTamanho(700, 500);
                   
                    GerarPartidataEGT coletaSisbb = new GerarPartidataEGT();
                   
                    coletaSisbb.inicioRotinaSisbb(sisbb, "EGT");
                   
                   
                   
//                    ColetaSaldoDjoBaseWeb t = new ColetaSaldoDjoBaseWeb();
//                    PropriedadesPadraoSISBB sis = new PropriedadesPadraoSISBB();
//                    t.inicioRotinaSisbb(sisbb, "DJO");//, a, b, c, k
                    sisbb.rotinaEncerramento();

                    JOptionPane.showMessageDialog(null, "Captura Finalizada com Sucesso!");
                } catch (Throwable ex) {
                    Logger.getLogger(FormPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        };
        thread.start();


        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Thread thread = new Thread() {

            public void run() {//double a, String b, int c, Date k
                try {
                    
                   
                    
                   Janela3270 sisbb = new Janela3270();
                   sisbb.setTamanho(700, 500);
                   
                    ColetaSituacaoPartida coletaSisbb = new ColetaSituacaoPartida();
                   
                    coletaSisbb.inicioRotinaSisbb(sisbb, "EGT");
                   
                   
                   
//                    ColetaSaldoDjoBaseWeb t = new ColetaSaldoDjoBaseWeb();
//                    PropriedadesPadraoSISBB sis = new PropriedadesPadraoSISBB();
//                    t.inicioRotinaSisbb(sisbb, "DJO");//, a, b, c, k
                    sisbb.rotinaEncerramento();

                    JOptionPane.showMessageDialog(null, "Captura Finalizada com Sucesso!");
                } catch (Throwable ex) {
                    Logger.getLogger(FormPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        };
        thread.start();


    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
     
         Thread thread = new Thread() {
            public void run() { // colocar rotina em try-catch
             
               try{
                   ColetaAssunto coletaAssunto = new ColetaAssunto();
                   txtAviso.setText("Consultando Portal Jurídico");
                   coletaAssunto.iniciar();
                   txtAviso.setText("Enviando Correio ....");
                   
                   
                   
                    txtAviso.setText("");
                    JOptionPane.showMessageDialog(null, "Fim de rotina");
                    
                   
                   
                   
                   
               }catch(Exception e){
                   JOptionPane.showMessageDialog(null, "Erro: " + e );
                   txtAviso.setText("");
               } catch (Throwable ex) {
                 JOptionPane.showMessageDialog(null, "Erro: " + ex );
                   txtAviso.setText("");
               
               }
                
            }
        };
        thread.start();
        txtAviso.setText("");
        
        
        
        
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
       
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    Janela3270 sisbb = new Janela3270();
                    sisbb.setTamanho(700, 500);
                    EnviaCorreioSisbb t = new EnviaCorreioSisbb();
                    t.inicioRotinaSisbb(sisbb, "CORREIO");

                    sisbb.rotinaEncerramento();

                    JOptionPane.showMessageDialog(null, "Envio de correio sisbb Concluído!");
                } catch (Throwable ex) {
                    Logger.getLogger(FormPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        };
        thread.start();
        
        
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
       FormTabCorreioFiscalizacao f = new FormTabCorreioFiscalizacao(this, rootPaneCheckingEnabled);
       f.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
         FormTabCorreioIrregularidade f = new FormTabCorreioIrregularidade(this, rootPaneCheckingEnabled);
         f.setVisible(true);


    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
       
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                   
                    ColetaSituacaoServTecnico c = new ColetaSituacaoServTecnico();
                    c.iniciar();
                    
                    Janela3270 sisbb = new Janela3270();
                    sisbb.setTamanho(700, 500);
                    EnviaCorreioSisbbIrregularidade t = new EnviaCorreioSisbbIrregularidade();
                    t.inicioRotinaSisbb(sisbb, "CORREIO");

                    sisbb.rotinaEncerramento();
                    

                    JOptionPane.showMessageDialog(null, "Envio de correio sisbb Concluído!");
                } catch (Throwable ex) {
                    Logger.getLogger(FormPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        };
        thread.start();
        
        
        
        
        
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed

        
            ColetaTJSC coletaTjsc = new ColetaTJSC();
        try {
            coletaTjsc.iniciar();
        } catch (Throwable ex) {
            Logger.getLogger(FormPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        

    }//GEN-LAST:event_jMenuItem12ActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel icone5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTable1;
    private java.awt.Label label7;
    private javax.swing.JLabel txtAviso;
    // End of variables declaration//GEN-END:variables
}
