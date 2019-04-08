
package trabajo;

public class VariablesDelServicio {
    
    private String Cliente, Rut, Producto, Codigo, Cantidad, Precio, Total;

    public VariablesDelServicio(String Cliente, String Rut, String Producto, String Codigo, String Cantidad, String Precio, String Total) {
        this.Cliente = Cliente;
        this.Rut = Rut;
        this.Producto = Producto;
        this.Codigo = Codigo;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
        this.Total = Total;
    }

    VariablesDelServicio() {
        
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public String getRut() {
        return Rut;
    }

    public void setRut(String Rut) {
        this.Rut = Rut;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String Total) {
        this.Total = Total;
    }
    
}
