package java1103_api;

public class Java141_System {

	public static void main(String[] args) {
		int[] arr1 = {1,5,2,4};
		int[] arr2 = {6,3,9,7,8};
		int[] arr3 = {4,2};
		
		int[] res = process(arr1,arr2,arr3);
		for(int data : res)
			System.out.printf("%3d", data);
	}
	
	public static int[] process(int[] arr1, int[] arr2, int[] arr3) {
		int[] arr = new int[arr1.length+arr2.length+arr3.length];
		/*for(int i=0;i<arr1.length; i++)
			arr[i]=arr1[i];
		
		for(int i=0;i<arr2.length; i++)
			arr[arr1.length + i]=arr2[i];
		
		for(int i=0;i<arr3.length; i++)
			arr[arr1.length + arr2.length + i]=arr3[i];
		*/
		System.arraycopy(arr1, 0, arr, 0, arr1.length);
		System.arraycopy(arr2, 0, arr, arr1.length, arr2.length);
		System.arraycopy(arr3, 0, arr, arr1.length+arr2.length, arr3.length);
		
		return arr;
	}
}
