package src.generator;

import processing.core.PApplet;
import src.Point;

public class TerrainNoise implements Generator{
    PApplet applet;
    int space,nbPts;

    /**
     *
     * @param applet link to our main processing class
     * @param space the space between each point of the scalar field
     * @param nbPts the number of points of the scalar field
     */
    public TerrainNoise(PApplet applet, int space, int nbPts) {
        this.applet = applet;
        this.space = space;
        this.nbPts = nbPts;
    }

    /**
     * Produce an isosurface value for each point
     * @param p The currently processed point
     * @return The isosurface  value
     */
    @Override
    public int generate(Point p) {
        int maxSize = space*nbPts;
        if(p.x==0 || p.x==maxSize || p.y==maxSize || p.z ==0 || p.z==maxSize) return 0;

        

        return 1;
    }
}
