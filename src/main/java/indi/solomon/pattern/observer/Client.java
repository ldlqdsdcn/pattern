package indi.solomon.pattern.observer;

/**
 * Created by dalei.liu on 2016/7/14.
 */
public class Client {

    public static void main(String[] args)
    {
        // 具体主题角色通常用具体自来来实现
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver c=new ConcreteObserver(subject, "Observer C");
        subject.attach(new ConcreteObserver(subject, "Observer A"));
        subject.attach(new ConcreteObserver(subject, "Observer B"));
        subject.attach(c);
        subject.setSubjectState("Ready");
        subject.doNotify();
        subject.detach(c);
        subject.setSubjectState("Wait");
        subject.doNotify();
    }
}
