import java.util.*;

public class LieuIntermediaire implements Lieu{
    private String nom;
    private List<Lieu> lieuxAccessibles = new ArrayList<>();

    public LieuIntermediaire(String nom){
        this.nom = nom;
    }

    public void ajouterLieu(Lieu lieu){
        lieuxAccessibles.add(lieu);
    }
    public void afficherLieux(){
        System.out.println("Vous êtes dans le lieu intermédiaire: "+ nom);
        for(Lieu lieu : lieuxAccessibles){
            lieu.afficherLieux();
        }
    }
}
