package moa.core;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @author 高海龙 gao_start@163.com
 * @date 2020.5.28 10.46pm
 */
public class FeatureSelectionUtils {
    /**
     * 是否包含
     *
     * @param num
     * @param relevantsInts
     * @return
     */
    public static boolean contains(int num, int[] relevantsInts) {
        for (int relevant : relevantsInts) {
            if (num == relevant) {
                return true;
            }
        }
        return false;
    }

    /**
     * 平均值
     *
     * @param values
     * @return
     */
    public static double mean(double[] values) {
        double count = 0;
        for (double val : values) {
            count = count + val;
        }
        return count / values.length;
    }

    /**
     * 标准差
     *
     * @param array
     * @param mean
     * @return
     */
    public static double stddev(double[] array, double mean) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += (array[i] - mean) * (array[i] - mean);   //求出方差，如果要计算方差的话这一步就可以了
        }
        double standardDeviation = Math.sqrt(total / array.length);   //求出标准差
        return standardDeviation;
    }

    /**
     * 交集
     *
     * @param sA
     * @param sB
     * @return
     */
    public static long intersection(int sA[], int sB[]) {
        List<Integer> a = new LinkedList<Integer>();
        Set<Integer> common = new HashSet<Integer>();
        for (Integer s : sA) {
            if (!a.contains(s)) {
                a.add(s);
            }
        }
        for (Integer b : sB) {
            if (a.contains(b)) {
                common.add(b);
            }
        }
        return common.size();
    }
}
