package src;

import processing.core.PApplet;
import peasy.*;
import src.generator.ConstantHigh;
import src.generator.Generator;

public class Main extends PApplet {

    final int space = 10;
    final int nbPts = 10;

    PeasyCam cam;
    Generator generator;
    ScalarField scalarField;
    MarchingCube marchingCube;



    @Override
    public void settings(){
        size(512, 512, P3D);
        generator = new ConstantHigh();
        scalarField = new ScalarField(space,nbPts,generator,this);
        marchingCube = new MarchingCube(this.scalarField, this,123);
    }
    @Override
    public void setup(){
        cam = new PeasyCam(this, (space*nbPts)/(float)2,(space*nbPts)/(float)2,(space*nbPts)/(float)2,80);

    }

    @Override
    public void draw(){
        background(255);
        marchingCube.march();
    }

    public void line(Point p1, Point p2){
        line(p1.x,p1.y,p1.z, p2.x,p2.y,p2.z);
    }

    public static void main(String... args){
        PApplet.main("src.Main");

    }
}
