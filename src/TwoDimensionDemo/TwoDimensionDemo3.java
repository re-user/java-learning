package TwoDimensionDemo;

public class TwoDimensionDemo3 {
    static void main() {
        /*
        某商场每个季度的销售额如下，单位：万元
        第一季度：22，44，66
        第二季度：77，33，88
        第三季度：25，45，65
        第四季度：11，66，99
         */
        //1.创建二维数组
        int[][] yearArrArr ={
                {22,44,66},
                {77,33,88},
                {25,45,65},
                {11,66,99}
        };
        int yearSum = 0;
        //2.遍历二维数组，得到每个一维数组并求和
        for (int i = 0; i < yearArrArr.length; i++) {
            int [] quarterArr = yearArrArr[i];
            int sum = getSum(quarterArr);
            System.out.println("第" + (i+1) + "季度的销售额总和为：" + sum);
            yearSum = yearSum + sum;
        }
        System.out.println("该商场的销售额总和为：" + yearSum);
    }

    //定义一个方法，用于计算每个季度的销售额总和
    static int getSum(int[] arr) {
        int  sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}