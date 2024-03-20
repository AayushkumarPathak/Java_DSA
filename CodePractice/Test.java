
public class Test {
        public static int findInarray(int target, int arr[]) {
            // Save the length of the mountain array
            int length = arr.length;
    
            // 1. Find the index of the peak element
            int low = 1;
            int high = length - 2;
            while (low != high) {
                int mid = (low + high) / 2;
                if (arr[mid] < arr[mid+1]) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            int peakIndex = low;
    
            // 2. Search in the strictly increasing part of the array
            low = 0;
            high = peakIndex;
            while (low != high) {
                int mid = (low + high) / 2;
                if (arr[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            // Check if the target is present in the strictly increasing part
            if (arr[low] == target) {
                return low;
            }
    
            // 3. Otherwise, search in the strictly decreasing part
            low = peakIndex + 1;
            high = length - 1;
            while (low != high) {
                int mid = (low + high) / 2;
                if (arr[mid] > target) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            // Check if the target is present in the strictly decreasing part
            if (arr[low] == target) {
                return low;
            }
    
            // Target is not present in the mountain array
            return -1;
        }
        public static void main(String[] args) {
            // int arr[] = {1,5,2};
            int arr[] = {0,5,3,1};
            System.out.println(findInarray(1, arr));
        }
    }

