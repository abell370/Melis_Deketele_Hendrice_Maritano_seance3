import builder.GraphicCard;
import builder.NetworkCard;
import director.Director;
import model.Computer;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Computer computer = new Computer();
    static NetworkCard networkCard = new NetworkCard();
    static GraphicCard graphicCard = new GraphicCard();
    static Director computerDirector = new Director(computer);
    static Director graphicCardDirector = new Director(graphicCard);
    static Director networkCardDirector = new Director(networkCard);



    public static void main(String[] args) {
        int choice = 0;
        System.out.print("Bienvenue dans votre PC Builder !\n");
        computerDirector.setName();
        do {
            System.out.println("Prix du PC " + computer.name + " = " + computer.getPrice() + "€");
            System.out.print(
                    "1. Modifier la RAM\n" +
                    "2. Modifier le nombre d'entrées/sorties\n" +
                    "3. Ajouter/Modifier le CPU\n" +
                    "4. Ajouter/Modifier la carte graphique\n" +
                    "5. Ajouter/Modifier la carte réseau\n" +
                    "6. Renommer le PC\n" +
                    "7. Infos du PC\n" +
                    "8. Quittez \n" +
                    "Votre choix : "
            );
            choice = scanner.nextInt();
            switchChoice(choice);
        } while(choice != 8);
        System.out.print("Au revoir !");
    }

    private static void switchChoice(int choice) {
        switch(choice) {
            case 1:
                computerDirector.setRam();
                break;
            case 2:
                computerDirector.setInOut();
                break;
            case 3:
                computerDirector.setCPU();
                break;
            case 4:
                graphicCardDirector.setName();
                graphicCardDirector.setRam();
                graphicCardDirector.setInOut();
                graphicCardDirector.setCPU();
                computer.addGraphicCard(graphicCard);
                break;
            case 5:
                networkCardDirector.setName();
                networkCardDirector.setRam();
                networkCardDirector.setInOut();
                networkCardDirector.setCPU();
                computer.addNetworkCard(networkCard);
                break;
            case 6:
                computerDirector.setName();
                break;
            case 7:
                String str = computerDirector.toString();
                System.out.print(str);
                break;
            default:
                break;
        }
    }
}
