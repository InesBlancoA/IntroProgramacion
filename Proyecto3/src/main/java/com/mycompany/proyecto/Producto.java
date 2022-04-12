package com.mycompany.proyecto;


public  class Producto {
    
    
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

    public int getCod_producto() {
        return cod_producto;
    }

    public void setCod_producto(int cod_producto) {
        this.cod_producto = cod_producto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    
    
    
        
    
    
    
    
    
}
