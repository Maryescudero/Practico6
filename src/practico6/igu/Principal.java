

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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jpfContraseña = new javax.swing.JPasswordField();
        jbIngresar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jlFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practico6/imagenes/vector.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 600, 480));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practico6/imagenes/usuario.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 30, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practico6/imagenes/password.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, 30, 50));

        jtfUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.add(jtfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 188, 180, 40));

        jpfContraseña.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.add(jpfContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, 180, 40));

        jbIngresar.setText("INGRESAR");
        jbIngresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIngresarActionPerformed(evt);
            }
        });
        jPanel2.add(jbIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, 120, 40));

        jbSalir.setText("SALIR");
        jbSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jPanel2.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 370, 120, 40));

        jlFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practico6/imagenes/60611-colores-pastel.jpg"))); // NOI18N
        jPanel2.add(jlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 530));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIngresarActionPerformed
        if (jtfUsuario.getText().equals("usuario") && jpfContraseña.getText().equals("1234")) {
         Menu menu = new Menu();
         menu.setVisible(true);
        } else {
            
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
            jtfUsuario.setText("");
            jpfContraseña.setText("");
        }
    }//GEN-LAST:event_jbIngresarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        JOptionPane.showMessageDialog(this," SU CARGA HA SIDO EXITOSA");
        System.exit(WIDTH);// salgo del sistema, imprimo cartel
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbIngresar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlFondo;
    private javax.swing.JPasswordField jpfContraseña;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables

}
