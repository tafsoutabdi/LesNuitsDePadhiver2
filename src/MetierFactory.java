public class MetierFactory {
    public Metier creerMetier(TypeMetier type) {
        switch (type) {
            case BARBARE:
                return new Barbare();
            case GUERRIER:
                return new Guerrier();
            case MAGICIEN:
                return new Magicien();
            default:
                throw new IllegalArgumentException("Type de métier inconnu : " + type);
        }
    }
}
