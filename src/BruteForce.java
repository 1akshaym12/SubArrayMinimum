public class App {
    public static void main(String[] args) {
        int[] nums={11,81,94,43,3};
        int result=0;

        for(int i=0; i<nums.length; i++){
            int min=nums[i];
            for(int j=i; j<nums.length; j++){
                if(min>nums[j]){
                    min=nums[j];
                }
                result+=min;
                
            }
        }
        System.out.println(result);

    }
}
