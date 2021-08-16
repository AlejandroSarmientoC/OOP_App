
package ec.edu.espe.simuladorVentanas;

/**
 *
 * @author alejandro
 */
public class Productos {
    private String usuario, producto,categoria;

    public Productos(String usuario, String producto, String categoria) {
        this.usuario = usuario;
        this.producto = producto;
        this.categoria = categoria;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    
}
