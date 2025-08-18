public class ComputeArea {
    
    public static void main(String[] args) {
        
        double base = 4.0;
        double height = 6.0;

        final double pi = 3.14;
        double radius = 8.0;
        double areaOfSquare;
        double areaOfTriangle;
        double areaOfCircle;


        areaOfSquare = base * base;
        areaOfTriangle = 0.5 * base * height;
        areaOfCircle = pi * radius * radius;

        System.out.println("The Area of Square: " + areaOfSquare +"\n"+ 
        "The Area of Triangle: " + areaOfTriangle +"\n"+ 
        "The Area of Circle: " + areaOfCircle);
    }
}
