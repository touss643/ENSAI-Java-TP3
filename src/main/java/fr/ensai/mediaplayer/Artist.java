package fr.ensai.mediaplayer;

public class Artist {
    private String firstName;
    private String lastName;
    private String nationality;

    /**
     * Construction of a new Artist object.
     *
     * @param firrstName  The firstname of the Artist.
     * @param lastName    The lastname of the Artist.
     * @param nationality The nationality of the Artist.
     */

    public Artist(String firstName, String lastName, String nationality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
    }

    /**
     * Obtaining the firstName of Artist.
     */

    public String getfirstName() {
        return firstName;
    }

    public String getlastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Artist " + getfirstName() + " " + getlastName();
    }

}
