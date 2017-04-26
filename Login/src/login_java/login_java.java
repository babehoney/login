/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_java;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
/**
 *
 * @author JUDMEZ
 */
public class login_java {
static GUI.Inicio i;
public static int usuario='1';
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
        }
        i = new GUI.Inicio();
        i.show();
    }
    
}
