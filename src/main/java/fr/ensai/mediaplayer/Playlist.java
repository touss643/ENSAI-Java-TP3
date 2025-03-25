package fr.ensai.mediaplayer;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    public String name;
    public List<Media> mediaList;
    public int totalDuration;

    public Playlist(String name) {
        this.name = name;
        this.mediaList = new ArrayList<>();
        this.totalDuration = 0;
    }

    // Add Media to a Playlist
    public void addMedia(Media media) {
        mediaList.add(media);
        totalDuration += media.duration;
    }

    // Remove Media from a Playlist
    public boolean removeMedia(Media media) {

        if (this.mediaList.contains(media)) {
            this.mediaList.remove(media);
            this.totalDuration -= media.duration;
            return true;
        } else {
            return false;
        }
    }

    public boolean removeMedia(int i) {
        if (i > 0 && i <= this.mediaList.size()) {
            Media todelete = this.mediaList.get(i);
            mediaList.remove(todelete);
            int duration = todelete.duration;
            this.totalDuration -= duration;
            return true;
        } else {
            return false;
        }
    }

    public void randomplay(boolean random) {
        if (this.mediaList.isEmpty()) {
            try {
                throw new IndexOutOfBoundsException("Your playlist is empty !!");
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        } else {
            if (random) {
                int range = mediaList.size();
                int randomvar = (int) ((range * Math.random()));
                Media mediatoplay = this.mediaList.get(randomvar);
                mediatoplay.play();
            } else {
                for (Media media : mediaList) {
                    media.play();
                }
            }
        }

    }

    public Playlist(Playlist other) {
        this.name = other.name;
        this.mediaList = other.mediaList;
        this.totalDuration = other.totalDuration;
    }

    // Display a Playlist
    @Override
    public String toString() {
        return "Playlist{" +
                "name='" + name + '\'' +
                ", mediaList=" + mediaList +
                ", totalDuration=" + totalDuration +
                '}';
    }
}
