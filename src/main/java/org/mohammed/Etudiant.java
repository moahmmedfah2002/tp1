package org.mohammed;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.Data;
import lombok.Getter;


@Data
public class Etudiant {

    // cne nom prenom email numero de telephone

    private String  cne;
    private String  nom;
    private String  prenom;
    private String  email;
    private int   telephone;
    private Filiere filiere;


    public  String serial(){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return  gson.toJson(this, Etudiant.class);
    }
    public void des(String str ){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Etudiant etudiant=gson.fromJson(str, Etudiant.class);

        this.cne = etudiant.cne;
        this.nom = etudiant.nom;
        this.prenom = etudiant.prenom;
        this.email = etudiant.email;
        this.telephone = etudiant.telephone;
        this.filiere = etudiant.filiere;

    }

}
