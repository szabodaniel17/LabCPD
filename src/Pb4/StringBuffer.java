package Pb4;

public class StringBuffer {
    private String value;
    private int start;
    private int end;

    public StringBuffer(String value) {
        this.value = value;
        this.start = 0;
        this.end = value.length() -1;
    }

    public synchronized void readFromStart(){
        int limit = this.value.length() / 2 ;
        while(this.start < limit){
            try {
                System.out.println("Reading char from start:" + value.charAt(this.start));
                this.start++;
                notifyAll();
                wait();


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        notifyAll();

    }

    public synchronized void readFromEnd(){
        int limit = this.value.length() / 2 ;
        while(this.end > limit){
            try {
                System.out.println("Reading char from end:" + value.charAt(this.end));
                this.end--;
                notifyAll();
                wait();


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        notifyAll();

    }


}
