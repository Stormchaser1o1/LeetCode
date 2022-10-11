class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n=nums.length;
        int small=Integer.MAX_VALUE;
        int medium=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(nums[i]<=small)   
                small=nums[i];
            else if(nums[i]<=medium)
                    medium=nums[i];
            else
                return true;
        }
        return false;
        
    }
}