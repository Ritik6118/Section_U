package Lec_02;

public class Maximum_Subarray_Bruteforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0;
		
		int [] arr= {-2,1,-3,4,-1,2,1,-5,4};
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum+=arr[j];
				max=Math.max(max, sum);
			}
		}
		System.out.println(max);
		
		
	}

}
