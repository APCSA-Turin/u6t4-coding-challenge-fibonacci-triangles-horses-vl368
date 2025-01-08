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
        Point p1 = new Point(5, 10);
        Point p2 = new Point(-6, 17);
        Point p3 = new Point(18, 4);
        Point p4 = new Point(-1, 4);
        Point p5 = new Point(4, 0);
        Point p6 = new Point(-1, 0);

        Triangle tri1 = new Triangle(p1,p2,p3);
        Triangle tri2 = new Triangle(p4,p5,p6);
        System.out.println("Test 1: " + (tri1.triangleInfo().equals("[(5, 10), (-6, 17), (18, 4)]")));
        System.out.println("--------------------");



        TriangleCollection collection1 = new TriangleCollection(6,4,7);
        System.out.println(collection1.triangleCollectionInfo());
        String expected = 
        "[(1, 5), (5, 12), (9, 5)]\n"+
        "[(1, 5), (5, 12), (8, 5)]\n"+
        "[(1, 5), (5, 12), (7, 5)]\n"+
        "[(1, 5), (5, 12), (6, 5)]\n"+
        "[(1, 5), (5, 12), (5, 5)]\n"+
        "[(1, 5), (5, 12), (4, 5)]\n";
        collection1.shiftTriangles(5);

        System.out.println(collection1.triangleCollectionInfo());
        System.out.println(collection1.triangleCollectionInfo().equals(expected));



        System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.println("--------------------");
    }
}
