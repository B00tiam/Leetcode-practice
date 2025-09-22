class Solution {
    public void sort(int[] res, int i) {
        if (res[0] == -1 && res[1] == -1) {
            res[0] = i;
            res[1] = i;
        }
        else {
            if (i < res[0]) {
                res[0] = i;
            }
            else if (i > res[1]) {
                res[1] = i;
            }
            else {
                return;
            }
        }
    }

    public void recur(int target, int[] res, int left, int right, int[] nums) {
        if (left > right) {
            return;
        }
        int mid = left + (right - left) / 2;

        if (nums[mid] == target) {
            sort(res, mid);
        }
        recur(target, res, mid + 1, right, nums);
        recur(target, res, left, mid - 1, nums);
    }

    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};

        if (nums.length == 0) {
            return res;
        }
        int left = 0;
        int right = nums.length - 1;
        recur(target, res, left, right, nums);

        return res;
    }
}