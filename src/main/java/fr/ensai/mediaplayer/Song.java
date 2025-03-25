package fr.ensai.mediaplayer;

import java.util.List;
import java.util.Objects;

public class Song extends Media {
    private Artist singer;
    private String lyrics;
    private Artist author;
    private Artist composer;
    private List<String> genres;

    /**
     * Construction of a new Song object.
     *
     * @param singer   The singer of the Song.
     * @param duration The duration of the Song in seconds.
     * @param lyrics   The lyrics of the Song.
     * @param author   The author of the Song.
     * @param composer The composer of the Song.
     * @param genres   The list of genres of the Song.
     */

    public Song(String title, Artist singer, int year, int duration, String lyrics, Artist author, Artist composer,
            List<String> genres) {
        super(title, duration, year);
        this.singer = singer;
        this.lyrics = lyrics;
        this.author = author;
        this.composer = composer;
        this.genres = genres;
    }

    /**
     * String representation of the Song.
     */
    @Override
    public String toString() {
        return "Song " + super.toString() + " by " + singer.toString() + " | Genres: " + genres;
    }

    /**
     * Indicates whether some other object is "equal to" this one. Two Song
     * objects are considered equal if they have the same title, singer, and year.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || this.getClass() != o.getClass())
            return false;
        Song otherSong = (Song) o;
        return this.year == otherSong.year &&
                Objects.equals(this.title, otherSong.title) &&
                Objects.equals(this.singer, otherSong.singer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.title, this.singer, this.year);
    }

    /**
     * Version karaoké of the lyrics
     */
    @Override
    public void play() {
        String[] words = lyrics.split("\\s+");
        for (String word : words) {
            System.out.print(word + " ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread was interrupted");
            }
        }
        System.out.println();
    }
}
