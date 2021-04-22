package src.generator;

import processing.core.PApplet;
import src.Point;

/**
 * Generate isosurface value for each point using processing Perlin noise.
 */
public class PerlinNoise implements Generator {
    PApplet applet;
    int space,nbPts;

    /**
     *
     * @param applet link to our main processing class
     * @param space the space between each point of the scalar field
     * @param nbPts the number of points of the scalar field
     */
    public PerlinNoise(PApplet applet, int space, int nbPts) {
        this.applet = applet;
        this.space = space;
        this.nbPts = nbPts;
    }

    /**
     * Produce an isosurface value for each point
     * @param pts The currently processed point
     * @return The isosurface  value
     */
    @Override
    public int generate(Point pts) {
        int maxSize = space*nbPts;
        if(pts.x==0 || pts.x==maxSize || pts.y==maxSize || pts.z ==0 || pts.z==maxSize) return 0;
        return Math.round(applet.noise(pts.x,pts.y,pts.z)* 255);
    }
}
