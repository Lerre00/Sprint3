package Trådar.Lektion1.Kö;

public class Producers extends Thread{

    private QueueElement obj;
    private String namn;
    private double interval;
    private Queue queue;

    public String getNamn() {
        return namn;
    }

    public Producers(String namn, double ggrPerSekund, Queue queue){
        this.namn = namn;
        this.interval = ggrPerSekund * 1000;
        this.queue = queue;
        obj = new QueueElement(namn);
    }

    @Override
    public void run()  {
        while (!Thread.interrupted()){
            try {
                Thread.sleep(Math.round(interval));
                System.out.println("Putting in: "+namn);
                queue.put(obj);
            }
            catch (InterruptedException e){
                break;
            }
        }

    }

}
