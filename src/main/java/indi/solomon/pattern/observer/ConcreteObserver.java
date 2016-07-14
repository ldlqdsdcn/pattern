package indi.solomon.pattern.observer;

/**
 * Created by dalei.liu on 2016/7/14.
 */
public class ConcreteObserver extends Observer {
    private String observerState;
    private String name;
    private ConcreteSubject subject;
    public ConcreteObserver(ConcreteSubject subject, String name)
    {
        this.subject = subject;
        this.name = name;
    }
    public void update() {
        observerState = subject.getSubjectState();
        observerState = subject.getSubjectState();
        System.out.println( String.format("The observer's state of %s is %s", name, observerState));
    }



    public ConcreteSubject getSubject() {
        return subject;
    }

    public void setSubject(ConcreteSubject subject) {
        this.subject = subject;
    }
}
