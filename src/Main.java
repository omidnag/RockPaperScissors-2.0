import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		// Börjar med att spelaren ska få välja.

		Scanner rock = new Scanner(System.in);
		int conter = 0;
		while (conter < 3) {
			System.out.print("Choose; rock, paper or scissors: ");
			String playerOne = rock.nextLine();

			int realNumber = 0;
			try {
				realNumber = Integer.parseInt(playerOne);
			} catch (NumberFormatException e) {
				if (playerOne.equalsIgnoreCase("rock")) {

					realNumber = 1;
				}

				else if (playerOne.equalsIgnoreCase("paper")) {

					realNumber = 2;
				} else if (playerOne.equalsIgnoreCase("scissors")) {

					realNumber = 3;
				} else {

					realNumber = 0;
				}

			}
			if (realNumber == 1) {
				System.out.println("rock");
				playerOne = "rock";
				System.out.println();
			} else if (realNumber == 2) {
				System.out.println("paper");
				playerOne = "paper";
				System.out.println();
			} else if (realNumber == 3) {
				System.out.println("scissors");
				playerOne = "scissors";
				System.out.println();

			} else {
				playerOne = "Wrong";
				System.out.println("Invalid weapon!");

			}

			if (!playerOne.equals("Wrong")) {

				int random = (int) (Math.random() * 3);

				String computerPlayer = "Computer";
				if (random == 0) {
					computerPlayer = "rock";
				} else if (random == 1) {
					computerPlayer = "paper";
				} else {
					computerPlayer = "scissors";
				}
				System.out.println("Computer: " + computerPlayer);

				// Meddelande man får beroende av reslutat.

				if (playerOne.equals(computerPlayer)) {
					System.out.println("Tie!");
				} else if ((playerOne.equalsIgnoreCase("rock") && computerPlayer.equals("scissors"))
						|| (playerOne.equalsIgnoreCase("scissors") && computerPlayer.equals("paper"))
						|| (playerOne.equalsIgnoreCase("paper") && computerPlayer.equals("rock"))) {
					System.out.println("You won!");
					conter++;
					playerOne = "";

				} else {
					System.out.println("You lost!");

				}
			}
		}

		// rock.close();
		// System.out.println("Good game! Choose again!");

	}
}
