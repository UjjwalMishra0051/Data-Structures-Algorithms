class Solution {
    public int[] sortedSquares(int[] nums) {
         int[]res = new int[nums.length];

        for(int i=0; i<nums.length; i++){
           
             res[i] = nums[i]*nums[i];     
        }
        int i = 0 ;
        int j = nums.length-1 ;
        int k = nums.length-1 ;

        while(i <= j){
            if (nums[i]*nums[i] < nums[j]*nums[j]){
                res[k] = nums[j]*nums[j];
                j--;
                k--;
            }
            else if (nums[i]*nums[i] > nums[j]*nums[j]){
                res[k] = nums[i]*nums[i];
                i++;
                k--;
            }
            else{
                res[k] = nums[i]*nums[i];
                i++;
                k--;
            }

        }
       
        return res;
    }      

    
}