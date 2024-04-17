public class MondeDuJeu{
    private LieuFinal padhiver;
    private LieuFinal luskan;
    private LieuFinal mirabar;
    private LieuFinal eauprofonde;

    private LieuIntermediaire routeNord;
    private LieuIntermediaire routeSud;
    private LieuIntermediaire foret;
    private LieuIntermediaire volcan;
    private LieuIntermediaire routeRiviere;
    private LieuIntermediaire maraisDesMorts;
    private LieuIntermediaire crypte;
    private LieuIntermediaire routeSudEst;
    private LieuIntermediaire routeNordEst;
    private LieuIntermediaire montagnes;
    private LieuIntermediaire hautesMontagnes;
    private LieuIntermediaire picDuMonde;

    public void initialiser(){

        //initialisation des villes
        padhiver = new LieuFinal("Padhiver");
        luskan = new LieuFinal("Luskan");
        mirabar = new LieuFinal("Mirabar");
        eauprofonde = new LieuFinal("Eau Profonde");

        //iniatilisation des lieux intermediaires
        routeNord = new LieuIntermediaire("Route Nord");
        routeSud = new LieuIntermediaire("Route Sud");
        foret = new LieuIntermediaire("Forêt");
        volcan = new LieuIntermediaire("Volcan");
        routeRiviere = new LieuIntermediaire("Route Riviere");
        maraisDesMorts = new LieuIntermediaire("Marais des Morts");
        crypte = new LieuIntermediaire("Crypte");
        routeSudEst = new LieuIntermediaire("Route Sud Est");
        routeNordEst = new LieuIntermediaire("Route Nord Est");
        montagnes = new LieuIntermediaire("Montagnes");
        hautesMontagnes = new LieuIntermediaire("Haute Montagne");
        picDuMonde = new LieuIntermediaire("Pic du Monde");

        //Ajout des lieux accessibles
        padhiver.ajouterLieu(routeNord);
        padhiver.ajouterLieu(routeSud);

        routeSud.ajouterLieu(maraisDesMorts);
        routeSud.ajouterLieu(eauprofonde);
        routeSud.ajouterLieu(montagnes);

        routeNord.ajouterLieu(foret);
        routeNord.ajouterLieu(luskan);

        foret.ajouterLieu(volcan);
        foret.ajouterLieu(routeNord);

        luskan.ajouterLieu(routeRiviere);
        luskan.ajouterLieu(routeNord);
        
        volcan.ajouterLieu(foret);

        routeRiviere.ajouterLieu(mirabar);
        routeRiviere.ajouterLieu(luskan);

        mirabar.ajouterLieu(routeRiviere);
        mirabar.ajouterLieu(routeNordEst);

        maraisDesMorts.ajouterLieu(crypte);
        maraisDesMorts.ajouterLieu(routeSud);

        eauprofonde.ajouterLieu(routeSudEst);
        eauprofonde.ajouterLieu(routeSud);

        routeSudEst.ajouterLieu(routeNordEst);
        routeSudEst.ajouterLieu(eauprofonde);

        routeNordEst.ajouterLieu(mirabar);
        routeNordEst.ajouterLieu(routeSudEst);

        crypte.ajouterLieu(maraisDesMorts);

        montagnes.ajouterLieu(routeSud);
        montagnes.ajouterLieu(hautesMontagnes);

        hautesMontagnes.ajouterLieu(montagnes);
        hautesMontagnes.ajouterLieu(picDuMonde);
    }
    public void commencerJeu() {
        // Logique de démarrage du jeu, interaction avec le joueur
    }
}