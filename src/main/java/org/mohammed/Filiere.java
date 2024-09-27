package org.mohammed;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.Data;

import java.util.List;
@Data
public class Filiere {

    private String nom;
    private String responsable;
    private List<Etudiant> etudiants;


    public  String serial(){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return  gson.toJson(this, Filiere.class);
    }
    public void des(String str ){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Filiere filiere=gson.fromJson(str, Filiere.class);


        this.nom = filiere.nom;

        this.responsable = filiere.responsable;
        this.etudiants = filiere.etudiants;

    }
}
