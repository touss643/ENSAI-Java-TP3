package fr.ensai.mediaplayer;

import java.util.List;

// Définition d'une classe représentant une chanson.
public class Song extends Media {
    private final Artist singer;
    private final Artist author;
    private final Artist composer;
    private final String lyrics;
    private final List<Genre> genres;

    // Constructeur pour initialiser une chanson
    public Song(String title, int year, int duration, Artist singer, Artist author, Artist composer, String lyrics,
            List<Genre> genres) {
        super(title, year, duration);
        this.singer = singer != null ? singer : Artist.UNKNOWN;
        this.author = author != null ? author : Artist.UNKNOWN;
        this.composer = composer != null ? composer : Artist.UNKNOWN;
        this.lyrics = lyrics;
        this.genres = genres;
    }

    // Obtention de la description de la chanson
    @Override
    public String getDescription() {
        return "Chanson: " + title + " - " + singer + " (" + year + ")";
    }
}
