/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;

/**
 *
 * @author JUDMEZ
 */
public class Funciones {

    public void Cerrar() {
        GUI.Menu_Principal.Contenedor.remove(GUI.Menu_Principal.Contenedor.getSelectedIndex());
    }

    public String byteArrToString(byte[] b) {
        String res = null;
        StringBuilder sb = new StringBuilder(b.length * 2);
        for (int i = 0; i < b.length; i++) {
            int j = b[i] & 0xff;
            if (j < 16) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(j));
        }
        res = sb.toString();
        return res.toUpperCase();
    }

    public boolean executeUpdate(String SQL) {
        boolean retorno = false;
        try {
            Connect BD = new Connect();
            BD.ConectarBasedeDatos();
            BD.sentencia.executeUpdate(SQL);
            BD.DesconectarBasedeDatos();
            retorno = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Aplicacion", JOptionPane.ERROR_MESSAGE);
        }
        return retorno;
    }

    public Object[][] RetornarDatos(String sql) {
        Connect BD = new Connect();
        try {
            BD.ConectarBasedeDatos();
            BD.resultado = BD.sentencia.executeQuery(sql);
            Object[][] obj = this.ResultSetToArray(BD.resultado);
            BD.resultado.close();
            BD.DesconectarBasedeDatos();
            return obj;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Aplicacion", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public Object[][] ResultSetToArray(ResultSet rs) {
        Object obj[][] = null;
        try {
            rs.last();
            ResultSetMetaData rsmd = rs.getMetaData();
            int numCols = rsmd.getColumnCount();
            int numFils = rs.getRow();
            obj = new Object[numFils][numCols];
            int j = 0;
            rs.beforeFirst();
            while (rs.next()) {
                for (int i = 0; i < numCols; i++) {
                    obj[j][i] = rs.getObject(i + 1);
                }
                j++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Aplicacion", JOptionPane.ERROR_MESSAGE);
        }
        return obj;
    }
}
