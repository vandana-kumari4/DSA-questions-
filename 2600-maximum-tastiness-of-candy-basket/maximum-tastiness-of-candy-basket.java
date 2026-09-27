class Solution {
     static boolean isValidAns(int []price,int k,int minDistance){
        int cowCount =1;
        int lastPosition = 0;
        for(int i =1;i< price.length;i++){
            if(price[i] - price[lastPosition] >= minDistance){
                 cowCount++;
                 lastPosition = i;
                 if(cowCount == k){
return true;
                 }
            } 
        }
        return false;
    }
    public int maximumTastiness(int[] price, int k) {
           Arrays.sort(price);
        int n = price.length;

        int s = 0;
        int e = price[n-1] - price[0];
        int ans = -1;
         while(s <= e){
            int mid = s+ (e-s)/2;

            if(isValidAns(price,k,mid)){
ans = mid;
s = mid +1;

            }
            else{
                e = mid - 1;
            }
         }
         return ans ;
    }
}
    