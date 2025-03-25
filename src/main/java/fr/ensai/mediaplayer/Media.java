package fr.ensai.mediaplayer;

// Définition d'une classe abstraite pour représenter un média générique
public abstract class Media {
    protected final String title;
    protected final int year;
    protected final int duration;

    // Constructeur pour initialiser un média
    public Media(String title, int year, int duration) {
        if (duration <= 0) {
            throw new IllegalArgumentException("La durée doit être positive.");
        }
        this.title = title;
        this.year = year;
        this.duration = duration;
    }

    // Obtention de la durée du média
    public int getDuration() {
        return duration;
    }

    // Obtenir le titre du média
    public String getTitle() {
        return title;
    }

    // Définir une méthode abstraite pour afficher les détails du média
    public abstract String getDescription();
}
