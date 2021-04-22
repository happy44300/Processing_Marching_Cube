package src;

import processing.core.PApplet;
import src.generator.Generator;

import java.util.ArrayList;
import java.util.Iterator;

public class ScalarField implements Iterable<Cube> {
    int space;
    int nbPtsX, nbPtsY,nbPtsZ;
    ArrayList<Cube> cubes;
    PApplet applet;
    Generator generator;

    public ScalarField(int space, int nbPtsX, int nbPtsY, int nbPtsZ, ArrayList<Cube> cubes, Generator generator, PApplet applet) {
        this.space = space;
        this.nbPtsX = nbPtsX;
        this.nbPtsY = nbPtsY;
        this.nbPtsZ = nbPtsZ;
        this.cubes = cubes;
        this.applet = applet;
        this.generator = generator;
        generateField();
    }

    public ScalarField(int space, int nbPts, Generator generator, PApplet applet) {
        this.space = space;
        this.nbPtsX = nbPts;
        this.nbPtsY = nbPts;
        this.nbPtsZ = nbPts;
        this.applet = applet;
        this.generator = generator;
        generateField();
    }

    private void generateField(){

        this.cubes = new ArrayList<>();

        for (int x = 0; x < nbPtsX; x++) {
            for (int y = 0; y < nbPtsY ; y++) {
                for (int z = 0; z < nbPtsZ; z++) {
                    int[][] pointsOffset = {{0,0,1},{1,0,1},{1,0,0},{0,0,0},{0,1,1},{1,1,1},{1,1,0},{0,1,0}};

                    Point[] points = new Point[8];

                    for (int i = 0; i < 8; i++) {
                                float px = (x + (float)pointsOffset[i][0]) * space;
                                float py =(y + (float)pointsOffset[i][1])*space;
                                float pz = (z + (float)pointsOffset[i][2])*space;
                        points[i] = new Point(
                                px, py, pz, generator.generate(new Point(px,py,pz,0,applet)),
                                applet);
                        //System.out.println(points[i]);
                    }
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
