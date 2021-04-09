import processing.core.PApplet;
import peasy.*;

public class Main extends PApplet {

    float x,y,z;
    PeasyCam cam;
    ScalarField scalarField;

    public void settings(){
        size(512, 512, P3D);
        scalarField = new ScalarField(10,2,this);
    }

    public void draw(){
        background(255);
        noLoop();
        camera(100, 0, 100, 50, 50, 0,
                0, 1, 0);
        scalarField.draw();

    }

    public static void main(String... args){
        PApplet.main("Main");
    }
}
