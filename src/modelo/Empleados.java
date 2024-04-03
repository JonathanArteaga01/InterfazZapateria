package modelo;

public class Empleados {
    private int idEmpleado;
    private String nombreEmpleado;
    private String apellidoEmpleado;
    private int edad;
    private String direccion;
    private String curp;
    private String rfc;
    private String sexo;
    private String fechaIngreso;
    private String situacionSentimental;
    private String tipoSangre;

    public Empleados(int idEmpleado, String nombreEmpleado, String apellidoEmpleado, int edad,
                     String direccion, String curp, String rfc, String sexo, String fechaIngreso,
                     String situacionSentimental, String tipoSangre) {
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
        this.edad = edad;
        this.direccion = direccion;
        this.curp = curp;
        this.rfc = rfc;
        this.sexo = sexo;
        this.fechaIngreso = fechaIngreso;
        this.situacionSentimental = situacionSentimental;
        this.tipoSangre = tipoSangre;
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

    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getSituacionSentimental() {
        return situacionSentimental;
    }

    public void setSituacionSentimental(String situacionSentimental) {
        this.situacionSentimental = situacionSentimental;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }
}
