package fourth_task.stream_42.my_implementation;

public class MyBubbleSorting {
    public static void bubbleSort(int[] array) {
        boolean flag;

        for (int i = 0; i < array.length - 1; i++) {
            flag = false;

            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    flag = true;
                }
            }

            if (!flag) break;
        }
    }

    public static void bubbleSort(String[] array) {
        boolean flag;

        for (int i = 0; i < array.length - 1; i++) {
            flag = false;

            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    flag = true;
                }
            }

            if (!flag) break;
        }
    }
}
