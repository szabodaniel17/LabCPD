package Pb4;

public class EndPointer extends Thread{
    private StringBuffer buffer;
    private String name;

    public EndPointer(StringBuffer buffer, String name) {
        this.buffer = buffer;
        this.name = name;
    }


    @Override
    public void run() {
        this.buffer.readFromEnd();
    }
}

