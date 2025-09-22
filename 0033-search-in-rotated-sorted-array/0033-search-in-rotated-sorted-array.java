class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        if (left == right) {
            return (nums[0] == target) ? 0 : -1;
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (target == nums[left]) {
                return left;
            }
            if (target == nums[right]) {
                return right;
            }
            if (nums[mid] > nums[right]) {
                if (target > nums[mid]) {
                    left = mid + 1;
                }
                else {
                    if (target > nums[right]) {
                        right = mid;
                    }
                    else {
                        left = mid + 1;
                    }
                }
            }
            else {
                if (target > nums[mid]) {
                    if (target > nums[right]) {
                        right = mid;
                    }
                    else {
                        left = mid + 1;
                    }
                }
                else {
                    right = mid;
                }
            }
        }

        return -1;
    }
}