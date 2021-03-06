/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repechajemv;

import Clases.Conexion;
import Clases.Mesa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author TOSHIBA
 */
public class SeleccionarMesa extends javax.swing.JFrame {

    /**
     * Creates new form SeleccionarMesa
     */
    
    Connection cnx;
    ArrayList<Mesa> mesas = new ArrayList();
    int mesaSeleccionada;
    RegistrarPedido rp;
    
    public SeleccionarMesa(Connection cnx,RegistrarPedido rp) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Seleccionar Mesa");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.cnx = cnx;
        this.rp = rp;
        estadoMesas();
        verificarDisponibilidad();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pEstadoMesas = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        bAceptar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pEstadoMesas.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado mesas"));

        b1.setText("1");
        b1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b1.setPreferredSize(new java.awt.Dimension(93, 87));
        b1.setVerifyInputWhenFocusTarget(false);
        b1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        b1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setText("2");
        b2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b2.setPreferredSize(new java.awt.Dimension(93, 87));
        b2.setVerifyInputWhenFocusTarget(false);
        b2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        b2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setText("3");
        b3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b3.setPreferredSize(new java.awt.Dimension(93, 87));
        b3.setVerifyInputWhenFocusTarget(false);
        b3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        b3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setText("4");
        b4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b4.setPreferredSize(new java.awt.Dimension(93, 87));
        b4.setVerifyInputWhenFocusTarget(false);
        b4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        b4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setText("5");
        b5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b5.setPreferredSize(new java.awt.Dimension(93, 87));
        b5.setVerifyInputWhenFocusTarget(false);
        b5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        b5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setText("6");
        b6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b6.setPreferredSize(new java.awt.Dimension(93, 87));
        b6.setVerifyInputWhenFocusTarget(false);
        b6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        b6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.setText("7");
        b7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b7.setPreferredSize(new java.awt.Dimension(93, 87));
        b7.setVerifyInputWhenFocusTarget(false);
        b7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        b7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setText("8");
        b8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b8.setPreferredSize(new java.awt.Dimension(93, 87));
        b8.setVerifyInputWhenFocusTarget(false);
        b8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        b8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setText("9");
        b9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b9.setPreferredSize(new java.awt.Dimension(93, 87));
        b9.setVerifyInputWhenFocusTarget(false);
        b9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        b9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        b10.setText("10");
        b10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b10.setPreferredSize(new java.awt.Dimension(93, 87));
        b10.setVerifyInputWhenFocusTarget(false);
        b10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        b10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });

        b11.setText("11");
        b11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b11.setPreferredSize(new java.awt.Dimension(93, 87));
        b11.setVerifyInputWhenFocusTarget(false);
        b11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        b11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });

        b12.setText("12");
        b12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b12.setPreferredSize(new java.awt.Dimension(93, 87));
        b12.setVerifyInputWhenFocusTarget(false);
        b12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        b12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pEstadoMesasLayout = new javax.swing.GroupLayout(pEstadoMesas);
        pEstadoMesas.setLayout(pEstadoMesasLayout);
        pEstadoMesasLayout.setHorizontalGroup(
            pEstadoMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEstadoMesasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pEstadoMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pEstadoMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pEstadoMesasLayout.createSequentialGroup()
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pEstadoMesasLayout.createSequentialGroup()
                        .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pEstadoMesasLayout.createSequentialGroup()
                        .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pEstadoMesasLayout.setVerticalGroup(
            pEstadoMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEstadoMesasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pEstadoMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pEstadoMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pEstadoMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        bAceptar.setText("Aceptar");
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bCancelar)
                        .addGap(10, 10, 10)
                        .addComponent(bAceptar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(pEstadoMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pEstadoMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCancelar)
                    .addComponent(bAceptar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void verificarDisponibilidad(){
        boolean existeMesasDisponibles = false;
        for (Mesa mesa : mesas) {
            if(mesa.getEstado()==1){
                existeMesasDisponibles = true;
                break;
            }
        }
        
        if(!existeMesasDisponibles){
            JOptionPane.showMessageDialog(null, "Lo sentimos, en estos momentos ninguna mesa se encuentra disponible", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void estadoMesas(){
        
        String sql = "SELECT * FROM mesa;";
        Statement st;
        try {
            st = cnx.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                Mesa m = new Mesa(rs.getString(1),rs.getString(2));
                mesas.add(m);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SeleccionarMesa.class.getName()).log(Level.SEVERE, null, ex);
        }

        if(mesas.get(0).getEstado()==1){
            b1.setIcon(new ImageIcon("src/Imagenes/mesaD.png"));
        }
        else{
            b1.setIcon(new ImageIcon("src/Imagenes/mesaND.png"));
            b1.setEnabled(false);
        }
        
        if(mesas.get(1).getEstado()==1){
            b2.setIcon(new ImageIcon("src/Imagenes/mesaD.png"));
        }
        else{
            b2.setIcon(new ImageIcon("src/Imagenes/mesaND.png"));
            b2.setEnabled(false);
        }
        
        if(mesas.get(2).getEstado()==1){
            b3.setIcon(new ImageIcon("src/Imagenes/mesaD.png"));
        }
        else{
            b3.setIcon(new ImageIcon("src/Imagenes/mesaND.png"));
            b3.setEnabled(false);
        }
        
        if(mesas.get(3).getEstado()==1){
            b4.setIcon(new ImageIcon("src/Imagenes/mesaD.png"));
        }
        else{
            b4.setIcon(new ImageIcon("src/Imagenes/mesaND.png"));
            b4.setEnabled(false);
        }
        
        if(mesas.get(4).getEstado()==1){
            b5.setIcon(new ImageIcon("src/Imagenes/mesaD.png"));
        }
        else{
            b5.setIcon(new ImageIcon("src/Imagenes/mesaND.png"));
            b5.setEnabled(false);
        }
        
        if(mesas.get(5).getEstado()==1){
            b6.setIcon(new ImageIcon("src/Imagenes/mesaD.png"));
        }
        else{
            b6.setIcon(new ImageIcon("src/Imagenes/mesaND.png"));
            b6.setEnabled(false);
        }
        
        if(mesas.get(6).getEstado()==1){
            b7.setIcon(new ImageIcon("src/Imagenes/mesaD.png"));
        }
        else{
            b7.setIcon(new ImageIcon("src/Imagenes/mesaND.png"));
            b7.setEnabled(false);
        }
        
        if(mesas.get(7).getEstado()==1){
            b8.setIcon(new ImageIcon("src/Imagenes/mesaD.png"));
        }
        else{
            b8.setIcon(new ImageIcon("src/Imagenes/mesaND.png"));
            b8.setEnabled(false);
        }
        
        if(mesas.get(8).getEstado()==1){
            b9.setIcon(new ImageIcon("src/Imagenes/mesaD.png"));
        }
        else{
            b9.setIcon(new ImageIcon("src/Imagenes/mesaND.png"));
            b9.setEnabled(false);
        }
        
        if(mesas.get(9).getEstado()==1){
            b10.setIcon(new ImageIcon("src/Imagenes/mesaD.png"));
        }
        else{
            b10.setIcon(new ImageIcon("src/Imagenes/mesaND.png"));
            b10.setEnabled(false);
        }
        
        if(mesas.get(10).getEstado()==1){
            b11.setIcon(new ImageIcon("src/Imagenes/mesaD.png"));
        }
        else{
            b11.setIcon(new ImageIcon("src/Imagenes/mesaND.png"));
            b11.setEnabled(false);
        }
        
        if(mesas.get(11).getEstado()==1){
            b12.setIcon(new ImageIcon("src/Imagenes/mesaD.png"));
        }
        else{
            b12.setIcon(new ImageIcon("src/Imagenes/mesaND.png"));
            b12.setEnabled(false);
        }
        
    }
    
    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        mesaSeleccionada=1;
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        mesaSeleccionada=2;
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        mesaSeleccionada=3;
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
        mesaSeleccionada=4;
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
        mesaSeleccionada=5;
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
        mesaSeleccionada=6;
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:
        mesaSeleccionada=7;
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
        mesaSeleccionada=8;
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        // TODO add your handling code here:
        mesaSeleccionada=9;
    }//GEN-LAST:event_b9ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        // TODO add your handling code here:
        mesaSeleccionada=10;
    }//GEN-LAST:event_b10ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
        // TODO add your handling code here:
        mesaSeleccionada=11;
    }//GEN-LAST:event_b11ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
        // TODO add your handling code here:
        mesaSeleccionada=12;
    }//GEN-LAST:event_b12ActionPerformed

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        try {
            // TODO add your handling code here:
            //UPDATE mesa SET estado=0 WHERE idMesa=1;
            PreparedStatement pstm = cnx.prepareStatement("UPDATE mesa " +
                    "SET estado = ? " +
                    "WHERE idMesa = ? ");
            
            pstm.setInt(2,mesaSeleccionada);
            pstm.setInt(1,0);
            
            pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SeleccionarMesa.class.getName()).log(Level.SEVERE, null, ex);
        }
        rp.cambiarValorMesa(Integer.toString(mesaSeleccionada));
        this.dispose();
    }//GEN-LAST:event_bAceptarActionPerformed

    /**
     * @param args the command line arguments
     */
    /*
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
/*        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SeleccionarMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeleccionarMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeleccionarMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeleccionarMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form *//*
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeleccionarMesa().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pEstadoMesas;
    // End of variables declaration//GEN-END:variables
}
