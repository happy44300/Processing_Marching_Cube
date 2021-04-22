package src;

import processing.core.PApplet;

/**
 * Represent of point with an isoLevel
 */
public class Point {
    /**
     * The x,y,z component of our point
     */
 public float x,y,z;
 int isoLevel;
 PApplet applet;

    /**
     * Create a point given each coordinate
     * @param x the x coordinate of the point
     * @param y the y coordinate of the point
     * @param z the z coordinate of the point
     * @param isoLevel the isoLevel of the point
     * @param applet link to processing main class
     */
    public Point(float x, float y, float z, int isoLevel, PApplet applet) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.isoLevel = isoLevel;
        this.applet = applet;
    }

    /**
     * Create a point with 0 as default coordinate
     * @param applet link to main processing class
     */
    public Point(PApplet applet) {
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.isoLevel = 0;
        this.applet = applet;
    }

    /**
     * Useful for debug.
     * Print the point as a string.
     * @return the text representation of the point
     */
    @Override
    public String toString() {
        return "src.Point{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", isoLevel=" + isoLevel +
                ", applet=" + applet +
                '}';
    }

    /**
     * Draw this point
     * NOTE: Drawing a full sphere for a point is gpu intensive. Drawing a lot of points will cause slow-down
     */
    public void Draw(){
        if(isoLevel < 255/2) {
            applet.pushMatrix();
            applet.translate(x, y, z);
            applet.sphere(1);
            applet.popMatrix();
        }
    }
}
