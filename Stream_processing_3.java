import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_processing_3 {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1,2,3,4,5,6);
        List<Integer> res = ls.stream().map(e -> e*e).collect(Collectors.toList());

        System.out.println(res);
    }
}
