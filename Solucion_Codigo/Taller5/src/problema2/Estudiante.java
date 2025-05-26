package problema2;

import java.util.Scanner;
import problema3.Empresa;

/**
 *
 * @author jdgua
 */
public class Estudiante {

    String nombre;
    int edad;
    double notaR = 0, totalR;
    Materia materia;
    double total;

    public Estudiante(String nombre, int edad, Materia materia) {
        this.nombre = nombre;
        this.edad = edad;
        this.materia = materia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public void verificarN(Scanner entrada) {
        total = materia.calcularTotal();
        if (total < 7.0) {
            System.out.println("Materia no aprobada con nota: " + materia.total
                    + "\nDebe rendir examen de recuperación");

            do {
                System.out.println("Ingrese la nota del examen de recuperación (max 3.5)");
                notaR = entrada.nextDouble();
                if (notaR < 0 || notaR > 3.5) {
                    System.out.println("Ingrese una nota entre 0 a 3.5");
                }
            } while (notaR < 0 || notaR > 3.5);

            totalR = (materia.total * 0.60) + notaR;
        }
    }

    public void MostrarInfo() {

        System.out.println("----- Información del Estudiante -----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("\n----- Información de la Materia -----\n");
        System.out.println(materia);
        if (notaR > 0) {
            if (totalR >= 7.0) {
                System.out.println("Materia aprobada con examen de recuperación: " + totalR);
            } else {
                System.out.println("Materia no aprobada con nota final: " + totalR);
            }
        }
    }
}
