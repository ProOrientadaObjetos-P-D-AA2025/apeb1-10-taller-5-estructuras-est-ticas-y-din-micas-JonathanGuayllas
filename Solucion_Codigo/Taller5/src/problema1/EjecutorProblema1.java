package problema1;
/**
 *
 * @author jdgua
 */
public class EjecutorProblema1 {

    public static void main(String[] args) {
        // Crear productos
        Producto p1 = new Producto("Computador", 1000, 1000);
        Producto p2 = new Producto("Televisores", 200, 2000);
        Producto p3 = new Producto("Celulares", 640, 1500);

        // Crear carrito de compras
        CarritoCompras carrito = new CarritoCompras();

        // Agregar productos al carrito
        carrito.agregarProducto(p1, 1);
        carrito.agregarProducto(p2, 5);
        carrito.agregarProducto(p3, 2);

        // Mostrar detalle de la compra
        carrito.mostrarDetalleCompra();

        // Calcular total y realizar pago
        double total = carrito.calcularTotal();
        System.out.println("Total de la compra: $" + total);

        // Verificar y aplicar descuento si el total supera $1000
        double descuento = 0;
        if (total > 1000) {
            descuento = total * 0.20; // 20% de descuento
            System.out.println("Se aplicará un descuento de $" + descuento);
        }

        // Realizar pago
        carrito.realizarPago(5000, descuento);
    }
}
