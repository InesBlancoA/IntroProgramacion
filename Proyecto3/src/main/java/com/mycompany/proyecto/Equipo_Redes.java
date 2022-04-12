package com.mycompany.proyecto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Equipo_Redes extends Producto{
    
    //Atributos equipo de redes
    private String tipo;
    private String red;
    
    //Atributos para crear el archivo
    private String ruta;
    private String nombre_archivo;
    private Producto obj_producto_equipo_redes;
    
    //Constructor
    public Equipo_Redes(String tipo, String red, String ruta, String nombre_archivo, Producto obj_producto_equipo_redes) {
        this.tipo = tipo;
        this.red = red;
        this.ruta = ruta;
        this.nombre_archivo = nombre_archivo;
        this.obj_producto_equipo_redes = obj_producto_equipo_redes;
    }
    public Equipo_Redes() {
        this.tipo = "";
        this.red = "";
        this.ruta = "";
        this.nombre_archivo = "Equipo_Redes.txt";
        this.obj_producto_equipo_redes = new Producto();
    }
    
    //Getter and Setter
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRed() {
        return red;
    }

    public void setRed(String red) {
        this.red = red;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getNombre_archivo() {
        return nombre_archivo;
    }

    public void setNombre_archivo(String nombre_archivo) {
        this.nombre_archivo = nombre_archivo;
    }

    public Producto getObj_producto_equipo_redes() {
        return obj_producto_equipo_redes;
    }

    public void setObj_producto_equipo_redes(Producto obj_producto_equipo_redes) {
        this.obj_producto_equipo_redes = obj_producto_equipo_redes;
    }
    
    
    //Metodos
    public void conexion() {
        
        try{
           String contenido = "";
           
           File arch_equipo_redes = new File (this.ruta+this.nombre_archivo);
           
           if (!arch_equipo_redes.exists()){
               arch_equipo_redes.createNewFile();
           }
        
           FileWriter fw = new FileWriter (arch_equipo_redes);
           BufferedWriter bw = new BufferedWriter (fw);
           
           bw.write(contenido);
           bw.close();
           
           
        }catch (Exception e){
           e.printStackTrace();
        }
    }   
        
    public void agregar_producto() {
        
        try{
            File arch_equipo_redes = new File (this.ruta+this.nombre_archivo);
            
            if(!arch_equipo_redes.exists()){
                arch_equipo_redes.createNewFile();
            }
            
            FileWriter fw = new FileWriter (arch_equipo_redes,true);
            BufferedWriter bw = new BufferedWriter (fw);
            
            bw.write(this.obj_producto_equipo_redes.getCod_producto()+","+this.obj_producto_equipo_redes.getMarca()+","+this.obj_producto_equipo_redes.getNombre()+","+
                    this.obj_producto_equipo_redes.getPrecio()+","+this.obj_producto_equipo_redes.getCantidad()+","+this.tipo+","+this.red);
            
            //Salva los cambios sin afectar lo que ya existe
            bw.flush();
            
            //Agrega los datos en una nueva línea
            bw.newLine();
            
            bw.close();
            
            
        }catch(Exception e){
            
            e.printStackTrace(); 
        }
    }
    
        
    public DefaultTableModel mostrar_reporte_producto() {
        Vector VectCabe = new Vector();
        VectCabe.addElement("Codigo");
        VectCabe.addElement("Marca");
        VectCabe.addElement("Nombre");
        VectCabe.addElement("Precio");
        VectCabe.addElement("Cantidad");
        VectCabe.addElement("Tipo");
        VectCabe.addElement("Descripción");
        
        DefaultTableModel tabla = new DefaultTableModel(VectCabe,0);
        
        try {
            String registro = "";
        
            File arch_equipo_redes= new File (this.ruta+this.nombre_archivo);  


            FileReader fr = new FileReader (arch_equipo_redes);
            BufferedReader br = new BufferedReader (fr);
        
        while ((registro = br.readLine())!=null){
            
            StringTokenizer st= new StringTokenizer (registro,",");
            
            Vector vector1 = new Vector();
            while(st.hasMoreTokens()){
                vector1.addElement(st.nextToken());
            }
            
            tabla.addRow(vector1);
        }
        
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return tabla;
    }

    public DefaultTableModel buscar_por_codigo_producto(String buscar_codigo) {
        Vector VectCabe = new Vector();
        VectCabe.addElement("Codigo");
        VectCabe.addElement("Marca");
        VectCabe.addElement("Nombre");
        VectCabe.addElement("Precio");
        VectCabe.addElement("Cantidad");
        VectCabe.addElement("Tipo");
        VectCabe.addElement("Descripción");
        
        DefaultTableModel tabla = new DefaultTableModel(VectCabe,0);
        
        try {
            String registro = "";
            boolean encuentra=false;
        
            File arch_equipo_redes= new File (this.ruta+this.nombre_archivo);  
            FileReader fr = new FileReader (arch_equipo_redes);
            BufferedReader br = new BufferedReader (fr);
        
        while ((registro = br.readLine())!=null){
            
            StringTokenizer st= new StringTokenizer (registro,",");
            
            Vector vector1 = new Vector();
            while(st.hasMoreTokens()){
                vector1.addElement(st.nextToken());
            }
            if (vector1.contains(buscar_codigo)){
                    tabla.addRow(vector1);
                    encuentra=true;
            }
        }
        
        }catch (Exception e){
          
          JOptionPane.showMessageDialog(null, e);
        }
        return tabla;
    }
    
    public void borrar_por_codigo_producto(String buscar_codigo) {
        
        try{
            String registro= "";
            boolean encuentra=false;
            
            File tempDB= new File(this.ruta+"Equipo_Redes_temporal.txt");
            File db= new File (this.ruta+this.nombre_archivo);
            
            BufferedReader br= new BufferedReader (new FileReader(db));
            BufferedWriter bw = new BufferedWriter (new FileWriter(tempDB));
            
            while ((registro = br.readLine())!=null){
                
                StringTokenizer st= new StringTokenizer (registro,",");
                
                Vector vector1 = new Vector();
                while(st.hasMoreTokens()){
                 vector1.addElement(st.nextToken());
                }
                if (vector1.contains(buscar_codigo)){
                    encuentra=true;
                }else{
                    bw.write(registro);
                    bw.flush();
                    bw.newLine();
                }
            }
            br.close();
            bw.close();
            
            if (encuentra){
                if (JOptionPane.showConfirmDialog(null, "Realmente desea borrar el producto?", "WARNING",
                      JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        db.delete();
                        tempDB.renameTo(db);
                        JOptionPane.showMessageDialog(null, "Producto Eliminado Correctamente");
                } else {
                       tempDB.delete();
                }
               
            }else{
                JOptionPane.showMessageDialog(null, "No se encontraron coincidencias con los parámetros de búsqueda");
                tempDB.delete();
            }
            tempDB.delete();
            
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
     
    public void actualizar_info_producto(String buscar_codigo) {
        try{
            String nuevaMarca, nuevoNombre, nuevoTipo, nuevaDescripción, registro, ced, registro2;
            Double nuevoPrecio;
            int nuevoCodigo, nuevaCantidad;
            boolean encuentra=false;
            
            File db = new File(this.ruta+this.nombre_archivo);
            File tempDB = new File(this.ruta+"Equipo_Redes_temporal.txt");

            BufferedReader br = new BufferedReader( new FileReader(db) );
            BufferedWriter bw = new BufferedWriter( new FileWriter(tempDB) );

            while( ( registro = br.readLine() ) != null ) {

                    StringTokenizer st = new StringTokenizer(registro,",");
                    
                    Vector vector1 = new Vector();
                    while(st.hasMoreTokens()){
                     vector1.addElement(st.nextToken());
                    }
                    if (vector1.contains(buscar_codigo)){
                     encuentra=true;
                    }
            }
            br.close();
            nuevoCodigo = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el nuevo código"));
            nuevaMarca = JOptionPane.showInputDialog(null,"Digite la nueva marca");
            nuevoNombre = JOptionPane.showInputDialog(null,"Digite el nuevo nombre");
            nuevoPrecio = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el nuevo precio"));
            nuevaCantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la nueva cantidad"));
            nuevoTipo = JOptionPane.showInputDialog(null,"Digite el nuevo tipo");
            nuevaDescripción = JOptionPane.showInputDialog(null,"Digite la nueva descripción");

            BufferedReader br2 = new BufferedReader( new FileReader(db) );

            while( (registro2 = br2.readLine() ) != null ) {    			
                    if(registro2.contains(buscar_codigo)) {
                            bw.write(nuevoCodigo+","+nuevaMarca+","+nuevoNombre+","+nuevoPrecio+","+nuevaCantidad+","+nuevoTipo+","+nuevaDescripción);
                    } else {
                            bw.write(registro2);	
                    }    			
                    bw.flush();
                    bw.newLine();
            }
            bw.close();
            br2.close();    		
            db.delete();    		
            boolean resultado = tempDB.renameTo(db);
            
            if (resultado){
                JOptionPane.showMessageDialog(null, "Actualizado correctamente.");                
            }

        }catch (Exception e) {
         e.printStackTrace();
        }
    }
    
    
}
