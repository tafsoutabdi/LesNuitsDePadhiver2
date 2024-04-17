public abstract class Personnage {
    protected final String nom;
    protected int pointsDeVieCourants;
    protected int pointsDeVieTotaux;

    public Personnage(String nom, int pointsDeVieCourants, int pointsDeVieTotaux){
        this.nom = nom;
        this.pointsDeVieCourants = pointsDeVieCourants;
        this.pointsDeVieTotaux = pointsDeVieTotaux;
    }
    // Getters et Setters
    public void setPointsDeVieCourants(int pointsDeVieCourants) {
        if (pointsDeVieCourants >= 0 && pointsDeVieCourants <= pointsDeVieTotaux) {
            this.pointsDeVieCourants = pointsDeVieCourants;
        } else {
            throw new IllegalArgumentException("L'argument n'est pas valide");
        }
    }
    public void setPointsDeVieTotaux(int pointsDeVieTotaux){
        this.pointsDeVieTotaux = pointsDeVieTotaux;
    }

    public String getNom(){
        return nom;
    }
    public int getPointsDeVieCourants(){
        return pointsDeVieCourants;
    }
    public int getPointsDeVieTotaux(){
        return pointsDeVieTotaux;
    }
}
