class Solution{
    public int missingNumber(int[] nums){
int XorSum = 0;
 for(int n: nums){
XorSum = XorSum ^ n;
    }
    int n= nums.length;
    for(int i =0 ;i<= n ;i++){
        XorSum = XorSum ^i;
    }
    return XorSum;
}
}

