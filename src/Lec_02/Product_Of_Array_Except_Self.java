package Lec_02;

import java.util.Arrays;

public class Product_Of_Array_Except_Self {
	public static void main(String [] args) {
		int [] arr= {1,2,3,4};
		System.out.println(Arrays.toString(productExceptSelf(arr)));
	}
	public static int[] productExceptSelf(int[] arr) {
        int prod=1;
        int [] left=new int[arr.length];
        int [] right=new int[arr.length];
        int [] ans=new int[arr.length];
        for(int i=0;i<left.length;i++){
            left[i]=prod;
            prod*=arr[i];
        }
        prod=1;
        for(int i=right.length-1;i>=0;i--){
            right[i]=prod;
            prod*=arr[i];
        }
        for(int i=0;i<ans.length;i++){
            ans[i]=left[i]*right[i];
        }
        return ans;
    }
}
