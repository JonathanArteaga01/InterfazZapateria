package modelo;


public class Clientes {
    private int idCliente;
    private String correoCliente;

    public Clientes(int idCliente, String correoCliente) {
        this.idCliente = idCliente;
        this.correoCliente = correoCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }
}

