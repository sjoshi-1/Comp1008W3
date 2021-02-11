import java. util.ArrayList;
import java.util.List;
import java.util.Arrays;

//class
public class VideoGame {

    //instance variable
    private String name;
    private ArrayList<String> genres;
    private String ageRating;
    private String console;
    //to store their value in memory we use constructor


    //construtor
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
        if (name.length() >= 2)
            this.name = name;
        else
            throw new IllegalArgumentException("name must be at least 2 characters");
    }


    public ArrayList<String> getGenre() {
        return genres;
    }


    public static ArrayList<String> getAllGenres(){
        ArrayList <String> genres=new ArrayList<>();
        genres.add("Horror");
        genres.add("FPS");
        genres.add("Puzzle");
        genres.add("Sports");
        genres.add("Adventure");
        genres.add("Point and click");
        genres.add("4x strategy");
        genres.add("Intro to OO");
         return genres;

    }
    public void setGenre(ArrayList<String> genres) {
        ArrayList<String> validGenres = getAllGenres();
        for (String genre : genres)
        {
            if (!validGenres.contains(genre))
                throw new IllegalArgumentException(genre + " is not valid.  Valid options are: "
                        +validGenres);
        }
        this.genres = genres;
    }

    public String getAgeRating() {

        return ageRating;
    }

    public void setAgeRating(String ageRating) {
        List<String> ageRatingValues=Arrays.asList("E","M","18+","T","R","13+","E10+","G");
        if(ageRatingValues.contains(ageRating))
        this.ageRating = ageRating;
        else
            throw new IllegalArgumentException(ageRating + " is not valid.  Options are : "+ ageRatingValues);
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
   List<String> consoleNames =Arrays.asList("GameBoy","PlayStation","Sega","PC");

        this.console = console;
    }
}

