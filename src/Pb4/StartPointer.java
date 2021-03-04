package Pb4;

public class StartPointer extends Thread{
    private StringBuffer buffer;
    private String name;

    public StartPointer(StringBuffer buffer, String name) {
        this.buffer = buffer;
        this.name = name;
    }

    @Override
    public void run() {
        this.buffer.readFromStart();
    }
}
