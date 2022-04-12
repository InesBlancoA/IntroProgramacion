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




public class Consolas extends Producto{

    //Atributos para crear el archivo
    private String ruta;
    private String nombre_archivo;
    private Producto obj_producto_consola;
    
    //Atributos de las consolas
    private String memoria;
    private String cant_juegos;

    public Consolas(String ruta, String nombre_archivo, Producto obj_producto_consola, String memoria, String cant_juegos) {
        this.ruta = ruta;
        this.nombre_archivo = nombre_archivo;
        this.obj_producto_consola = obj_producto_consola;
        this.memoria = memoria;
        this.cant_juegos = cant_juegos;
    }

    public Consolas() {
        this.ruta = "";
        this.nombre_archivo = "Consolas.txt";
        this.obj_producto_consola = new Producto();
        
        this.memoria = "";
        this.cant_juegos = "";
    }
    
    public Consolas(String memoria, String cant_juegos) {
     
        this.memoria = "";
        this.cant_juegos = "";
    }
    
    public Consolas(Producto obj_producto_consola ) {
        this.ruta = "";
        this.nombre_archivo = "Consolas.txt";
        this.obj_producto_consola = new Producto();
        
        this.memoria = "";
        this.cant_juegos = "";
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

    public Producto getObj_producto_consola() {
        return obj_producto_consola;
    }

    public void setObj_producto_consola(Producto obj_producto_consola) {
        this.obj_producto_consola = obj_producto_consola;
        
    }
    
    

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getCant_juegos() {
        return cant_juegos;
    }

    public void setCant_juegos(String cant_juegos) {
        this.cant_juegos = cant_juegos;
    }
    
    
    
    
    
    
    
    
    
    
    
    
   
    public void conexion() {
        
        
       try{
           
           String contenido="";
           
           File arch_consola = new File (this.ruta+this.nombre_archivo);
           
           
           
           if (!arch_consola.exists()){
               
               arch_consola.createNewFile();
               
           }
           
           
           FileWriter fw = new FileWriter (arch_consola);
           BufferedWriter bw = new BufferedWriter (fw);
           
           bw.write(contenido);
           bw.close();
           
           
       }catch (Exception e){
           
           e.printStackTrace();
    
       } 
     
        
    }// fin de la clase conexion

 
    public void agregar_producto() {
        
        try{
           
            File arch_consola = new File (this.ruta+this.nombre_archivo);
            
            if(!arch_consola.exists()){
                
                arch_consola.createNewFile();
                
            }
            
            FileWriter fw = new FileWriter (arch_consola,true);
            BufferedWriter bw = new BufferedWriter (fw);
            
            bw.write(this.obj_producto_consola.getCod_producto()+","+this.obj_producto_consola.getNombre()+","+this.obj_producto_consola.getMarca()+","+
                    this.obj_producto_consola.getPrecio()+","+this.obj_producto_consola.getCantidad()+","+this.memoria+","+this.cant_juegos);
            
            //Salva los cambios sin afectar lo que ya existe
            bw.flush();
            
            //Agrega los datos en una nueva línea
            bw.newLine();
            
            bw.close();
            
            
        }catch(Exception e){
            
            e.printStackTrace(); 
        }
        
    
        
    }

  
    public DefaultTableModel mostrar_reporte_producto(){
        
        Vector VectCabe = new Vector();
        VectCabe.addElement("Codigo");
        VectCabe.addElement("Marca");
        VectCabe.addElement("Nombre");
        VectCabe.addElement("Precio");
        VectCabe.addElement("Cantidad");
        VectCabe.addElement("Memoria");
        VectCabe.addElement("Juegos");
        
        DefaultTableModel tabla = new DefaultTableModel(VectCabe,0);
        
        
        try {
        
        String registro = "";
        
        File arch_consola= new File (this.ruta+this.nombre_archivo);  
        
        
        FileReader fr = new FileReader (arch_consola);
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

    
    public DefaultTableModel buscar_por_codigo_producto(String buscar_codigo_consola) {
        
        Vector VectCabe = new Vector();
        VectCabe.addElement("Codigo");
        VectCabe.addElement("Marca");
        VectCabe.addElement("Nombre");
        VectCabe.addElement("Precio");
        VectCabe.addElement("Cantidad");
        VectCabe.addElement("Memoria");
        VectCabe.addElement("Juegos");
        
        DefaultTableModel tabla = new DefaultTableModel(VectCabe,0);
        
        
        try{
            
            String registro = "";
            boolean encuentra=false;
            
            File arch_consola = new File (this.ruta+this.nombre_archivo); 
            
            FileReader fr = new FileReader (arch_consola);
            BufferedReader br = new BufferedReader (fr);
            
            while ((registro = br.readLine())!=null){
            
            StringTokenizer st= new StringTokenizer (registro,",");
            
            Vector vector1 = new Vector();
            while(st.hasMoreTokens()){
                vector1.addElement(st.nextToken());
            }
            if (vector1.contains(buscar_codigo_consola)){
                    tabla.addRow(vector1);
                    encuentra=true;
            }
        }
   
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, e); 
           
        }
        return tabla;
    }

    
    public DefaultTableModel borrar_por_codigo_producto(String buscar_codigo_consola) {
       
        Vector VectCabe = new Vector();
        VectCabe.addElement("Codigo");
        VectCabe.addElement("Marca");
        VectCabe.addElement("Nombre");
        VectCabe.addElement("Precio");
        VectCabe.addElement("Cantidad");
        VectCabe.addElement("Memoria");
        VectCabe.addElement("Juegos");
        
        DefaultTableModel tabla = new DefaultTableModel(VectCabe,0);
        
       try{
           
           
           String registro= "";
           boolean encuentra=false;
           
           File tempDB= new File(this.ruta+"Consolas_temporal.txt");
           File db= new File (this.ruta+this.nombre_archivo);
           
           BufferedReader br= new BufferedReader (new FileReader(db));
           BufferedWriter bw = new BufferedWriter (new FileWriter(tempDB));
           
           while ((registro = br.readLine())!=null){
                
                StringTokenizer st= new StringTokenizer (registro,",");
                
                Vector vector1 = new Vector();
                while(st.hasMoreTokens()){
                 vector1.addElement(st.nextToken());
                }
                if (vector1.contains(buscar_codigo_consola)){
                    tabla.addRow(vector1);
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
       return tabla;
  
    }

    
    public void actualizar_info_producto(String buscar_codigo_consola) {
        
        
        try{
           
           String nuevaMarca, nuevoNombre,nuevaMemoria,nuevaCantJuegos, registro,registro2;
           Double nuevoPrecio;
           int nuevoCodigo,nuevaCantidad;
           boolean encuentra=false; 
            
           File db = new File(this.ruta+this.nombre_archivo);
           File tempDB = new File(this.ruta+"Computadoras_temporal.txt");

           BufferedReader br = new BufferedReader( new FileReader(db) );
           BufferedWriter bw = new BufferedWriter( new FileWriter(tempDB) );
           
           while( ( registro = br.readLine() ) != null ) {

                    StringTokenizer st = new StringTokenizer(registro,",");
                    
                    Vector vector1 = new Vector();
                    while(st.hasMoreTokens()){
                     vector1.addElement(st.nextToken());
                    }
                    if (vector1.contains(buscar_codigo_consola)){
                     encuentra=true;
                    }
            }
           
           
            br.close();
            
            nuevoCodigo = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el nuevo código"));
            nuevaMarca = JOptionPane.showInputDialog(null,"Digite la nueva marca");
            nuevoNombre = JOptionPane.showInputDialog(null,"Digite el nuevo nombre");
            nuevoPrecio = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el nuevo precio"));
            nuevaCantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la nueva cantidad"));
            nuevaMemoria= JOptionPane.showInputDialog(null,"Digite la nueva memoria");
            nuevaCantJuegos= JOptionPane.showInputDialog(null,"Digite la nueva cantidad de juegos");
            
            BufferedReader br2 = new BufferedReader( new FileReader(db) );

            while( (registro2 = br2.readLine() ) != null ) {    			
                    if(registro2.contains(buscar_codigo_consola)) {
                            bw.write(nuevoCodigo+","+nuevaMarca+","+nuevoNombre+","+nuevoPrecio+","+nuevaCantidad+","+nuevaMemoria+","+nuevaCantJuegos);
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
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        
        
        
        
        
     
    }
    
}
