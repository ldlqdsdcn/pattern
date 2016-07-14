package indi.solomon.pattern.bridge.clothing;

/**
 * Created by dalei.liu on 2016/7/14.
 */
public class Client {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //两类人
        Person man = new Man();
        Person lady = new Woman();
        //两种衣服的类
        Clothing jacket = new Jacket();
        Clothing trouser = new Trouser();

        jacket.dressCloth(man);
        trouser.dressCloth(man);
        jacket.dressCloth(lady);
        trouser.dressCloth(lady);
    }
}
