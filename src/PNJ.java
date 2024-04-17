public class PNJ extends Personnage{
    protected String phaseDialoge;

    public PNJ(String nom, int pointsDeVieCourants, int pointsDeVieTotaux, String phaseDialoge){
        super(nom, pointsDeVieCourants, pointsDeVieTotaux);
        this.phaseDialoge = phaseDialoge;
    }

    public String getPhaseDialoge(){
        return phaseDialoge;
    }

    public void setPhaseDialoge(String phaseDialoge){
        this.phaseDialoge = phaseDialoge;
    }
}
