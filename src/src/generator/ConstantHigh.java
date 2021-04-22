package src.generator;

import src.Point;

public class ConstantHigh implements Generator{
    @Override
    public int generate(Point pts) {
        return 255;
    }
}
