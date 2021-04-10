import processing.core.PApplet;
import peasy.*;

public class Main extends PApplet {

    float x,y,z;
    PeasyCam cam;
    ScalarField scalarField;

    final int space = 10;
    final int nbPts = 10;

    @Override
    public void settings(){
        size(512, 512, P3D);
        scalarField = new ScalarField(space,nbPts,this);

    }
    @Override
    public void setup(){
        cam = new PeasyCam(this, (space*nbPts)/2,(space*nbPts)/2,(space*nbPts)/2,80);
    }

    @Override
    public void draw(){
        background(255);
        scalarField.draw();

    }

    public void line(Point p1, Point p2){
        line(p1.x,p1.y,p1.z, p2.x,p2.y,p2.z);
    }

    public static void main(String... args){
        PApplet.main("Main");
    }
}
