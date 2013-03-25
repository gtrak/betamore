/**
 * 1. Fibonacci.  A Fibonacci number is one of the set 1 1 2 3 5 8 ...
 *    where the next is just the sum of the last two.  Plug your
 *    IFibonacci implementation into this code, adding it to the
 *    factory method again.
 * 2. Explain what it does.
 * 3. Switch ArrayList out for a java.util.HashSet.  Notice anything different?
 *    Try a higher count of numbers if not.
 */
public class Task6{
    interface IFibonacci {
        public int next();
    }
    
    // static class YourFibonacci implements IFibonacci {
    //
    // }

    public static IFibonacci createFibonacci(){
        // HERE
        // return new YourFibonacci();
        return null;
    }

    public static java.util.Collection<Integer> fibonacciSequence(int limit) {
        IFibonacci fib = createFibonacci();

        // How can we return a List if we said we're returning a
        // Collection as the return type?
        java.util.List out = new java.util.ArrayList();

        for(int count = 0; count<limit; count++){
            out.add(fib);
        }

        return out;
    }

    public static void main(String[] args){
        for (int x: fibonacciSequence(20)){
            System.out.println(x);
        }
    }
}
   

