package com.example.project;

public class TriangleTests {
    public static void main(String[] args) {
        //point distance
        System.out.println("--------------------");
        System.out.println("Points distance test");
        Point pt1 = new Point(0, 4);
        Point pt2 = new Point (0, 8);
        System.out.println("Test 1: " + (pt1.distanceTo(pt2) == 4));
        pt1 = new Point(4, 0);
        pt2 = new Point (4, 0);
        System.out.println("Test 2: " + (pt1.distanceTo(pt2) == 4));
        pt1 = new Point(1, 1);
        pt2 = new Point (4, 5);
        System.out.println("Test 3: " + (pt1.distanceTo(pt2) == 5));
        System.out.println("--------------------");
        System.out.println("Points info test");
        System.out.println("Test 1: " + pt1.pointInfo().equals("(1, 1)"));
        System.out.println("Test 2: " + pt2.pointInfo().equals("(4, 5)"));
        pt1 = new Point(0, 1);
        pt2 = new Point (2, 8);
        System.out.println("Test 3: " + pt1.pointInfo().equals("(0, 1)"));
        System.out.println("Test 4: " + pt2.pointInfo().equals("(2, 8)"));
        System.out.println("--------------------");
        System.out.println("Triangle Perimeter test");
        Point pt3 = new Point(0,2);
        Triangle t1 = new Triangle(pt1, pt2, pt3);
        System.out.println("Test 1: " + (t1.perimeter() == 14.605));
        pt1 = new Point(4,5);
        pt2 = new Point(7,0);
        pt3 = new Point(2,8);
        Triangle t2 = new Triangle(pt1, pt2, pt3);
        System.out.println("Test 2: " + (t2.perimeter() == 18.87));
        System.out.println("--------------------");
        System.out.println("Triangle Info test");
        System.out.println("Test 1: " + (t1.triangleInfo().equals("[(0, 1), (2, 8), (0, 2)]")));
        System.out.println("Test 2: " + (t2.triangleInfo().equals("[(4, 5), (7, 0), (2, 8)]")));
        System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.println("--------------------");
    }
}
