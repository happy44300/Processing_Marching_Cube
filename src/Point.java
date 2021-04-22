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

    public Point(PApplet main) {
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.isoSurface = 0;
        this.main = main;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", isoSurface=" + isoSurface +
                ", main=" + main +
                '}';
    }

    public void Draw(){
        if(isoSurface < 255/2) {
            main.pushMatrix();
            main.translate(x, y, z);
            main.sphere(1);
            main.popMatrix();
        }
    }
}
