import java.util.Arrays;

class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int a = m-1;
        int b = n-1;
        for (int i = nums1.length-1; b >= 0; i--) {
            if (a>=0 && nums1[a]>nums2[b] )
                nums1[i] = nums1[a--];
            else
                nums1[i] = nums2[b--];
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {2,0};
        int m = 1;
        int[] nums2 = {1};
        int n = 1;

        Solution.merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
    }
}