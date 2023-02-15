interface mathX{
    void add(int n1, int n2);
}

class ProgramOne implements mathX{
    public void add(int n1, int n2){
        System.out.println(n1+n2);
    }
}

public class Stream_processing_4 {
    public static void main(String[] args) {
        ProgramOne o1 = new ProgramOne();
        o1.add(10,20);

        mathX obj = (int x, int y)->{
            System.out.println(x+y);
        };
        obj.add(10,20);
    }
}
