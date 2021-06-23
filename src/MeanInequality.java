
public class MeanInequality {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		int[] ans = new int[arr.length*2];
		for(int i = 0; i < arr.length; i++) {
			ans[i] = arr[i];
			ans[i+arr.length] = arr[i];
		}
		int[] aws = new int[arr.length];
	for(int i = 0; i < arr.length; i++) {
		int x = (2 *ans[i+1] - ans[i+2]);
			if(ans[i] == (2 *ans[i+1] - ans[i+2])) {
				ans[i] = arr[i+1];
				ans[i+1] = arr[i];
				ans[i+arr.length] = ans[i];
				ans[i+arr.length+1] = ans[i+1];
				aws[i] = ans[i];
			}
			else aws[i] = ans[i];
		}
		
	}

}
