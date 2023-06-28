package u4d3;

public class App {
	public static void main(String[] args) {

		// ***************************** CONDIZIONALI **********************
//		int x = 10, y = 30;
//
//		boolean test = true;
//
//		if (test)
//			System.out.println("Test passato");
//		else
//			System.out.println("Test non passato");
//
//
//		if (x > y) {
//			System.out.println("x è maggiore di y");
//		} else if (x == 10) {
//			System.out.println("x è uguale a 10");
//		} else {
//			System.out.println("X non è maggiore di Y o uguale a 10");
//		}
//
//		if (y % 2 == 0) {
//			System.out.println("Il numero è pari");
//		}
//
//		System.out.println(x <= y ? "minore" : "maggiore");
//
//		System.out.println(testNumbers(10, 20, 30));

		// ***************************** SWITCH CASE **********************

//		String favouriteColour = "purple";
//
//		switch (favouriteColour) {
//		case "red": {
//			System.out.println("il colore è il rosso");
////			break;
//		}
//		case "green": {
//			System.out.println("il colore è il verde");
////			break;
//		}
//		case "blue": {
//			System.out.println("il colore è il blu");
////			break;
//		}
//		default:
//			System.out.println("Nessuno dei precedenti");
//		}

		int x = 10, y = 20;
		int z = (x > y) ? -100 : 100;

		switch (z) {
		default:
			System.out.println("Default");
			x--;
			break;
		case 30:
			x++;
			break;
		case -100:
			System.out.println("Il numero è -100");
			break;

		case 100:
			System.out.println("Il numero è 100");
			x--;
			break;
		case 1000:
			System.out.println("Il numero è 1000");
			x--;
			break;
		}

		System.out.println(x);

	}

	public static int testNumbers(int a, int b, int c) {
		return a > b ? (a > c ? a : c) : (b > c ? b : c); // non abusare del ternary operator
	}
}
