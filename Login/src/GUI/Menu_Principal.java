/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;

/**
 *
 * @author JUDMEZ
 */
public class Menu_Principal extends javax.swing.JPanel {
    public static Paneles.Administrar AD;
    public static String administrar="0";
    /**
     * Creates new form Menu_Principal
     */
    public Menu_Principal() {
        initComponents();
        labelLoading.setVisible(false);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        labelLoading = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        Contenedor = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        lbfondo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("PANEL DE ADMINISTRACIÓN");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 0, 350, 30);

        jLabel3.setText(" Administrador");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 20, 300, 20);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(0, 120, 167, 5);

        jLabel6.setText("Ítem III");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel6MouseReleased(evt);
            }
        });
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 80, 140, 40);

        jLabel9.setText("Ítem I");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel9MouseReleased(evt);
            }
        });
        jPanel2.add(jLabel9);
        jLabel9.setBounds(23, 1, 140, 40);
        jPanel2.add(jSeparator6);
        jSeparator6.setBounds(0, 40, 167, 10);
        jPanel2.add(jSeparator7);
        jSeparator7.setBounds(0, 80, 167, 10);

        jLabel10.setText("Ítem II");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel10MouseReleased(evt);
            }
        });
        jPanel2.add(jLabel10);
        jLabel10.setBounds(20, 40, 140, 40);
        jPanel2.add(jSeparator8);
        jSeparator8.setBounds(0, 160, 167, 5);

        jLabel11.setText("Ítem IV");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel11MouseReleased(evt);
            }
        });
        jPanel2.add(jLabel11);
        jLabel11.setBounds(20, 120, 140, 40);
        jPanel2.add(jSeparator9);
        jSeparator9.setBounds(0, 200, 167, 5);

        jLabel12.setText("Ítem V");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel12MouseReleased(evt);
            }
        });
        jPanel2.add(jLabel12);
        jLabel12.setBounds(20, 160, 140, 40);
        jPanel2.add(jSeparator10);
        jSeparator10.setBounds(0, 280, 167, 5);

        jLabel13.setText("Administrar");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel13MouseReleased(evt);
            }
        });
        jPanel2.add(jLabel13);
        jLabel13.setBounds(20, 321, 140, 38);

        jLabel14.setText("Ítem VII");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel14MouseReleased(evt);
            }
        });
        jPanel2.add(jLabel14);
        jLabel14.setBounds(20, 240, 140, 40);
        jPanel2.add(jSeparator11);
        jSeparator11.setBounds(0, 360, 167, 10);

        labelLoading.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/loading_1.gif"))); // NOI18N
        jPanel2.add(labelLoading);
        labelLoading.setBounds(70, 410, 30, 30);

        jLabel5.setText("Ítem VI");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel5MouseReleased(evt);
            }
        });
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 200, 140, 40);
        jPanel2.add(jSeparator12);
        jSeparator12.setBounds(0, 240, 167, 10);

        jLabel1.setText("Ítem VIII");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel1MouseReleased(evt);
            }
        });
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 282, 150, 38);
        jPanel2.add(jSeparator13);
        jSeparator13.setBounds(0, 320, 167, 10);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(1, 50, 170, 480);

        Contenedor.setFocusable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Contenedor.addTab("Inicio", jPanel3);

        jPanel1.add(Contenedor);
        Contenedor.setBounds(171, 50, 830, 480);

        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/start.png"))); // NOI18N
        jLabel4.setText("  byspel.com");
        jLabel4.setToolTipText("Ir a byspel.com");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel4MouseReleased(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 534, 140, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel14MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseReleased
    
    }//GEN-LAST:event_jLabel14MouseReleased

    private void jLabel9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseReleased
       
    }//GEN-LAST:event_jLabel9MouseReleased

    private void jLabel13MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseReleased
        new _Administrar().show();
    }//GEN-LAST:event_jLabel13MouseReleased

    private void jLabel11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseReleased
      
    }//GEN-LAST:event_jLabel11MouseReleased

    private void jLabel10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseReleased
     
    }//GEN-LAST:event_jLabel10MouseReleased

    private void jLabel6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseReleased
       
    }//GEN-LAST:event_jLabel6MouseReleased

    private void jLabel12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseReleased
       
    }//GEN-LAST:event_jLabel12MouseReleased

    private void jLabel5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseReleased
     
    }//GEN-LAST:event_jLabel5MouseReleased

    private void jLabel4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseReleased
        try {
           Abrir_URL(); 
        } catch (URISyntaxException e) {
        }   
    }//GEN-LAST:event_jLabel4MouseReleased

    private void jLabel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseReleased
      
    }//GEN-LAST:event_jLabel1MouseReleased
 
    public class _Administrar implements Runnable{ 
       public void show(){ 
            new Thread(this).start(); 
        } 
        @Override 
        public void run() { 
            labelLoading.setVisible(true); 
            jLabel13.setEnabled(false);
            Cargar_Administracion();
            labelLoading.setVisible(false); 
            jLabel13.setEnabled(true);
            repaint();
        } 
    } 

    private void Cargar_Administracion(){
        try {
         if(administrar.equals("0")){
         AD = new Paneles.Administrar();
         Contenedor.addTab("Administrar", AD);
         Contenedor.setSelectedComponent(AD);
         }else{
         Contenedor.setSelectedComponent(AD);
         }
         administrar = "1";
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null, e.getMessage());  
        }
    }
   
  
   
    private void Abrir_URL() throws URISyntaxException {
      if (Desktop.isDesktopSupported()) {
          Desktop desktop = Desktop.getDesktop();
          try {
              URI uri = new URI("http://www.byspel.com");
             desktop.browse(uri);
          } catch (IOException e) {
             System.err.println("Error: No se pudo abrir el enlace" + e.getMessage() );
          }
      } else {
          System.err.println("Error: Error de compatibilidad en la plataforma actual. No se puede abrir enlaces web.");
      }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTabbedPane Contenedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel labelLoading;
    private javax.swing.JLabel lbfondo;
    // End of variables declaration//GEN-END:variables
}
