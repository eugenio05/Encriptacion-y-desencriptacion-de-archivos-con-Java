/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyectoseguridad;

import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author eugen
 */
public class Limpiar {
    public void limpiar(JPanel panel) {
        for (Object o : panel.getComponents()) {
            if (o instanceof JTextField jTextField ) {
                jTextField.setText("");
                
            }
            
        }        
    }
}
