
package ec.edu.espe.simuladorVentanas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoSubirProducto {
    private File archivoSubirProdutos;
    
    public void crearArchivoSubirProductos(){
        archivoSubirProdutos = new File("archivoSubirProductos.txt");
        
        try{
            if(archivoSubirProdutos.createNewFile()){
                
            }
        }
        catch(IOException ex){
            System.err.println("ERROR, "+ex);
        }
    }
    
    public void escribirTextoSubirProducto(Productos producto){
        try{
            FileWriter escribir = new FileWriter(archivoSubirProdutos, true);
            escribir.write(producto.getUsuario()+"%"+producto.getProducto()+"%"+producto.getCategoria()+"\r\n");
            escribir.close();
        }
        catch(IOException ex){
            System.err.println("ERROR, "+ex);
        }
    }
    
    
}
