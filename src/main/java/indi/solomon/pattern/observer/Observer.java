package indi.solomon.pattern.observer;

/**
 * Created by dalei.liu on 2016/7/14.
 */
/// <summary>
/// 抽象观察者类，为所有具体观察者定义一个接口，在得到通知时更新自己
/// </summary>
public abstract class Observer
{
    public abstract void update();
}

