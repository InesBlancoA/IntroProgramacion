package com.mycompany.proyecto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Celulares extends Producto {
    
    //Se establecen las variables para celulares
    private String modelo, funcionalidades;
    
    //Se establecen las variables para crear el archivo de texto
    private String ruta, nomb_archivo;
    private Producto obj_producto_celulares;
    
    //Constructores de la clase

    public Celulares(String modelo, String funcionalidades, String ruta, String nomb_archivo, Producto obj_producto_celulares) {
        this.modelo = modelo;
        this.funcionalidades = funcionalidades;
        this.ruta = ruta;
        this.nomb_archivo = nomb_archivo;
        this.obj_producto_celulares = obj_producto_celulares;
    }
    
    public Celulares() {
        this.modelo = "";
        this.funcionalidades = "";
        this.ruta = "";
        this.nomb_archivo = "Celulares.txt";
        this.obj_producto_celulares = new Producto();
    }

    public Celulares(String modelo, String funcionalidades) {
        this.modelo = modelo;
        this.funcionalidades = funcionalidades;
    }
    
    public Celulares(Producto obj_producto_celulares){
        this.modelo = "";
        this.funcionalidades = "";
        this.ruta = "";
        this.nomb_archivo = "Celulares.txt";
        this.obj_producto_celulares = new Producto();       
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFuncionalidades() {
        return funcionalidades;
    }

    public void setFuncionalidades(String funcionalidades) {
        this.funcionalidades = funcionalidades;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getNomb_archivo() {
        return nomb_archivo;
    }

    public void setNomb_archivo(String nomb_archivo) {
        this.nomb_archivo = nomb_archivo;
    }

    public Producto getObj_producto_celulares() {
        return obj_producto_celulares;
    }

    public void setObj_producto_celulares(Producto obj_producto_celulares) {
        this.obj_producto_celulares = obj_producto_celulares;
    }

    //Metodos de la clase
    
    public void conexion() {
        
        try{
           
           String contenido = "";
           
           File arch_celulares = new File (this.ruta+this.nomb_archivo);
           
           
           
           if (!arch_celulares.exists()){
               
               arch_celulares.createNewFile();
               
           }
           
           
           FileWriter fw = new FileWriter (arch_celulares);
           BufferedWriter bw = new BufferedWriter (fw);
           
           bw.write(contenido);
           bw.close();
           
           
       }catch (Exception e){
           
           e.printStackTrace();
    
       } 
    }

   
    public void agregar_producto() {
        
        try{
           
            File arch_celulares = new File (this.ruta+this.nomb_archivo);
            
            if(!arch_celulares.exists()){
                
                arch_celulares.createNewFile();
                
            }
            
            FileWriter fw = new FileWriter (arch_celulares,true);
            BufferedWriter bw = new BufferedWriter (fw);
            
            bw.write(this.obj_producto_celulares.getCod_producto()+","+this.obj_producto_celulares.getNombre()+","+this.obj_producto_celulares.getMarca()+","+
                    this.obj_producto_celulares.getPrecio()+","+this.obj_producto_celulares.getCantidad()+","+this.marca+","+this.modelo+","+this.funcionalidades);
            
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
        VectCabe.addElement("Modelo");
        VectCabe.addElement("Funcionalidades");
        
        DefaultTableModel tabla = new DefaultTableModel(VectCabe,0);
        
        
        try {
        
        String registro = "";
        
        File arch_celulares = new File (this.ruta+this.nomb_archivo);  
        
        
        FileReader fr = new FileReader (arch_celulares);
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
          
      } return tabla;
    }

    
    public DefaultTableModel buscar_por_codigo_producto(String buscar_codigo) {
        
        Vector VectCabe = new Vector();
        VectCabe.addElement("Codigo");
        VectCabe.addElement("Marca");
        VectCabe.addElement("Nombre");
        VectCabe.addElement("Precio");
        VectCabe.addElement("Cantidad");
        VectCabe.addElement("Modelo");
        VectCabe.addElement("Funcionalidades");
        
        DefaultTableModel tabla = new DefaultTableModel(VectCabe,0);
        
        try {
        
        String registro = "";
        boolean encuentra = false;
        
        File arch_celulares= new File (this.ruta+this.nomb_archivo);  
        
        
        FileReader fr = new FileReader (arch_celulares);
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

    public DefaultTableModel borrar_por_codigo_producto(String buscar_codigo) {
        
        Vector VectCabe = new Vector();
        VectCabe.addElement("Codigo");
        VectCabe.addElement("Marca");
        VectCabe.addElement("Nombre");
        VectCabe.addElement("Precio");
        VectCabe.addElement("Cantidad");
        VectCabe.addElement("Modelo");
        VectCabe.addElement("Funcionalidades");
        
        DefaultTableModel tabla = new DefaultTableModel(VectCabe,0);
        
       try{
           
           
           String registro = "";
           boolean encuentra = false;
           
           File tempDB = new File(this.ruta + "Celulares_temporal.txt");
           File db = new File (this.ruta + this.nomb_archivo);
           
           BufferedReader br= new BufferedReader (new FileReader(db));
           BufferedWriter bw = new BufferedWriter (new FileWriter(tempDB));
           
           while ((registro = br.readLine())!=null){
                
                StringTokenizer st= new StringTokenizer (registro,",");
                
                Vector vector1 = new Vector();
                
                while(st.hasMoreTokens()){
                 vector1.addElement(st.nextToken());
                }
                if (vector1.contains(buscar_codigo)){
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

    
    public void actualizar_info_producto(String buscar_codigo) {
        
        try{
           
           String nuevaMarca, nuevoNombre,nuevoModelo,nuevasFuncionalidades, registro,registro2;
           Double nuevoPrecio;
           int nuevoCodigo,nuevaCantidad;
           boolean encuentra = false; 
            
           File db = new File(this.ruta+this.nomb_archivo);
           File tempDB = new File(this.ruta+"Celulares_temporal.txt");

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
            nuevoModelo = JOptionPane.showInputDialog(null,"Digite el nuevo modelo del celular");
            nuevasFuncionalidades = JOptionPane.showInputDialog(null,"Digite las nuevas funcionalidades del celular");
            
            BufferedReader br2 = new BufferedReader( new FileReader(db) );

            while( (registro2 = br2.readLine() ) != null ) {    			
                    if(registro2.contains(buscar_codigo)) {
                            bw.write(nuevoCodigo+","+nuevaMarca+","+nuevoNombre+","+nuevoPrecio+","+nuevaCantidad+","+nuevoModelo+","+nuevasFuncionalidades);
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
