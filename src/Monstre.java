public class Monstre extends Personnage implements Attaquer {
    protected int magie;

    public Monstre(String nom, int pointsDeVieCourants, int pointsDeVieTotaux, int magie) {
        super(nom, pointsDeVieCourants, pointsDeVieTotaux);
        this.magie = magie;
    }

    public void attaquer(Personnage cible) {
        int degats = this.calculerDegats();

        // Appliquez d'autres logiques ici en fonction de la réserve, du type de
        // monstre, etc.
        cible.setPointsDeVieCourants(cible.getPointsDeVieCourants() - degats);

        // vérifier si la cible a atteint 0 points de vie et prendre des mesures
        // supplémentaires.
    }

    public int calculerDegats() {
        return this.magie;
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
    public void lancerSort(String nomSort, PJ cible, int coutMagieSort) {
        if (magie >= coutMagieSort) {
            System.out.println(nom + " lance " + nomSort + " sur " + cible.getNom());
            cible.subirDegats(pointsDeVieCourants);
            magie -= coutMagieSort;
        } else {
            System.out.println(nom + " n'a pas assez de magie pour lancer " + nomSort);
        }
    }

}
