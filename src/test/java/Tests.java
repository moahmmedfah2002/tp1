import org.junit.Assert;
import org.junit.Test;
import org.mohammed.Etudiant;
import org.mohammed.Filiere;

import java.util.ArrayList;

public class Tests {
    @Test
    public void serial(){
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

        Assert.assertEquals(filiere.serial(),"{\n" +
                "  \"nom\": \"info\",\n" +
                "  \"responsable\": \"X\",\n" +
                "  \"etudiants\": [\n" +
                "    {\n" +
                "      \"cne\": \"CD474729\",\n" +
                "      \"nom\": \"fahlaoui\",\n" +
                "      \"prenom\": \"mohammed\",\n" +
                "      \"email\": \"fahlaoui@gmail.com\",\n" +
                "      \"telephone\": 0\n" +
                "    }\n" +
                "  ]\n" +
                "}");





    }
}
