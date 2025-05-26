package problema1;

import java.util.ArrayList;

/**
 *
 * @author jdgua
 */
public class CarritoCompras {

    ArrayList<Producto> productosCarrito = new ArrayList<>();
    ArrayList<Producto> productosStock = new ArrayList<>();
    double total;
    double descuento;
    boolean existe;

    public void agregarProducto(String nombre, int cantidad) {
        existe = false;
        for (Producto p : productosStock) {
            if (p.getNombreP().equalsIgnoreCase(nombre)) {
                existe = true;
                if (p.getCantidadP() >= cantidad) {
                    Producto productoC = new Producto(p.getNombreP(),
                            p.getPrecioP(), p.getCantidadP());
                    productosCarrito.add(productoC);
                    System.out.println("Producto añadido al carrito");
                } else {
                    System.out.println("No hay productos suficientes disponibles");
                }
                break;
            }
            if (!existe);
            System.out.println("Ese producto no existe");
        }
    }

    public double calcularTotal() {
        for (Producto pT : productosCarrito) {
            total = total + (pT.getCantidadP() * pT.getPrecioP());
        }
        return total;
    }

    public void realizarPago(double montoP, double porcentjaD) {
        total = calcularTotal();

        if (total > 1000) {
            descuento = total * porcentjaD;
            System.out.println("Tiene un descuento del " + porcentjaD + "% : " + descuento);
        }

        if (montoP >= total) {
            System.out.println("Gracias por su compra");
            for (Producto comprado : productosCarrito) {
                for (Producto actualizarS : productosStock) {
                    if (actualizarS.getNombreP().equalsIgnoreCase(comprado.getNombreP())) {
                        actualizarS.setCantidadP(actualizarS.getCantidadP() - comprado.getCantidadP());
                    }
                }
            }
        } else {
            total = (total - descuento) - montoP;
            System.out.println("Le falta la siguiente cantidad de dinero $:" + total);
        }

    }

    public void mostrarDetalleCompra() {
        System.out.println("---- Detalles de su compra ----");
        for (Producto imprimir : productosCarrito) {
            System.out.println(imprimir.toString());
        }
    }
}
