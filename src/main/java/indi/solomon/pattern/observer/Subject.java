package indi.solomon.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dalei.liu on 2016/7/14.
 */
/// <summary>
/// 抽象主题类
/// </summary>
public abstract class Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    /// <summary>
    /// 增加观察者
    /// </summary>
    /// <param name="observer"></param>
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /// <summary>
    /// 移除观察者
    /// </summary>
    /// <param name="observer"></param>
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /// <summary>
    /// 向观察者（们）发出通知
    /// </summary>
    public void doNotify() {
        for (Observer o : observers) {
            o.update();
        }
    }
}
