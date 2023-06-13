package assignment;

public class Assign14 {
	public static void main(String[] args) {
        int[] arr= {1,6,7,8,9};
        int largest=arr[0];
        
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]>largest) {
        		largest=arr[i];
        	}
        }System.out.println("Largest no in array "+largest);

	}
}
