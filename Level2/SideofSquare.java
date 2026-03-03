import java.util.Scanner;

public class SideofSquare {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double perimeter,side;
        System.out.print("Enter perimeter: ");
        perimeter = input.nextDouble();

        side = perimeter/4;
        
        System.out.println("The length of side is " + side +"whose Perimeter is"+ perimeter); 
        input.close();
    }
}
