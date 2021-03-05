package ex5_6;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,5,7,4,9};
		int sum = 0;
		int temp;
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6-i-1; j++)
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
		}
		for(int i = 0; i < 6; i++) {
			sum += arr[i];
			System.out.println(arr[i]);
		}
		System.out.println("The sum is " + sum + " and the average is " + (double)sum/6);
	}

}
