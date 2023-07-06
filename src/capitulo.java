import java.util.Scanner;

public class capitulo {
    String narrativa, pergunta1, pergunta2;
    int mudancaDeEnergia = 0;

    public void mostra(personagem pj){
        System.out.println(narrativa);
        System.out.println(pergunta1);
        System.out.println(pergunta2);
        if (mudancaDeEnergia != 0) pj.gastarenergia(mudancaDeEnergia);
    }

    public int escolha(Scanner scan){
        String lido = scan.nextLine();
        while (!lido.equalsIgnoreCase(pergunta1) && !lido.equalsIgnoreCase(pergunta2)){
            System.out.println("Texto invalido, tente novamente");
            lido = scan.nextLine();
        }
        if (lido.equalsIgnoreCase(pergunta1)){
            return 1;
        } else {
            return 2;
        }
    }
    
}
