package fr.ensai.mediaplayer;

// Définition d'une classe représentant un podcast.
public class Podcast extends Media {
    private final String host;
    private final String topic;
    private final String subtitles;

    // Constructeur pour initialiser un podcast.
    public Podcast(String title, String host, String topic, int duration, int year, String subtitles) {
        super(title, year, duration);
        this.host = host;
        this.topic = topic;
        this.subtitles = subtitles;
    }

    // Obtention la description du podcast.
    @Override
    public String getDescription() {
        return "Podcast: " + title + " animé par " + host + " sur " + topic;
    }
}
