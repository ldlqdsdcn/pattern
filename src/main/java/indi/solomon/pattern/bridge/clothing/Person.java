package indi.solomon.pattern.bridge.clothing;

/**
 * Created by dalei.liu on 2016/7/14.
 */
public abstract class Person {
    private String type;
    private Clothing clothing;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Clothing getClothing() {
        return clothing;
    }

    public void setClothing(Clothing clothing) {
        this.clothing = clothing;
    }

    //抽象方法
    public abstract void dress();
}