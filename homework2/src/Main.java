import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Написать метод, возвращающий количество чётных элементов массива.
 *      countEvens([2, 1, 2, 3, 4]) → 3
 *      countEvens([2, 2, 0]) → 3
 *      countEvens([1, 3, 5]) → 0
 *
 * Написать функцию, возвращающую разницу между самым большим и самым ма- леньким элементами переданного
 *      не пустого массива.
 *
 * Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Count of evens: " + countEvens(new int[]{2, 1, 2, 3, 4}));
        System.out.println("Count of evens: " + countEvens(new int[]{2, 2, 0}));
        System.out.println("Count of evens: " + countEvens(new int[]{1, 3, 5}));

        System.out.println("Max different: " + getMaxDiff(new int[]{2, 1, 2, 3, 4}));
        System.out.println("Max different: " + getMaxDiff(new int[]{2, 2, 0}));
        System.out.println("Max different: " + getMaxDiff(new int[]{1, 3, 5}));

        System.out.println("isZeroNeighbours: " + isZeroNeighbours(new int[]{2, 1, 2, 3, 4}));
        System.out.println("isZeroNeighbours: " + isZeroNeighbours(new int[]{2, 2, 0}));
        System.out.println("isZeroNeighbours: " + isZeroNeighbours(new int[]{1, 3, 5}));
        System.out.println("isZeroNeighbours: " + isZeroNeighbours(new int[]{1, 3, 0, 0, 5}));
    }

    public static int countEvens(int[] array) {
        int count = 0;

        for (int i : array) {
            if (i%2 == 0) count++;
        }
        return count;
    }

    public static int getMaxDiff(int[] array) {
        if (array.length == 0) return -1;
        List<Integer> list = new ArrayList<>();
        for (int i : array) {
            list.add(i);
        }
        return Collections.max(list) - Collections.min(list);
    }

    public static boolean isZeroNeighbours(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] == 0 && array[i-1] == 0) {
                return true;
            }
        }
        return false;
    }
}