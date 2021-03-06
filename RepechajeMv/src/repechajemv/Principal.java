/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repechajemv;

import Clases.Conexion;
import Clases.ImagePanel;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author TOSHIBA
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    
    Conexion cn;
    Connection cnx;
    
    public Principal() throws SQLException, ClassNotFoundException {
        initComponents();
        this.setTitle("Bienvenido");
        this.setLocationRelativeTo(null);
        //this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        /*ImageIcon icon = new ImageIcon("src/Imagenes/");
        ImagePanel panel = new ImagePanel(icon.getImage());
        this.getContentPane().add(panel);*/
        realizarConexion();
    }

    public void realizarConexion() throws SQLException, ClassNotFoundException{
    
        cn = new Conexion();
        if(cn.obtener()!=null){
            cnx = cn.obtener();
            System.out.println("Conexion exitosa");
        }
        else{
            System.out.println("Conexion erronea");
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

        jMenuBar1 = new javax.swing.JMenuBar();
        mMenu = new javax.swing.JMenu();
        miRegistrarPedido = new javax.swing.JMenuItem();
        miActualizarPedido = new javax.swing.JMenuItem();
        miRegistrarComprobante = new javax.swing.JMenuItem();
        mSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        mMenu.setText("Menú");

        miRegistrarPedido.setText("Registrar Pedido");
        miRegistrarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRegistrarPedidoActionPerformed(evt);
            }
        });
        mMenu.add(miRegistrarPedido);

        miActualizarPedido.setText("Actualizar Pedido");
        miActualizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miActualizarPedidoActionPerformed(evt);
            }
        });
        mMenu.add(miActualizarPedido);

        miRegistrarComprobante.setText("Registrar Comprobante");
        miRegistrarComprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRegistrarComprobanteActionPerformed(evt);
            }
        });
        mMenu.add(miRegistrarComprobante);

        jMenuBar1.add(mMenu);

        mSalir.setText("Salir");
        mSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(mSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miRegistrarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRegistrarPedidoActionPerformed
        RegistrarPedido rP = new RegistrarPedido(cnx);
        rP.setVisible(true);
        
    }//GEN-LAST:event_miRegistrarPedidoActionPerformed

    private void miActualizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miActualizarPedidoActionPerformed
        ActualizarPedido aP = new ActualizarPedido(cnx);
        aP.setVisible(true);
        
    }//GEN-LAST:event_miActualizarPedidoActionPerformed

    private void miRegistrarComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRegistrarComprobanteActionPerformed
        RegistrarComprobante rC = new RegistrarComprobante(cn);
        try {
            cn.cerrar();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        rC.setVisible(true);
    }//GEN-LAST:event_miRegistrarComprobanteActionPerformed

    private void mSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mSalirMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_mSalirMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Principal().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mMenu;
    private javax.swing.JMenu mSalir;
    private javax.swing.JMenuItem miActualizarPedido;
    private javax.swing.JMenuItem miRegistrarComprobante;
    private javax.swing.JMenuItem miRegistrarPedido;
    // End of variables declaration//GEN-END:variables
}
