package SortCollection;
public class Bubble {
	//冒泡排序
    //把最大值排到最后，每次遍历减少一个遍历数量
	public static int[] bubblesort(int[] nums) {
		for(int i = 0; i < nums.length - 1; i++) {
			for(int j = 0; j<nums.length - 1 - i; j++) {
				if(nums[j] > nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		return nums;
	}
}
