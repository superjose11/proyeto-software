/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;
import java.awt.Color;
import java.sql.*;
import clases.Conexion;
import javax.swing.JOptionPane;
/**
 *
 * @author braul
 */
public class InterfazRegistro extends javax.swing.JFrame {

    /**
     * Creates new form InterfazRegistro
     */
    public InterfazRegistro() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonRegistrar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre(s):");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido materno:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellido paterno:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre de usuario:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Correo electrónico:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contraseña:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jButtonRegistrar.setBackground(new java.awt.Color(51, 51, 51));
        jButtonRegistrar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButtonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegistrar.setText("Registrarse");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, -1));

        jButtonCancelar.setBackground(new java.awt.Color(51, 51, 51));
        jButtonCancelar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, -1));

        jTextField1.setBackground(new java.awt.Color(51, 51, 51));
        jTextField1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 360, -1));

        jTextField2.setBackground(new java.awt.Color(51, 51, 51));
        jTextField2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 360, -1));

        jTextField3.setBackground(new java.awt.Color(51, 51, 51));
        jTextField3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 360, -1));

        jTextField4.setBackground(new java.awt.Color(51, 51, 51));
        jTextField4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 360, -1));

        jTextField5.setBackground(new java.awt.Color(51, 51, 51));
        jTextField5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 360, -1));

        jPasswordField1.setBackground(new java.awt.Color(51, 51, 51));
        jPasswordField1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 360, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 612, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        // TODO add your handling code here:
        int validacion = 0;
        String nombre, ap_m, ap_p, usuario, correo, contraseña;
        nombre = jTextField1.getText().trim();
        ap_p = jTextField2.getText().trim();
        ap_m = jTextField3.getText().trim();
        usuario = jTextField4.getText().trim();
        correo = jTextField5.getText().trim();
        contraseña = jPasswordField1.getText().trim();
        
        if(nombre.equals("")){
            jTextField1.setBackground(Color.red);
            validacion++;
        }
        
        if(ap_p.equals("")){
            jTextField2.setBackground(Color.red);
            validacion++;
        }
        
        if(ap_m.equals("")){
            jTextField3.setBackground(Color.red);
            validacion++;
        }
        if(usuario.equals("")){
            jTextField4.setBackground(Color.red);
            validacion++;
        }
        if(correo.equals("")){
            jTextField5.setBackground(Color.red);
            validacion++;
        }
        if(contraseña.equals("")){
            jPasswordField1.setBackground(Color.red);
            validacion++;
        }
        
        try{
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select nombre from usuario where nombre = '" +nombre+ "'");
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                jTextField4.setBackground(Color.red);
                JOptionPane.showMessageDialog(null, "Nombre de usuario no disponible.");
                cn.close();
            } else{
                cn.close();
                if (validacion==0) {
                    try{
                        Connection cn2 = Conexion.conectar();
                        PreparedStatement pst2 = cn2.prepareStatement("insert into usuario values(?,?,?,?,?,?,?)");
                        pst2.setInt(1, 0);
                        pst2.setString(2, nombre);
                        pst2.setString(3, ap_p);
                        pst2.setString(4, ap_m);
                        pst2.setString(5, usuario);
                        pst2.setString(6, correo);
                        pst2.setString(7, contraseña);
                        pst2.executeUpdate();
                        cn2.close();
                        limpiar();
                        jTextField1.setBackground(Color.GREEN);
                        jTextField2.setBackground(Color.GREEN);
                        jTextField3.setBackground(Color.GREEN);
                        jTextField4.setBackground(Color.GREEN);
                        jTextField5.setBackground(Color.GREEN);
                        jPasswordField1.setBackground(Color.GREEN);
                        JOptionPane.showMessageDialog(null, "Registro exitoso.");
                        this.dispose();
                        
                    }catch(Exception e){
                        System.err.println("Error en registrar usuario.");
                        JOptionPane.showMessageDialog(null, "Error en el sistema al registrarse.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos.");
                }
            }
        }catch(Exception e){
            System.err.println("Error en validar usuario.");
            JOptionPane.showMessageDialog(null, "Error al comparar usuario.");
        }

    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
public void limpiar(){
    jTextField1.setText("");
    jTextField2.setText("");
    jTextField3.setText("");
    jTextField4.setText("");
    jTextField5.setText("");
    jPasswordField1.setText("");
}
}
