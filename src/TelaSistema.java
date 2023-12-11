
import Cliente.TelaCadastroClientes;
import Usuario.ListagemUsuario;
import Usuario.TelaCadastroUsuario;
import java.awt.Graphics;

public class TelaSistema extends javax.swing.JFrame {

    /**
     * Creates new form TelaSistema
     */
    public TelaSistema() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuBarSistema = new javax.swing.JMenuBar();
        jMenuItListagemUsuario = new javax.swing.JMenu();
        jMenuUsuarios = new javax.swing.JMenu();
        jMenuItemCadastroUsuario = new javax.swing.JMenuItem();
        jMenuItemListagemUsuario = new javax.swing.JMenuItem();
        jMenuClientes = new javax.swing.JMenu();
        jMenuItemNovoCliente = new javax.swing.JMenuItem();
        jMenuAtendimento = new javax.swing.JMenu();
        jMenuCobranca = new javax.swing.JMenu();
        JmenuCaixa = new javax.swing.JMenu();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 622, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
        );

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TelaPrincipal");
        setAutoRequestFocus(false);
        setName("TelaPrincipal"); // NOI18N
        setResizable(false);

        jMenuItListagemUsuario.setText("Cadastros");

        jMenuUsuarios.setText("Usuarios");

        jMenuItemCadastroUsuario.setText("Novo");
        jMenuItemCadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroUsuarioActionPerformed(evt);
            }
        });
        jMenuUsuarios.add(jMenuItemCadastroUsuario);

        jMenuItemListagemUsuario.setText("Listagem");
        jMenuItemListagemUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListagemUsuarioActionPerformed(evt);
            }
        });
        jMenuUsuarios.add(jMenuItemListagemUsuario);

        jMenuItListagemUsuario.add(jMenuUsuarios);

        jMenuClientes.setText("Clientes");

        jMenuItemNovoCliente.setText("Novo");
        jMenuItemNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNovoClienteActionPerformed(evt);
            }
        });
        jMenuClientes.add(jMenuItemNovoCliente);

        jMenuItListagemUsuario.add(jMenuClientes);

        jMenuBarSistema.add(jMenuItListagemUsuario);

        jMenuAtendimento.setText("Atendimentos");
        jMenuBarSistema.add(jMenuAtendimento);

        jMenuCobranca.setText("Cobran�a");

        JmenuCaixa.setText("Caixa");
        jMenuCobranca.add(JmenuCaixa);

        jMenuBarSistema.add(jMenuCobranca);

        setJMenuBar(jMenuBarSistema);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 778, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 413, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroUsuarioActionPerformed
        TelaCadastroUsuario TUsuario = new TelaCadastroUsuario();
        TUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastroUsuarioActionPerformed

    private void jMenuItemListagemUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListagemUsuarioActionPerformed
        ListagemUsuario TLUsuario = new ListagemUsuario();
        TLUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItemListagemUsuarioActionPerformed

    private void jMenuItemNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNovoClienteActionPerformed
        // TODO add your handling code here:
        TelaCadastroClientes Tela = new TelaCadastroClientes();
        Tela.setVisible(true);
      
    }//GEN-LAST:event_jMenuItemNovoClienteActionPerformed

    /**
     * @param args the command line argumeants
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JmenuCaixa;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenuAtendimento;
    private javax.swing.JMenuBar jMenuBarSistema;
    private javax.swing.JMenu jMenuClientes;
    private javax.swing.JMenu jMenuCobranca;
    private javax.swing.JMenu jMenuItListagemUsuario;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemCadastroUsuario;
    private javax.swing.JMenuItem jMenuItemListagemUsuario;
    private javax.swing.JMenuItem jMenuItemNovoCliente;
    private javax.swing.JMenu jMenuUsuarios;
    // End of variables declaration//GEN-END:variables
}
