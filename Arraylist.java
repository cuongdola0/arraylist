package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

class NumberExercise {
    
    public static ArrayList<Integer> EnterData(ArrayList<Integer> numbers) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            int num = scanner.nextInt();
            numbers.add(num);
        }
        return numbers;
    }

    public static void DisplayData(ArrayList<Integer> numbers) {
        System.out.print("Cac phan tu trong mang:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int findMax2(ArrayList<Integer> numbers) {
        if (numbers.size() < 2) {
            System.out.println("mang phai co 2 phan tu.");
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num < max1) {
                max2 = num;
            }
        }

        if (max2 == Integer.MIN_VALUE) {
            System.out.println("Khong co so lon thu 2.");
        }

        return max2;
    }

    public static void deleteOddNumber(ArrayList<Integer> numbers) {
        numbers.removeIf(num -> num % 2 != 0);
    }
}

    class Process {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Nhap");
            System.out.println("2. Xuat");
            System.out.println("3. Max2");
            System.out.println("4. Xoa so le");
            System.out.println("0. Thoat");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    NumberExercise.EnterData(numbers);
                    break;
                case 2:
                    NumberExercise.DisplayData(numbers);
                    break;
                case 3:
                        int max2 = NumberExercise.findMax2(numbers);
                        System.out.println("Phan tu lon thu 2 trong mang: " + max2);
                    break;
                case 4:
                    NumberExercise.deleteOddNumber(numbers);
                    System.out.println("Da xoa cac phan tu le.");
                    System.out.println("Cac phan tu trong mang:"+numbers);
                    break;
                case 0:
                    System.out.println("Thoat.");
                    break;
                default:
                    System.out.println("Chon sai roi be oi!!!");
            }
        } while (choice != 0);
    }
}