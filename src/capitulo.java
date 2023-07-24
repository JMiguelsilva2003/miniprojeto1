import java.util.ArrayList;
import java.util.Scanner;

public class capitulo {
    String narrativa;
    ArrayList < Escolha > escolhas;
    int mudancaDeEnergia = 0;
    personagem pj;
    Scanner scan;
    
    public capitulo(personagem pj, Scanner scan) {
        this.escolhas = new ArrayList< Escolha >();
        this.pj = pj;
        this.scan = scan;
    }


    private boolean verificao(String escolha) {
        for ( Escolha escolha1 : escolhas) {
            if (escolha1.texto.equalsIgnoreCase(escolha)) {
                return true; 

            }
        }
        return false;

    }


    private void mostra(){
        System.out.println(narrativa);
        for ( Escolha escolha1 : escolhas) {
            System.out.println(escolha1.texto);
              
        }
        if (mudancaDeEnergia != 0) pj.gastarenergia(mudancaDeEnergia);
    }

    private int escolha(){
        String lido = scan.nextLine();
        while (!verificao(lido)){
            System.out.println("Texto invalido, tente novamente");
            lido = scan.nextLine();
        }
        for (int index = 0; index < escolhas.size(); index++) {
            if (escolhas.get(index).texto.equalsIgnoreCase(lido)) {
                return index;
            
            }
        
        }
        return -1;
    }


    public void executar() {
        mostra();
        if (this.escolhas.size() > 0) {
            int seila = escolha();
            this.escolhas.get(seila).executar();
        }
        
    }
}