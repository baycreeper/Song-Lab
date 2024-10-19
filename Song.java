public class Song {
    private String title, artist, genre, topic;
    private int year, lengthInSeconds;
    private double shakiness, obscenity, danceability, loudness;

    public Song() {
        title = "";
        artist = "";
        genre = "";
        year = 0;
        lengthInSeconds = 0;
        shakiness = 0.0;
        obscenity = 0.0;
        danceability = 0.0;
        loudness = 0.0;
        topic = "";
    }

    public Song(String name, String artist, int year, String genre, int lengthInSeconds, double shakiness,
            double obscenity, double danceability, double loudness, String topic) {
        this.title = name;
        this.artist = artist;
        this.genre = genre;
        this.year = year;
        this.lengthInSeconds = lengthInSeconds;
        this.shakiness = shakiness;
        this.obscenity = obscenity;
        this.danceability = danceability;
        this.loudness = loudness;
        this.topic = topic;
    }

    public String toString() {
        return "Title: " + title + " | Artist: " + artist + " | Genre: " + genre + " | Year: " + year + " | Length: "
                + lengthInSeconds + " | Shakiness: " + shakiness + " | Obscenity: " + obscenity + " | Danceability: "
                + danceability + " | Loudness: " + loudness + " | Topic: " + topic + "\n";

    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public int getLength() {
        return lengthInSeconds;
    }

    public double getShakiness() {
        return shakiness;
    }

    public double getObscenity() {
        return obscenity;
    }

    public double getDanceability() {
        return danceability;
    }

    public double getLoudness() {
        return loudness;
    }

    public String getTopic() {
        return topic;
    }

    public void setTitle(String setTitle) {
        setTitle = title;
    }

    public void setArtist(String setArtist) {
        setArtist = artist;
    }

    public void setGenre(String setGenre) {
        setGenre = genre;
    }

    public void setYear(int setYear) {
        setYear = year;
    }

    public void setShakiness(double setShakiness) {
        setShakiness = shakiness;
    }

    public void setObscenity(double setObscenity) {
        setObscenity = obscenity;
    }

    public void setDanceability(double setDanceability) {
        setDanceability = danceability;
    }

    public void setLoudness(double setLoudness) {
        setLoudness = loudness;
    }

    public void setTopic(String setTopic) {
        setTopic = topic;
    }

}