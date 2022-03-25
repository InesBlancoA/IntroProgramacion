package com.mycompany.proyecto;


public abstract class Personal {

    
  
    protected String nombre;
    protected String apellido1;
    protected String apellido2;
    protected String identificacion;
    protected double Salario;
    protected int edad;
    
    public Personal(String nombre, String apellido1, String apellido2, String identificacion, double Salario, int edad) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.identificacion = identificacion;
        this.Salario = Salario;
        this.edad = edad;
    }

    public Personal() {
        
        this.nombre ="";
        this.apellido1 = "";
        this.apellido2 = "";
        this.identificacion = "";
        this.Salario = 0;
        this.edad = 0;
        
    }
    
    
    
    
    
    
    
    public abstract void conexion();
    
    public abstract void agregar_persona();
    
    public abstract void mostrar_reporte_personal();
    
    public abstract void buscar_por_codigo_empleado();
    
    public abstract void borrar_por_codigo_empleado();
    
    public abstract void actualizar_info_empleado();
    
    
    
    
    
    
}
