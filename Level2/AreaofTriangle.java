import java.util.Scanner;

public class AreaofTriangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double Base, Height;
        double AreainCM,AreainIN;
        System.out.print("Enter Base: ");
        Base = input.nextDouble();

        System.out.print("Enter Height: ");
        Height = input.nextDouble();

        AreainCM = 0.5*Base*Height;
        AreainIN = AreainCM/6.4516;

        System.out.println("The Area of triangle in cm:"+AreainCM);
        System.out.println("The Area of triangle in IN:"+AreainIN);

        input.close();
    }
}
