package Interface.Impl;

import Interface.IColor;

public class Red implements IColor {

    @Override
    public void colorLight() {
        System.out.println("This light is Red");
    }
}
