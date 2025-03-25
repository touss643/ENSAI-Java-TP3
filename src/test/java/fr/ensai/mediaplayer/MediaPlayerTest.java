package fr.ensai.mediaplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class MediaTest {

    // =========================================
    // Tests pour la classe Song
    // =========================================
    @Test
    void songPlay_ShouldPrintLyricsWithDelay() {
        // GIVEN
        Artist singer = new Artist("Ed", "Sheeran", "British");
        String lyrics = "I'm in love with the shape of you";
        Song song = new Song(
                "Shape of You",
                2017,
                234,
                singer,
                singer,
                singer,
                lyrics,
                List.of(Genre.POP));

        // WHEN/THEN
        // Vérification visuelle manuelle nécessaire pour le délai
        song.play(); // Doit afficher les paroles mot par mot
    }

    @Test
    void songToString_ShouldReturnFormattedString() {
        // GIVEN
        Artist singer = new Artist("Adele", "Adkins", "British");
        Song song = new Song(
                "Hello",
                2015,
                295,
                singer,
                singer,
                singer,
                "Hello from the other side",
                List.of(Genre.POP));

        // WHEN
        String result = song.toString();

        // THEN
        assertEquals("Song: Hello (2015) - Singer: Artist Adele Adkins", result);
    }

    // =========================================
    // Tests pour la classe Podcast
    // =========================================
    @Test
    void podcastPlay_ShouldPrintSubtitles() {
        // GIVEN
        Podcast podcast = new Podcast(
                "Tech Today",
                "John Doe",
                "Java Programming",
                1800,
                2023,
                "Bienvenue dans ce podcast sur Java...");

        // WHEN/THEN
        podcast.play(); // Doit afficher les sous-titres
    }

    @Test
    void podcastToString_ShouldReturnFormattedString() {
        // GIVEN
        Podcast podcast = new Podcast(
                "Science Weekly",
                "Marie Curie",
                "Physique",
                1500,
                2024,
                "Les dernières découvertes...");

        // WHEN
        String result = podcast.toString();

        // THEN
        assertEquals("Podcast: Science Weekly (2024) - Host: Marie Curie", result);
    }

    // =========================================
    // Tests communs pour Media
    // =========================================
    @Test
    void mediaGetters_ShouldReturnCorrectValues() {
        // GIVEN
        Artist artist = new Artist("David", "Guetta", "French");
        Song song = new Song(
                "Titanium",
                2011,
                245,
                artist,
                artist,
                artist,
                "You shout it out...",
                List.of(Genre.ELECTRO));

        // WHEN/THEN
        assertEquals(245, song.getDuration());
        assertEquals("Titanium", song.getTitle());
        assertEquals(2011, song.getYear());
    }
}