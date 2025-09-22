public class SearchMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int targetRow = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][matrix[i].length - 1] >= target) {
                targetRow = i;
                break;
            }
        }

        int left = 0;
        int right = matrix[targetRow].length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (matrix[targetRow][mid] > target) {
                right = mid - 1;
                continue;
            }

            if (matrix[targetRow][mid] < target) {
                left = mid + 1;
                continue;
            }

            return true;
        }

        return false;
    }
}
