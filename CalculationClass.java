import java.util.Scanner;

public class CalculationClass {

    public static Scanner scan = new Scanner(System.in);
    public static void main ( String [] args)
    {
        CalculationClass.AreaOfFigures();
    }

    public static String AreaOfFigures ()
    {
        String result = "";
        System.out.println("Enter number of figur, please. " +
                "  If it's a square, enter '1',   if it is a triangle, enter '2',  " +
                "if it is a rectangle, enter '3', if it's a circle, type '4' ");

        int numberOfFigure = Integer.parseInt(scan.nextLine());



        if (numberOfFigure == 1) // for square
        {
            System.out.println("Enter the first side of the square = ");
            int a = Integer.parseInt(scan.nextLine());
            if (a >= 1)
            {
                int p = 4 * a;
                int s = a * a;

                result = "Perimeter of the square = "+p+" and Area = "+s;
                System.out.println(result);
            }
            else
            {
                return result = "Invalid entered data";
            }
        }



        else if (numberOfFigure == 2) // for triangle
        {
            System.out.println("Enter the first side of the triangle  = ");
            int a = Integer.parseInt(scan.nextLine());
            System.out.println("Enter the second side of the triangle = ");
            int b = Integer.parseInt(scan.nextLine());
            System.out.println("Enter the third side of the triangle = ");
            int c = Integer.parseInt(scan.nextLine());


            if ( a + b + c >= 1 )
            {
                int p = a + b + c;
                double s = a * b / 2;

                result = "Perimeter of the triangle = "+p+" and Area ="+s;
                System.out.println(result);
            }
            else
            {
                return result = "Invalid entered data";
            }
        }



        else if (numberOfFigure == 3) // for rectangle
        {
            System.out.println("Enter the first side of the rectangle = ");
            int a = Integer.parseInt(scan.nextLine());
            System.out.println("Enter the second side of the rectangle = ");
            int b = Integer.parseInt(scan.nextLine());

            if ( a + b >= 1)
            {
                int p =( a +  b ) * 2;
                int s = a * b;
                result = "Perimeter of the rectangle = "+p+" and Area ="+s;

                System.out.println(result);
            }
            else
            {
                return result = "Invalid entered data";
            }
        }



        else if (numberOfFigure == 4) // for circle
        {
            System.out.println("Enter the Radius of the circle = ");
            int r = Integer.parseInt(scan.nextLine());
            if (r >= 1)
            {
                double pi = 3.14;
                double s = pi * ( r * r );
                double p = 2 * pi * r;
                result = "Perimeter of the circle = "+p+" and Area ="+s;

                System.out.println(result);
            }
            else
            {
                return result = "Invalid entered data";
            }

        }
        return result = "Введите значение в верном формате например квадрат";
    }
}
