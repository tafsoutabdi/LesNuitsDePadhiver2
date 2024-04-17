public class TestJeu {
    public static void main(String[] args) {
        // Créez une instance de la classe gérant le monde du jeu
        MondeDuJeu mondeDuJeu = new MondeDuJeu();

        // Initialisez le monde du jeu (ajoutez les lieux, les personnages, etc.)
        mondeDuJeu.initialiser();

        // Commencez le jeu
        mondeDuJeu.commencerJeu();
    }
}
