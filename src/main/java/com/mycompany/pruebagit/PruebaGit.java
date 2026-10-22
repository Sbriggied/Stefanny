

package com.mycompany.pruebagit;

import javax.swing.JOptionPane;


public class Pruebagit {

    public static void main(String[] args) {
        int entrada, hora, minutos, segundos;
        
        entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite los segundos"));
        
        hora = entrada/3600;
        segundos = (entrada % 60);
        minutos = (entrada % 3600) / 60;
        
        JOptionPane.showMessageDialog(null, "H " +hora+ "M " +minutos+ "S" +segundos);
        
    }
}

// c"
