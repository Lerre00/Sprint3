package Trådar.Lektion1.Medicin;

public class Medicin extends Thread{

    private String medicinNamn;
    private double interval;

    public Medicin(String medicinNamn, double ggrPerMinut){
        this.medicinNamn = medicinNamn;
        this.interval = (60/ggrPerMinut) * 1000;
    }

    @Override
    public void run()  {
        while (!Thread.interrupted()){
            try {
                Thread.sleep(Math.round(interval));
                System.out.println("Dags att ta "+medicinNamn);
            }
            catch (InterruptedException e){
                break;
            }
        }

    }

}
