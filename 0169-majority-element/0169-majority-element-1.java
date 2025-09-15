class Solution {
    public int majorityElement(int[] nums) {
        // hashmap: key -> kind of element, value -> count of element 
        HashMap<Integer, Integer> map = new HashMap<>();

        // loop to count the whole array
        for (int i = 0; i < nums.length; i++) {
            // if this element existed in hashmap, just ++ value; instead get a new key and its value as 1
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // loop to get the most frequent element
        int max_key = 0;
        int max_val = nums.length / 2;
        for (int k : map.keySet()) {
            int v = map.get(k);
            if (v >= max_val) {
                max_key = k;
                max_val = v;
            }
        }

        return max_key;
    }
}