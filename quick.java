package SortCollection;

public class quick {

	
	public static int[] quicksort(int[] nums) {
		partition(nums,0,nums.length-1);
		return nums;
	}
	
	private static void partition(int[] nums, int start, int end) {
		if(start>=end) {
			return;
		}
		int key = nums[start];
		int left = start;
		int right = end;
		while(left<right) {
			while(left<right&&nums[right]>=key) {
				right--;
			}
			while(left<right&&nums[left]<=key) {
				left++;
			}
			if(left<right) {
				int temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;
			}
		}
		nums[start] = nums[left];
		nums[left] = key;
		partition(nums,start,left-1);
		partition(nums,left+1,end);
	}
	
}
