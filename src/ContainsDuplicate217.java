public class ContainsDuplicate217 {
    public static boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n; j++) {
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,1,1,2,2,3,4};
       boolean x = containsDuplicate(arr1);
        System.out.println(x);
    }
}

