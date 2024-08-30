package co.edu.uniquindio.poo.model;

public class Producto {
        private String nombre;
        private double precioCompra;
        private TipoProducto tipo;
    
        public Producto(String nombre, double precioCompra, TipoProducto tipo) {
            this.nombre = nombre;
            this.precioCompra = precioCompra;
            this.tipo = tipo;
        }
    
        public String getNombre() {
            return nombre;
        }
    
        public double getPrecioCompra() {
            return precioCompra;
        }
    
        public TipoProducto getTipo() {
            return tipo;
        }
    
        public double calcularPrecioVenta() {
            double incremento = 0.0;
    
            if (tipo == TipoProducto.REFRIGERADOS) {
                incremento = 0.10;
            } else if (tipo == TipoProducto.PERECEDEROS) {
                incremento = 0.15;
            } else if (tipo == TipoProducto.NO_PERECEDEROS) {
                incremento = 0.05;
            }
    
            return precioCompra + (precioCompra * incremento);
        }
    
    }


