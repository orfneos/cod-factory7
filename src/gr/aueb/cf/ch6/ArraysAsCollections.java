package gr.aueb.cf.ch6;

public class ArraysAsCollections {

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 9};
    }

    public static int[] getEvens(int[] arr) {
        int count = 0;
        int pivot = 0;

        for (int el : arr) {
            if (el % 2 == 0) count ++;
        }

        int[] evens = new int[count];


        for (int el : arr) {
            if (el % 2 == 0) evens[pivot++] = el;
        }
        return evens;
    }
    // Mapping
    public static int[] mapToDooble(int[] arr) {
        int[] mapped = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            mapped[i] = arr[i] * 2;
        }
        return mapped;
    }

    // Reducing
    public static int sum(int[] arr) {
        int sum = 0;

        for (int el : arr) {
            sum += el;
        }
        return sum;
    }

    public static double avg(int[] arr) {

        return sum(arr) / (double) arr.length;

        }

    public static boolean anyEven(int[] arr) {
        boolean isanyEven = false;

        for (int el : arr) {
            if (el % 2 == 0) {
                isanyEven = true;
                break;
            }
        }

        return isanyEven;
    }

    public static boolean moreThanTwoEvens(int[] arr) {
     int count = 0;

     for (int el : arr) {
         if (el % 2 == 0) count ++;
     }

     return count > 2;
    }

    public static boolean moreThanTwoConsecutive(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == arr[i+1] - 1 && arr[i] == arr[i+2] - 2) {
                count++;
                break;
            }
        }

        return count >=1;

    }

    public static boolean moreThanTwoWithSameEnding(int[] arr) {
        int[] endings = new int[10];
        boolean isSameEnding = false;

        for (int num : arr) {
            endings[num % 10]++;
        }

        for (int count : endings) {
            if (count >= 3) {
                isSameEnding = true;

            }
        }
        return isSameEnding;
    }

    public static boolean AllAreEvent(int[] arr) {
        //return getEvens(arr).length == arr.length;

        boolean allEven = true;
        int count = 0;
        for (int el : arr) {
            if (el % 2 == 0) count ++;
        }
        return count == arr.length;
    }
}
