package problema3;

import java.util.ArrayList;

/**
 *
 * @author jdgua
 */
public class Empresa {

    String nombre;
    String ruc;
    String direccion;
    ArrayList<Departamento> departamentoN = new ArrayList<>();

    public Empresa(String nombre, String ruc, String direccion) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Departamento> getDepartamentoN() {
        return departamentoN;
    }

    public void setDepartamentoN(ArrayList<Departamento> departamentoN) {
        this.departamentoN = departamentoN;
    }
    
     
    public void agregarD(Departamento nombreD) {
        // agrego el departamento 
        departamentoN.add(nombreD);
    }
    
    // metodo informacion
    public void mostrarInfoD() {
        System.out.println("\n---- Datos de la empresa ----");
        System.out.println("Nombre empresa: " + nombre + "\nRuc de la empresa: " + ruc
                + "\nDirección de la empresa: " + direccion + "\n");
        // bucle para recorrer la lista y mostar info

        for (Departamento info : departamentoN) {
            System.out.println(info.toString());
        }
    }
}
