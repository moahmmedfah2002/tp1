package org.mohammed;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Gson gson = new GsonBuilder().setPrettyPrinting().create();


    public static void main(String[] args) {
        Filiere filiere=new Filiere();

        Etudiant etudiant  = new Etudiant();
        etudiant.setPrenom("mohammed");
        etudiant.setNom("fahlaoui");
        etudiant.setEmail("fahlaoui@gmail.com");
        etudiant.setCne("CD474729");
        ArrayList etudiants = new ArrayList();
        etudiants.add(etudiant);
        filiere.setEtudiants(etudiants);
        filiere.setResponsable("X");
        filiere.setNom("info");
        System.out.println(filiere.serial());


    }
}