package src.generator;

import processing.core.PApplet;
import src.Point;

public class PerlinNoise implements Generator {
    PApplet applet;

    public PerlinNoise(PApplet applet) {
        this.applet = applet;
    }

    @Override
    public int generate(Point pts) {
        return Math.round(applet.noise(pts.x,pts.y,pts.z)* 255);
    }
}
