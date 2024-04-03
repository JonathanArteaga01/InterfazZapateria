package modelo;

public class Ventas extends Productos {
    private int idVenta;
    private int cantidadVendida;
    private String fechaVenta;
    private String metodoPago;
    private int idEmpleado;
    private String nombreEmpleado;

    public Ventas(int idProducto, String nombreProducto, String tallaProducto, 
                  double precioProveedor, double precioTienda, 
                  int cantidadARegistrar, String nombreProveedor,
                  int idVenta, int cantidadVendida, String fechaVenta, 
                  String metodoPago, int idEmpleado, String nombreEmpleado) {
        super(idProducto, nombreProducto, tallaProducto, precioProveedor, precioTienda, cantidadARegistrar, nombreProveedor);
        this.idVenta = idVenta;
        this.cantidadVendida = cantidadVendida;
        this.fechaVenta = fechaVenta;
        this.metodoPago = metodoPago;
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
    }

    // Getters y setters
    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }
}
