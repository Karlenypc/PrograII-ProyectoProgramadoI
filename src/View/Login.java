/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Karlenypc
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        
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
        jLabel_Usuario = new javax.swing.JLabel();
        txtCorreoUsuario = new javax.swing.JTextField();
        jLabel_Contraseña = new javax.swing.JLabel();
        txtPasswordField = new javax.swing.JPasswordField();
        jButton_Ingresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(51, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesIcons/LogoCentroMedico.png"))); // NOI18N
        jLabel1.setText("Icon");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 170, 180));

        jLabel_Usuario.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel_Usuario.setForeground(new java.awt.Color(0, 32, 79));
        jLabel_Usuario.setText("Usuario:");
        jPanel1.add(jLabel_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 95, 26));

        txtCorreoUsuario.setText("jTextField1");
        txtCorreoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtCorreoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 220, 32));

        jLabel_Contraseña.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel_Contraseña.setForeground(new java.awt.Color(0, 32, 79));
        jLabel_Contraseña.setText("Contraseña:");
        jPanel1.add(jLabel_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 92, 24));

        txtPasswordField.setText("jPasswordField1");
        jPanel1.add(txtPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 220, 31));

        jButton_Ingresar.setForeground(new java.awt.Color(255, 0, 0));
        jButton_Ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesIcons/BotonIngresar.png"))); // NOI18N
        jButton_Ingresar.setBorderPainted(false);
        jButton_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IngresarActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 100, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesIcons/icons8_lock_25px.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 30, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesIcons/icons8_user_25px_1.png"))); // NOI18N
        jLabel4.setText("jLabel3");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 30, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 32, 79));
        jSeparator1.setForeground(new java.awt.Color(0, 32, 79));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 250, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 32, 79));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 250, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCorreoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoUsuarioActionPerformed

    private void jButton_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IngresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_IngresarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_Contraseña;
    private javax.swing.JLabel jLabel_Usuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtCorreoUsuario;
    private javax.swing.JPasswordField txtPasswordField;
    // End of variables declaration//GEN-END:variables
}