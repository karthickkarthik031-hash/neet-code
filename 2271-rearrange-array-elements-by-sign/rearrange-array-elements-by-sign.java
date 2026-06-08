class Solution {
    public int[] rearrangeArray(int[] nums) {
        int j=0;
        int a[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                a[j]=nums[i];
                j+=2;
            }
        }
        int k=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                a[k]=nums[i];
                k+=2;
            }
        }
        return a;
    }
}