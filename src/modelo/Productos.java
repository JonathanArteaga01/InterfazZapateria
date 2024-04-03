package modelo;

public class Productos extends Proveedores {
    private int idProducto;
    private String nombreProducto;
    private String tallaProducto;
    private double precioTienda;
    private int cantidadARegistrar;

    public Productos(int idProducto, String nombreProducto, String tallaProducto, 
                     double precioProveedor, double precioTienda, 
                     int cantidadARegistrar, String nombreProveedor) {
        super(0, nombreProveedor, "", ""); // Se pasa 0 como idProveedor y se dejan vacíos los otros parámetros
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.tallaProducto = tallaProducto;
        this.precioTienda = precioTienda;
        this.cantidadARegistrar = cantidadARegistrar;
    }

    // Getters y setters
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getTallaProducto() {
        return tallaProducto;
    }

    public void setTallaProducto(String tallaProducto) {
        this.tallaProducto = tallaProducto;
    }

    public double getPrecioTienda() {
        return precioTienda;
    }

    public void setPrecioTienda(double precioTienda) {
        this.precioTienda = precioTienda;
    }

    public int getCantidadARegistrar() {
        return cantidadARegistrar;
    }

    public void setCantidadARegistrar(int cantidadARegistrar) {
        this.cantidadARegistrar = cantidadARegistrar;
    }
}
