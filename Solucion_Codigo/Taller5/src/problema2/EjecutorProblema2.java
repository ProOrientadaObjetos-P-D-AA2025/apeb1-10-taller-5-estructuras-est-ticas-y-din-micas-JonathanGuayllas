package problema2;

import java.util.Scanner;

/**
 *
 * @author jdgua
 */
public class EjecutorProblema2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nombre, nombreM;
        double n1, n2, n3;
        int edad;
        
        System.out.println("Ingrese el nombre del estudiante: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la edad del estudiante: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        
        System.out.println("Ingrese el nombre de la materia");
        nombreM = entrada.nextLine();
        do {
            System.out.println("Ingrese la nota de ACD (max 3.5): ");
            n1 = entrada.nextDouble();
            if (n1 < 0 || n1 > 3.5) {
                System.out.println("Solo notas entre 0 y 3.5");
            }
        } while (n1 < 0 || n1 > 3.5);

        do {
            System.out.println("Ingrese la nota de APE (max 3.5): ");
            n2 = entrada.nextDouble();
            if (n2 < 0 || n2 > 3.5) {
                System.out.println("Solo notas entre 0 y 3.5");
            }
        } while (n2 < 0 || n2 > 3.5);

        do {
            System.out.println("Ingrese la nota de AA (max 3.0): ");
            n3 = entrada.nextDouble();
            if (n3 < 0 || n3 > 3.0) {
                System.out.println("Solo notas entre 0 y 3.0");
            }
        } while (n3 < 0 || n3 > 3.0);
        
        Materia materia = new Materia (nombreM, n1,n2,n3);
        
        Estudiante estudiante = new Estudiante (nombre,edad,materia);
        estudiante.setMateria(materia);
        estudiante.verificarN(entrada);
        estudiante.MostrarInfo();
        
    }
}
