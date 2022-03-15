import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		int opcao = 0;
		int first;
		int second;
		int resultado = 0;
		StringBuilder bitmasking = new StringBuilder("0000000000000000");
		String palavra = "";
		int pos = 0;

		Scanner scanner = new Scanner(System.in);

		while (true) {

			BitUtils.menu();
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1: // operação AND
				System.out.print("\nInforme os dois valores: (0xNNNN)\n");
				first = BitUtils.convertHexBin(scanner.next());
				second = BitUtils.convertHexBin(scanner.next());
				System.out.println();
				BitUtils.display(first);
				System.out.println();
				BitUtils.display(second);
				resultado = first & second;
				System.out.println("\n---- & ------------------------------------------");
				BitUtils.display(resultado);
				System.out.println("\n");
				break;
			case 2: // operação OU
				System.out.print("\nInforme os dois valores: (0xNNNN)\n");
				first = BitUtils.convertHexBin(scanner.next());
				second = BitUtils.convertHexBin(scanner.next());
				System.out.println();
				BitUtils.display(first);
				System.out.println();
				BitUtils.display(second);
				resultado = first | second;
				System.out.println("\n---- | ------------------------------------------");
				BitUtils.display(resultado);
				System.out.println("\n");
				break;
			case 3: // operação OU exclusivo
				System.out.print("Informe os dois valores: (0xNNNN)\n");
				first = BitUtils.convertHexBin(scanner.next());
				second = BitUtils.convertHexBin(scanner.next());
				System.out.println();
				BitUtils.display(first);
				System.out.println();
				BitUtils.display(second);
				resultado = first ^ second;
				System.out.println("\n---- ^ ------------------------------------------");
				BitUtils.display(resultado);
				System.out.println("\n");
				break;
			case 4: // Complemento
				System.out.print("Informe o valor: (0xNNNN)\n");
				first = BitUtils.convertHexBin(scanner.next());
				System.out.println();
				BitUtils.display(first);
				resultado = ~first;
				System.out.println("\n--- ~ -------------------------------------------");
				BitUtils.display(resultado);
				System.out.println("\n");
				break;
			case 5: // Deslocamento à esquerda
				System.out.print("Informe o valor: (0xNNNN)\n");
				first = BitUtils.convertHexBin(scanner.next());
				System.out.println();
				BitUtils.display(first);
				resultado = first << 1;
				System.out.println("\n--- << --------------------------------------------");
				BitUtils.display(resultado);
				System.out.println("\n");
				break;
			case 6: // Deslocamento à direita
				System.out.print("Informe o valor: (0xNNNN)\n");
				first = BitUtils.convertHexBin(scanner.next());
				System.out.println();
				BitUtils.display(first);
				resultado = first >> 1;
				System.out.println("\n--- >> --------------------------------------------");
				BitUtils.display(resultado);
				System.out.println("\n");
				break;

			case 7: // Bitmask à direita

				System.out.print("Informe a palavra: (0xNNNN)\n");
				first = BitUtils.convertHexBin(scanner.next());
				System.out.println();

				palavra = Integer.toBinaryString(first);
				bitmasking = new StringBuilder("0000000000000000");

				System.out.println("Deseja presevar quantos bits mais a direita? ");
				pos = scanner.nextInt();
				System.out.println();

				pos = 16 - pos;

				for (int i = pos; i < 16; i++) {
					bitmasking.setCharAt(i, '1');
				}

				BitUtils.display(Integer.parseInt(palavra, 2));
				System.out.println();
				BitUtils.display(Integer.parseInt(bitmasking.toString(), 2));
				int result = Integer.parseInt(palavra, 2) & Integer.parseInt(bitmasking.toString(), 2);
				System.out.println("\n---- & ------------------------------------------");
				BitUtils.display(result);
				System.out.println("\n");
				break;

			case 8: // Bitmask à esquerda

				System.out.print("Informe a palavra: (0xNNNN)\n");
				first = BitUtils.convertHexBin(scanner.next());
				System.out.println();

				String palavra2 = Integer.toBinaryString(first);
				StringBuilder bitmasking2 = new StringBuilder("0000000000000000");
				int pos2;

				System.out.println("Deseja presevar quantos bits mais a esquerda? ");
				pos2 = scanner.nextInt();
				System.out.println();

				for (int i = 0; i < pos2; i++) {
					bitmasking2.setCharAt(i, '1');
				}

				BitUtils.display(Integer.parseInt(palavra2, 2));
				System.out.println();
				BitUtils.display(Integer.parseInt(bitmasking2.toString(), 2));
				int result2 = Integer.parseInt(palavra2, 2) & Integer.parseInt(bitmasking2.toString(), 2);
				System.out.println("\n---- & ------------------------------------------");
				BitUtils.display(result2);
				System.out.println("\n");
				break;

			case 9: // Bitmask de 1s à direita

				System.out.print("Informe a palavra: (0xNNNN)\n");
				first = BitUtils.convertHexBin(scanner.next());
				System.out.println();

				String palavra3 = Integer.toBinaryString(first);
				StringBuilder bitmasking3 = new StringBuilder("0000000000000000");
				int pos3;

				System.out.println("Deseja presevar quantos bits mais a esquerda? ");
				pos3 = scanner.nextInt();
				System.out.println();

				pos3 = 16 - pos3;

				for (int i = pos3; i < 16; i++) {
					bitmasking3.setCharAt(i, '1');
				}

				BitUtils.display(Integer.parseInt(palavra3, 2));
				System.out.println();
				BitUtils.display(Integer.parseInt(bitmasking3.toString(), 2));
				int result3 = Integer.parseInt(palavra3, 2) | Integer.parseInt(bitmasking3.toString(), 2);
				System.out.println("\n---- | ------------------------------------------");
				BitUtils.display(result3);
				System.out.println("\n");
				break;

			case 10: // Bitmask de 1s - direita

				System.out.print("Informe a palavra: (0xNNNN)\n");
				first = BitUtils.convertHexBin(scanner.next());
				System.out.println();

				String palavra4 = Integer.toBinaryString(first);
				StringBuilder bitmasking4 = new StringBuilder("0000000000000000");
				int pos4;

				System.out.println("Deseja presevar quantos bits mais a direita? ");
				pos4 = scanner.nextInt();
				System.out.println();

				for (int i = 0; i < pos4; i++) {
					bitmasking4.setCharAt(i, '1');
				}

				BitUtils.display(Integer.parseInt(palavra4, 2));
				System.out.println();
				BitUtils.display(Integer.parseInt(bitmasking4.toString(), 2));
				int result4 = Integer.parseInt(palavra4, 2) | Integer.parseInt(bitmasking4.toString(), 2);
				System.out.println("\n---- | ------------------------------------------");
				BitUtils.display(result4);
				System.out.printf("\n0x%s | 0x%s = 0x%s\n\n", Integer.toHexString(Integer.parseInt(palavra4, 2)).toUpperCase(), 
						Integer.toHexString(Integer.parseInt(bitmasking4.toString(), 2)).toUpperCase(),
						Integer.toHexString(result4).toUpperCase());
				break;

			case 11: // Bitmask inverter à direita

				System.out.print("Informe a palavra: (0xNNNN)\n");
				first = BitUtils.convertHexBin(scanner.next());
				System.out.println();

				String palavra5 = Integer.toBinaryString(first);
				StringBuilder bitmasking5 = new StringBuilder("0000000000000000");
				int pos5;

				System.out.println("Deseja presevar quantos bits mais a esquerda? ");
				pos5 = scanner.nextInt();
				System.out.println();

				pos5 = 16 - pos5;

				for (int i = pos5; i < 16; i++) {
					bitmasking5.setCharAt(i, '1');
				}

				BitUtils.display(Integer.parseInt(palavra5, 2));
				System.out.println();
				BitUtils.display(Integer.parseInt(bitmasking5.toString(), 2));
				int result5 = Integer.parseInt(palavra5, 2) ^ Integer.parseInt(bitmasking5.toString(), 2);
				System.out.println("\n---- ^ ------------------------------------------");
				BitUtils.display(result5);
				System.out.println("\n");
				break;

			case 12: // Bitmask inverter à esquerda

				System.out.print("Informe a palavra: (0xNNNN)\n");
				first = BitUtils.convertHexBin(scanner.next());
				System.out.println();

				String palavra6 = Integer.toBinaryString(first);
				StringBuilder bitmasking6 = new StringBuilder("0000000000000000");
				int pos6;

				System.out.println("Deseja presevar quantos bits mais a direita? ");
				pos6 = scanner.nextInt();
				System.out.println();

				for (int i = 0; i < pos6; i++) {
					bitmasking6.setCharAt(i, '1');
				}

				BitUtils.display(Integer.parseInt(palavra6, 2));
				System.out.println();
				BitUtils.display(Integer.parseInt(bitmasking6.toString(), 2));
				int result6 = Integer.parseInt(palavra6, 2) ^ Integer.parseInt(bitmasking6.toString(), 2);
				System.out.println("\n---- ^ ------------------------------------------");
				BitUtils.display(result6);
				System.out.println("\n");
				break;
				
			case 13: // Bitmask com "0x4"

				System.out.print("Informe a palavra: (0xNNNN)\n");
				first = BitUtils.convertHexBin(scanner.next());
				System.out.println();

				String palavra7 = Integer.toBinaryString(first);
				System.out.println();

				BitUtils.display(Integer.parseInt(palavra7, 2));
				System.out.println();
				BitUtils.display(BitUtils.convertHexBin("0x4"));
				int result7 = Integer.parseInt(palavra7, 2) ^ BitUtils.convertHexBin("0x4");
				System.out.println("\n----- ^ -----------------------------------------");
				BitUtils.display(result7);
				System.out.println("\n");
				break;

			default:
				System.out.println("PROGRAMA ENCERRADO...");
				System.exit(0);
			}
		}
	}

	// exibe a representação de bits do valor inteiro especificado
	public class BitUtils {

		public static void menu() {
			System.out.println("Escolha a operação: ");
			System.out.printf("%s%s", "[1] AND\n[2] OR\n", "[3] XOR\n[4] Complemento\n"
					+ "[5] Deslocamento a esquerda\n[6] Deslocamento a direita\n"
					+ "[7] Bitmask - direita\n[8] Bitmask - esquerda\n"
					+ "[9] Bitmask de 1s - Direita\n[10] Bitmask de 1s - Esquerda\n"
					+ "[11] Bitmask inverter á Direita\n[12] Bitmask inverter á Esquerda\n"
					+ "[13] Bitmask com '0x4'\n"
					+ "[15] Encerrar programa\nOpção: ");
		}

		public static void display(int value) {

			String val = Integer.toHexString(value);

			System.out.printf("0x%s:\t", val.toUpperCase());


			// cria um valor inteiro com 1 no bit mais à esquerda e 0s em outros locais
			int displayMask = 1 << 15;

			// para cada bit exibe 0 ou 1
			for (int bit = 1; bit <= 16; bit++) {
				// utiliza displayMask para isolar o bit
				System.out.print((value & displayMask) == 0 ? '0' : '1');

				value <<= 1; // desloca o valor uma posição para a esquerda

				if (bit % 4 == 0)
					System.out.print(' '); // exibe espaço a cada x bits
			}
		}

		public static int convertHexBin(String palavra) {
			return Integer.decode(palavra);
		}

	}
}