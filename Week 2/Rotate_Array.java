import java.util.Arrays;

class Solution {
    public int[] rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,0, n-1);
        reverse(nums,0, k-1);
        reverse(nums, k, n-1); 
        return nums;  
    }
    public void reverse(int nums[], int s, int e){
        int start=s;
        int end=e;
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }    
    }
}

class Rotate_Array{
    public static void main(String[] args){
    int nums[]={1,2,3};
    int k=4;
    Solution s=new Solution();
    int output[]=s.rotate(nums,k);
    System.out.print(Arrays.toString(output));
}
}