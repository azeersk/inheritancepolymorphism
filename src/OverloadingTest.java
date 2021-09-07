import java.util.Scanner;

public class OverloadingTest {
    public void Showing(String a, int b){
        System.out.println("enter your name: "+a);
        System.out.println("enter your Id: "+b);
    }
    public void Showing(int b,String a){
        System.out.println();
        System.out.println("enter your name1: "+a);
        System.out.println("enter your Id1: "+b);
    }
}

class ExecuteOf{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        OverloadingTest obj = new OverloadingTest();
        String a = input.nextLine();
        int b = input.nextInt();
        obj.Showing(a,b);
        obj.Showing(b,a);

    }
}
