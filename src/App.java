//import java.time.chrono.Era;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        personagem pj = new personagem();
        personagem pj2 = new personagem();
        pj2.setNome("Turame");
        
        System.out.print("\n|====================================>           PRÓLOGO           <==================================================|\n");

        System.out.println(
         "\nEra uma vez, em uma terra sombria e repleta de mistérios, um reino assolado por medo e fome."+
         "\nOs campos outrora férteis estavam secos e estéreis, enquanto os habitantes viviam sob uma "+
         "\nterrível maldição que assombrava suas vidas. A corrupção e o desespero permeavam cada"+
         "\ncentímetro daquele lugar.\n"+
         "\nNinguem se atrevia a falar abertamente sobre o castelo, mas os sussurros nas tavernas e nas vielas"+
         "\nescuras contavam histórias horripilantes de almas atormentadas e criaturas monstruosas."+
         "\nAqueles que sofriam de uma fome insaciável ou eram atormentados por visões horripilantes"+
         "\neram muitas vezes considerados vítimas da maldição do Castelo das Sombras.\n");

        System.out.println(
         "\nUm aventureiro corajoso e desesperado decidiu enfrentar seus medos e partir numa "+
         "perigosa jornada em busca de uma cura para a maldição. Ele se embrenhara nas florestas "+
         "sombrias que acercam o castelo, guiado por histórias e lendas antigas.\n");
        
        System.out.println("Desconhecido: Você parece perdido, não vou atacalo, Saia das sombras!\n");

        System.out.println("\nDesconhecido: Eu sou um antigo deus que foi destituído pelos meus irmãos e estou esperando "+
        "um aventureiro corajoso para acabar com a maldição do reino, você parece a pessoa certa!\n");
        
        System.out.println("\nVocê: Como eu posso acreditar em você\n");
        System.out.println("O desconhecido agarra sua cabeça e com seu poder revela o seu passado divino.\n ");

        System.out.println("divindade: Qual o seu nome?");
        pj.setNome(scanner.nextLine()); 
        
        System.out.println("divindade : Olá "+pj.getNome()+", qual é a sua idade?");
        pj.setIdade(scanner.nextInt());
        scanner.nextLine();
        if (pj.getIdade() < 18) {
             System.out.println("divindade: Essas masmorras são muito perigosas para quem ainda não provou álcool!");
             System.out.println("\nFIM de jogo!");
         }
        else {
             System.out.println("divindade: Que bom que você não é criança, mas tenha cuidado com essas masmorras porque o perigo espreita cada esquina desse inferno!");
             System.out.println("divindade: Lhe desejo sorte jovem rapaz, você vai precisar de toda ela, que os deuses te acompanhe "+pj.getNome());
               

        File leitor = new File("RSC/Capitulo.txt");
        Scanner leitando = new Scanner(leitor, "UTF-8"); 
        String nomeCAPITULO;
        String narraçaoCAPITULO;
        String nomepersonagemCAPITULO;
        int gastodenergiaCAPITULO;
        Map <String,capitulo> listacapitulo = new HashMap <String,capitulo>() ;
        while(leitando.hasNextLine()){
            String linha = leitando.nextLine();
            if (linha.equalsIgnoreCase("CAPITULO")) {
                nomeCAPITULO = leitando.nextLine();
                narraçaoCAPITULO = leitando.nextLine();
                gastodenergiaCAPITULO = Integer.parseInt(leitando.nextLine());
                nomepersonagemCAPITULO = leitando.nextLine();
                listacapitulo.put(nomeCAPITULO, new capitulo(pj, scanner));
                listacapitulo.get(nomeCAPITULO).setNarrativa(narraçaoCAPITULO);
                listacapitulo.get(nomeCAPITULO).setMudancaDeEnergia(gastodenergiaCAPITULO);
                listacapitulo.get(nomeCAPITULO).setNomeNPC(nomepersonagemCAPITULO);

            } else if (linha.equalsIgnoreCase("escolha")){
                String origem = leitando.nextLine();
                String txt = leitando.nextLine();
                String destino = leitando.nextLine();
                listacapitulo.get(origem).addescolha(new Escolha(txt, listacapitulo.get(destino)));
            } else if (linha.equalsIgnoreCase("CAPITULOIMAGEM")) {
                nomeCAPITULO = leitando.nextLine();
                narraçaoCAPITULO = leitando.nextLine();
                gastodenergiaCAPITULO = Integer.parseInt(leitando.nextLine());
                nomepersonagemCAPITULO = leitando.nextLine();
                String linhaString;
                String imagem = "";
                while(true){
                    linhaString = leitando.nextLine();
                    if (linhaString.equalsIgnoreCase("FIM")){
                        break;
                    }
                    imagem = imagem + linhaString + "\n";
                }
                
                Capitulo_Imagem temporario = new Capitulo_Imagem(pj, scanner);
                listacapitulo.put(nomeCAPITULO, temporario);
                temporario.setNarrativa(narraçaoCAPITULO);
                temporario.setMudancaDeEnergia(gastodenergiaCAPITULO);
                temporario.setNomeNPC(nomepersonagemCAPITULO);
         
                temporario.setImagem(imagem);}
        }
        listacapitulo.get("- capitulo 1").executar();
         
    
        }
    } 
}      