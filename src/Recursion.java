public class Recursion {

    public static void main(String[] args){
        walk(5);
    }
    /*iteration
    private static void walk(int steps){
       for (int i = 0; i< steps;i++){
           System.out.println("You take a step!");
       }
    }

     */
    //recursion
    private static void walk(int steps){

        if (steps < 1){
            return;
        }
        System.out.println("You take a step!");
        walk(steps -1);
    }
}
