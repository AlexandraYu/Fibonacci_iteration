public class FiboIteration{
     public static int fibonacci_iteration (int n) {
         if (n<=1) return n; 
         int curr = 1, prev = 0, tmp=0; 
         for (int i=2; i<=n; i++) {
             tmp = curr; 
             curr = curr+prev; 
             prev = tmp; 
         }
         return curr; 
     }

     public static void main(String []args){
        System.out.println(fibonacci_iteration(10));
     }
}
