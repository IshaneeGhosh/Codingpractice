/*
https://leetcode.com/problems/majority-element-ii/
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
Example 1:
Input: nums = [3,2,3]
Output: [3]

Example 2:
Input: nums = [1]
Output: [1]
*/
import java.util.*;
class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int x:nums)
        {
            if(map.containsKey(x))
                map.put(x,map.get(x)+1);
            else
                map.put(x,1);
        }
        for(int x:nums)
        {
            if(map.containsKey(x) && map.get(x)>Math.floor(nums.length/3))
            {   list.add(x);
                map.remove(x);
            }    
        }
        return list;
    }
}
