package Pb3;

import java.util.LinkedList;
import java.util.Queue;

public class Data {
    Queue<String> queue = new LinkedList<String>();
    public boolean available=false;

    public String print(){
        String printed = queue.poll();
        System.out.println("Was printed:"+printed);
        return printed;
    }

    public void toPrint(String toPrint){
        System.out.println("Adding to the queue:"+ toPrint);
        queue.add(toPrint);
    }

    public boolean hasDoc(){
        return !queue.isEmpty();
    }

    public String toString() {
        StringBuilder builder = new StringBuilder("Queue: ");
        queue.stream().forEach(element -> builder.append(element + " "));
        return builder.toString();
    }
}
