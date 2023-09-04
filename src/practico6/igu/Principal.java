

package practico6.igu;


import static java.awt.image.ImageObserver.WIDTH;
import java.util.TreeSet;
import javax.swing.JOptionPane;
import practico6.logica.Productos;


/**
 *
 * @author marus
 */
public class Principal extends javax.swing.JFrame {
    public static TreeSet<Productos> productos=new TreeSet<>();

    /** Creates new form Principal */
    public Principal() {
        initComponents();
        this.setSize(930, 525);
        this. setLocationRelativeTo(null);// formulario centrado
        this.setResizable(false);
        this.setTitle("LOGIN-INGRESO");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbAcceso = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jlCarrito = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbAcceso.setText("INGRESAR");
        jbAcceso.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAccesoActionPerformed(evt);
            }
        });
        getContentPane().add(jbAcceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 310, 160, 50));

        jbSalir.setText("SALIR");
        jbSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, 160, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practico6/imagenes/password.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, 30, 40));

        jtfUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 12), new java.awt.Color(219, 179, 179))); // NOI18N
        getContentPane().add(jtfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, 220, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practico6/imagenes/usuario.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 30, 50));

        jlCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practico6/imagenes/vector.jpg"))); // NOI18N
        getContentPane().add(jlCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 590, 470));

        jPasswordField1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, 220, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAccesoActionPerformed
        Menu acceso = new Menu();
        if (jtfUsuario.getText().equals("usuario") && jPasswordField1.getText().equals("1234")) {
            acceso.setVisible(true);
            
        } else {
            
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
            jtfUsuario.setText("");
            jPasswordField1.setText("");
        }
    }//GEN-LAST:event_jbAccesoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        System.exit(WIDTH);
        
    }//GEN-LAST:event_jbSalirActionPerformed

     
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JButton jbAcceso;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlCarrito;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables

}
