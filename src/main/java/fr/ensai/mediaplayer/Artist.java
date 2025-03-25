package fr.ensai.mediaplayer;

// Définir une classe représentant un artiste
public class Artist {
    private final String firstName;
    private final String lastName;
    private final String nationality;

    // Définition d'un artiste inconnu pour éviter les valeurs nulles
    public static final Artist UNKNOWN = new Artist("Inconnu", "Inconnu", "Inconnue");

    // Constructeur pour initialiser les informations de l'artiste
    public Artist(String firstName, String lastName, String nationality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
    }

    // Affichage d'une représentation textuelle de l'artiste
    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + nationality + ")";
    }
}
