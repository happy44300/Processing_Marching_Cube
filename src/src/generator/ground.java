package src.generator;

import src.Point;

public class ground implements Generator {

    @Override
    public int generate(Point pts) {
        if(pts.y  == 0) return 255;
        return 0;
    }
}
