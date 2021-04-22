package src.generator;

import processing.core.PApplet;
import src.Point;

public class PerlinNoise implements Generator {
    PApplet applet;
    int space,nbPts;

    public PerlinNoise(PApplet applet, int space, int nbPts) {
        this.applet = applet;
        this.space = space;
        this.nbPts = nbPts;
    }

    @Override
    public int generate(Point pts) {
        int maxSize = space*nbPts;
        if(pts.x==0 || pts.x==maxSize || pts.y==maxSize || pts.z ==0 || pts.z==maxSize) return 0;
        return Math.round(applet.noise(pts.x,pts.y,pts.z)* 255);
    }
}
