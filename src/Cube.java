import processing.core.PApplet;
import processing.core.PConstants;

import java.util.ArrayList;


public class Cube {
    Point[] points;
    Main applet;

    public Cube(Point[] points, PApplet applet) {
        this.points = points;
        this.applet = (Main)applet;
    }

    public Point[] getEdge(){
        return  points;
    }

    public void draw(){
        applet.beginShape(PConstants.POINTS);


        for (int i = 0; i < 4; i++) {
            applet.line(points[i],points[i+4]);
            applet.line(points[i],points[(i+1)%4]);
            applet.line(points[i+4],points[(i+1)%4+4]);
        }
        applet.endShape(applet.CLOSE);
    }


    public Point[] getPoints() {
        return points;
    }


}
