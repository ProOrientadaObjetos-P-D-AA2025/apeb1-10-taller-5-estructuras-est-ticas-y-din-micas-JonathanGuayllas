package problema2;

/**
 *
 * @author jdgua
 */
public class Materia {

    String nombreM, info;
    double acd, ape, aa, total;

    public Materia(String nombreM, double acd, double ape, double aa) {
        this.nombreM = nombreM;
        this.acd = acd;
        this.ape = ape;
        this.aa = aa;
    }

    public String getNombreM() {
        return nombreM;
    }

    public void setNombreM(String nombreM) {
        this.nombreM = nombreM;
    }

    public double getAcd() {
        return acd;
    }

    public void setAcd(double acd) {
        this.acd = acd;
    }

    public double getApe() {
        return ape;
    }

    public void setApe(double aoe) {
        this.ape = ape;
    }

    public double getAa() {
        return aa;
    }

    public void setAa(double aa) {
        this.aa = aa;
    }

    public double calcularTotal() {

        total = acd + ape + aa;
        return total;
    }

    @Override
    public String toString() {
        info = "Materia: " + nombreM + "\nNota ACD: " + acd + "\nNota APE: " + ape
                + "\nNota AA: " + aa;
        if (total >= 7.0 && calcularTotal() <= 10) {
            info = info + "\nEstado: Aprobado con nota final: " + total;
        } else {
            info = info + "\nEstado sin recuperación: No aprobado con nota: " + total;
        }

        return info;
    }

}
