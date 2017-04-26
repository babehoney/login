/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author IdlhDeveloper
 */
public class Consultations {
    
public String UpdatePass(String var2, String var3){
    return "UPDATE login SET pasSword='"+var2+"' WHERE id='1' AND estado = '1';";
}    
public String Count_Login(String var1, String var2){
    return "SELECT COUNT(id) FROM login WHERE pasSword ='"+var1+"' AND loGin='"+var2+"' ";
}
public String Count_Login2(String var1){
    return "SELECT COUNT(id) FROM login WHERE pasSword ='"+var1+"' AND id='1' ";
}
}
