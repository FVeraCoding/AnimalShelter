/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import interfaz.gatos.general.AdoptarGatos;
import interfaz.gatos.general.VerGatos;
import interfaz.perros.general.AdoptarPerros;
import interfaz.perros.general.VerPerros;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import logica.PerrosGatos;

/**
 *
 * @author alumnadotarde
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    
    public PantallaPrincipal() {
        initComponents();
        PerrosGatos.crearGatos();
        PerrosGatos.crearPerros();
        getContentPane().setBackground(Color.pink);
        this.setFondoPantalla();
    }

   private void setFondoPantalla() {
        // Carga de la imagen de fondo desde el archivo
            ImageIcon fondo = new ImageIcon(getClass().getResource("/img/fondo.jpg"));

        // Crear un JLabel que contenga la imagen
        JLabel fondoLabel = new JLabel(fondo);

        // Configuramos el tamaño del JLabel al tamaño del JFrame
        fondoLabel.setSize(this.getWidth(), this.getHeight());

        // Agregamos el JLabel al JPanel del JFrame
        this.getContentPane().add(fondoLabel);

        // Para que los otros componentes aparezcan encima del fondo, debemos ajustar el layout
        this.getContentPane().setLayout(null);  // Desactivar el layout automático para colocar manualmente
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelBienvenida = new javax.swing.JLabel();
        jLabelBienvenida1 = new javax.swing.JLabel();
        jLabelBienvenida2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuPerros = new javax.swing.JMenu();
        jMenuItemPerrosVer = new javax.swing.JMenuItem();
        jMenuItemPerrosAdoptar = new javax.swing.JMenuItem();
        jMenuGatos = new javax.swing.JMenu();
        jMenuItemGatosVer = new javax.swing.JMenuItem();
        jMenuItemGatosAdoptar = new javax.swing.JMenuItem();
        jMenuCuenta = new javax.swing.JMenu();
        jMenuItemCuentaDatos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelBienvenida.setFont(new java.awt.Font("Mallanna", 0, 36)); // NOI18N
        jLabelBienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBienvenida.setText("a");

        jLabelBienvenida1.setFont(new java.awt.Font("Mallanna", 0, 36)); // NOI18N
        jLabelBienvenida1.setText("El Bosque");

        jLabelBienvenida2.setFont(new java.awt.Font("Mallanna", 0, 36)); // NOI18N
        jLabelBienvenida2.setText("Bienvenido/a");

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel1.setText("¿Ya tienes una cuenta?");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel2.setText("¿Quieres registrarte?");

        jButton1.setText("Iniciar sesión");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Registrarte");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jMenuPerros.setText("Perros");

        jMenuItemPerrosVer.setText("Ver");
        jMenuItemPerrosVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPerrosVerActionPerformed(evt);
            }
        });
        jMenuPerros.add(jMenuItemPerrosVer);

        jMenuItemPerrosAdoptar.setText("Adoptar");
        jMenuItemPerrosAdoptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPerrosAdoptarActionPerformed(evt);
            }
        });
        jMenuPerros.add(jMenuItemPerrosAdoptar);

        jMenuBar1.add(jMenuPerros);

        jMenuGatos.setText("Gatos");

        jMenuItemGatosVer.setText("Ver");
        jMenuItemGatosVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGatosVerActionPerformed(evt);
            }
        });
        jMenuGatos.add(jMenuItemGatosVer);

        jMenuItemGatosAdoptar.setText("Adoptar");
        jMenuItemGatosAdoptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGatosAdoptarActionPerformed(evt);
            }
        });
        jMenuGatos.add(jMenuItemGatosAdoptar);

        jMenuBar1.add(jMenuGatos);

        jMenuCuenta.setText("Cuenta");

        jMenuItemCuentaDatos.setText("Datos");
        jMenuItemCuentaDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCuentaDatosActionPerformed(evt);
            }
        });
        jMenuCuenta.add(jMenuItemCuentaDatos);

        jMenuBar1.add(jMenuCuenta);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabelBienvenida)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelBienvenida1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelBienvenida2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(60, 60, 60)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabelBienvenida2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBienvenida1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton2))
                .addGap(117, 117, 117))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemGatosAdoptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGatosAdoptarActionPerformed
        AdoptarGatos adoptarGatos = new AdoptarGatos(this, false);
        adoptarGatos.setVisible(true);  
    }//GEN-LAST:event_jMenuItemGatosAdoptarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        InicioSesion inicio = new InicioSesion(this, true);
        inicio.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Registro registro = new Registro(this, true);
        registro.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItemPerrosVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPerrosVerActionPerformed
        VerPerros verPerros = new VerPerros(this, false);
        verPerros.setVisible(true);
    }//GEN-LAST:event_jMenuItemPerrosVerActionPerformed

    private void jMenuItemGatosVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGatosVerActionPerformed
        VerGatos verGatos = new VerGatos(this, false);
        verGatos.setVisible(true);
    }//GEN-LAST:event_jMenuItemGatosVerActionPerformed

    private void jMenuItemPerrosAdoptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPerrosAdoptarActionPerformed
        AdoptarPerros adoptarPerros = new AdoptarPerros(this, false);
        adoptarPerros.setVisible(true);
    }//GEN-LAST:event_jMenuItemPerrosAdoptarActionPerformed

    private void jMenuItemCuentaDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCuentaDatosActionPerformed
     if(InicioSesion.isLoginExitoso()){
         Datos datos = new Datos(this, true);
         datos.setVisible(true);
     }else{
         JOptionPane.showMessageDialog(this, "No se ha iniciado sesión.", "Error", JOptionPane.ERROR_MESSAGE);
     }
    }//GEN-LAST:event_jMenuItemCuentaDatosActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBienvenida;
    private javax.swing.JLabel jLabelBienvenida1;
    private javax.swing.JLabel jLabelBienvenida2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCuenta;
    private javax.swing.JMenu jMenuGatos;
    private javax.swing.JMenuItem jMenuItemCuentaDatos;
    private javax.swing.JMenuItem jMenuItemGatosAdoptar;
    private javax.swing.JMenuItem jMenuItemGatosVer;
    private javax.swing.JMenuItem jMenuItemPerrosAdoptar;
    private javax.swing.JMenuItem jMenuItemPerrosVer;
    private javax.swing.JMenu jMenuPerros;
    // End of variables declaration//GEN-END:variables
}
