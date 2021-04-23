package src.generator;

import processing.core.PApplet;
import src.Point;

/**
 * Generate isosurface value for each point using processing Perlin noise.
 */
public class PerlinNoise implements Generator {
    PApplet applet;
    int spacing,nbPts;
    int scale;

    /**
     *
     * @param applet link to our main processing class
     * @param spacing the spacing between each point of the scalar field
     * @param nbPts the number of points of the scalar field
     * @param  scale
     */
    public PerlinNoise(PApplet applet, int spacing, int nbPts, int scale) {
        this.applet = applet;
        this.spacing = spacing;
        this.nbPts = nbPts;
        this.scale =scale;
    }

    /**
     * Produce an isosurface value for each point
     * @param pts The currently processed point
     * @return The isosurface  value
     */
    @Override
    public int generate(Point pts) {
        int maxSize = spacing *nbPts;
        //make sure we close the shape near the border
        if(pts.x==0 || pts.x==maxSize || pts.y==0 || pts.y==maxSize || pts.z ==0 || pts.z==maxSize) return 0;
        //since we use the coordinate between point to generate noise, we need to make sure spacing bewteen the point does not influence the output
        return Math.round(applet.noise((pts.x/ spacing)*scale,(pts.y/ spacing)*scale,(pts.z/ spacing)*scale)* 255);
    }
}
