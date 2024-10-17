package logica;

import actores.Gato;
import actores.Perro;
import java.util.List;
import java.util.ArrayList;



public class PerrosGatos {
    
    private static List<Gato> listaGatos = new ArrayList<>();
    private static List<Perro> listaPerros = new ArrayList<>();
    
    public static void crearGatos(){
        Gato gato1 = new Gato("C:\\Users\\Fernando\\Documents\\NetBeansProjects\\AnimalShelter\\src\\img\\imgProyecto\\Gatos\\gato1.jpg", "Asket", "Comun", 3.2, "Naranja", "Macho");
        Gato gato2 = new Gato("C:\\Users\\Fernando\\Documents\\NetBeansProjects\\AnimalShelter\\src\\img\\imgProyecto\\Gatos\\gato2.jpg", "Mati", "Comun", 6, "Naranja", "Hembra");
        Gato gato3 = new Gato("C:\\Users\\Fernando\\Documents\\NetBeansProjects\\AnimalShelter\\src\\img\\imgProyecto\\Gatos\\gato3.jpg", "Beni", "Comun", 2.6, "Gris", "Macho");
        Gato gato4 = new Gato("C:\\Users\\Fernando\\Documents\\NetBeansProjects\\AnimalShelter\\src\\img\\imgProyecto\\Gatos\\gato4.jpg", "Raspi", "Siames", 3, "Blanco", "Hembra");
        Gato gato5 = new Gato("C:\\Users\\Fernando\\Documents\\NetBeansProjects\\AnimalShelter\\src\\img\\imgProyecto\\Gatos\\gato5.jpg", "Esper", "Comun", 1.2, "Gris", "Macho");
        Gato gato6 = new Gato("C:\\Users\\Fernando\\Documents\\NetBeansProjects\\AnimalShelter\\src\\img\\imgProyecto\\Gatos\\gato6.jpg", "Mardu", "Comun", 3, "Blanco", "Hembra");
        Gato gato7 = new Gato("C:\\Users\\Fernando\\Documents\\NetBeansProjects\\AnimalShelter\\src\\img\\imgProyecto\\Gatos\\gato7.jpg", "Mantra", "Comun", 2.5, "Gris", "Hembra");
        Gato gato8 = new Gato("C:\\Users\\Fernando\\Documents\\NetBeansProjects\\AnimalShelter\\src\\img\\imgProyecto\\Gatos\\gato8.jpg", "Loki", "Comun", 4.5, "Naranja", "Macho");
        Gato gato9 = new Gato("C:\\Users\\Fernando\\Documents\\NetBeansProjects\\AnimalShelter\\src\\img\\imgProyecto\\Gatos\\gato9.jpg", "Astrid", "Birmanian", 3.2, "Blanco", "Hembra");
        
        listaGatos.add(gato1);
        listaGatos.add(gato2);
        listaGatos.add(gato3);
        listaGatos.add(gato4);
        listaGatos.add(gato5);
        listaGatos.add(gato6);
        listaGatos.add(gato7);
        listaGatos.add(gato8);
        listaGatos.add(gato9);
    }
    
    public static void crearPerros(){
        Perro perro1 = new Perro("C:\\Users\\Fernando\\Documents\\NetBeansProjects\\AnimalShelter\\src\\img\\imgProyecto\\Perros\\perro1.jpg", "Potito", "Chihuahua", 6.2, "Blanco", "Hembra");
        Perro perro2 = new Perro("C:\\Users\\Fernando\\Documents\\NetBeansProjects\\AnimalShelter\\src\\img\\imgProyecto\\Perros\\perro2.jpg", "Shanna", "Labrador", 23.4, "Blanco", "Hembra");
        Perro perro3 = new Perro("C:\\Users\\Fernando\\Documents\\NetBeansProjects\\AnimalShelter\\src\\img\\imgProyecto\\Perros\\perro3.jpg", "Sae", "Corgi", 9.6, "Blanco", "Macho");
        Perro perro4 = new Perro("C:\\Users\\Fernando\\Documents\\NetBeansProjects\\AnimalShelter\\src\\img\\imgProyecto\\Perros\\perro4.jpg", "Bob", "Bulldog", 8.4, "Blanco", "Macho");
        Perro perro5 = new Perro("C:\\Users\\Fernando\\Documents\\NetBeansProjects\\AnimalShelter\\src\\img\\imgProyecto\\Perros\\perro5.jpg", "Max", "Husky", 16.3, "Negro", "Macho");
        Perro perro6 = new Perro("C:\\Users\\Fernando\\Documents\\NetBeansProjects\\AnimalShelter\\src\\img\\imgProyecto\\Perros\\perro6.jpg", "Lopolo", "Beagle", 19.3, "Marrón", "Macho");
        Perro perro7 = new Perro("C:\\Users\\Fernando\\Documents\\NetBeansProjects\\AnimalShelter\\src\\img\\imgProyecto\\Perros\\perro7.jpg", "America", "Pastor Belga", 21.3, "Marron", "Hembra");
        Perro perro8 = new Perro("C:\\Users\\Fernando\\Documents\\NetBeansProjects\\AnimalShelter\\src\\img\\imgProyecto\\Perros\\perro8.jpg", "Estrella", "Pomerania", 3.4, "Marrón", "Hembra");
        Perro perro9 = new Perro("C:\\Users\\Fernando\\Documents\\NetBeansProjects\\AnimalShelter\\src\\img\\imgProyecto\\Perros\\perro9.jpg", "Lasie", "Border Collie", 12.3, "Negro", "Hembra");

        listaPerros.add(perro1);
        listaPerros.add(perro2);
        listaPerros.add(perro3);
        listaPerros.add(perro4);
        listaPerros.add(perro5);
        listaPerros.add(perro6);
        listaPerros.add(perro7);
        listaPerros.add(perro8);
        listaPerros.add(perro9);
    }

    public static List<Gato> getListaGatos() {
        return listaGatos;
    }

    public static void setListaGatos(List<Gato> listaGatos) {
        PerrosGatos.listaGatos = listaGatos;
    }

    public static List<Perro> getListaPerros() {
        return listaPerros;
    }

    public static void setListaPerros(List<Perro> listaPerros) {
        PerrosGatos.listaPerros = listaPerros;
    }
    
    
}
