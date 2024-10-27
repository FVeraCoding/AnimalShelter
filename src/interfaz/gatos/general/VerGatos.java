/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package interfaz.gatos.general;

import interfaz.gatos.individual.DialogoGato1;
import interfaz.PantallaPrincipal;
import interfaz.gatos.individual.DialogoGato2;
import interfaz.gatos.individual.DialogoGato3;
import interfaz.gatos.individual.DialogoGato4;
import interfaz.gatos.individual.DialogoGato5;
import interfaz.gatos.individual.DialogoGato6;
import interfaz.gatos.individual.DialogoGato7;
import interfaz.gatos.individual.DialogoGato8;
import interfaz.gatos.individual.DialogoGato9;
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
public class VerGatos extends javax.swing.JDialog {

    private PantallaPrincipal p;
    
    public VerGatos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        this.jPanelFotosGatos1.setOpaque(false);
        this.jPanelNombreGatos1.setOpaque(false);
        this.jPanelFotosGatos2.setOpaque(false);
        this.jPanelNombreGatos2.setOpaque(false);
        this.jPanelFotosGatos3.setOpaque(false);
        this.jPanelNombreGatos3.setOpaque(false);

        this.setImageLabel(jLabelFotoGato1, PerrosGatos.getListaGatos().get(0).getUrl());
        this.setImageLabel(jLabelFotoGato2, PerrosGatos.getListaGatos().get(1).getUrl());
        this.setImageLabel(jLabelFotoGato3, PerrosGatos.getListaGatos().get(2).getUrl());
        this.setImageLabel(jLabelFotoGato4, PerrosGatos.getListaGatos().get(3).getUrl());
        this.setImageLabel(jLabelFotoGato5, PerrosGatos.getListaGatos().get(4).getUrl());
        this.setImageLabel(jLabelFotoGato6, PerrosGatos.getListaGatos().get(5).getUrl());
        this.setImageLabel(jLabelFotoGato7, PerrosGatos.getListaGatos().get(6).getUrl());
        this.setImageLabel(jLabelFotoGato8, PerrosGatos.getListaGatos().get(7).getUrl());
        this.setImageLabel(jLabelFotoGato9, PerrosGatos.getListaGatos().get(8).getUrl());

        jLabelNombreGato1.setText(PerrosGatos.getListaGatos().get(0).getNombre());
        jLabelNombreGato2.setText(PerrosGatos.getListaGatos().get(1).getNombre());
        jLabelNombreGato3.setText(PerrosGatos.getListaGatos().get(2).getNombre());
        jLabelNombreGato4.setText(PerrosGatos.getListaGatos().get(3).getNombre());
        jLabelNombreGato5.setText(PerrosGatos.getListaGatos().get(4).getNombre());
        jLabelNombreGato6.setText(PerrosGatos.getListaGatos().get(5).getNombre());
        jLabelNombreGato7.setText(PerrosGatos.getListaGatos().get(6).getNombre());
        jLabelNombreGato8.setText(PerrosGatos.getListaGatos().get(7).getNombre());
        jLabelNombreGato9.setText(PerrosGatos.getListaGatos().get(8).getNombre());
        
        jLabelFotoGato1.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            DialogoGato1 dialogoGato1 = new DialogoGato1(p, false);
            dialogoGato1.setVisible(true);
        }
    });
        
        jLabelFotoGato2.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            DialogoGato2 dialogoGato2 = new DialogoGato2(p, false);
            dialogoGato2.setVisible(true);
        }
    });
        
        jLabelFotoGato3.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            DialogoGato3 dialogoGato3 = new DialogoGato3(p, false);
            dialogoGato3.setVisible(true);
        }
    });
        
        jLabelFotoGato4.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            DialogoGato4 dialogoGato4 = new DialogoGato4(p, false);
            dialogoGato4.setVisible(true);
        }
    });
        
        jLabelFotoGato5.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            DialogoGato5 dialogoGato5 = new DialogoGato5(p, false);
            dialogoGato5.setVisible(true);
        }
    });
        
        jLabelFotoGato6.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            DialogoGato6 dialogoGato6 = new DialogoGato6(p, false);
            dialogoGato6.setVisible(true);
        }
    });
        
        jLabelFotoGato7.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            DialogoGato7 dialogoGato7 = new DialogoGato7(p, false);
            dialogoGato7.setVisible(true);
        }
    });
        
        jLabelFotoGato8.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            DialogoGato8 dialogoGato8 = new DialogoGato8(p, false);
            dialogoGato8.setVisible(true);
        }
    });
        
        jLabelFotoGato9.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            DialogoGato9 dialogoGato9 = new DialogoGato9(p, false);
            dialogoGato9.setVisible(true);
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

        jPanelFotosGatos1 = new javax.swing.JPanel();
        jLabelFotoGato1 = new javax.swing.JLabel();
        jLabelFotoGato2 = new javax.swing.JLabel();
        jLabelFotoGato3 = new javax.swing.JLabel();
        jPanelNombreGatos1 = new javax.swing.JPanel();
        jLabelNombreGato1 = new javax.swing.JLabel();
        jLabelNombreGato2 = new javax.swing.JLabel();
        jLabelNombreGato3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanelFotosGatos2 = new javax.swing.JPanel();
        jLabelFotoGato4 = new javax.swing.JLabel();
        jLabelFotoGato5 = new javax.swing.JLabel();
        jLabelFotoGato6 = new javax.swing.JLabel();
        jPanelNombreGatos2 = new javax.swing.JPanel();
        jLabelNombreGato4 = new javax.swing.JLabel();
        jLabelNombreGato5 = new javax.swing.JLabel();
        jLabelNombreGato6 = new javax.swing.JLabel();
        jPanelFotosGatos3 = new javax.swing.JPanel();
        jLabelFotoGato7 = new javax.swing.JLabel();
        jLabelFotoGato8 = new javax.swing.JLabel();
        jLabelFotoGato9 = new javax.swing.JLabel();
        jPanelNombreGatos3 = new javax.swing.JPanel();
        jLabelNombreGato7 = new javax.swing.JLabel();
        jLabelNombreGato8 = new javax.swing.JLabel();
        jLabelNombreGato9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelFotosGatos1.setLayout(new java.awt.GridLayout(1, 3, 30, 0));
        jPanelFotosGatos1.add(jLabelFotoGato1);
        jPanelFotosGatos1.add(jLabelFotoGato2);
        jPanelFotosGatos1.add(jLabelFotoGato3);

        jPanelNombreGatos1.setLayout(new java.awt.GridLayout(1, 3, 30, 0));

        jLabelNombreGato1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombreGato1.setText("jLabel2");
        jPanelNombreGatos1.add(jLabelNombreGato1);

        jLabelNombreGato2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombreGato2.setText("jLabel3");
        jPanelNombreGatos1.add(jLabelNombreGato2);

        jLabelNombreGato3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombreGato3.setText("jLabel1");
        jPanelNombreGatos1.add(jLabelNombreGato3);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("¡Estos son nuestros amigos en adopcion!");

        jPanelFotosGatos2.setLayout(new java.awt.GridLayout(1, 3, 30, 0));
        jPanelFotosGatos2.add(jLabelFotoGato4);
        jPanelFotosGatos2.add(jLabelFotoGato5);
        jPanelFotosGatos2.add(jLabelFotoGato6);

        jPanelNombreGatos2.setLayout(new java.awt.GridLayout(1, 3, 30, 0));

        jLabelNombreGato4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombreGato4.setText("jLabel3");
        jPanelNombreGatos2.add(jLabelNombreGato4);

        jLabelNombreGato5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombreGato5.setText("jLabel4");
        jPanelNombreGatos2.add(jLabelNombreGato5);

        jLabelNombreGato6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombreGato6.setText("jLabel2");
        jPanelNombreGatos2.add(jLabelNombreGato6);

        jPanelFotosGatos3.setLayout(new java.awt.GridLayout(1, 3, 30, 0));
        jPanelFotosGatos3.add(jLabelFotoGato7);
        jPanelFotosGatos3.add(jLabelFotoGato8);
        jPanelFotosGatos3.add(jLabelFotoGato9);

        jPanelNombreGatos3.setLayout(new java.awt.GridLayout(1, 3, 30, 0));

        jLabelNombreGato7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombreGato7.setText("jLabel3");
        jPanelNombreGatos3.add(jLabelNombreGato7);

        jLabelNombreGato8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombreGato8.setText("jLabel4");
        jPanelNombreGatos3.add(jLabelNombreGato8);

        jLabelNombreGato9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombreGato9.setText("jLabel2");
        jPanelNombreGatos3.add(jLabelNombreGato9);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelFotosGatos3, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelNombreGatos1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelFotosGatos2, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelNombreGatos2, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanelFotosGatos1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanelNombreGatos3, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addComponent(jPanelFotosGatos1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelNombreGatos1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelFotosGatos2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelNombreGatos2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelFotosGatos3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelNombreGatos3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(VerGatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerGatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerGatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerGatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VerGatos dialog = new VerGatos(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabelFotoGato1;
    private javax.swing.JLabel jLabelFotoGato2;
    private javax.swing.JLabel jLabelFotoGato3;
    private javax.swing.JLabel jLabelFotoGato4;
    private javax.swing.JLabel jLabelFotoGato5;
    private javax.swing.JLabel jLabelFotoGato6;
    private javax.swing.JLabel jLabelFotoGato7;
    private javax.swing.JLabel jLabelFotoGato8;
    private javax.swing.JLabel jLabelFotoGato9;
    private javax.swing.JLabel jLabelNombreGato1;
    private javax.swing.JLabel jLabelNombreGato2;
    private javax.swing.JLabel jLabelNombreGato3;
    private javax.swing.JLabel jLabelNombreGato4;
    private javax.swing.JLabel jLabelNombreGato5;
    private javax.swing.JLabel jLabelNombreGato6;
    private javax.swing.JLabel jLabelNombreGato7;
    private javax.swing.JLabel jLabelNombreGato8;
    private javax.swing.JLabel jLabelNombreGato9;
    private javax.swing.JPanel jPanelFotosGatos1;
    private javax.swing.JPanel jPanelFotosGatos2;
    private javax.swing.JPanel jPanelFotosGatos3;
    private javax.swing.JPanel jPanelNombreGatos1;
    private javax.swing.JPanel jPanelNombreGatos2;
    private javax.swing.JPanel jPanelNombreGatos3;
    // End of variables declaration//GEN-END:variables
}
