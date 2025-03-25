package fr.ensai.mediaplayer;

import java.util.List;

// Définir la classe principale pour exécuter l'application
public class Main {
        public static void main(String[] args) {
                // Création des artistes
                Artist edSheeran = new Artist("Ed", "Sheeran", "British");
                Artist adele = new Artist("Adele", "Adkins", "British");

                // Création des chansons
                Song shapeOfYou = new Song("Shape of You", 2017, 234, edSheeran, null, null,
                                "I'm in love with the shape of you...", List.of(Genre.POP));
                Song hello = new Song("Hello", 2015, 295, adele, null, null, "Hello from the other side...",
                                List.of(Genre.POP, Genre.SOUL));

                // Création d'un podcast
                Podcast techToday = new Podcast("Tech Today", "John Doe", "Technologie", 1800, 2023,
                                "Bienvenue dans Tech Today. Aujourd'hui, nous parlons de Java...");

                // Création d'une playlist
                Playlist playlist1 = new Playlist("Ma Playlist 2023");
                playlist1.addMedia(shapeOfYou);
                playlist1.addMedia(hello);
                playlist1.addMedia(techToday);

                // Copie de la playlist
                Playlist playlist2 = playlist1.copy("Copie de Ma Playlist 2023");

                // Suppression une chanson de la première playlist
                playlist1.removeMedia(hello);

                // Affichage des résultats
                System.out.println("\n=== Durées ===");
                System.out.println("Durée playlist1 : " + playlist1.getTotalDuration() + "s");
                System.out.println("Durée playlist2 : " + playlist2.getTotalDuration() + "s");

                System.out.println("\n=== Lecture playlist2 ===");
                playlist2.play(false);
        }
}
