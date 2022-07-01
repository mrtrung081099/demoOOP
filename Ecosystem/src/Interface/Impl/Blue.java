package Interface.Impl;

import Interface.IColor;

public class Blue implements IColor {
    @Override
    public void colorLight() {
        System.out.println("This light is Blue");
    }
}
