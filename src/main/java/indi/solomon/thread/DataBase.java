package indi.solomon.thread;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by 刘大磊 on 2016/10/18 11:00.
 */
public class DataBase {
    private static DataBase database=new DataBase();

    public static DataBase getInstance()
    {
        return database;
    }

    private Set<String> map=new HashSet<String>();

    public boolean contains(String key)
    {
        return map.contains(key);
    }
    public boolean add(String key)
    {
     return    map.add(key);
    }
    public Set<String> getMap()
    {
        return this.map;
    }


}
