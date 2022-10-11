

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of transaction array");
		int size = sc.nextInt();
		System.out.println("Enter the value of target");

		int transaction[] = new int[size];

		for (int i = 0; i < size; i++) {

			transaction[i] = sc.nextInt(); // array Transactions
		}
		System.out.println("Enter the total no of targets that needs to be achieved");
		int testcases = sc.nextInt();
		int targetamt;
		int sum, flag, j;
		for (int i = 1; i <= testcases; i++) {
			sum = 0;
			flag = 0;
			System.out.println("enter the value of target" + " " + i);
			targetamt = sc.nextInt();
			for (j = 0; j < transaction.length; j++) {
				sum = sum + transaction[j];
				if (sum >= targetamt) {
					System.out.println("Target achieved after" + " " + ++j + " " + "transaction");
					flag = 1;
					break;

				}
			}
			if (flag == 0) {
				System.out.println("Given target is not achieved ");

			}
		}
	}
}
