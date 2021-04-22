package src;

import processing.core.PApplet;

import java.util.ArrayList;

public class MarchingCube {

    ScalarField scalarField;
    PApplet applet;
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
                if (cube.getPoints()[i].isoSurface > isoLevel) {
                    cubeIndex |= 1 << i;
                }
            }

           // if(cubeIndex != 0) System.out.println(cubeIndex);

            for(int i = 0; TriangulationTable.triTable[cubeIndex][i] !=-1; i += 3) {
                cube.triangleFromEdgeIndexes(
                        TriangulationTable.triTable[cubeIndex][i],
                        TriangulationTable.triTable[cubeIndex][i+1],
                        TriangulationTable.triTable[cubeIndex][i+2])
                        .draw();
            }
        }
    }
}

