/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author hp 14
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFotos = new javax.swing.JTextField();
        cmbConsultar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIva = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtPagar = new javax.swing.JTextField();
        cmbNuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Vijaya", 1, 24)); // NOI18N
        jLabel1.setText("Revele Su Rollo Fotografico");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Cuantas Fotos Tiene Su Rollo ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        txtFotos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFotosKeyTyped(evt);
            }
        });
        jPanel1.add(txtFotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 140, -1));

        cmbConsultar.setBackground(new java.awt.Color(0, 0, 0));
        cmbConsultar.setForeground(new java.awt.Color(255, 255, 255));
        cmbConsultar.setText("OK");
        cmbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(cmbConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel3.setText("Monto A Pagar");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("IVA  16%");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 150, 50, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel5.setText("Su Monto Total Es:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        txtIva.setEditable(false);
        jPanel1.add(txtIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 70, -1));

        txtTotal.setEditable(false);
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 90, -1));

        txtPagar.setEditable(false);
        jPanel1.add(txtPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 70, -1));

        cmbNuevo.setBackground(new java.awt.Color(0, 0, 0));
        cmbNuevo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmbNuevo.setForeground(new java.awt.Color(255, 255, 255));
        cmbNuevo.setText("Borrar");
        cmbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(cmbNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbConsultarActionPerformed
        String monto,iva,montototal;
        int nfotos,operacion,impuesto,total;
        
        if (txtFotos.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(this,"Digite Cuantas Fotos","error", JOptionPane.ERROR_MESSAGE);
         txtFotos.requestFocusInWindow();}
        
        else {
        
       nfotos=Integer.parseInt(txtFotos.getText());
       
       operacion=nfotos*1500;
       impuesto=(operacion*16)/100;
       total=operacion+impuesto;
       
       monto=String.valueOf(operacion);
       txtPagar.setText(monto);
       
       iva=String.valueOf(impuesto);
       txtIva.setText(iva);
       
       montototal=String.valueOf(total);
       txtTotal.setText(montototal);
       
        
        }
    }//GEN-LAST:event_cmbConsultarActionPerformed

    private void txtFotosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFotosKeyTyped
        char c=evt.getKeyChar(); 
          if(Character.isLetter(c)) { 
              getToolkit().beep(); 
              evt.consume();}
    }//GEN-LAST:event_txtFotosKeyTyped

    private void cmbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNuevoActionPerformed
        txtFotos.setText("");
        txtIva.setText("");
        txtPagar.setText("");
        txtTotal.setText("");
        
       txtFotos.requestFocusInWindow();
    }//GEN-LAST:event_cmbNuevoActionPerformed

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
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmbConsultar;
    private javax.swing.JButton cmbNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtFotos;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtPagar;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
