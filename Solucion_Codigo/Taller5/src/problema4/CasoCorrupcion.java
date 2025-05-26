package problema4;

import java.util.ArrayList;

/**
 *
 * @author jdgua
 */
public class CasoCorrupcion {

    String nombreC;
    String fechaI;
    int diasT;
    String estado;
    String detallesA;
    ArrayList<PersonaImplicada> personasImplicadas;

    public CasoCorrupcion(String nombreC, String fechaI, int diasT, String detallesAdicionales) {
        this.nombreC = nombreC;
        this.fechaI = fechaI;
        this.diasT = diasT;
        this.estado = "Iniciado";
        this.detallesA = detallesA;
        this.personasImplicadas = new ArrayList<>();
    }

    public void actualizarEstado() {
        if (this.diasT > 14) {
            this.estado = "Urgente";
        } else if (diasT > 7) {
            this.estado = "Alerta";
        }
    }

    public String getNombreCaso() {
        return nombreC;
    }

    public String getFechaInicio() {
        return fechaI;
    }

    public String getEstado() {
        return estado;
    }

    public String getDetallesAdicionales() {
        return detallesA;
    }

    public ArrayList<PersonaImplicada> getPersonasImplicadas() {
        return personasImplicadas;
    }

    public void agregarPersona(PersonaImplicada persona) {
        personasImplicadas.add(persona);
    }
}
