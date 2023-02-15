import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_processing_5 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(12,-4,-5,19,7);
        List<Integer> res = nums.stream().filter(e -> e>0).collect(Collectors.toList());
        System.out.println(res);

    }
}
