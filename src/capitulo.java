import java.util.ArrayList;
import java.util.Scanner;

public class capitulo {
    protected String narrativa;
    public void setNarrativa(String narrativa) {
        this.narrativa = narrativa;
    }


    protected ArrayList < Escolha > escolhas;
    public void addescolha(Escolha esk){
        this.escolhas.add(esk);
    } 
   


    protected int mudancaDeEnergia = 0;
    public void setMudancaDeEnergia(int mudancaDeEnergia) {
        this.mudancaDeEnergia = mudancaDeEnergia;
    }


    protected personagem pj;
    protected Scanner scan;
    
    public capitulo(personagem pj, Scanner scan) {
        this.escolhas = new ArrayList< Escolha >();
        this.pj = pj;
        this.scan = scan;
    }


    protected boolean verificao(String escolha) {
        for ( Escolha escolha1 : escolhas) {
            if (escolha1.texto.equalsIgnoreCase(escolha)) {
                return true; 

            }
        }
        return false;

    }


    protected void mostra(){
        System.out.println(narrativa.replace("\\n","\n").replace("pj.getNome", pj.getNome()).replace("pj2.getNome","Turame"));
        for ( Escolha escolha1 : escolhas) {
            System.out.println(escolha1.texto);
              
        }
        if (mudancaDeEnergia != 0) pj.gastarenergia(mudancaDeEnergia);
    }

    protected int escolha(){
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

    protected String nomeNPC;
    
    public void setNomeNPC(String nomeNPC) {
        this.nomeNPC = nomeNPC;
    }


    public void executar() {
        mostra();
        if (this.escolhas.size() > 0) {
            int seila = escolha();
            this.escolhas.get(seila).executar();
        }
        
    }
}