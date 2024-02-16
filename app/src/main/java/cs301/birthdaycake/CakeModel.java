package cs301.birthdaycake;

public class CakeModel {
    public boolean isLit = true;
    public int numCandles = 2;
    public boolean hasFrosting = true;
    public boolean hasCandles = true;

    CakeModel() {
    }

    void blowing() {
        isLit = false;
    }

    boolean getLit() {
        return isLit;
    }

    boolean getCandles() {
        return hasCandles;
    }

    void fixCandles(boolean boo) {
        hasCandles = boo;
    }
}


