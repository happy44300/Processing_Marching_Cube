import processing.core.PApplet;
import processing.core.PConstants;

public class Cube {
    Point[] points;
    PApplet applet;

    public Cube(Point[] points, PApplet applet) {
        this.points = points;
        this.applet = applet;
    }

    public void draw(){
        applet.beginShape();
        for(Point point : points) {
            applet.vertex(point.x,point.y,point.z);
        }
        applet.endShape(PConstants.CLOSE);
    }

    public Point[] getPoints() {
        return points;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }

    public PApplet getApplet() {
        return applet;
    }

    public void setApplet(PApplet applet) {
        this.applet = applet;
    }
}
