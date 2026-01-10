/*
https://leetcode.com/problems/sort-colors/
Given an array nums with n objects colored red, white, or blue, 
sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.

Example 1:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Example 2:
Input: nums = [2,0,1]
Output: [0,1,2]
 

Constraints:
n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2.
*/
class DutchNationalFlag {
    public void sortColors(int[] nums) {
        
        int c0,c1,c2;
        c0=c1=c2=0;
        for(int x:nums)
        {
            if(x==0)
                c0++;
            else if(x==1)
                c1++;
            else if(x==2)
                c2++;
        }
        int i=0;
        while(i<c0)
            nums[i++]=0;
        int j=0;
        while(j<c1){
            nums[i++]=1;
            j++;
        }
        int k=0;
        while(k<c2){
            nums[i++]=2;
            k++;
        }
    }
}
