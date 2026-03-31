import java.util.*;
public class Stacks {

    public static void main(String[] args) {

       //to push object into our stack
        Stack<String> stack = new Stack<String>();


        //'push' used to put something into the stack

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

        //THIS CHECK IF THE STACK IS EMPTY
        System.out.println(stack.empty());

        //THIS WILL REMOVE THE TOP MOST OBJECT FROM THE STACK
        stack.pop();

        //ASSIGN IT TO A VARIABLE TO IDENTIFY WHAT OBJECT WAS POP IN THE PRINT
        String myFavGame = stack.pop();



        System.out.println(stack);
        System.out.println(myFavGame);

        //IDENTIFY THE TOP MOST ITEM INSTEAD OF DELETING IT(POP)
        System.out.println(stack.peek());

        //SEARCH FOR AN ITEM IN THE STACK
        System.out.println(stack.search("Borderlands"));


        //PUSHING ITEMS N TIMES
        for (int i = 0; i < 1000000000; i++){
            stack.push("fallout76");
        }




    }

}
