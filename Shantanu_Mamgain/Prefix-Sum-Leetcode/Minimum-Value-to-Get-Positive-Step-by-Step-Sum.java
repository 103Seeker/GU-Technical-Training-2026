class Solution {
    public int minStartValue(int[] nums) {
        int count=0;
        
        for(int i=1; i<nums.length; i++){
            
            nums[i] += nums[i-1];
            if(nums[i]>0){
                count++;
            }
        }
        if(nums[0]>0){
            count++;
        }
        if(count==nums.length){
            return 1;
        }
        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            
            if(nums[i]<min){
                min=nums[i];
            }
        }

        return (Math.abs(min)+1);
    }
}
