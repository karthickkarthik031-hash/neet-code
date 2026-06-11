class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int count=0;
        int j=0;
        int a=0;
        int b=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                count++;
                a=0;
            }
            while(count==k){
                a++;
                if(nums[j]%2!=0){
                    count--;
                }
                j++;
            }
            b=b+a;
        }
        return b;
    }
}