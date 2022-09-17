/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import dao.UsuarioDAO;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.CanaisDTO;

/**
 *
 * @author debor
 */
public class frmListaGUI extends javax.swing.JFrame {

    /**
     * Creates new form visual_canal
     */
    public frmListaGUI() {
        initComponents();
        ListarValoresCanais();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCanais = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        CarID = new javax.swing.JTextField();
        CarToken = new javax.swing.JTextField();
        CarNome = new javax.swing.JTextField();
        CarUsuario = new javax.swing.JTextField();
        CarCanal = new javax.swing.JTextField();
        CarTipo = new javax.swing.JTextField();
        CarSenha = new javax.swing.JTextField();
        btnCarregar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setToolTipText("");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, -1, -1));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 620, -1, -1));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, -1, -1));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, -1, -1));

        jLabel15.setAutoscrolls(true);
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 560, -1, -1));
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, -1, -1));

        jLabel19.setToolTipText("");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 620, -1, -1));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, -1, -1));
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 560, -1, -1));
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 560, -1, -1));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 620, -1, -1));

        btnAdicionar.setText("Adicionar");
        btnAdicionar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 0)));
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 70, 30));

        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 0)));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 490, 70, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("    VISUALIZAR CANAIS");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 102, 0)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 490, 80));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 750, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 710, -1, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 720, -1, -1));

        tabelaCanais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Canal", "Tipo", "Usuario", "Senha", "Token"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaCanais);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 710, 190));

        btnVoltar.setText("Voltar");
        btnVoltar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 0)));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 640, 80, 30));

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 0)));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 70, 30));

        CarID.setEditable(false);
        getContentPane().add(CarID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 70, -1));

        CarToken.setEditable(false);
        getContentPane().add(CarToken, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 500, 80, -1));

        CarNome.setEditable(false);
        getContentPane().add(CarNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 90, -1));

        CarUsuario.setEditable(false);
        getContentPane().add(CarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, 90, -1));

        CarCanal.setEditable(false);
        getContentPane().add(CarCanal, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 80, -1));

        CarTipo.setEditable(false);
        getContentPane().add(CarTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, 80, -1));

        CarSenha.setEditable(false);
        getContentPane().add(CarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 500, 80, -1));

        btnCarregar.setText("Carregar dados");
        btnCarregar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 0)));
        btnCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCarregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, 120, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo_padrao.png"))); // NOI18N
        jLabel2.setText("jLabel1");
        jLabel2.setMaximumSize(new java.awt.Dimension(1024, 768));
        jLabel2.setMinimumSize(new java.awt.Dimension(1024, 768));
        jLabel2.setPreferredSize(new java.awt.Dimension(1024, 768));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1030, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        ExcluirCadastro();
        LimparCampos();
        ListarValoresCanais();

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        frmHomeAdminGUI objhomeadmgui = new frmHomeAdminGUI();
        objhomeadmgui.setVisible(true); //abri a pagina se o login for correto

        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        frmAdicionarCanalGUI objadicionarcanalgui = new frmAdicionarCanalGUI();
        objadicionarcanalgui.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarActionPerformed
        CarregarCampos();
    }//GEN-LAST:event_btnCarregarActionPerformed

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
            java.util.logging.Logger.getLogger(frmListaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmListaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmListaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmListaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmListaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CarCanal;
    private javax.swing.JTextField CarID;
    private javax.swing.JTextField CarNome;
    private javax.swing.JTextField CarSenha;
    private javax.swing.JTextField CarTipo;
    private javax.swing.JTextField CarToken;
    private javax.swing.JTextField CarUsuario;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnCarregar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tabelaCanais;
    // End of variables declaration//GEN-END:variables

    private void ListarValoresCanais() {
        try {
            UsuarioDAO objcanaisDAO = new UsuarioDAO();

            DefaultTableModel model = (DefaultTableModel) tabelaCanais.getModel();
            model.setNumRows(0);

            ArrayList<CanaisDTO> lista = objcanaisDAO.listarCanais();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getId(),
                    lista.get(num).getNome(),
                    lista.get(num).getCanal(),
                    lista.get(num).getTipo(),
                    lista.get(num).getUsuario(),
                    lista.get(num).getSenha(),
                    lista.get(num).getToken(),});
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ListarValoresView" + erro);

        }

    }

    private void CarregarCampos() {
        int setar = tabelaCanais.getSelectedRow();
        CarID.setText(tabelaCanais.getModel().getValueAt(setar, 0).toString());
        CarNome.setText(tabelaCanais.getModel().getValueAt(setar, 1).toString());
        CarCanal.setText(tabelaCanais.getModel().getValueAt(setar, 2).toString());
        CarTipo.setText(tabelaCanais.getModel().getValueAt(setar, 3).toString());
        CarUsuario.setText(tabelaCanais.getModel().getValueAt(setar, 4).toString());
        CarSenha.setText(tabelaCanais.getModel().getValueAt(setar, 5).toString());
        CarToken.setText(tabelaCanais.getModel().getValueAt(setar, 6).toString());
    }

    private void ExcluirCadastro() {
        int id_cadastro;

        id_cadastro = Integer.parseInt(CarID.getText());

        CanaisDTO objcanaisdto = new CanaisDTO();
        objcanaisdto.setId(id_cadastro);

        UsuarioDAO objusuariodao = new UsuarioDAO();
        objusuariodao.excluirCadastros(objcanaisdto);

    }

    private void LimparCampos() {
        CarID.setText("");
        CarNome.setText("");
        CarCanal.setText("");
        CarTipo.setText("");
        CarUsuario.setText("");
        CarSenha.setText("");
        CarToken.setText("");
        CarNome.requestFocus();
    }

}
