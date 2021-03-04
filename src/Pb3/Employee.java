package Pb3;

public class Employee extends Thread {
    private Data data;
    private long delay;
    private int identif;
    private int noOfFiles;

    public Employee(Data data, long delay,int identif,int noOfFiles) {
        this.data = data;
        this.delay = delay;
        this.identif=identif;
        this.noOfFiles = noOfFiles;
    }

    @Override
    public void run() {
        try {
            for(int i = 0; i < noOfFiles;i++){
                    sleep(delay);
                    String print = "Pb3.Employee #" +identif + ": " + i;
                    System.out.println("Pb3.Employee #"+identif+" wants to print: "+i);
                    data.toPrint(print);
                }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

