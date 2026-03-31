import java.util.*;

public class ArrayList___LinkedList {
    public static void main(String[] args){
        LinkedList<Integer> linked = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;

        for (int i = 0 ; i< 1000000; i++){
            linked.add(i);
            arrayList.add(i);

        }

        //***********************LinkedList**********************
        startTime= System.nanoTime();

        //linked.get(999999);
        linked.remove(999999);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("LinkedList:\t" + elapsedTime +" ns");


        //***********************ArrayList***********************
        startTime= System.nanoTime();

        //arrayList.get(999999);
        arrayList.remove(999999);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("ArrayList:\t" + elapsedTime +" ns");
    }

}
