package fr.ensai.mediaplayer;

import java.util.Arrays;
import java.util.List;

public class Main {
        public static void main(String[] args) {
                // Create a new Artist step by step

                Artist singer_1 = new Artist("Dassin", "Joe", "French");

                String lyrics_1 = """
                                Les matins se suivent et se ressemblent
                                Quand l'amour fait place au quotidien
                                """;

                List<String> songGenres = Arrays.asList(
                                "Pop", "Rock", "Jazz", "Classical", "Hip-Hop",
                                "Country", "Electronic", "Reggae", "Blues", "Metal");

                Song joe = new Song("Salut les amoureux", singer_1, 1972, 323, lyrics_1, singer_1, singer_1,
                                songGenres);

                System.out.println(joe.toString());
                joe.play();

                String sub = """
                                Bonsoir dans Autant n'emporte l'histoire aujourd'hui, Albert Einstein
                                Albert Einstein, physicien de génie prix nobel de phsysique en 1921,
                                """;
                Podcast podcast = new Podcast("Podcast de Albert Einstein", "Albert Einstein", "Physique", 30, 1921,
                                sub);

                podcast.play();

                Artist singer_2 = new Artist("John", "Siegler", "French");

                String lyrics_2 = """
                                Un jour je serai le meilleur dresseur
                                Je me battrai sans répit
                                Je ferai tout pour être vainqueur
                                """;

                Song pokeman = new Song("Attrapez les tous", singer_2, 2014, 120, lyrics_2, singer_2, singer_2,
                                songGenres);

                // Create a object of type Playlist
                Playlist playlist = new Playlist("P1");
                playlist.addMedia(joe);
                playlist.addMedia(pokeman);
                playlist.addMedia(podcast);

                playlist.randomplay(true);

                Playlist playlist2 = new Playlist(playlist);

                System.out.println(playlist2.toString());

                playlist.removeMedia(pokeman);

                // display the total duration of the playlist p1 and p2
                System.out.println(playlist.totalDuration + playlist2.totalDuration);

                // play the playlist2 with randomplay method
                playlist2.randomplay(false);

                // verify that the exception of playlist empty is catched
                Playlist playlist3 = new Playlist("P3");

                playlist3.randomplay(true);

        }
}
