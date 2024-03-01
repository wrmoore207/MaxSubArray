class Solution {

	int maxCrossing(int[] nums, int low, int mid, int high) {
		
        // calculate pos/neg products of left sub array
		int maxPosL = -1;
		int maxNegL = 1;
		int prod = 1;
		for(int i = mid; i >= low; --i) {
			prod = prod * nums[i];
			if(prod > maxPosL) {
				maxPosL = prod;
			}
			if(prod < maxNegL) {
				maxNegL = prod;
			}
		}

        //calculate pos/neg products of right subarray
		int maxPosR = -1;
		int maxNegR = 1;
		prod = 1;
		for(int i = mid + 1; i <= high; ++i) {
			prod = prod * nums[i];
			if(prod > maxPosR) {
				maxPosR = prod;
			}
			if(prod < maxNegR) {
				maxNegR = prod;
			}
		}

        // calculate the maximum positive product
        // crossing the midpoint
		int maxProd = Math.max(maxPosR, maxPosL);
		maxProd = Math.max(maxProd, maxPosR * maxPosL);
		maxProd = Math.max(maxProd, maxNegR * maxNegL);

		return maxProd;
	}

	int maxSubArray(int[] nums, int low, int high) {
		int res = 0;
		if(low == high) {
			return nums[low];
		}
		int mid = (low + high) / 2;
		// Compute max product subarray left of mid point
		int maxLeft = maxSubArray(nums, low, mid); 
		// Compute max product subarray right of mid point
		int maxRight = maxSubArray(nums, mid + 1, high);
		// Compute max product subarray crossing mid point
		int max_cross =  maxCrossing(nums, low, mid, high);

		// Return max of all products
		res = Math.max(maxLeft, maxRight);
		res = Math.max(res, max_cross);

		return res;
	}

	public int maxProduct(int[] nums) {
		int n = nums.length;
		return maxSubArray(nums, 0, n - 1);
	}
}


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 3, -2, 4};
        int result = solution.maxProduct(nums);
        System.out.println("Maximum Product Subarray: " + result);
    }
}
