import processing.core.PConstants;

public class Triangle {
    Point[] vertices;
    Main applet;

    public Triangle(Point[] vertices, Main applet) {
        this.vertices = vertices;
        this.applet = applet;
    }

    public void draw(){
        applet.beginShape(PConstants.POINTS);
        applet.line(vertices[0], vertices[1]);
        applet.line(vertices[1], vertices[2]);
        applet.line(vertices[2], vertices[3]);
        applet.endShape(applet.CLOSE);
    }
}
