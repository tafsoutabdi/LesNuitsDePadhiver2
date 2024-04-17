public class MonstreFactory {
    public Monstre creerMonstre(TypeMonstre type) {
        switch (type) {
            case GOBELIN:
                return new Monstre("Gobelin", 4, 4, 0);
            case ORC:
                return new Monstre("Orc", 5, 8, 0);
            case CHAUVESOURIS:
                return new Monstre("Chauve-souris", 5, 6, 0);
            case NECROMENT:
                return new Monstre("Necromant", 8, 30, 10);
            case DRAGON:
                return new Monstre("Dragon", 12, 70, 24);
            case GEANT:
                return new Monstre("Geant", 25, 90, 0);
            case DRAGONVENERABLE:
                return new Monstre("Dragon Venerable", 24, 220,48);
            default:
                throw new IllegalArgumentException("Type de monstre non pris en charge");
        }
    }
}
