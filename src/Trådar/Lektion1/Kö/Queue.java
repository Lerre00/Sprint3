package Trådar.Lektion1.Kö;

import java.util.ArrayList;

public class Queue extends Thread{
    private ArrayList<Object> l = new ArrayList<>();
    public int size() {  // ger antalet element i kön
        return l.size();
    }
    public synchronized void put(Object obj){
        l.add(obj);
        notify();
    }
    public synchronized Object take(){
        while(l.isEmpty()){
            try{ wait(); }
            catch(InterruptedException e){ return null;}
        }
        Object obj = l.get(0);
        l.remove(0);
        return obj;
    }

}
