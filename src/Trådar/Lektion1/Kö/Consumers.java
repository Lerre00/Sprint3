package Trådar.Lektion1.Kö;

public class Consumers extends Thread{
        private double interval;

        private Queue queue;

        public Consumers(double ggrPerSekund, Queue queue){
            this.interval = ggrPerSekund * 1000;
            this.queue = queue;
        }

        @Override
        public void run()  {
            while (!Thread.interrupted()){
                try {
                    Thread.sleep(Math.round(interval));
                    QueueElement e = (QueueElement)queue.take();
                    System.out.println("Taking away: "+e.getText());

                }
                catch (InterruptedException e){
                    break;
                }
            }

        }

    }
