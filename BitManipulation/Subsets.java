/*
https://leetcode.com/problems/subsets/
Given an integer array nums of unique elements, return all possible subsets (the power set).
The solution set must not contain duplicate subsets. Return the solution in any order.
 
Example 1:
Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

Example 2:
Input: nums = [0]
Output: [[],[0]]
*/
class Subsets {
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> ans=new ArrayList<>();
        int limit=1<<nums.length;
        for(int j=0; j<limit; j++)
        {
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<nums.length;i++)
            {
                if ((j & (1 << i)) != 0)
                    list.add(nums[i]);
            }
            ans.add(list);
        }
        return ans;
    }
}
