package Pb3;

public class Printer extends Thread{
    private Data data;
    private long delay;


    public Printer(Data data,long delay) {
        this.data = data;
        this.delay = delay;
    }

    @Override
    public void run() {
        while(!data.hasDoc()){
            try{
                System.out.println("Nothing to print.");
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        while(data.hasDoc()){
            try{
                String document = data.print();
                System.out.println("Printing document: "+ document);
                sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
