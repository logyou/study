package algorithms;

/**
 * @author lyh
 * @date 2019/11/11 0011
 **/
public class ClipMatrix {

    /**
     * 逆时针打印矩阵，回形取数
     *
     * @param nums 二维数组
     */
    public void output(int[][] nums) {
        output(nums, 0, 0, nums.length, nums[0].length);
    }

    /**
     * 逆时针打印矩阵，回形取数
     *
     * @param nums        二维数组
     * @param rowIndex    开始行索引
     * @param columnIndex 开始列索引
     * @param rowCount    行的数字个数
     * @param columnCount 列的数字个数
     */
    public void output(int[][] nums, int rowIndex, int columnIndex, int rowCount, int columnCount) {
        if (rowCount < 1 || columnCount < 1) {
            return;
        }
        //取左边的数，共 rowCount 个
        for (int i = 0; i < rowCount; i++) {
            System.out.print(nums[rowIndex + i][columnIndex] + " ");
        }
        //取下边的数，共 columnCount-1 个
        for (int i = 0; i < columnCount - 1; i++) {
            System.out.print(nums[rowIndex + rowCount - 1][columnIndex + 1 + i] + " ");
        }
        //取右边的数，共 rowCount-1 个
        for (int i = 0; i < rowCount - 1; i++) {
            System.out.print(nums[rowIndex + rowCount - 2 - i][columnIndex + columnCount - 1] + " ");
        }
        //取上边的数，共 columnCount-2 个
        for (int i = 0; i < columnCount - 2; i++) {
            System.out.print(nums[rowIndex][columnIndex + columnCount - 2 - i] + " ");
        }
        //递归下一圈的数字
        output(nums, columnIndex + 1, rowIndex + 1, rowCount - 2, columnCount - 2);
    }

    public static void main(String[] args) {
        ClipMatrix cm = new ClipMatrix();
        int m = 3;
        int n = 3;
        int[][] nums = new int[m][n];
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = ++num;
                System.out.print(nums[i][j] + " \t");
            }
            System.out.println(" ");
        }
        System.out.println("--------------------------------");
        cm.output(nums);
    }
}
