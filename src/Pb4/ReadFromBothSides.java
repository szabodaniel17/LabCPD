package Pb4;

public class ReadFromBothSides {
    public static void main(String[] args) {
        String val = "this is the string";
        StringBuffer buffer = new StringBuffer(val);
        StartPointer start = new StartPointer(buffer,"#1");
        EndPointer end = new EndPointer(buffer,"#2");

        start.start();
        end.start();
    }
}
