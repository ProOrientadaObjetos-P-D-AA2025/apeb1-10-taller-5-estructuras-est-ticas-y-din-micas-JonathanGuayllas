package problema5;

/**
 *
 * @author jdgua
 */
public class Evento {

    String nombre;
    String fecha;
    String ubicacion;
    String tipo;
    String descripcion;
    boolean usaArmasN;
    int bajasP;

    public Evento(String nombre, String fecha, String ubicacion, String tipo, String descripcion, boolean usaArmasNucleares, int bajasPorcentuales) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.usaArmasN = usaArmasN;
        this.bajasP = bajasP;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean siUsaArmasNucleares() {
        return usaArmasN;
    }

    public int getBajasPorcentuales() {
        return bajasP;
    }

    @Override
    public String toString() {
        return "Evento{" + "nombre=" + nombre + ", fecha=" + fecha + ", ubicacion=" 
                + ubicacion + ", tipo=" + tipo + ", descripcion=" + descripcion + ", "
                + "Usa Armas Nucleares=" + usaArmasN + ", Bajas Porcentuales=" + bajasP + '}';
    }
    
    
}
