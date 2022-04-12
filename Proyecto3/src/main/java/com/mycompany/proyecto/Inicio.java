
package com.mycompany.proyecto;


public class Inicio {

   
    public static void main(String[] args) {
        
        iniciar_sistema();
    }
    
    public static void iniciar_sistema(){
        
        frm_inicio_sesion objeto_inicio = new frm_inicio_sesion();
        
        objeto_inicio.setLocationRelativeTo(null);
        
        objeto_inicio.setVisible(true);
    }
    
    
}
