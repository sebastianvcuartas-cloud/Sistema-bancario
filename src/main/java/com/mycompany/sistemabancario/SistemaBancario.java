/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemabancario;
import Vista.VistaBanco;
/**
 *
 * @author USUARIO
 */
public class SistemaBancario {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
               
                VistaBanco vista = new VistaBanco();
                
              
                vista.setLocationRelativeTo(null);
                
             
                vista.setVisible(true);
            }
        });
    }
    

}
