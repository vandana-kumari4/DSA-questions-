class Solution {
    public int firstUniqueEven(int[] nums) {
    int count[] = new int[101];
    for(int num : nums){
        count[num]++;
    }
    for(int num : nums){
        if(num % 2 == 0  && count[num]==1){
            return  num;
        }
    }
    return -1;
            
    }
}
