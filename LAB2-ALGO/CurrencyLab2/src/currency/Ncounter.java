package currency;

public class Ncounter {

	public void counting(int[] currency, int amount) {
		int Nqty[] = new int[currency.length];
		for (int i = 0; i < currency.length; i++) {
			Nqty[i] = amount / currency[i];
			amount = amount % currency[i];
		}
		for (int i = 0; i < currency.length; i++) {
			if (Nqty[i] != 0) {
				System.out.println(currency[i] + ":" + Nqty[i]);

			}
		}
	}

}