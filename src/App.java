//import java.time.chrono.Era;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        personagem pj = new personagem();
        personagem pj2 = new personagem();
        pj2.nome = "Turame";
        
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
        pj.nome = scanner.nextLine();
        
        System.out.println("divindade : Olá "+pj.nome+", qual é a sua idade?");
        pj.idade = scanner.nextInt();
        scanner.nextLine();
        if (pj.idade < 18) {
             System.out.println("divindade: Essas masmorras são muito perigosas para quem ainda não provou álcool!");
             System.out.println("\nFIM de jogo!");
         }
        else {
             System.out.println("divindade: Que bom que você não é criança, mas tenha cuidado com essas masmorras porque o perigo espreita cada esquina desse inferno!");
             System.out.println("divindade: Lhe desejo sorte jovem rapaz, você vai precisar de toda ela, que os deuses te acompanhe "+pj.nome);
               
                capitulo cap01 = new capitulo();
                cap01.narrativa = "\n|====================================>           capítulo 1          <==================================================|\n"+
                pj.nome+" adentra a fundo no reino e encontra um guerreiro perdido e assustado"+
                pj.nome+": quem é você?"+
                pj2.nome+": eu sou "+pj2.nome+ " e eu posso ajudar você."+
                pj.nome+": então vamos!"+
                pj.nome+" ao adentra mais a fundo no reino e encontra um dos deuses, que o faz uma proposta."+
                "\nOutra divindade: você poderia se juntar a mim, eu realizarei todos os seus desejos.\n";
                cap01.escolhas = new String[]{"aceitar","recusar"};
                cap01.mostra(pj);

        if (cap01.escolha(scanner) == 1) {
             System.out.println("Por aceitar essa proposta você foi morto e a maldição vai perpetuar por toda a eternidade. ");
             System.out.println("\nFIM de jogo!");
         }

        else {
             System.out.println("\nOutra divindade: então você vai sofrer a furia dos deuses!\n");
             System.out.println("por lutar com a divindade vc perdeu 80 de sua energia mas matou o deus");
             pj.gastarenergia(80); 
             pj2.gastarenergia(80);
              System.out.println("sua energia é: "+pj.energia+" para "+pj.nome+ " e "+pj2.nome+" ficou com "+pj2.energia);
         }

        System.out.println("\nApós entrarem em um conflito épico " +pj.nome+" saiu vitorioso e "+
        "pode escolher roubou o poder do deus ou não. [você quer roubar? sim ou nao] ");
        pj.escolha = scanner.nextLine();
            if (pj.escolha.equalsIgnoreCase("sim")) {
                capitulo cap03 = new capitulo();
                cap03.narrativa = "\n|====================================>           capítulo 3          <==================================================|\n"+
                pj.nome+" pegou o poder e ganhou poder.\n"+
                "\napós a morte da divindade os personagens começaram a sentir as estruturas do reino tremerem.\n"+
                "os aventureiros percebem então que os outros deuses estão chegando."+
                "[você pode digitar [fugir] para tentar fugir dos deuses ou digitar [lutar] para tentar matar mais um]";
                cap03.escolhas = new String[]{"fugir","lutar"};
                cap03.mostra(pj);
                if (cap03.escolha(scanner) == 1) {
                    System.out.println(pj.nome+ " e " + pj2.nome +" conseguiram escapar do reino e se salvarem ");
                    System.out.println("FIM de jogo!");
                }
                else {
                    System.out.println("você não conseguiu derrotar os deuses e vc e seu amigo perderam 200 de energia ");  
                    pj.gastarenergia(200); 
                    pj2.gastarenergia(200);
                  
            }}
            else {  
                 
                capitulo cap02 = new capitulo();
                 cap02.narrativa = "\n|====================================>           capítulo 2          <==================================================|\n"+
                                    "como "+pj.nome+ " não pegou o poder a ganância de "+pj2.nome+" o fez roubar o poder para ele e matar "+pj.nome+" tirando 200 de energia dele."+
                                    "[você quer [voltar] para o primeiro capítulo ou [aceitar] o seu fim]";

                 cap02.escolhas = new String[]{"voltar","aceitar"};
                 cap02.mudancaDeEnergia = 200;
                 cap02.mostra(pj);                   
            
                 if (cap02.escolha(scanner) == 1) {
                    main(args);
                }
                else {
                    System.out.println("Fim de jogo");

                }
       
            }
        }
    } 
}      