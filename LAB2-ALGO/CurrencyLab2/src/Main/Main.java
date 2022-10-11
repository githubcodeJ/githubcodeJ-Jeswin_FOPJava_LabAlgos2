package Main;

import java.util.Arrays;
import java.util.Scanner;

import currency.BubbleSort;
import currency.Ncounter;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of currency denominations" + "");
		int size = sc.nextInt();

		int currency[] = new int[size];
		{
			for (int i = 0; i < size; i++) {
				System.out.println("enter the currency denominations value" + " " + i);
				currency[i] = sc.nextInt();
			}
			System.out.println("B$" + Arrays.toString(currency));
			BubbleSort bs = new BubbleSort();
			bs.sort(currency);
			System.out.println("After" + Arrays.toString(currency));
            System.out.println("enter the amount you want to pay");

			int amount = sc.nextInt();
			Ncounter n = new Ncounter();
			System.out.println("Your payment approach in order to give min no of notes will be");
			n.counting(currency, amount);
		}
	}
}