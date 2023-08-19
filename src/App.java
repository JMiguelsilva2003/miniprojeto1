//import java.time.chrono.Era;
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
               
        capitulo cap01 = new capitulo(pj,scanner);
        cap01.setNarrativa(
                pj.getNome()+" adentra a fundo no reino e encontra um guerreiro perdido e assustado"+
                pj.getNome()+": quem é você?"+
                pj2.getNome()+": eu sou "+pj2.getNome()+ " e eu posso ajudar você."+
                pj.getNome()+": então vamos!"+
                pj.getNome()+" ao adentra mais a fundo no reino e encontra um dos deuses, que o faz uma proposta."+
                "\nOutra divindade: você poderia se juntar a mim, eu realizarei todos os seus desejos.\n");
                

        capitulo cap01_1 = new capitulo(pj, scanner);
        cap01_1.setNarrativa("Por aceitar essa proposta você foi morto e a maldição vai perpetuar por toda a eternidade.\n FIM de jogo!");
        capitulo cap01_2 = new capitulo(pj, scanner);
        cap01_2.setNarrativa( 
        "\nOutra divindade: então você vai sofrer a furia dos deuses!\npor lutar com a divindade vc perdeu 80 de sua energia mas matou o deus");
        cap01_2.setMudancaDeEnergia(80);
        
        cap01.addescolha(new Escolha("aceitar", cap01_1));
        cap01.addescolha(new Escolha("recusar", cap01_2));

        capitulo cap02 = new capitulo(pj, scanner);
        cap01_2.addescolha(new Escolha("continuar", cap02));
        cap02.setNarrativa("\nApós entrarem em um conflito épico " +pj.getNome()+" saiu vitorioso e pode escolher roubou o poder do deus ou não. [você quer roubar? sim ou nao] ");

        capitulo cap03 = new capitulo(pj, scanner);
        capitulo cap04 = new capitulo(pj, scanner); 

        cap02.addescolha(new Escolha("sim", cap03));
        cap02.addescolha(new Escolha("nao", cap04));

        cap03.setNarrativa( 
                pj.getNome()+" pegou o poder e ganhou poder.\n"+
                "\napós a morte da divindade os personagens começaram a sentir as estruturas do reino tremerem.\n"+
                "os aventureiros percebem então que os outros deuses estão chegando."+
                "[você pode digitar [fugir] para tentar fugir dos deuses ou digitar [lutar] para tentar matar mais um].");
               
        capitulo cap03_1 = new capitulo(pj, scanner);
        capitulo cap03_2 = new capitulo(pj, scanner);
        cap03.addescolha(new Escolha("fugir", cap03_1));
        cap03.addescolha(new Escolha("lutar", cap03_2));

        cap03_1.setNarrativa(pj.getNome()+ " e " + pj2.getNome() +" conseguiram escapar do reino e se salvarem \nFIM de jogo!");
        cap03_2.setNarrativa("você não conseguiu derrotar os deuses e vc e seu amigo perderam 200 de energia ");
        cap03_2.setMudancaDeEnergia(200);  
                 
        cap04.setNarrativa( 
                                    "como "+pj.getNome()+ " não pegou o poder a ganância de "+pj2.getNome()+" o fez roubar o poder para ele e matar "+pj.getNome()+" tirando 200 de energia dele."+
                                    "[você quer [voltar] para o primeiro capítulo ou [aceitar] o seu fim]");
        
        cap04.addescolha(new Escolha("voltar", cap01));
        capitulo cap05 = new capitulo(pj, scanner);
        cap04.addescolha(new Escolha("aceitar", cap05));
        cap05.setNarrativa(" FIM DE JOGO");
        cap01.executar();
            
        }
    } 
}      