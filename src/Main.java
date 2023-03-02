import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int aux = 0;
    do{
        int maquina = 0;
        int doWhileOperator = 1;
        int moedasNaMaquina = 0;
        int bait = 0;
        float contaNaMaquina = 0;
        float troconamaquina = 0;


        //NOME DOS PRODUTOS
        String Nome_Coca_cola_1 = "Coca-Cola";
        String Nome_Pepsi_2 = "Pepsi";
        String Nome_Iced_Tea_3 = "Iced-Tea";

        //PREÇO DOS PRODUTOS
        float PrecoDaCoca_Cola_1 = (float) 0.70;
        float PrecoDaPepsi_2 = (float) 0.65;
        float PrecoDaIced_Tea_3 = (float) 0.60;

        //QUANTIDADE DE MOEDAS
        int QuantMoedasDe0_05 = 0;
        int QuantMoedasDe0_10 = 0;
        int QuantMoedasDe0_20 = 0;
        int QuantMoedasDe0_50 = 0;

        System.out.println("1 -> " + Nome_Coca_cola_1 + " (" + PrecoDaCoca_Cola_1 + " €)\n2 -> " + Nome_Pepsi_2 + " (" + PrecoDaPepsi_2 + " €)\n3 -> " + Nome_Iced_Tea_3 + " (" + PrecoDaIced_Tea_3 + " €)");
        maquina = leitor.nextInt();

        do {
            System.out.println("Insira as moedas\n 1 -> 0,05 € \n 2 -> 0,10 € \n 3 -> 0,20 € \n 4 -> 0,50 €");
            moedasNaMaquina = leitor.nextInt();
            switch (moedasNaMaquina) {
                case 1:
                    contaNaMaquina = contaNaMaquina + 0.05f;
                    QuantMoedasDe0_05++;
                    break;
                case 2:
                    contaNaMaquina = contaNaMaquina + 0.1f;
                    QuantMoedasDe0_10++;
                    break;
                case 3:
                    contaNaMaquina = contaNaMaquina + 0.2f;
                    QuantMoedasDe0_20++;
                    break;
                case 4:
                    contaNaMaquina = contaNaMaquina + 0.5f;
                    QuantMoedasDe0_50++;
                    break;
                default:
                    System.out.println("Insira um valor de 1 a 4!!!");
            }
            System.out.println("Deseja inserir mais moedas? (1-> Sim/ 2-> Não)");
            doWhileOperator = leitor.nextInt();
        } while (doWhileOperator == 1);

        switch (maquina) {
            case 1:
                if (contaNaMaquina >= PrecoDaCoca_Cola_1) {
                    troconamaquina = (float) Math.round((contaNaMaquina - PrecoDaCoca_Cola_1) * 100) / 100;
                } else {
                    System.out.println("Não inseriu dinheiro sufeciente!");
                    System.out.println("Dinheiro Introduzido -> " + contaNaMaquina + " €");
                    System.out.println("Precisa de inserir mais -> " + (float) Math.round((PrecoDaCoca_Cola_1 - contaNaMaquina) * 100) / 100);
                    troconamaquina = contaNaMaquina;
                }
                break;
            case 2:
                if (contaNaMaquina >= PrecoDaPepsi_2) {
                    troconamaquina = (float) Math.round((contaNaMaquina - PrecoDaPepsi_2) * 100) / 100;
                } else {
                    System.out.println("Não inseriu dinheiro sufeciente!");
                    System.out.println("Dinheiro Introduzido -> " + contaNaMaquina + " €");
                    System.out.println("Precisa de inserir mais -> " + (float) Math.round((PrecoDaPepsi_2 - contaNaMaquina) * 100) / 100);
                    troconamaquina = contaNaMaquina;
                }
                break;
            case 3:
                if (contaNaMaquina >= PrecoDaIced_Tea_3) {
                    troconamaquina = (float) Math.round((contaNaMaquina - PrecoDaIced_Tea_3) * 100) / 100;
                } else {
                    System.out.println("Não inseriu dinheiro sufeciente!");
                    System.out.println("Dinheiro Introduzido -> " + contaNaMaquina + " €");
                    System.out.println("Precisa de inserir mais -> " + (float) Math.round((PrecoDaIced_Tea_3 - contaNaMaquina) * 100) / 100);
                    troconamaquina = contaNaMaquina;
                }
                break;
            default:
                System.out.println("Insira um numero valido de 1 a 3!!");
        }

        do {
            if (troconamaquina >= 0.50 && QuantMoedasDe0_50 > 0) {
                troconamaquina = (float) Math.round((troconamaquina - 0.50) * 100) / 100;
                QuantMoedasDe0_50--;
                System.out.printf("RETIROU 50 CENT\n");
                System.out.println(troconamaquina);
            } else if (troconamaquina >= 0.20 && QuantMoedasDe0_20 > 0) {
                troconamaquina = (float) Math.round((troconamaquina - 0.20) * 100) / 100;
                QuantMoedasDe0_20--;
                System.out.printf("RETIROU 20 CENT\n");
                System.out.println(troconamaquina);
            } else if (troconamaquina >= 0.10 && QuantMoedasDe0_10 > 0) {
                troconamaquina = (float) Math.round((troconamaquina - 0.10) * 100) / 100;
                QuantMoedasDe0_10--;
                System.out.printf("RETIROU 10 CENT\n");
                System.out.println(troconamaquina);
            } else if (troconamaquina >= 0.05 && QuantMoedasDe0_05 > 0) {
                troconamaquina = (float) Math.round((troconamaquina - 0.05) * 100) / 100;
                System.out.println(QuantMoedasDe0_05);
                QuantMoedasDe0_05--;
                System.out.printf("RETIROU 5 CENT\n");
                System.out.println(troconamaquina);
            } else if (troconamaquina == 0 && bait == 0) {
                System.out.println("Retire o seu troco: " + troconamaquina + " €");
                bait = 1;
            } else if (troconamaquina != 0 && bait == 0) {
                System.out.println("Não Existem moedas na máquina por favor contactar xxx xxx xxx");
                bait = 1;
            }
        } while (troconamaquina == 0 && bait == 0 );
    }while(aux == 0);
    }
}