/*Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
Example 1:
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]

Example 2:
Input: nums = [1], k = 1
Output: [1]

Example 3:
Input: nums = [1,2,1,2,1,2,3,1,3,2], k = 2
Output: [1,2]

Constraints:
1 <= nums.length <= 105
-104 <= nums[i] <= 104
k is in the range [1, the number of unique elements in the array].
It is guaranteed that the answer is unique.*/

class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:nums)
        {
            if(map.containsKey(x))
                map.put(x,map.get(x)+1);
            else
                map.put(x,1);
        } 
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
        int arr[]=new int[k];
        int i=0;
        for (Map.Entry<Integer, Integer> e : list) 
        {
            arr[i++]=e.getKey();
            if(i>=k)
                break;
        }   
        return arr;
    }
}
