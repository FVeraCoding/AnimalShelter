/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package interfaz.gatos.individual;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import logica.PerrosGatos;

/**
 *
 * @author Fernando
 */
public class DialogoGato1 extends javax.swing.JDialog {

    
    public DialogoGato1(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.jLabelNombre.setText(PerrosGatos.getListaGatos().get(0).getNombre());
        this.jLabelPeso.setText(jLabelPeso.getText() + " "+PerrosGatos.getListaGatos().get(0).getPeso());
        this.jLabelColor.setText(jLabelColor.getText() + " "+PerrosGatos.getListaGatos().get(0).getColor());
        this.jLabelRaza.setText(jLabelRaza.getText() + " "+PerrosGatos.getListaGatos().get(0).getRaza());
        this.jLabelSexo.setText(jLabelSexo.getText() + " "+PerrosGatos.getListaGatos().get(0).getSexo());
        this.setImageLabel(jLabelFoto, PerrosGatos.getListaGatos().get(0).getUrl());
        this.getContentPane().setBackground(Color.pink);
        this.jLabelFoto.setBackground(Color.pink);
        this.jLabelColor.setBackground(Color.pink);
    }

    
        private void setImageLabel(JLabel label, String ruta) {
        try {
            ImageIcon imagen = new ImageIcon(ruta);
            if (imagen.getIconWidth() == -1) {
                System.out.println("No se pudo cargar la imagen desde la ruta: " + ruta);
                return; // Salimos si la imagen no se cargó
            }
            Image img = imagen.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT);
            Icon icon = new ImageIcon(img);
            label.setIcon(icon);
        } catch (Exception e) {
            e.printStackTrace(); // Imprimimos cualquier excepción que ocurra
        }
        this.setFondoPantalla();
    }
        
    
        
        private void setFondoPantalla() {
        // Carga de la imagen de fondo desde el archivo
            ImageIcon fondo = new ImageIcon(getClass().getResource("/img/fondogatos.jpg"));

        // Crear un JLabel que contenga la imagen
        JLabel fondoLabel = new JLabel(fondo);

        // Configuramos el tamaño del JLabel al tamaño del JFrame
        fondoLabel.setSize(this.getWidth(), this.getHeight());

        // Agregamos el JLabel al JPanel del JFrame
        this.getContentPane().add(fondoLabel);

        // Para que los otros componentes aparezcan encima del fondo, debemos ajustar el layout
        this.getContentPane().setLayout(null);  // Desactivar el layout automático para colocar manualmente
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelFoto = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelRaza = new javax.swing.JLabel();
        jLabelPeso = new javax.swing.JLabel();
        jLabelColor = new javax.swing.JLabel();
        jLabelSexo = new javax.swing.JLabel();
        jLabelDescripcion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelFoto.setText("jLabel1");

        jLabelNombre.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelNombre.setText("Nombre: ");

        jLabelRaza.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelRaza.setText("Raza: ");

        jLabelPeso.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelPeso.setText("Peso:");

        jLabelColor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelColor.setText("Color: ");

        jLabelSexo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelSexo.setText("Sexo: ");

        jLabelDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelDescripcion.setText("Descripción: ");

        jLabel1.setText("Asket es una preciosa amiga gatuna.");

        jLabel2.setText("Le encanta dormir mucho en el sofá");

        jLabel3.setText("y jugar con la pelota de lana durante las tardes de lluvia.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelColor, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(jLabelDescripcion))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabelNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRaza)
                    .addComponent(jLabelColor))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPeso)
                    .addComponent(jLabelSexo))
                .addGap(24, 24, 24)
                .addComponent(jLabelDescripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(DialogoGato1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogoGato1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogoGato1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogoGato1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogoGato1 dialog = new DialogoGato1(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelColor;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPeso;
    private javax.swing.JLabel jLabelRaza;
    private javax.swing.JLabel jLabelSexo;
    // End of variables declaration//GEN-END:variables
}
