package Circles;

public class Circle {
    static double radius;
    final double pi = Math.PI;

    Circle (double r){
       radius = r;
    }

    public double circLenght(){

        double l = 2 * pi * radius;
        return l;
    }

    public double circArea(){

        double s = pi * radius * radius;
        return s;
    }

}
