public class PJ extends Personnage implements Attaquer{
    protected int niveau;
    protected Metier metier;
    protected Arme arme;

    public PJ(String nom, int pointsDeVieCourants, int pointsDeVieTotaux, int niveau, Metier metier, Arme arme){
        super(nom, pointsDeVieCourants, pointsDeVieTotaux);
        this.metier = metier;
        this.arme = arme;
        this.niveau = niveau;
    }
    public void attaquer(Personnage cible) {
        int degats = this.calculerDegats();
        // Appliquez d'autres logiques ici en fonction du niveau, du métier, etc.
        cible.setPointsDeVieCourants(cible.getPointsDeVieCourants() - degats);
    }
    private int calculerDegats() {
        int degatsBase = this.arme.getDegats(); 
        // Appliquez des modificateurs en fonction du niveau, du métier, etc.
        int degatsFinaux = degatsBase * this.niveau;
        // Par exemple, si le personnage est un magicien, doublez les dégâts
        if (this.metier == Metier.MAGICIEN) {
            degatsFinaux *= 2;
        }
        return degatsFinaux;
    }
    public void subirDegats(int degats) {
        pointsDeVieCourants -= degats;
        if (pointsDeVieCourants < 0) {
            pointsDeVieCourants = 0;
        }
        System.out.println(nom + " subit " + degats + " points de dégâts.");
        if (pointsDeVieCourants == 0) {
            System.out.println(nom + " est K.O.");
        }
    }
}