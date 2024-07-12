package task;

import java.util.*;

public class PlayerManager {
	public static void main(String[] args) {
		Player[] players = new Player[10];
		Scanner sc = new Scanner(System.in);

		// Sample data
		players[0] = new Player(1, "vivek", 120);
		players[1] = new Player(2, "Pratima", 85);
		players[2] = new Player(3, "Rahul", 95);
		players[3] = new Player(4, "Rajat", 105);
		players[4] = new Player(5, "Eve", 150);
		players[5] = new Player(6, "Frank", 60);
		players[6] = new Player(7, "Grace", 130);
		players[7] = new Player(8, "Heidi", 75);
		players[8] = new Player(9, "Vivvan", 45);
		players[9] = new Player(10, "Judy", 102);

		boolean exit = false;

		while (!exit) {
			System.out.println("\nChoose an operation:");
			System.out.println("1. Search player by ID");
			System.out.println("2. Modify player details");
			System.out.println("3. Iterate and display all players");
			System.out.println("4. Show players with score higher than 102");
			System.out.println("5. Exit");

			int choice = sc.nextInt();
			sc.nextLine(); // consume newline

			switch (choice) {
			case 1:
				searchPlayer(players, sc);
				break;
			case 2:
				modifyPlayer(players, sc);
				break;
			case 3:
				iteratePlayers(players);
				break;
			case 4:
				showHighScoringPlayers(players);
				break;
			case 5:
				exit = true;
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}

		sc.close();
	}

	private static void searchPlayer(Player[] players, Scanner sc) {
		System.out.print("Enter player ID to search: ");
		int id = sc.nextInt();
		Optional<Player> player = Arrays.stream(players).filter(p -> p.getId() == id).findFirst();

		if (player.isPresent()) {
			System.out.println("Player found: " + player.get());
		} else {
			System.out.println("Player not found.");
		}
	}

	private static void modifyPlayer(Player[] players, Scanner sc) {
		System.out.print("Enter player ID to modify: ");
		int id = sc.nextInt();
		sc.nextLine(); // consume newline
		Optional<Player> playerOpt = Arrays.stream(players).filter(p -> p.getId() == id).findFirst();

		if (playerOpt.isPresent()) {
			Player player = playerOpt.get();
			System.out.print("Enter new name: ");
			String name = sc.nextLine();
			System.out.print("Enter new score: ");
			int score = sc.nextInt();
			player.setName(name);
			player.setScore(score);
			System.out.println("Player details updated.");
		} else {
			System.out.println("Player not found.");
		}
	}

	private static void iteratePlayers(Player[] players) {
		System.out.println("Iterating through all players:");
		for (Player player : players) {
			System.out.println(player);
		}
	}

	private static void showHighScoringPlayers(Player[] players) {
		System.out.println("Players with score higher than 102:");
		Arrays.stream(players).filter(p -> p.getScore() > 102).forEach(System.out::println);
	}
}
