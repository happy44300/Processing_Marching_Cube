package src;

import processing.core.PApplet;
import peasy.*;
import src.generator.Generator;
import src.generator.PerlinNoise;

/**
 * Application main class
 */
public class Main extends PApplet {

    final int space = 10;
    final int nbPts = 15;
    final int isoSurface = 140;

    PeasyCam cam;
    Generator generator;
    ScalarField scalarField;
    MarchingCube marchingCube;


    /**
     * When using processing outside the app, we need to use this instead of setup
     */
    @Override
    public void settings(){
        size(512, 512, P3D);
        generator = new PerlinNoise(this,space,nbPts);
        scalarField = new ScalarField(space,nbPts,generator,this);
        marchingCube = new MarchingCube(this.scalarField,isoSurface);
    }

    @Override
    public void setup(){
        //PeasyCam require to by initialized in setup instead of settings
        cam = new PeasyCam(this, (space*nbPts)/(float)2,(space*nbPts)/(float)2,(space*nbPts)/(float)2,80);
    }

    @Override
    public void draw(){
        background(255);
        marchingCube.march();
    }

    /**
     * Wrapper function to call line using our Point class
     * @param p1 1st point
     * @param p2 2nd point
     */
    public void line(Point p1, Point p2){
        line(p1.x,p1.y,p1.z, p2.x,p2.y,p2.z);
    }

    /**
     * Wrapper function to call vertex using our Point class
     * @param point The point to add as a vertex
     */
    public void vertex(Point point){
       vertex(point.x, point.y, point.z);
    }

    /**
     * Project entry point
     * @param args Command line arguments
     */
    public static void main(String... args){
        PApplet.main("src.Main");

    }
}
