import java.util.Scanner;

public class OverridingTest {
    public void Showing(String a, int b) {
        System.out.println("enter your name: " + a);
        System.out.println("enter your Id: " + b);
    }
}
class OverridingTwo extends OverridingTest {
    public void Showing(int bb, String aa) {
        System.out.println();
        System.out.println("enter your name1: " + aa);
        System.out.println("enter your Id1: " + bb);
    }
}
class ExecuteOfOverride {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        OverridingTest obj = new OverridingTest();
        String a = input.nextLine();
        int b = input.nextInt();
        obj.Showing(a, b);
        OverridingTwo obj1 = new OverridingTwo();
        String aa = input.nextLine();
        int bb = input.nextInt();
        obj1.Showing(bb, aa);
    }
}
