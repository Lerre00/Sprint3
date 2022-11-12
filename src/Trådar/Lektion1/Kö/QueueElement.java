package Trådar.Lektion1.Kö;

public class QueueElement {
    protected String text;

    QueueElement(String o) {
        text=o;
    }

    public String getText(){
        return text;
    }
}
