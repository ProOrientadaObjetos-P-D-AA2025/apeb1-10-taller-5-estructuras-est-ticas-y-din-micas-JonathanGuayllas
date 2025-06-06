package problema5;

import java.util.ArrayList;

/**
 *
 * @author jdgua
 */
public class Conflicto {

    String nombre;
    ArrayList<String> paisesI;
    String fechaI;
    String estadoA;
    ArrayList<Evento> eventos;

    public Conflicto(String nombre, ArrayList<String> paisesI, String fechaInicio) {
        this.nombre = nombre;
        this.paisesI = paisesI;
        this.fechaI = fechaInicio;
        this.estadoA = "Activo";
        this.eventos = new ArrayList<>();
    }

    public ArrayList<Evento> consultarEventos() {
        return eventos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstadoActual() {
        return estadoA;
    }

    public ArrayList<String> getPaisesInvolucrados() {
        return paisesI;
    }
    
    public void agregarEvento(Evento evento) {
        eventos.add(evento);
        actualizarEstado();
    }

    private void actualizarEstado() {
        int totalPaises = paisesI.size();
        ArrayList<String> paisesConBatallas = new ArrayList<>();//declaro el arreglo de los paises que estan en batalla
        for (Evento evento : eventos) {
            if (evento.getTipo().equals("Batalla") && !paisesConBatallas.contains(evento.getUbicacion())) {//verifico si los paises que se presentan estan en batalla
                paisesConBatallas.add(evento.getUbicacion());
            }
        }

        double porcentajePCB = (double) paisesConBatallas.size() / totalPaises;//hago que el valor que me envie pase de String a double

        if (porcentajePCB > 0.5) {
            estadoA = "Guerra Mundial";
        } else if (porcentajePCB >= 0.3) {
            estadoA = "Convocar a la ONU a reunión urgente";
        }

        // Lista de países de primer mundo 
        String[] paisesPM = {"EEUU", "Rusia", "Reino Unido", "Francia"};

        boolean batallasNucleares = false;
        for (Evento evento : eventos) {
            for (String pais : paisesPM) {
                if (evento.getUbicacion().equals(pais) && evento.siUsaArmasNucleares()) {//Si se usa armas nucleares variabble booleana
                    batallasNucleares = true;
                    break;
                }
            }
        }

        if (batallasNucleares) {
            estadoA = "Guerra Mundial";
        }

        for (Evento evento : eventos) {
            if (evento.getBajasPorcentuales() >= 50) {
                estadoA = "Convocar a la ONU a reunión urgente";
                break;
            }
        }
    }
    
    @Override
    public String toString() {
        return "Conflicto{" + "nombre=" + nombre + ", paises Involucrados=" + paisesI
                + ", fecha Inicio=" + fechaI + ", estado actual=" + estadoA + ", "
                + "eventos=" + eventos + '}';
    }

}
