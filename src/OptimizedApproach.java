import java.util.Stack;

public class OptimizedApproach{
    public static void main(String[] args) {
        int[] arr={3,1,2,4};
        int[] previousSmall=new int[arr.length];
        int[] nextSmall=new int[arr.length];

        Stack<Integer> stack=new Stack<>();
        //previous smaller element
        for(int i=0; i<arr.length; i++){
           while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
                stack.pop();
            }
            previousSmall[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(i);
        
        }
        stack.clear();

        //next smaller element

        for(int i=arr.length-1; i>=0; i--){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            nextSmall[i]=stack.isEmpty()?arr.length:stack.peek();
            stack.push(i);
        
        }
        long result=0;
        int mod=1_000_000_007;

        for(int i=0; i<arr.length; i++){
            int left=i-previousSmall[i];
            int right=nextSmall[i]-i;
            result=(result+(arr[i]*left*right)%mod)%mod;
        }
    
        System.out.println(result);
    }
}