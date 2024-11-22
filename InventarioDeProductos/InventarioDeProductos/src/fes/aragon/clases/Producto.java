package fes.aragon.clases;

import java.util.Objects;

public class Producto implements Comparable<Producto>{
    private String nombreProducto;
    private Integer id;
    private double precio;
    private Integer cantidadInventario;

    @Override
    public int compareTo(Producto otroProducto) {
        return this.id.compareTo(otroProducto.getId());
    }

    public Producto() {
    }

    public Producto(String nombreProducto,Integer id, double precio, Integer cantidadInventario) {
        this.nombreProducto = nombreProducto;
        this.id = id;
        this.precio = precio;
        this.cantidadInventario = cantidadInventario;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Integer getCantidadInventario() {
        return cantidadInventario;
    }

    public void setCantidadInventario(Integer cantidadInventario) {
        this.cantidadInventario = cantidadInventario;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "Nombre del Producto= '" + nombreProducto + '\'' +
                ", Id= " + id +
                ", Precio= " + precio +
                ", Cantidad en el Inventario= " + cantidadInventario +
                '}';
    }
}