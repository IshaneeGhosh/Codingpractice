/*Intuition
We’re sailing through the Grand Line (a sorted array), hunting for a pirate named target.
The problem? This pirate can appear multiple times, hiding among identical crewmates.

Our mission is not just to find him —
we must find where his crew starts and where it ends.

Binary Search is our Log Pose:

It doesn’t show the exact island immediately,

but it always points us in the right direction.

When we finally spot the target:

We don’t stop the ship

We keep sailing left to find the first appearance

And sail right to find the last appearance

Because a true Pirate King checks everything 👑

Approach
We use two binary searches:

🔹 First Search → Find the first occurrence

If mid is smaller than target → sail right

If mid is bigger → sail left

If mid == target:

Save the position
Keep sailing left to check if there’s an earlier one
🔹 Second Search → Find the last occurrence

Same idea, but this time:
When we find the target,
We save it and sail right to find the farthest one
If the pirate never shows up?
We return [-1, -1] and move on to the next adventure.*/
class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        // To return the elements directly from the private function we make 
        return new int[] {first(nums, target )  , last(nums , target)};
    }

    // Function that would return the first occurence 
    private int first(int [] arr , int target){
        // Binary Search Basics eh 
        int left = 0 ; 
        int right = arr.length -1; 
        // To to store the mid and if there no value it will directly give -1 
        int ans = -1;

        // Standard Binary Search Conditon 
        while(left<=right){
            int mid = left + (right - left) / 2;

            
            // If the mid is target that does not guranetee that its the first occurence duh
            // But it does tell us that the first occurrence is at mid or left to mid 
            if(arr[mid] == target ){

                // So we store the mid in ans in case if thats the first occurence 
                ans = mid;
                // Then we make the right to the mid -1
                right = mid - 1;
            }
            // If the target is greater than the ofc it would be to right side of the mid 
            else if (arr[mid]<target){
                left = mid + 1; 
            }
            // If the target is not in the mid not greater than mid it surely would be in left of mid or not present at all 
            else{
                right = mid -1 ; 
            }
        }
        // Return what ever that answer is 
        return ans ; 

    }


    private int last (int [] arr , int target){
        int left = 0; 
        int right = arr.length-1;
        int ans = -1;

        while(left <= right ){
            int mid = left + (right - left )/2; 

            if (arr[mid] == target ){
                ans = mid ;
                left = mid+1 ; 
            }
            else if (arr[mid]>target ){
                right = mid -1;
            }else{
                left = mid + 1; 
            }
        }
        return ans ;
    }
}
