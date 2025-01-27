package UD22_MVC.Ejercicio3.Controller;

import java.util.List;
import UD22_MVC.Ejercicio3.Modelo.Cientifico;

public class CientificoController {

    public static void addCientifico(String dni_cientifico, String nom_apels) {
        Cientifico cientifico = new Cientifico(dni_cientifico, nom_apels);
        cientifico.addCientifico();
    }

    public List<String> getAllNombresCientificos() {
        return Cientifico.getAllNombresCientificos();
    }
    
    public static List<Cientifico> getAllCientificos() {
        return Cientifico.getAllCientificos();
    }

    public static Cientifico getCientificoByDNI(String dni_cientifico) {
        return Cientifico.getCientificoByDNI(dni_cientifico);
    }

    public static void updateCientifico(String dni_cientifico, String nom_apels) {
        Cientifico cientifico = new Cientifico(dni_cientifico, nom_apels);
        cientifico.updateCientifico();
    }

    public static void deleteCientifico(String dni_cientifico) {
        Cientifico.deleteCientifico(dni_cientifico);
    }
}
