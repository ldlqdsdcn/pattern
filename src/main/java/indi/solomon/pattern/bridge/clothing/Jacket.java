package indi.solomon.pattern.bridge.clothing;

/**
 * Created by dalei.liu on 2016/7/14.
 */
public class Jacket extends Clothing {

    @Override
    public void dressCloth(Person person) {
        System.out.println(person.getType() + "穿上马甲！");
    }

}
