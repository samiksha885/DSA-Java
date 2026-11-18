// Reverse pairs
// time complexity - O(n)


public class Reversepair {
    public int reversePairs(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        return mergeSort(nums, 0, nums.length - 1);
    }

    public static int mergeSort(int a[], int low, int high) {
        if (low >= high) {
            return 0;
        }
        int mid = low + (high - low) / 2;
        int count = 0;

        count += mergeSort(a, low, mid);         // Left part
        count += mergeSort(a, mid + 1, high);    // Right part
        count += countAndMerge(a, low, mid, high); // Count pairs and merge

        return count;
    }

    public static int countAndMerge(int a[], int low, int mid, int high) {
        
        int count = 0;
        int right = mid + 1;

        for (int i = low; i <= mid; i++) {
            while (right <= high && (long) a[i] > 2L * a[right]) {
                right++;
            }
            count = count + (right - (mid + 1));
        }
         

        // Ab dono sorted halves ko merge karne ka standard code
        int temp[] = new int[high - low + 1];
        int left = low;
        int j = mid + 1;
        int k = 0;

        while (left <= mid && j <= high) {
            if (a[left] <= a[j]) {
                temp[k++] = a[left++];
            } else {
                temp[k++] = a[j++];
            }
        }

        while (left <= mid) {
            temp[k++] = a[left++];
        }

        while (j <= high) {
            temp[k++] = a[j++];
        }

        // Sorted elements ko wapas original array 'a' mein copy karna
        for (int i = low, p = 0; i <= high; i++, p++) {
            a[i] = temp[p];
        }

        return count;
    }
}
