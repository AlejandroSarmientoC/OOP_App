
package ec.edu.espe.simuladorVentanas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author alejandro
 */
public class ArchivoGuardarUsuario {
    private File archivoSubirProdutos;
    
    public void crearArchivoSubirUsuario(){
        archivoSubirProdutos = new File("archivoGuardarUsuarios.txt");
        
        try{
            if(archivoSubirProdutos.createNewFile()){
                
            }
        }
        catch(IOException ex){
            System.err.println("ERROR, "+ex);
        }
    }
    
    public void escribirTextoSubirUsuario(Usuario persona){
        try{
            FileWriter escribir = new FileWriter(archivoSubirProdutos, true);
            escribir.write(persona.getUsuario()+"%"+persona.getCorreo()+"%"+persona.getContraseña()+"%"+persona.getDireccion()+"%"+persona.getTelefono()+"\r\n");
            escribir.close();
        }
        catch(IOException ex){
            System.err.println("ERROR, "+ex);
        }
    }
}
