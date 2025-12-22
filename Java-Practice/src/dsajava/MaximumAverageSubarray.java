package dsajava;

public class MaximumAverageSubarray {
	public static double findMaxAverage(int[] nums, int k) {
        double avgMax=0;
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
            avgMax=sum/k;
        }
        double curr_avgMax=0;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
            curr_avgMax=sum/k;
            avgMax=Math.max(avgMax,curr_avgMax);
        }
        return avgMax;
    }
	public static void main(String[] args) {
		int nums[] = {1,12,-5,-6,50,3};
		int k = 4;
		System.out.println(findMaxAverage(nums, k));
	}

}
