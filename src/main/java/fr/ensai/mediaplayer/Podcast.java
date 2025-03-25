package fr.ensai.mediaplayer;

public class Podcast extends Media {
    private String host;
    private String topic;
    private String subtitles;

    /**
     * Construction of a new Podcast object.
     *
     * @param host      Represents the host of the Podcast.
     * @param topic     The topic we will talk in the Podcast.
     * @param subtitles The discussion in the Podcast.
     */

    public Podcast(String title, String host, String topic, int duration, int year, String subtitles) {
        super(title, duration, year);
        this.host = host;
        this.topic = topic;
        this.subtitles = subtitles;
    }

    @Override
    public void play() {
        System.out.println("podcast in processing : " + title);
        String[] words = subtitles.split("\\s+");
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

    @Override
    public String toString() {
        return super.toString() + ", Host: " + host + ", Topic: " + topic;
    }
}
