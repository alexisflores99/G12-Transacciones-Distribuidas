package breiner.view;

import java.beans.PropertyVetoException;
import javax.swing.JInternalFrame;

public class EurekaMain extends javax.swing.JFrame {

    /**
     * Creates new form EurekaMain
     */
    public EurekaMain() {
        initComponents();
        crearTitulo();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    private void crearTitulo() {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        menuProceso = new javax.swing.JMenu();
        menuProcesoDeposito = new javax.swing.JMenuItem();
        RetiroView = new javax.swing.JMenuItem();
        transaccionview = new javax.swing.JMenuItem();
        menuConsulta = new javax.swing.JMenu();
        menuConsultaMovimientos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        menuProceso.setText("Proceso");

        menuProcesoDeposito.setText("Transacción");
        menuProcesoDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProcesoDepositoActionPerformed(evt);
            }
        });
        menuProceso.add(menuProcesoDeposito);

        RetiroView.setText("Retiro");
        RetiroView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetiroViewActionPerformed(evt);
            }
        });
        menuProceso.add(RetiroView);

        transaccionview.setText("Depósito");
        transaccionview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transaccionviewActionPerformed(evt);
            }
        });
        menuProceso.add(transaccionview);

        menuBar.add(menuProceso);

        menuConsulta.setText("Consulta");

        menuConsultaMovimientos.setText("Movimientos");
        menuConsultaMovimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaMovimientosActionPerformed(evt);
            }
        });
        menuConsulta.add(menuConsultaMovimientos);

        menuBar.add(menuConsulta);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

   private void menuProcesoDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProcesoDepositoActionPerformed
       try {
           JInternalFrame view = new TransaccionView();
           desktopPane.add(view);
           view.setVisible(true);
           view.setMaximum(true);
       } catch (PropertyVetoException ex) {
       }
   }//GEN-LAST:event_menuProcesoDepositoActionPerformed

   private void menuConsultaMovimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultaMovimientosActionPerformed
       try {
           JInternalFrame view = new ConsultaMovimientos();
           desktopPane.add(view);
           view.setVisible(true);
           view.setMaximum(true);
       } catch (PropertyVetoException ex) {
       }
   }//GEN-LAST:event_menuConsultaMovimientosActionPerformed

    private void RetiroViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetiroViewActionPerformed
        // Retiro
        try {
            JInternalFrame view = new RetiroView();
            desktopPane.add(view);
            view.setVisible(true);
            view.setMaximum(true);
        } catch (PropertyVetoException ex) {
        }
    }//GEN-LAST:event_RetiroViewActionPerformed

    private void transaccionviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transaccionviewActionPerformed
        // Transaccion
        try {
            JInternalFrame view = new DepositoView();
            desktopPane.add(view);
            view.setVisible(true);
            view.setMaximum(true);
        } catch (PropertyVetoException ex) {
        }
    }//GEN-LAST:event_transaccionviewActionPerformed

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
            java.util.logging.Logger.getLogger(EurekaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EurekaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EurekaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EurekaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EurekaMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem RetiroView;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuConsulta;
    private javax.swing.JMenuItem menuConsultaMovimientos;
    private javax.swing.JMenu menuProceso;
    private javax.swing.JMenuItem menuProcesoDeposito;
    private javax.swing.JMenuItem transaccionview;
    // End of variables declaration//GEN-END:variables

}
