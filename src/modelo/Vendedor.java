package modelo;

public class Vendedor {

    private int id_vendedor;
    private String dui_vendedor;
    private String nombre_vendedor;
    private String celular_vendedor;
    private String estado_vendedor;
    private String user_vendedor;

    public Vendedor() {
    }

    public Vendedor(int id_vendedor, String dui_vendedor, String nombre_vendedor, String celular_vendedor, String estado_vendedor, String user_vendedor) {
        this.id_vendedor = id_vendedor;
        this.dui_vendedor = dui_vendedor;
        this.nombre_vendedor = nombre_vendedor;
        this.celular_vendedor = celular_vendedor;
        this.estado_vendedor = estado_vendedor;
        this.user_vendedor = user_vendedor;
    }

    public String getUser_vendedor() {
        return user_vendedor;
    }

    public void setUser_vendedor(String user_vendedor) {
        this.user_vendedor = user_vendedor;
    }

    public int getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    public String getDui_vendedor() {
        return dui_vendedor;
    }

    public void setDui_vendedor(String dui_vendedor) {
        this.dui_vendedor = dui_vendedor;
    }

    public String getNombre_vendedor() {
        return nombre_vendedor;
    }

    public void setNombre_vendedor(String nombre_vendedor) {
        this.nombre_vendedor = nombre_vendedor;
    }

    public String getCelular_vendedor() {
        return celular_vendedor;
    }

    public void setCelular_vendedor(String celular_vendedor) {
        this.celular_vendedor = celular_vendedor;
    }

    public String getEstado_vendedor() {
        return estado_vendedor;
    }

    public void setEstado_vendedor(String estado_vendedor) {
        this.estado_vendedor = estado_vendedor;
    }

}
