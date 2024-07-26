class Solution {
    public int mySqrt(int x) {
        long low=0,high=x;
        long res=0;
        while(low<=high){
            long mid=low+(high-low)/2;
            if(mid*mid>x){
                high=mid-1;
            }
            else if(mid*mid<x){
                low=mid+1;
                res=mid;
            }
            else{
                return (int)mid;
            }
        }
        return (int)res;
    }
}
