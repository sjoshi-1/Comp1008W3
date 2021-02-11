import java.util.ArrayList;
import java.util.Arrays;

    public class VGInstance {
        public static void main(String[] args) {
            String name1 = new String("Fred");
            String name2 = new String("Fred");
            System.out.println("name1==name2: " + (name1 == name2));
            System.out.println("name1.equals(name2): " + name1.equals(name2));

            String name3 = "Fred";
            String name4 = "Fred";
            System.out.println(name3==name4);
  System.out.println("Hello");



            ArrayList<String> unchartedGenres = new ArrayList<>();
            unchartedGenres.addAll(Arrays.asList("Adventure","Puzzle"));

            try {
                VideoGame vg1 = new VideoGame("Uncharted", unchartedGenres, "ski", "PlayStation");
            }
            catch (IllegalArgumentException e)
            {
                System.out.println(e.getMessage());
            }

        }
    }

