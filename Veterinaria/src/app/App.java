package app;


import veterinaria.Mascota;
import veterinaria.Veterinaria;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        Veterinaria vet = new Veterinaria("VetNorte", "Balmaceda");

        Mascota mascota1 = new Mascota(1,"Jonhy","Pastor Aleman", 4);
        Mascota mascota2 = new Mascota(5, "Cangri", "Cangrejo",6);

        vet.agregarMascota(mascota1);
        vet.agregarMascota(mascota2);
        vet.listarMascotas();

        vet.sacarMascota(1);
        vet.sacarMascota(10);
        vet.listarMascotas();

    }

}
