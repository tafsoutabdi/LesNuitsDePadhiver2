import java.util.*;

public class LieuFinal implements Lieu{
    private String nom;
    private List<Lieu> lieuAccessibles = new ArrayList<>();

    public LieuFinal(String nom){
        this.nom = nom;
    }
    public void ajouterLieu(Lieu lieu){
        lieuAccessibles.add(lieu);
    }
    public void afficherLieux(){
        System.out.println("Les actions disponibles dans le lieu final: " + nom);

        for(Lieu lieu: lieuAccessibles){
            lieu.afficherLieux();
        }
    }
}
