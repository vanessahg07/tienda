package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String nombre;
    private List<Producto> productos;

    public Tienda(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void mostrarProductos() {
        System.out.println("Productos en la tienda '" + nombre + "':");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}