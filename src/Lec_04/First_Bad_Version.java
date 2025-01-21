package Lec_04;

public class First_Bad_Version {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int firstBadVersion(int n) {
        int lo=1;
        int hi=n;
        int ans=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            System.out.println(mid);
            if(isBadVersion(mid)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
        // System.out.println(isBadVersion(1));
        // return 0;
    }

}
