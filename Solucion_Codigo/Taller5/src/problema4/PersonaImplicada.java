package problema4;

/**
 *
 * @author jdgua
 */
public class PersonaImplicada {

    String nombre;
    int edad;
    String ocupacion;
    String nivelI;
    int sentencia; //Meses
    String estadoP;

    public PersonaImplicada(String nombre, int edad, int sentencia, String ocupacion, String nivelI) {
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.nivelI = nivelI;
        this.sentencia = sentencia;
        this.estadoP = "Persona con proceso en orden";
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public String getNivelImplicacion() {
        return nivelI;
    }

    public void verificarReduccionPena() {
        if (this.nivelI.equalsIgnoreCase("acusado")) {
            this.estadoP = "Esta persona puede acogerse a reduccion de pena si"
                    + " decide colaborar confesando la verdad" + verificarFianza();
        }
    }

    public String verificarFianza() {
        if (this.sentencia > 12) {
            return "\nEsta persona puede acogerse a pagar fianza si es que colabora "
                    + "con informacion util (Fianza no mayor al 50% del danio economico)";
        }
        return "";
    }

    @Override
    public String toString() {
        return "PersonaImplicada{" + "nombre=" + nombre + ", edad=" + edad + ","
                + " ocupacion=" + ocupacion + ", nivelI=" + nivelI + ", estadoP="
                + estadoP + '}';
    }

}
