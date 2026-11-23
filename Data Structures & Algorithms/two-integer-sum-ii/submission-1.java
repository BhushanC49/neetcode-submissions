class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while(left < right){

            int ans = numbers[left] + numbers[right];

            if(target == ans) return new int[]{left+1,right+1};

            if(target > ans){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{};
    }
}
