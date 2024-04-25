import java.util.ArrayList;
import java.util.Scanner;

public class Votacao{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> participantes = new ArrayList<>();
        ArrayList<Integer> votos = new ArrayList<>();
        ArrayList<String> vencedores = new ArrayList<>();

        participantes.add(" Aline Dias");
        participantes.add(" Beatriz Reis");
        participantes.add(" Davi Brito");
        participantes.add(" Deniziane Ferreira");
        participantes.add(" Fernanda Bande");
        participantes.add(" Giovanna Lima");
        participantes.add(" Giovanna Pitel");
        participantes.add(" Isabella Nogueira");
        participantes.add(" Juninho");
        participantes.add(" Leidy Elin");
        participantes.add(" Lucas Henrique");
        participantes.add(" Lucas Luigi");
        participantes.add(" Lucas Pizani");
        participantes.add(" Mascus Vinicius");
        participantes.add(" Matteus Amaral");
        participantes.add(" Maycon Cosmer");
        participantes.add(" MC Bin Laden");
        participantes.add(" Michel Nogueira");
        participantes.add(" Nizam");
        participantes.add(" Raquele Cardoso");
        participantes.add(" Rodriguinho");
        participantes.add(" Thalyta Alves");
        participantes.add("Vanessa Lopes");
        participantes.add("Vinicius Rodrigues");
        participantes.add("Wanessa Camargo");
        participantes.add("Yasmin Brunet");


        for (int i = 0; i < participantes.size(); i++) {
            votos.add(0);
        }

        System.out.println("Votação do BBB - Digite o número do padrticipante que deseja votar");
        for (int i = 0; i < participantes.size(); i++) {
            System.out.println((i + 1) + ". " + participantes.get(i));
        }
        System.out.println("0. Encerrar votação");

        while (true) {
            System.out.print("Voto: ");
            int voto = scanner.nextInt();
            if (voto == 0) {
                break;
            }
            if (voto > 0 && voto <= participantes.size()) {
                votos.set(voto - 1, votos.get(voto - 1) + 1);
                System.out.println("Voto guardado para o/a: " + participantes.get(voto - 1));
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }


        System.out.println("\nResultados:");
        for (int i = 0; i < participantes.size(); i++) {
            System.out.println(participantes.get(i) + ": " + votos.get(i) + " votos");
        }
        int totalVotos = 0;
        String perdedor = "";
        for (int i = 0; i < participantes.size(); i++) {
            if (votos.get(i) > totalVotos) {
                totalVotos = votos.get(i);
                perdedor = participantes.get(i);
            }
        }
        System.out.println("\nSe eu conseguir mover montanhas, se eu conseguir surfar um tsunami, se eu conseguir\n" +
                "domar o sol, se eu conseguir fazer o mar virar sertão, e o sertão virar mar, se eu\n" +
                "conseguir dizer o que eu nunca vou conseguir dizer, aí terá chegado o dia em que eu\n" +
                "vou conseguir te eliminar com alegria. com " + totalVotos + " votos, é você quem sai é você: " + perdedor );
        for (int i = 0; i < participantes.size(); i++) {
            if (!participantes.get(i).equals(perdedor)) {
                vencedores.add(participantes.get(i));
            }
        }

    }
}