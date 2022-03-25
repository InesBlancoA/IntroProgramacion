package com.mycompany.proyecto;


public abstract class Producto {
    
    //**PRUEBA***
    
    
    protected int cod_producto;
    protected String marca;
    protected String nombre;
    protected double precio;
    protected int cantidad;

    public Producto(int cod_producto, String marca, String nombre, double precio, int cantidad) {
        this.cod_producto = cod_producto;
        this.marca = marca;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Producto() {
        this.cod_producto = 0;
        this.marca = "";
        this.nombre = "";
        this.precio = 0;
        this.cantidad = 0;
    }
    
    
    
    public abstract void conexion();
    
    public abstract void agregar_producto();
    
    public abstract void mostrar_reporte_producto();
    
    public abstract void buscar_por_codigo_producto();
    
    public abstract void borrar_por_codigo_producto();
    
    public abstract void actualizar_info_producto();
    
    
        
    
    
    
    
    
}
