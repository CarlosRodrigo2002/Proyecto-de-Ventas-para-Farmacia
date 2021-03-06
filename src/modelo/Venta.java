package modelo;

public class Venta {

    private int id_venta;
    private String fecha_venta;
    private double total_venta;
    private String estado_venta;
    private int cliente_id_cliente;
    private int vendedor_id_vendedor;

    public Venta() {
    }

    public Venta(int id_venta, String fecha_venta, double total_venta, String estado_venta, int cliente_id_cliente, int vendedor_id_vendedor) {
        this.id_venta = id_venta;
        this.fecha_venta = fecha_venta;
        this.total_venta = total_venta;
        this.estado_venta = estado_venta;
        this.cliente_id_cliente = cliente_id_cliente;
        this.vendedor_id_vendedor = vendedor_id_vendedor;
    }

    public int getVendedor_id_vendedor() {
        return vendedor_id_vendedor;
    }

    public void setVendedor_id_vendedor(int vendedor_id_vendedor) {
        this.vendedor_id_vendedor = vendedor_id_vendedor;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public String getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(String fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public double getTotal_venta() {
        return total_venta;
    }

    public void setTotal_venta(double total_venta) {
        this.total_venta = total_venta;
    }

    public String getEstado_venta() {
        return estado_venta;
    }

    public void setEstado_venta(String estado_venta) {
        this.estado_venta = estado_venta;
    }

    public int getCliente_id_cliente() {
        return cliente_id_cliente;
    }

    public void setCliente_id_cliente(int cliente_id_cliente) {
        this.cliente_id_cliente = cliente_id_cliente;
    }

}
