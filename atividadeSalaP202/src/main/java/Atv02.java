import java.util.Locale;
import java.util.Scanner;

public class Atv02 {

    public static void preencheEAtualiza(boolean[] vet, int numeroCadeira) {

        if (vet[numeroCadeira - 1] == false) {
            vet[numeroCadeira - 1] = true;
        } else {
            System.out.println("Esta poltrona já está ocupada!");
        }
    }

    public static boolean[] exibeDisponibilidadeA(boolean[] vetA) {

        int lotacao = 0;
        System.out.println("Poltronas disponíveis [ ] | Poltronas ocupadas [X]: \n");
        System.out.println("Janela lado esquerdo: ");

        for (int i = 0; i < vetA.length; i++) {
            if (vetA[i] == false) {
                System.out.println((i + 1) + " - [ ]");
            } else {
                System.out.println((i + 1) + " - [X]");
                lotacao++;
            }
        }
        System.out.println("lotação: " + lotacao);
        return vetA;
    }

    public static boolean[] exibeDisponibilidadeB(boolean[] vetB) {

        System.out.println("Poltronas disponíveis [ ] | Poltronas ocupadas [X]: \n");
        System.out.println("Corredor lado esquerdo: ");

        for (int i = 0; i < vetB.length; i++) {
            if (vetB[i] == false) {
                System.out.println((i + 1) + " - [ ]");
            } else {
                System.out.println((i + 1) + " - [X]");
            }
        }
        return vetB;
    }

    public static boolean[] exibeDisponibilidadeC(boolean[] vetC) {

        System.out.println("Poltronas disponíveis [ ] | Poltronas ocupadas [X]: \n");
        System.out.println("Corredor lado direito: ");

        for (int i = 0; i < vetC.length; i++) {
            if (vetC[i] == false) {
                System.out.println((i + 1) + " - [ ]");
            } else {
                System.out.println((i + 1) + " - [X]");
            }
        }
        return vetC;
    }

    public static boolean[] exibeDisponibilidadeD(boolean[] vetD) {

        System.out.println("Poltronas disponíveis [ ] | Poltronas ocupadas [X]: \n");
        System.out.println("Janela lado direito: ");

        for (int i = 0; i < vetD.length; i++) {
            if (vetD[i] == false) {
                System.out.println((i + 1) + " - [ ]");
            } else {
                System.out.println((i + 1) + " - [X]");
            }
        }
        return vetD;
    }


    public static void main(String[] args) {

        boolean[] vetorJanelaA = new boolean[12];
        boolean[] vetorCorredorB = new boolean[12];
        boolean[] vetorJanelaC = new boolean[12];
        boolean[] vetorCorredorD = new boolean[12];
        int posicaoPoltrona;
        int numeroPoltrona;
        int lado;
        char S = 0;

        do {
            Scanner input = new Scanner(System.in);
            System.out.println("" +
                    "\nDigite o  número da posição da poltrona que deseja:\n" +
                    "1- Corredor\n" +
                    "2- Janela");
            posicaoPoltrona = input.nextInt();

            System.out.println("Informe o lado que deseja:\n" +
                    "1- Esquerdo\n" +
                    "2- Direito");
            lado = input.nextInt();

            if (posicaoPoltrona == 1 && lado == 1) {
                System.out.println("Informe o  número da poltrona que deseja no corredor, de acordo com a disponibilidade: ");
                exibeDisponibilidadeB(vetorCorredorB);
                numeroPoltrona = input.nextInt();
                preencheEAtualiza(vetorCorredorB, numeroPoltrona);
                System.out.println("Deseja escolher uma nova poltrona [S/N]?");
                S = input.next().toLowerCase(Locale.ROOT).trim().charAt(0);

            } else if (posicaoPoltrona == 1 && lado == 2) {
                System.out.println("Informe o  número da poltrona que deseja no corredor, de acordo com a disponibilidade: ");
                exibeDisponibilidadeD(vetorCorredorD);
                numeroPoltrona = input.nextInt();
                preencheEAtualiza(vetorCorredorD, numeroPoltrona);
                System.out.println("Deseja escolher uma nova poltrona [S/N]?");
                S = input.next().toLowerCase(Locale.ROOT).trim().charAt(0);

            } else if (posicaoPoltrona == 2 && lado == 1) {
                System.out.println("Informe o  número da poltrona que deseja na janela, de acordo com a disponibilidade: ");
                exibeDisponibilidadeA(vetorJanelaA);
                numeroPoltrona = input.nextInt();
                preencheEAtualiza(vetorJanelaA, numeroPoltrona);
                System.out.println("Deseja escolher uma nova poltrona [S/N]?");
                S = input.next().toLowerCase(Locale.ROOT).trim().charAt(0);

            } else if (posicaoPoltrona == 2 && lado == 2) {
                System.out.println("Informe o  número da poltrona que deseja na janela, de acordo com a disponibilidade: ");
                exibeDisponibilidadeC(vetorJanelaC);
                numeroPoltrona = input.nextInt();
                preencheEAtualiza(vetorJanelaC, numeroPoltrona);
                System.out.println("Deseja escolher uma nova poltrona [S/N]?");
                S = input.next().toLowerCase(Locale.ROOT).trim().charAt(0);
            }
        } while (S == 's');

        System.out.println("O ônibus atingiu a lotação máxima ou a escolha foi encerrada!");
    }
}


