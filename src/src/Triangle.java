package src;

import processing.core.PConstants;

public class Triangle {
    Point[] vertices;
    Main applet;

    public Triangle(Point[] vertices, Main applet) {
        this.vertices = vertices;
        this.applet = applet;
    }

    public Triangle(Point v1, Point v2, Point v3, Main applet) {
        Point[] v;
        v = new Point[3];
        v[0] = v1;
        v[1] = v2;
        v[2] = v3;
        this.vertices = v;
        this.applet = applet;
    }

    public void draw(){
        applet.fill(255,0,255);
        applet.beginShape();
        applet.vertex(vertices[0]);
        applet.vertex(vertices[1]);
        applet.vertex(vertices[2]);
        applet.endShape(applet.CLOSE);
        applet.noFill();
    }
}
