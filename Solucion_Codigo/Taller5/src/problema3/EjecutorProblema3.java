package problema3;

import java.util.Scanner;

/**
 *
 * @author jdgua
 */
public class EjecutorProblema3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String n, r, d;
        String nD;
        String c = "";
        int nE;
        double pA;
        int contador = 0;

        System.out.println("Ingrese el nombre de la empresa: ");
        n = entrada.nextLine();
        System.out.println("Ingrese el ruc de la empresa; ");
        r = entrada.nextLine();
        System.out.println("Ingrese la dirección de la empresa: ");
        d = entrada.nextLine();
        // objeto empresa
        Empresa empresa = new Empresa(n, r, d);

        System.out.println("\n---- Ingrese los datos de los 3 departamentos ----");

        do {
            System.out.println("\nIngrese el nombre del departamento: ");
            nD = entrada.nextLine();

            do {
                System.out.println("Ingrese el numero de empleados: ");
                nE = entrada.nextInt();

                if (nE < 0) {
                    System.out.println("Ingresar valores iguales o superiores a 0");
                }
            } while (nE < 0);

            do {
                System.out.println("Ingrese la producción anual: ");
                pA = entrada.nextDouble();
                
                if (pA < 0) {
                    System.out.println("Ingresar valores iguales o superiores a 0");
                }  
            } while (pA < 0);

            entrada.nextLine();
            // objet departamento 
            Departamento departamento = new Departamento(nD, nE, pA, c);
            // defino categoria
            departamento.definircategoria();
            // agrego el departamento a la empresa
            empresa.agregarD(departamento);

            contador++;

        } while (contador < 3);

        empresa.mostrarInfoD();
    }
}
