package co.edu.uniquindio.application;

import co.edu.uniquindio.poo.model.Producto;
import co.edu.uniquindio.poo.model.TipoProducto;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Producto producto = new Producto("Agua", 200.0, TipoProducto.REFRIGERADOS);
        double precioVenta = producto.calcularPrecioVenta();
        System.out.println("El precio de venta es: " + precioVenta);
    }
}
