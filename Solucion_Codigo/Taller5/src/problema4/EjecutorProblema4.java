package problema4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jdgua
 */
public class EjecutorProblema4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroCaso = 1;
        String opcion = "";
        do {
            System.out.println("=================================================================================");
            System.out.println("CASO : " + numeroCaso);
            System.out.println("Ingresa el nombre del caso:");
            String nombreCaso = entrada.nextLine();
            System.out.println("Ingresa la fecha de inicio (DD//MM//AAA):");
            String fechaCaso = entrada.next();
            System.out.println("Ingresa los dias transcurridos:");
            int diasCaso = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Ingresa cualquier detalle adicional del caso:");
            String detalleCaso = entrada.nextLine();
            CasoCorrupcion caso = new CasoCorrupcion(nombreCaso, fechaCaso, diasCaso, detalleCaso);
            System.out.println("QUIERES AGREGAR PERSONAS AL CASO? (1 -> SI | 2 -> NO)");
            int agregarPersonas = entrada.nextInt();
            
            if (agregarPersonas == 1) {
                ArrayList<PersonaImplicada> persona = new ArrayList<>();
                System.out.println("CUANTAS PERSONAS DESEAS AGREGAR?");
                int nPersonas = entrada.nextInt();
                for (int i = 0; i < nPersonas; i++) {
                    persona.add(new PersonaImplicada(generarPersonas(), generarEdad(),
                            generarSentencia(), generarOcupacion(), generarNivImplicacion()));
                    persona.get(i).verificarReduccionPena();
                    caso.agregarPersona(persona.get(i));
                }
            }
            caso.actualizarEstado();
            //MOSTRAR INFORMACION EN CONSOLA
            System.out.println(caso);
            System.out.println("\nPERSONAS IMPLICADAS:");
            for (PersonaImplicada persona : caso.getPersonasImplicadas()) {
                System.out.println(persona);
            }
            System.out.println("=================================================================================");
            System.out.println("DESEAS REGISTRAR OTRO CASO? ( SI/NO)");
            opcion = entrada.next();
            if (opcion.equalsIgnoreCase("SI")) {
                numeroCaso++;
            } else if (opcion.equalsIgnoreCase("NO")) {
                System.out.println("GRACIAS POR VISITAR LA APP DE LA FISCALIA ECUATORIANA, QUE LA JUSTICIA PREVALEZCA");
            } else {
                System.out.println("OPCION INCORRECTA - PROGRAMA CULMINADO");
            }
        } while (opcion.equalsIgnoreCase("SI"));
    }

    public static String generarPersonas() {
        Random aleatorio = new Random();
        String[] personas = {"Jonathan Guayllas", "Juan Pedro", "Lenin Correa", "Paula Villamar", "Carlos Alvarado", "Jose Alberto"};
        int indiceAleatorio = aleatorio.nextInt(((personas.length - 1) - 0) + 1) + 0;
        return personas[indiceAleatorio];
    }

    public static String generarOcupacion() {
        Random aleatorio = new Random();
        String[] ocupacion = {"Ingeniero", "Arquitecto", "Comerciante", "Abogado", "Doctor", "Profesor"};
        int indiceAleatorio = aleatorio.nextInt(((ocupacion.length - 1) - 0) + 1) + 0;
        return ocupacion[indiceAleatorio];
    }

    public static int generarEdad() {
        Random aleatorio = new Random();
        int numero = aleatorio.nextInt((90 - 18) + 1) + 18;
        return numero;
    }

    public static int generarSentencia() {
        Random aleatorio = new Random();
        int numero = aleatorio.nextInt((90 - 1) + 1) + 1;
        return numero;
    }

    public static String generarNivImplicacion() {
        Random aleatorio = new Random();
        String[] implicacion = {"Acusado", "Testigo", "Inocente", "Victima", "Complice"};
        int indiceAleatorio = aleatorio.nextInt(((implicacion.length - 1) - 0) + 1) + 0;
        return implicacion[indiceAleatorio];
    }
}
