/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
/**
 *
 * @author JUDMEZ
 */
public class Inicio extends javax.swing.JFrame {
public GUI.Menu_Principal Menu;
Clases.Funciones Functions = new Clases.Funciones();
Clases.Consultations Consultations = new Clases.Consultations();
public int u;
    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        setLocationRelativeTo(this);
     }
            
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new javax.swing.JPanel();
        panelLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Contenedor.setBackground(new java.awt.Color(255, 255, 255));
        Contenedor.setLayout(null);

        panelLogin.setBackground(new java.awt.Color(255, 255, 255));
        panelLogin.setLayout(null);

        jLabel1.setText("Usuario");
        panelLogin.add(jLabel1);
        jLabel1.setBounds(110, 80, 70, 20);

        jLabel2.setText("Contraseña");
        panelLogin.add(jLabel2);
        jLabel2.setBounds(100, 120, 90, 20);

        jTextField1.setText("admin");
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        panelLogin.add(jTextField1);
        jTextField1.setBounds(180, 80, 190, 20);

        jPasswordField1.setText("1234");
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyTyped(evt);
            }
        });
        panelLogin.add(jPasswordField1);
        jPasswordField1.setBounds(180, 120, 190, 20);

        jButton1.setText("Acceder");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelLogin.add(jButton1);
        jButton1.setBounds(250, 150, 120, 23);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/lock.png"))); // NOI18N
        panelLogin.add(jLabel3);
        jLabel3.setBounds(-10, 50, 130, 120);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Bienvenido");
        panelLogin.add(jLabel4);
        jLabel4.setBounds(110, 30, 70, 20);

        jLabel5.setText("Por favor ingrese sus credenciales de acceso");
        panelLogin.add(jLabel5);
        jLabel5.setBounds(150, 50, 280, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("LOGIN");
        panelLogin.add(jLabel6);
        jLabel6.setBounds(90, 10, 330, 17);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelLogin.add(jPanel1);
        jPanel1.setBounds(0, 560, 1010, 0);
        panelLogin.add(jLabel7);
        jLabel7.setBounds(0, 0, 1000, 560);

        Contenedor.add(panelLogin);
        panelLogin.setBounds(0, 0, 1000, 553);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        preval();
    }//GEN-LAST:event_jButton1ActionPerformed
private void preval(){
    if (!jTextField1.getText().isEmpty()) {
            if (!jPasswordField1.getText().isEmpty()) {
                Acceder();
            } else {
                JOptionPane.showMessageDialog(this, "Por favor ingrese su password");
                jPasswordField1.requestFocusInWindow();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor ingrese su usuario");
            jTextField1.requestFocusInWindow();
        }
}
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Object[] opciones = {"Aceptar", "Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(null, "En realidad desea cerrar la aplicacion", "Mensaje de Confirmacion",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
        if (eleccion == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
        }
    }//GEN-LAST:event_formWindowClosing

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char car = evt.getKeyChar();
        if((car<'a' || car>'z') && (car<'A' || car>'Z') && (car<'0' || car>'9')) evt.consume();
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jPasswordField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyTyped
        char car = evt.getKeyChar();
        if((car<'a' || car>'z') && (car<'A' || car>'Z') && (car<'0' || car>'9')) evt.consume();
    }//GEN-LAST:event_jPasswordField1KeyTyped

    private void jPasswordField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            preval();
        }
    }//GEN-LAST:event_jPasswordField1KeyReleased

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            preval();
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed
    private void Menu_principal() {
        try {
            Contenedor.removeAll();
            if (Menu == null) {
                Menu = new GUI.Menu_Principal();
            }
            Menu.setBounds(0, 0, 1010, 564);
            Contenedor.add(Menu);
            Menu.setVisible(true);
            Contenedor.validate();
            Contenedor.repaint();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }
     private void Acceder(){
        String password = new String(this.getPassword());
        String passwordFrom = null;
        int vV;
            try{
                MessageDigest MD5 = MessageDigest.getInstance("MD5");
                byte[] tmp = password.getBytes();
                MD5.update(tmp);
                passwordFrom = new String(Functions.byteArrToString(MD5.digest()).toCharArray());
                Object CLogin[][] = Functions.RetornarDatos(Consultations.Count_Login(passwordFrom, jTextField1.getText()));
                vV = Integer.parseInt(CLogin[0][0].toString());
                if(vV == 0){
                  JOptionPane.showMessageDialog(this, "Los datos de acceso son incorrectos");
                }else{
                   Menu_principal();
                }
          } catch (NoSuchAlgorithmException ex) {
              JOptionPane.showMessageDialog(null, ex.getMessage());
          }
    }
    public char[] getPassword(){
        return this.jPasswordField1.getPassword();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel panelLogin;
    // End of variables declaration//GEN-END:variables
}