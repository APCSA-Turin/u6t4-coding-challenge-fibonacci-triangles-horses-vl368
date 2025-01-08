package com.example.project;

public class Triangle {
    // array of Point objects
    private Point[] vertices;
    
    // Constructor: initializes the vertices array
    // to contain the three Point objects
    public Triangle(Point p1, Point p2, Point p3) {
      /* IMPLEMENT ME */
      this.vertices = new Point[3];
      this.vertices[0] = p1;
      this.vertices[1] = p2;
      this.vertices[2] = p3;
    }
    
    // Returns the perimeter of the Triangle
    // HINT: use the distanceTo method that you wrote in the Point class
    public double perimeter() {
      /* IMPLEMENT ME */
      double perimeter = 0;
      perimeter += vertices[0].distanceTo(vertices[1]);
      perimeter += vertices[1].distanceTo(vertices[2]);
      perimeter += vertices[2].distanceTo(vertices[3]);
      return perimeter;
    }
  
    // Returns a String with the three vertices that make up the Triangle;
    // if the vertices are the points (6, 10), (11, 15), and (18, 7),
    // this method should return: "[(6, 10), (11, 15), (18, 7)]"
    public String triangleInfo() {
      /* IMPLEMENT ME */
      String str = "[";
      for (Point vertice : vertices) {
        str += vertice.pointInfo() + ", ";
      }
      str = str.substring(str.length()-2) + "]";
      return str;
    }

    public Point[] getVertices() {
      return vertices;
    }
  }
  