package veterinaria;

public class Mascota {

    private int nroChip;
    private String nombre;
    private String raza;
    private int nroPatas;

    public Mascota(int nroChip, String nombre, String raza, int nroPatas) {
        this.nroChip = nroChip;
        this.nombre = nombre;
        this.raza = raza;
        this.nroPatas = nroPatas;
    }

    public int getNroChip() {
        return nroChip;
    }



    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getNroPatas() {
        return nroPatas;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nroChip=" + nroChip +
                ", nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", nroPatas=" + nroPatas +
                '}';
    }
}
