package problema1;

/**
 *
 * @author jdgua
 */
public class Producto {
    String nombreP;
    double precioP;
    int cantidadP;

    public Producto(String nombreP, double precioP, int cantidadP) {
        this.nombreP = nombreP;
        this.precioP = precioP;
        this.cantidadP = cantidadP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public double getPrecioP() {
        return precioP;
    }

    public void setPrecioP(double precioP) {
        this.precioP = precioP;
    }

    public int getCantidadP() {
        return cantidadP;
    }

    public void setCantidadP(int cantidadD) {
        this.cantidadP = cantidadD;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombreP=" + nombreP + ", precioP=" + precioP + ", cantidadD=" + cantidadP + '}';
    }
     
}
