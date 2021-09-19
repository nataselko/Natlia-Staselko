import java.util.Arrays;

public class Task08_4 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        int n = (int) (1 + Math.random() * 11);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (1 + Math.random() * 21);
        }
        System.out.println(Arrays.toString(arr));
        //Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        //System.out.println(n);
        try {
            arrBinarySearch(arr, n);
        } catch (SortException e) {
            e.printStackTrace();
        }
    }

    public static void arrBinarySearch(int[] arr, int n) throws SortException {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] <= arr[i+1]) {
            } else {
                throw new SortException(" Массив не отсортирован!");
            }
        }
        int first = 0;
        int last = arr.length - 1;
        int pos = (first + last) / 2;
        while (arr[pos] != n && first <= last) {
            if (arr[pos] > n) {
                last = pos - 1;
            } else if (arr[pos] < n) {
                first = pos + 1;
            }
            pos = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println("элемент находиться в массиве в позиции " + pos);

        } else {
            System.out.println("элемента нет в этом массиве");
        }
    }

    private static class SortException extends Exception {

        public SortException(String message) {
            super('\u2665' + " " + message + " " + '\u2665');

        }
    }
}
