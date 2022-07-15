package SortCollection;

public class selection {
	//—°‘Ò≈≈–Ú
	public static int[] selectionsort(int[] nums) {
		for(int i =0; i < nums.length-1; i++) {
			int index = i;
			for(int j = i; j <nums.length-1;j++) {
				if(nums[index] > nums[j+1]) {
					index = j+1;
				}
			}
			int temp = nums[index];			
			nums[index] = nums[i];
			nums[i] = temp;
		}
		return nums;
	}
}
