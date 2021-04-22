import processing.core.PApplet;

import java.util.ArrayList;

public class MarchingCube {

    ScalarField scalarField;
    PApplet applet;
    ArrayList<Triangle> triangles;
    int isoLevel;

    public MarchingCube(ScalarField scalarField, PApplet applet, int isolevel) {
        this.scalarField = scalarField;
        this.applet = applet;
        this.isoLevel = isolevel;
    }

    public void march() {
        for (Cube cube : scalarField) {
            int cubeIndex = 0;

            //calculate cube index
            for (int i = 0; i < 8; i++) {
                if (cube.getPoints()[i].isoSurface < isoLevel) {
                    cubeIndex |= 1 << i;
                }
            }

        }
    }

    public void drawTriangulation(){
        for (Triangle triangle: triangles) {
            triangle.draw();
        }
    }
}

