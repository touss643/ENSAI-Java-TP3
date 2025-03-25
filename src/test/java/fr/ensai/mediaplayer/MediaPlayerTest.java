package fr.ensai.mediaplayer;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import fr.ensai.mediaplayer.Playlist;
import fr.ensai.mediaplayer.Podcast;
import fr.ensai.mediaplayer.Song;

class MediaPlayerTest {

        @Test
        void removemedia_by_media() {

                // GIVEN

                Artist singer1 = new Artist("Stromae", "Paul Van Haver", "Belgian");

                String lyrics1 = """
                                Dites-moi où, n'avez-vous caché votre âme ?
                                Ça doit faire au moins mille fois que j'ai compté mes doigts
                                """;

                List<String> songGenres = Arrays.asList("Electro-Pop", "Chanson Française");
                Song stromae = new Song("Papaoutai", singer1, 2013, 230, lyrics1, singer1, singer1, songGenres);

                Artist singer2 = new Artist("Angèle", "Van Laeken", "Belgian");

                String lyrics2 = """
                                Tu n'auras plus mon respect
                                Si t’parles comme tous ces mecs
                                """;
                Song angele = new Song("Balance ton quoi", singer2, 2019, 215, lyrics2, singer2, singer2, songGenres);

                Podcast podcast = new Podcast("Le Débrief Tech", "Alex Martin", "Technology", 2024, 1500,
                                "Analyse des dernières tendances en IA");

                Playlist playlist = new Playlist("Playlist 1");
                playlist.addMedia(stromae);
                playlist.addMedia(angele);
                playlist.addMedia(podcast);

                // THEN
                assertTrue(playlist.removeMedia(angele));
        }

        @Test
        void removemedia_by_index() {

                // GIVEN
                Artist singer1 = new Artist("Stromae", "Paul Van Haver", "Belgian");

                String lyrics1 = """
                                Dites-moi où, n'avez-vous caché votre âme ?
                                Ça doit faire au moins mille fois que j'ai compté mes doigts
                                """;

                List<String> songGenres = Arrays.asList("Electro-Pop", "Chanson Française");
                Song stromae = new Song("Papaoutai", singer1, 2013, 230, lyrics1, singer1, singer1, songGenres);

                Artist singer2 = new Artist("Angèle", "Van Laeken", "Belgian");

                String lyrics2 = """
                                Tu n'auras plus mon respect
                                Si t’parles comme tous ces mecs
                                """;
                Song angele = new Song("Balance ton quoi", singer2, 2019, 215, lyrics2, singer2, singer2, songGenres);

                Podcast podcast = new Podcast("Le Débrief Tech", "Alex Martin", "Technology", 2024, 1500,
                                "Analyse des dernières tendances en IA");
                ;

                Playlist playlist = new Playlist("Playlist 1");
                playlist.addMedia(stromae);
                playlist.addMedia(angele);
                playlist.addMedia(podcast);

                // THEN
                assertTrue(playlist.removeMedia(1)); // Supprime "Balance ton quoi"
        }
}
