package moa.core;

/**
 * @author 高海龙 gao_start@163.com
 * @date 2020.5.28 10.46pm
 */
public class FeatureSelectionUtils {
    public static boolean contains(int num, int[] relevantsInts) {
        for (int relevant : relevantsInts) {
            if (num == relevant) {
                return true;
            }
        }
        return false;
    }

    public static double mean(double[] values) {
        double count = 0;
        for (double val : values) {
            count = count + val;
        }
        return count / values.length;
    }

    //todo
    public static double stddev(double[] values, double val) {
        return 0.0;
    }

    // todo;
    public static long intersection(int sA[], int sB[]) {
        return 0;
    }
}
