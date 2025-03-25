package fr.ensai.mediaplayer;

import java.util.ArrayList;
import java.util.List;

// Définition d'une classe représentant une playlist.
public class Playlist {
    private final String name;
    private final List<Media> mediaList;

    // Constructeur pour initialiser une playlist vide.
    public Playlist(String name) {
        this.name = name;
        this.mediaList = new ArrayList<>();
    }

    // Ajout d'un média à la playlist.
    public void addMedia(Media media) {
        if (media != null) {
            mediaList.add(media);
        }
    }

    // Suppression d'un média de la playlist (par objet)
    public void removeMedia(Media media) {
        mediaList.remove(media);
    }

    // Suppression d'un média par son index
    public void removeMediaAt(int index) {
        if (index >= 0 && index < mediaList.size()) {
            mediaList.remove(index);
        }
    }

    // Copie de la playlist avec un nouveau nom
    public Playlist copy(String newName) {
        Playlist copy = new Playlist(newName);
        copy.mediaList.addAll(List.copyOf(mediaList)); // Empêcher les modifications accidentelles
        return copy;
    }

    // Calcul de la durée totale de la playlist
    public int getTotalDuration() {
        return mediaList.stream().mapToInt(Media::getDuration).sum();
    }

    // Lecture de la playlist (avec un ordre configurable)
    public void play(boolean shuffle) {
        List<Media> playOrder = shuffle ? new ArrayList<>(mediaList) : mediaList;
        if (shuffle) {
            java.util.Collections.shuffle(playOrder);
        }

        for (Media media : playOrder) {
            System.out.println(media.getDescription());
        }
    }

    // Affichage une représentation textuelle de la playlist
    @Override
    public String toString() {
        return "Playlist '" + name + "' avec " + mediaList.size() + " médias";
    }
}
