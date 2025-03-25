package fr.ensai.mediaplayer;

public abstract class Media {
    public String title;
    public int duration;
    public int year;

    /**
     * Construction of a new Media object.
     *
     * @param title    The title of the Media.
     * @param year     The year the Media was released.
     * @param duration The duration of the Media in seconds.
     */

    public Media(String title, int duration, int year) {
        this.title = title;
        this.duration = duration;
        this.year = year;
    }

    public abstract void play();

    /**
     * Textual representation of the Media.
     */
    @Override
    public String toString() {
        return "Title: " + title + " (" + year + "), Durée: " + duration + " min";
    }
}
