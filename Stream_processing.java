import java.util.ArrayList;
import java.util.Locale;

public class Stream_processing {
    public static void change(String m){
        System.out.println(m.toUpperCase());
    }
    public static void main(String[] args) {
        ArrayList<String> lang = new ArrayList<>();
        lang.add("Java");
        lang.add("CSharp");
        lang.add("Python");
        lang.add("PHP");

        lang.forEach(Stream_processing::change);
    }
}
