package com.example.project;

public class TriangleTester {
    public static void main(String[] args) {
        Triangle myTriangle = new Triangle (1, 3, 4, 6, 6, 3);
        Triangle myotherTriangle = new Triangle();
        System.out.println(myTriangle.perimeter());
        System.out.println(myTriangle.area());

        myTriangle.tranlsateX(7);
        System.out.println(myTriangle.perimeter());
        System.out.println(myTriangle.area());

        myTriangle.translateY(2);
        System.out.println(myTriangle.perimeter());
        System.out.println(myTriangle.area());

    }

}
