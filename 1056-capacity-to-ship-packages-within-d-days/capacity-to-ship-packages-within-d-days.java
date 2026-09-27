class Solution {
    static boolean isValidSolution(int weights[] ,int days,int maxLength){
int painterCount =1;
int paintedLength = 0;
for(int i =0 ;i < weights.length;i++) { ;
if(paintedLength + weights[i] <= maxLength){
    paintedLength = paintedLength + weights[i];
}
else{
   painterCount++;
   paintedLength = 0;
if(painterCount > days){
    return false;
}
if(weights[i]> maxLength){
    return false;
}else{
    paintedLength = paintedLength + weights[i];
}
}
    }
    return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int sum =0;
        for(int i = 0; i<weights.length;i++){
            sum  += weights[i];
        }
        int ans  = -1;
        int s =0 ;
        int e =sum;
        while(s <= e){
            int mid = s+(e-s)/2;
            if(isValidSolution(weights,days,mid)){
ans = mid;
e = mid -1;

            }else{
                s= mid +1;
            }

            
        }
        return  ans;
    }
}