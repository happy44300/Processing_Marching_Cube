import processing.core.PApplet;

public class MarchingCube {

    ScalarField scalarField;
    PApplet applet;
    int isoLevel;

    public MarchingCube(ScalarField scalarField, PApplet applet, int isolevel) {
        this.scalarField = scalarField;
        this.applet = applet;
        this.isoLevel = isolevel;
    }

    public void march(){
        for (Cube cube : scalarField){
            int cubeIndex = 0;
            for(int i=0; i<8; i++) {
                if (cube.getPoints()[i].isoSurface < isoLevel) {
                    cubeIndex |= 1 << i;
                }
            }
            if(TriangulationTable.edgeTable[cubeIndex] == 0){
                return;
            }
        }
    }

}

