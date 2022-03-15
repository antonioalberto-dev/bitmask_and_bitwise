import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		// 0000 0000 0000 0000
		String palavra = "0110110110110111";
		StringBuilder bitmasking = new StringBuilder("0000000000000000");
		int pos;

		Scanner sc = new Scanner(System.in);

		int num = 255;
		String val = Integer.toHexString(num);
		System.out.println("0x" + val);

		sc.close();

	}
	
	public static void display(int value) {
		System.out.printf("%d:\t", value);

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

}
