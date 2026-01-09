/*Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.*/
class IntersectionArraysII{
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        int[] arr = nums1.length > nums2.length? new int[nums2.length]: new int[nums1.length];
        int i=0;
        for(int x:nums1)
        {
            if(map1.containsKey(x))
                map1.put(x,map1.get(x)+1);
            else
                map1.put(x,1);
        }
        for(int x:nums2)
        {
            if(map2.containsKey(x))
                map2.put(x,map2.get(x)+1);
            else
                map2.put(x,1);
        }
        for(int x:nums1)
        {
            if(map1.containsKey(x)&&map2.containsKey(x))
            {
                int count=0;
                if(map1.get(x)==map2.get(x))
                    count=map1.get(x);
                else
                    count=map1.get(x)>map2.get(x)?map2.get(x):map1.get(x);
                
                while(count>0)
                {
                    arr[i++]=x;
                    count--;
                }
                map1.remove(x);
                map2.remove(x);
            }
        }
        int arr2[]=new int[i];
        for(int x=0; x<i; x++)
        {
            arr2[x]=arr[x];
        }
        return arr2;

    }
}
