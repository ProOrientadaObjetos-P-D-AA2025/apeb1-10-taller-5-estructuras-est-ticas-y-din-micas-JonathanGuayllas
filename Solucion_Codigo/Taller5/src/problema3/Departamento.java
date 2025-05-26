package problema3;

/**
 *
 * @author jdgua
 */
public class Departamento {

    String nombre,categoria;
    int numeroE;
    double produccionA;

    public Departamento(String nombre, int numeroE, double produccionA, String categoria) {
        this.nombre = nombre;
        this.numeroE = numeroE;
        this.produccionA = produccionA;
        this.categoria = categoria;
    }
    
    // set y getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroE() {
        return numeroE;
    }

    public void setNumeroE(int numeroE) {
        this.numeroE = numeroE;
    }

    public double getProduccionA() {
        return produccionA;
    }

    public void setProduccionA(double produccionA) {
        this.produccionA = produccionA;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    // categoria
    public void definircategoria() {

        if ((numeroE > 20) && (produccionA > 1000000)) {
            this.categoria = "A";
            
        } else if ((numeroE > 10) && (produccionA > 500000)) {
            this.categoria = "B";
            
        } else if ((numeroE >= 0) && (produccionA >= 0)) {
            this.categoria = "C";
        }

    }
    // to string
    @Override
    public String toString() {
        return "----- Departamento -----" + "\nNombre departamento: " + nombre + 
                "\nNumero empleados: " + numeroE + "\nProduccion anual: " + 
                produccionA + "\nCategoria: " + categoria + "\n";
    }
    
    
}
