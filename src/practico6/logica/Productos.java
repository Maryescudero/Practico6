
package practico6.logica;

/**
 *
 * @author marus
 */
public class Productos implements Comparable<Productos> { 
    private int codigo;
    private String descripcion;
    private double precio;
    private int stock;
    private Categorias rubro;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Categorias getRubro() {
        return rubro;
    }

    public void setRubro(Categorias rubro) {
        this.rubro = rubro;
    }

    public Productos(int codigo, String descripcion, double precio, int stock, Categorias rubro) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.rubro = rubro;
    }

    @Override
    public int compareTo(Productos t) {
         if(codigo == t.codigo){
        
            return 0;
        } else if(codigo > t.codigo){
        
            return 1;
        }else {
        
            return -1;
        }
    }
    
   
    }


    

