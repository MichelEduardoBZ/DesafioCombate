package Challenge;

import java.util.Locale;
import java.util.Scanner;

import Fighters.Champions;

public class Fight {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		Champions champion[] = new Champions[2];

		for (int i = 0; i < 2; i++) {

			System.out.println("Digite os dados do " + (i + 1) + "º campeão");
			System.out.print("Nome: ");
			String name = entrada.nextLine();

			System.out.print("Vida inicial: ");
			String life = entrada.nextLine();
			int lifeValidated = Integer.parseInt(life);

			System.out.print("Ataque: ");
			String attack = entrada.nextLine();
			int attackValidated = Integer.parseInt(attack);

			System.out.print("Armadura: ");
			String armor = entrada.nextLine();
			int armorValidated = Integer.parseInt(armor);

			champion[i] = new Champions(name, lifeValidated, attackValidated, armorValidated);

		}

		System.out.print("Quantos turnos você deseja executar? ");
		String shift = entrada.nextLine();
		int shiftValidated = Integer.parseInt(shift);

		for (int i = 0; i < shiftValidated; i++) {
			System.out.println();

			champion[0].takeDamage(champion[1].getAtack());
			champion[1].takeDamage(champion[0].getAtack());
			System.out.println("Resultado do turno " + (i + 1) + "º turno");
			champion[0].status();
			champion[1].status();

			if (champion[0].getLife() <= 0 || champion[1].getLife() <= 0) {
				System.out.println("FIM DO COMBATE");
				break;
			}

		}
	}

}
