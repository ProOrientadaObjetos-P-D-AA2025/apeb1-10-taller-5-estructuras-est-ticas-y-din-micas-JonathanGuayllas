package problema1;

import java.util.ArrayList;

/**
 *
 * @author jdgua
 */
public class CarritoCompras {

    Producto[] productos;
    int[] cantidades;
    int numeroP;

    public CarritoCompras() {
        this.productos = new Producto[100]; // Capacidad máxima de 100 productos en el carrito
        this.cantidades = new int[100];
        this.numeroP = 0;
    }

    public void agregarProducto(Producto producto, int cantidad) {
        if (producto.getCantidad() >= cantidad) {
            productos[numeroP] = producto;
            cantidades[numeroP] = cantidad;
            numeroP++;
            System.out.println("Agregado " + cantidad + " "+ producto.getNombre()
                    + " al carrito.");
        } else {
            System.out.println("No hay suficiente cantidad de " + producto.getNombre()
                    + " disponible.");
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < numeroP; i++) {
            total += productos[i].getPrecio() * cantidades[i];
        }
        return total;
    }

    public void realizarPago(double montoPagado, double descuento) {
        double total = calcularTotal();
        double totalConDescuento = total - descuento;

        if (montoPagado >= totalConDescuento) {
            for (int i = 0; i < numeroP; i++) {
                productos[i].reducirCantidad(cantidades[i]);
            }
            double cambio = montoPagado - totalConDescuento;
            System.out.println("Pago realizado con éxito. Su cambio es: $" + cambio
                    + ". Gracias por su compra!");
        } else {
            double cantidadFaltante = totalConDescuento - montoPagado;
            System.out.println("Pago insuficiente. Faltan $" + cantidadFaltante);
        }
    }

    public void mostrarDetalleCompra() {
        System.out.println("Detalle de la compra:");
        for (int i = 0; i < numeroP; i++) {
            System.out.println(cantidades[i] + " x " + productos[i].getNombre()
                    + " - $" + productos[i].getPrecio() + " cada uno");
        }
    }

    @Override
    public String toString() {
        return "CarritoCompras{" + "productos=" + productos + ", cantidades="
                + cantidades + ", numeroP=" + numeroP + '}';
    }

}
