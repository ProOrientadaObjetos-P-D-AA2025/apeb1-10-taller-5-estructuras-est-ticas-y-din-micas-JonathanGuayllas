package problema5;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jdgua
 */
public class EjecutorProblema5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String opcion = "";
        do {
            System.out.println("=============================================="
                    + "========================================================="
                    + "=======");
            System.out.println("Desea ingresar un evento?(SI/NO)");
            opcion = entrada.next();
            System.out.println("=============================================="
                    + "========================================================="
                    + "=======");
            if (opcion.equalsIgnoreCase("SI")) {
                System.out.println("CUANTOS CONFLICTOS DESEA INGRESAR?");
                int nConflictos = entrada.nextInt();
                for (int i = 0; i < nConflictos; i++) {
                    ArrayList<String> paisesInvolucrados = new ArrayList<>();
                    paisesInvolucrados.add(generarPaises());//el numero de paises involucrados determina el tamanio del arreglo

                    System.out.println("INGRESE EL NOMBRE DEL CONFLICTO");
                    String nombreConflicto = "Conflicto " + (i + 1) + " " + entrada.nextLine();
                    System.out.println(nombreConflicto);

                    Conflicto conflicto = new Conflicto(nombreConflicto, 
                            paisesInvolucrados, generarFechas());

                    System.out.println("======================================="
                            + "================================================="
                            + "======================");
                    System.out.println("CUANTOS EVENTOS DESEA INGRESAR?");
                    int nEventos = entrada.nextInt();
                            entrada.nextLine();
                    for (int j = 0; j < nEventos; j++) {
                        String nombreEvento = "Evento: " + (j + 1);
                        Evento evento1 = new Evento(nombreEvento, generarFechas(), 
                                generarPaises(), generarNombreEvento(), 
                                "Descripción de la batalla", generarTrueFalse(),
                                10);
                        conflicto.agregarEvento(evento1);
                        
                        System.out.println("=================================="
                                + "============================================="
                                + "=========================");
                        System.out.println("Nombre del conflicto: " + conflicto.getNombre());
                        System.out.println("Estado actual del conflicto: " + conflicto.getEstadoActual());
                        for (Evento evento : conflicto.consultarEventos()) {
                            System.out.println("Evento: " + evento.getNombre() + ", Tipo: " 
                                    + evento.getTipo() + ", Fecha: " + evento.getFecha());

                        }
                        System.out.println(evento1);
                    }
                }

            }
        } while (opcion.equalsIgnoreCase("si"));
    }

    public static String generarPaises() {
        Random aleatorio = new Random();
        String[] paises = {"China", "Japon", "Rusia", "Ecuador", "Canada", "Argentina", 
            "Alemania", "Espania", "EEUU", "Reino Unido", "Francia", "Peru"};
        int indiceAleatorio = aleatorio.nextInt(((paises.length - 1) - 0) + 1) + 0;
        return paises[indiceAleatorio];
    }

    public static String generarFechas() {
        Random aleatorio = new Random();
        String[] fechaOcurrio = {"20/5/2023", "12/12/2022", "4/7/2023", "9/3/2024", "01/9/2020"};
        int indiceAleatorio = aleatorio.nextInt(((fechaOcurrio.length - 1) - 0) + 1) + 0;
        return fechaOcurrio[indiceAleatorio];
    }

    public static String generarNombreEvento() {
        Random aleatorio = new Random();
        String[] nombreEvento = {"Batalla", "Tratado de paz", "Reunion Diplomatica"};
        int indiceAleatorio = aleatorio.nextInt(((nombreEvento.length - 1) - 0) + 1) + 0;
        return nombreEvento[indiceAleatorio];
    }

    public static boolean generarTrueFalse() {
        Random aleatorio = new Random();
        boolean[] bombas = {true, false};
        int indiceAleatorio = aleatorio.nextInt(((bombas.length - 1) - 0) + 1) + 0;
        return bombas[indiceAleatorio];
    }

    public static int generarBajasPorcentuales() {
        Random aleatorio = new Random();
        int[] bajas = {5, 10, 20, 30, 0, 15};
        int indiceAleatorio = aleatorio.nextInt(((bajas.length - 1) - 0) + 1) + 0;
        return bajas[indiceAleatorio];
    }
}
