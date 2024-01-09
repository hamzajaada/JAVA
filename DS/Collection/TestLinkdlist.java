package DS.Collection;

import java.util.LinkedList;

public class TestLinkdlist {
    public static void main(String[] args) {
        LinkedList <String> li = new LinkedList<String>();
        li.addFirst("hamza");
        li.addLast("ayoub");
        System.out.println(li);
        System.out.println(li.getFirst());
        li.removeFirst();
        System.out.println(li);

        
    }
}
