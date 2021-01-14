package veterinaria;

import java.util.ArrayList;

public class Veterinaria {

    private String nombre;
    private String direccion;
    private ArrayList<Mascota> mascotas;

    public Veterinaria(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.mascotas = new ArrayList<>();
    }

    public void agregarMascota(Mascota mascota){
        for (int i = 0; i < mascotas.size(); i++){
            if (mascotas.get(i).getNroChip() == mascota.getNroChip()){
                System.out.println("La mascota " + mascota.getNombre() + " ya fue agregada");
                return;
            }
        }
        mascotas.add(mascota);
    }

    public void sacarMascota(int nroChip){
        for (int i = 0; i < mascotas.size(); i++){
            if (mascotas.get(i).getNroChip() == nroChip){
                mascotas.remove(i);
                return;
            }
        }
        System.out.println("No existe una mascota con el chip: " + nroChip);
    }

    public void listarMascotas(){
        System.out.println(mascotas);
    }


}
