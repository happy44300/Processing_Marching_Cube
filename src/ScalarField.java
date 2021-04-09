import processing.core.PApplet;

import java.util.ArrayList;
import java.util.Iterator;

public class ScalarField implements Iterable<Cube> {
    int space;
    int nbPtsX, nbPtsY,nbPtsZ;
    ArrayList<Cube> cubes;
    PApplet applet;

    public ScalarField(int space, int nbPtsX, int nbPtsY, int nbPtsZ, PApplet applet) {
        this.space = space;
        this.nbPtsX = nbPtsX;
        this.nbPtsY = nbPtsY;
        this.nbPtsZ = nbPtsZ;
        this.applet = applet;
        generateField();
    }

    public ScalarField(int space, int nbPts, PApplet applet) {
        this.space = space;
        this.nbPtsX = nbPts;
        this.nbPtsY = nbPts;
        this.nbPtsZ = nbPts;
        this.applet = applet;
        generateField();
    }

    private void generateField(){

        this.cubes = new ArrayList<>();

        for (int x = 0; x < nbPtsX; x++) {
            for (int y = 0; y < nbPtsY ; y++) {
                for (int z = 0; z < nbPtsZ; z++) {
                    Point[] points = {
                            new Point(x,y,z,0, applet), //[0,0,0]
                            new Point(x,y,z,0, applet), //[0,0,0]
                            new Point(x,y,z,0, applet), //[0,0,0]
                            new Point(x,y,z,0, applet), //[0,0,0]
                            new Point(x,y,z,0, applet), //[0,0,0]
                            new Point(x,y,z,0, applet), //[0,0,0]
                            new Point(x,y,z,0, applet), //[0,0,0]
                            new Point(x,y,z,0, applet), //[0,0,0]


                    };
                    cubes.add(new Cube(points,applet));
                }
            }
        }
    }

    public void draw(){
        for (Cube cube: this) {
            cube.draw();
        }
    }

    @Override
    public Iterator<Cube> iterator() {
        return cubes.iterator();
    }
}
