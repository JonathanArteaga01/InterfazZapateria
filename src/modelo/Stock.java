package modelo;

public class Stock extends Productos {
    private int existenciaProducto;

    public Stock(int idProducto, String nombreProducto, String tallaProducto, 
                 double precioProveedor, double precioTienda, 
                 int cantidadARegistrar, String nombreProveedor,
                 int existenciaProducto) {
        super(idProducto, nombreProducto, tallaProducto, precioProveedor, precioTienda, cantidadARegistrar, nombreProveedor);
        this.existenciaProducto = existenciaProducto;
    }

    // Getters y setters
    public int getExistenciaProducto() {
        return existenciaProducto;
    }

    public void setExistenciaProducto(int existenciaProducto) {
        this.existenciaProducto = existenciaProducto;
    }
}
