package indi.solomon.pattern.bridge.clothing;

/**
 * Created by dalei.liu on 2016/7/14.
 */
public class Man extends Person {

    public Man()
    {
        setType("男人");
    }

    @Override
    public void dress() {
        getClothing().dressCloth(this);
    }

}