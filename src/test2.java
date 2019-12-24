import java.util.Arrays;
import java.util.Scanner;
public class test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int ct = in.nextInt();
        int nums [] = new int[ct];
        for (int i = 0; i < ct; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println("Вывод массива : " + Arrays.toString(nums));
        insertIntoSort(nums);
        System.out.println("Массив после сортировки : " + Arrays.toString(nums));}

    public static void insertIntoSort(int[] arr) {
        int temp, j;
        for(int i = 0; i < arr.length - 1; i++){
            if (arr[i] > arr[i + 1]) {
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                j = i;
                while (j > 0 && temp < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = temp;
            }
        }
    }}