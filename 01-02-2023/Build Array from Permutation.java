class Solution {
    public int[] buildArray(int[] nums) {
        int[] a= new int[nums.length];
        for(int i=0;i<=nums.length-1;i++){
            a[i]=nums[nums[i]];
        }
        return a;
    }
}