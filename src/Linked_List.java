import java.sql.SQLOutput;
import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args){

        LinkedList<String> list = new LinkedList<String>();
/*   As a stack
        list.push("A");
        list.push("B");
        list.push("C");
        list.push("D");
        list.push("E");
        list.push("F");
        list.pop();
System.out.println(list);
 */
        list.offer("A");
        list.offer("B");
        list.offer("C");
        list.offer("D");
        list.offer("F");
        //list.poll();

        //LINKED LIST ARE EASY TO DO INSERTION AND DELETION
        list.add(4, "E");
        list.remove("E");
        list.addFirst("0");
        list.addLast("G");

        System.out.println(list);




    }
}
