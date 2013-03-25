/**
 * 1. Fibonacci.  A Fibonacci number is one of the set 1 1 2 3 5 8 ...
 *    where the next is just the sum of the last two.  Create an
 *    object that satisfies the IFibonacci interface and returns the
 *    next fibonacci number on every call of 'next'.  Wire up the
 *    constructor to the createFibonacci factory function, which our
 *    implementation uses to create a fibonacci sequence.
 * 2. Enjoy the Object-Oriented approach that java affords :-).
 */
public class Task5{
    
    public static IFibonacci createFibonacci(){
        // return new YourFibonacci();
        return null;
    }

    public static void main(String[] args){
        IFibonacci impl = createFibonacci();
        
        if (impl == null) {
            System.out.println("NOT DONE");
            return;
        }

        int current = 0;
        for (int count=0; count < 5; count++){
            current = impl.next();
        }

        System.out.println(current);
    }
}
   
interface IFibonacci {
    public int next();
}

// class YourFibonacci implements IFibonacci {
//
// }
