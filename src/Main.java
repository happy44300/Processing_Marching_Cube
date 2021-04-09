import processing.core.PApplet;
import peasy.*;

public class Main extends PApplet {

    float x,y,z;
    PeasyCam cam;

    public void settings(){
        size(512, 512, P3D);
    }

    public void draw(){
        background(255);
        rectMode(CENTER);
        sphere(100);
    }

    public static void main(String... args){
        PApplet.main("Main");
    }
}
