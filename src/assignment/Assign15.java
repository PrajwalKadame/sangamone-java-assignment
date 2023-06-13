package assignment;

public class Assign15 {
	public static void main(String[] args) {
		
 int[] arr= {4,3,6,2,8};
 int temp=0;
 
 for(int i=0;i<arr.length;i++) {
	 System.out.print(arr[i]+" ");
 }
 
 for (int i = 0; i < arr.length; i++) {     
     for (int j = i+1; j < arr.length; j++) {     
        if(arr[i] > arr[j]) {    
            temp = arr[i];    
            arr[i] = arr[j];    
            arr[j] = temp;    
        }     
     }     
 }    
 
 System.out.println("\n"+"Elements of array sorted in ascending order: ");    
 for (int i = 0; i < arr.length; i++) {     
     System.out.print(arr[i] + " ");    
 }    
 
}
}
