import java.util.Scanner;

public class capitulo {
    String narrativa;
    String[] escolhas;
    int mudancaDeEnergia = 0;
    public boolean verificao(String escolha) {
        for (String escolha1 : escolhas) {
            if (escolha1.equalsIgnoreCase(escolha)) {
                return true; 

            }
        }
        return false;

    }


    public void mostra(personagem pj){
        System.out.println(narrativa);
        for (String escolha : escolhas) {
            System.out.println(escolha);
              
        }
        if (mudancaDeEnergia != 0) pj.gastarenergia(mudancaDeEnergia);
    }

    public int escolha(Scanner scan){
        String lido = scan.nextLine();
        while (!verificao(lido)){
            System.out.println("Texto invalido, tente novamente");
            lido = scan.nextLine();
        }
        for (int index = 0; index < escolhas.length; index++) {
            if (escolhas[index].equalsIgnoreCase(lido)) {
                return index;

            }
            
        }
        return -1;
    }
    
}