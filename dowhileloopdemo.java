public class DoWhileLoopDemo {

    public static void main(String[] args) {
        int count = 10;
        System.out.println("Printing numbers from 10 to 1");
        do {
            System.out.println(count--);
            
        } while(count >= 0);
    }
}
