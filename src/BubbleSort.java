import java.util.Arrays;
public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {12,1,6,8,5,7};
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}	
			}
		}
		System.out.println(Arrays.toString(arr));		
	}
}
