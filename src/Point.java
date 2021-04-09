import processing.core.PApplet;

public class Point {
 float x,y,z;
 int isoSurface;
 PApplet main;

    public Point(float x, float y, float z, int isoSurface, PApplet main) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.isoSurface = isoSurface;
        this.main = main;
    }

    public void Draw(){
        main.translate(x,y,z);
        main.sphere(10);
    }
}
