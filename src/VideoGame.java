import java. util.ArrayList;
public class VideoGame {
    private String name;
    private ArrayList<String> genre;
    private String ageRating;
    private String console;
    //to store their value in memory we use constructor


    public VideoGame(String name, ArrayList<String> genre, String ageRating, String console) {
        //this is calling a set method
        setName (name);
        setGenre (genre);
        setAgeRating (ageRating);
        setConsole (console);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getGenre() {
        return genre;
    }

    public void setGenre(ArrayList<String> genre) {
        this.genre = genre;
    }

    public String getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(String ageRating) {
        this.ageRating = ageRating;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }
}

