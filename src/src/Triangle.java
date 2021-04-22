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
        applet.beginShape(PConstants.LINE);
        applet.line(vertices[0], vertices[1]);
        applet.line(vertices[1], vertices[2]);
        applet.line(vertices[2], vertices[0]);
        applet.endShape(applet.CLOSE);
    }
}
