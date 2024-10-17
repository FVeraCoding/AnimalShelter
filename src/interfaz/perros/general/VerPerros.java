/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package interfaz.perros.general;

import interfaz.perros.individual.DialogoPerro1;
import interfaz.PantallaPrincipal;
import interfaz.perros.individual.DialogoPerro2;
import interfaz.perros.individual.DialogoPerro3;
import interfaz.perros.individual.DialogoPerro4;
import interfaz.perros.individual.DialogoPerro5;
import interfaz.perros.individual.DialogoPerro6;
import interfaz.perros.individual.DialogoPerro7;
import interfaz.perros.individual.DialogoPerro8;
import interfaz.perros.individual.DialogoPerro9;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import logica.PerrosGatos;

/**
 *
 * @author Fernando
 */
public class VerPerros extends javax.swing.JDialog {

    private PantallaPrincipal p;

    public VerPerros(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        p = (PantallaPrincipal) parent;
        getContentPane().setBackground(Color.pink);

        initComponents();
        this.jPanelFotos1.setOpaque(false);
        this.jPanelNombrePerros1.setOpaque(false);
        this.jPanelFotosPerros2.setOpaque(false);
        this.jPanelNombrePerros2.setOpaque(false);
        this.jPanelFotosPerros3.setOpaque(false);
        this.jPanelNombrePerros3.setOpaque(false);

        // Establecer fotos y nombres de perros.
        this.setImageLabel(jLabelFotoPerro1, PerrosGatos.getListaPerros().get(0).getUrl());
        this.jLabelNombrePerro1.setText(PerrosGatos.getListaPerros().get(0).getNombre());
        this.setImageLabel(jLabelFotoPerro2, PerrosGatos.getListaPerros().get(1).getUrl());
        this.jLabelNombrePerro2.setText(PerrosGatos.getListaPerros().get(1).getNombre());
        this.setImageLabel(jLabelFotoPerro3, PerrosGatos.getListaPerros().get(2).getUrl());
        this.jLabelNombrePerro3.setText(PerrosGatos.getListaPerros().get(2).getNombre());
        this.setImageLabel(jLabelFotoPerro4, PerrosGatos.getListaPerros().get(3).getUrl());
        this.jLabelNombrePerro4.setText(PerrosGatos.getListaPerros().get(3).getNombre());
        this.setImageLabel(jLabelFotoPerro5, PerrosGatos.getListaPerros().get(4).getUrl());
        this.jLabelNombrePerro5.setText(PerrosGatos.getListaPerros().get(4).getNombre());
        this.setImageLabel(jLabelFotoPerro6, PerrosGatos.getListaPerros().get(5).getUrl());
        this.jLabelNombrePerro6.setText(PerrosGatos.getListaPerros().get(5).getNombre());
        this.setImageLabel(jLabelFotoPerro7, PerrosGatos.getListaPerros().get(6).getUrl());
        this.jLabelNombrePerro7.setText(PerrosGatos.getListaPerros().get(6).getNombre());
        this.setImageLabel(jLabelFotoPerro8, PerrosGatos.getListaPerros().get(7).getUrl());
        this.jLabelNombrePerro8.setText(PerrosGatos.getListaPerros().get(7).getNombre());
        this.setImageLabel(jLabelFotoPerro9, PerrosGatos.getListaPerros().get(8).getUrl());
        this.jLabelNombrePerro9.setText(PerrosGatos.getListaPerros().get(8).getNombre());
        
        jLabelFotoPerro1.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            DialogoPerro1 dialogoPerro1 = new DialogoPerro1(p, false);
            dialogoPerro1.setVisible(true);
        }
    });
        
        jLabelFotoPerro2.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            DialogoPerro2 dialogoPerro2 = new DialogoPerro2(p, false);
            dialogoPerro2.setVisible(true);
        }
    });
        jLabelFotoPerro3.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            DialogoPerro3 dialogoPerro3 = new DialogoPerro3(p, false);
            dialogoPerro3.setVisible(true);
        }
    });
        jLabelFotoPerro4.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            DialogoPerro4 dialogoPerro4 = new DialogoPerro4(p, false);
            dialogoPerro4.setVisible(true);
        }
    });
        jLabelFotoPerro5.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            DialogoPerro5 dialogoPerro5 = new DialogoPerro5(p, false);
            dialogoPerro5.setVisible(true);
        }
    });
        jLabelFotoPerro6.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            DialogoPerro6 dialogoPerro6 = new DialogoPerro6(p, false);
            dialogoPerro6.setVisible(true);
        }
    });
        jLabelFotoPerro7.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            DialogoPerro7 dialogoPerro7 = new DialogoPerro7(p, false);
            dialogoPerro7.setVisible(true);
        }
    });
        jLabelFotoPerro8.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            DialogoPerro8 dialogoPerro8 = new DialogoPerro8(p, false);
            dialogoPerro8.setVisible(true);
        }
    });
        jLabelFotoPerro9.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            DialogoPerro9 dialogoPerro9 = new DialogoPerro9(p, false);
            dialogoPerro9.setVisible(true);
        }
    });
        
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


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFotos1 = new javax.swing.JPanel();
        jLabelFotoPerro1 = new javax.swing.JLabel();
        jLabelFotoPerro2 = new javax.swing.JLabel();
        jLabelFotoPerro3 = new javax.swing.JLabel();
        jPanelNombrePerros1 = new javax.swing.JPanel();
        jLabelNombrePerro1 = new javax.swing.JLabel();
        jLabelNombrePerro2 = new javax.swing.JLabel();
        jLabelNombrePerro3 = new javax.swing.JLabel();
        jPanelFotosPerros2 = new javax.swing.JPanel();
        jLabelFotoPerro4 = new javax.swing.JLabel();
        jLabelFotoPerro5 = new javax.swing.JLabel();
        jLabelFotoPerro6 = new javax.swing.JLabel();
        jPanelNombrePerros2 = new javax.swing.JPanel();
        jLabelNombrePerro4 = new javax.swing.JLabel();
        jLabelNombrePerro5 = new javax.swing.JLabel();
        jLabelNombrePerro6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanelFotosPerros3 = new javax.swing.JPanel();
        jLabelFotoPerro7 = new javax.swing.JLabel();
        jLabelFotoPerro8 = new javax.swing.JLabel();
        jLabelFotoPerro9 = new javax.swing.JLabel();
        jPanelNombrePerros3 = new javax.swing.JPanel();
        jLabelNombrePerro7 = new javax.swing.JLabel();
        jLabelNombrePerro8 = new javax.swing.JLabel();
        jLabelNombrePerro9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelFotos1.setLayout(new java.awt.GridLayout(1, 3, 50, 0));
        jPanelFotos1.add(jLabelFotoPerro1);
        jPanelFotos1.add(jLabelFotoPerro2);
        jPanelFotos1.add(jLabelFotoPerro3);

        jPanelNombrePerros1.setLayout(new java.awt.GridLayout(1, 3, 30, 0));

        jLabelNombrePerro1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombrePerro1.setText("jLabel2");
        jPanelNombrePerros1.add(jLabelNombrePerro1);

        jLabelNombrePerro2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombrePerro2.setText("jLabel1");
        jPanelNombrePerros1.add(jLabelNombrePerro2);

        jLabelNombrePerro3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombrePerro3.setText("jLabel3");
        jPanelNombrePerros1.add(jLabelNombrePerro3);

        jPanelFotosPerros2.setLayout(new java.awt.GridLayout(1, 3, 30, 0));
        jPanelFotosPerros2.add(jLabelFotoPerro4);
        jPanelFotosPerros2.add(jLabelFotoPerro5);
        jPanelFotosPerros2.add(jLabelFotoPerro6);

        jPanelNombrePerros2.setLayout(new java.awt.GridLayout(1, 3, 30, 0));

        jLabelNombrePerro4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombrePerro4.setText("jLabel3");
        jPanelNombrePerros2.add(jLabelNombrePerro4);

        jLabelNombrePerro5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombrePerro5.setText("jLabel2");
        jPanelNombrePerros2.add(jLabelNombrePerro5);

        jLabelNombrePerro6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombrePerro6.setText("jLabel4");
        jPanelNombrePerros2.add(jLabelNombrePerro6);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("¡Estos son nuestros amigos en adopcion!");

        jPanelFotosPerros3.setLayout(new java.awt.GridLayout(1, 3, 30, 0));
        jPanelFotosPerros3.add(jLabelFotoPerro7);
        jPanelFotosPerros3.add(jLabelFotoPerro8);
        jPanelFotosPerros3.add(jLabelFotoPerro9);

        jPanelNombrePerros3.setLayout(new java.awt.GridLayout(1, 3, 30, 0));

        jLabelNombrePerro7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombrePerro7.setText("jLabel3");
        jPanelNombrePerros3.add(jLabelNombrePerro7);

        jLabelNombrePerro8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombrePerro8.setText("jLabel4");
        jPanelNombrePerros3.add(jLabelNombrePerro8);

        jLabelNombrePerro9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombrePerro9.setText("jLabel2");
        jPanelNombrePerros3.add(jLabelNombrePerro9);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelFotosPerros2, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelFotos1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelNombrePerros1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelNombrePerros2, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelFotosPerros3, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelNombrePerros3, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanelFotos1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelNombrePerros1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelFotosPerros2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelNombrePerros2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelFotosPerros3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelNombrePerros3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(VerPerros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerPerros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerPerros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerPerros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VerPerros dialog = new VerPerros(new javax.swing.JFrame(), true);
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
    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFotoPerro1;
    private javax.swing.JLabel jLabelFotoPerro2;
    private javax.swing.JLabel jLabelFotoPerro3;
    private javax.swing.JLabel jLabelFotoPerro4;
    private javax.swing.JLabel jLabelFotoPerro5;
    private javax.swing.JLabel jLabelFotoPerro6;
    private javax.swing.JLabel jLabelFotoPerro7;
    private javax.swing.JLabel jLabelFotoPerro8;
    private javax.swing.JLabel jLabelFotoPerro9;
    private javax.swing.JLabel jLabelNombrePerro1;
    private javax.swing.JLabel jLabelNombrePerro2;
    private javax.swing.JLabel jLabelNombrePerro3;
    private javax.swing.JLabel jLabelNombrePerro4;
    private javax.swing.JLabel jLabelNombrePerro5;
    private javax.swing.JLabel jLabelNombrePerro6;
    private javax.swing.JLabel jLabelNombrePerro7;
    private javax.swing.JLabel jLabelNombrePerro8;
    private javax.swing.JLabel jLabelNombrePerro9;
    private javax.swing.JPanel jPanelFotos1;
    private javax.swing.JPanel jPanelFotosPerros2;
    private javax.swing.JPanel jPanelFotosPerros3;
    private javax.swing.JPanel jPanelNombrePerros1;
    private javax.swing.JPanel jPanelNombrePerros2;
    private javax.swing.JPanel jPanelNombrePerros3;
    // End of variables declaration//GEN-END:variables
}
