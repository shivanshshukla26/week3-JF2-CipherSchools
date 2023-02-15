import java.util.*;

class Program {
    static void Convert(int arg) {
        System.out.println(Math.abs(arg));
    }
    void doAction(){
        List<Integer> numbers = Arrays.asList(5,-6,-9,2,2,0,-3);
        numbers.forEach(Program::Convert);
    }
}
public class Stream_processing_2 {
    public static void main(String[] args) {
        Program obj = new Program();
        obj.doAction();
    }
}
