//import java.time.chrono.Era;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

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

        System.out.println("[Digite o seu sexo com M para masculino e F para feminino: ]");
        String sexo = scanner.nextLine();
        
         if (sexo.equalsIgnoreCase("M")) {
             System.out.println("Desconhecido: Olâ rapaz, essas masmorras são perigosas! Cuidado! mas eu irei te ajudar.");
         }
         if (sexo.equalsIgnoreCase("F")) {
             System.out.println("Desconhecido: Olâ moça, essas masmorras são muito perigosas para uma mulher! mas eu irei te ajudar.");
         }
        System.out.println("\nDesconhecido: Eu sou um antigo deus que foi destituído pelos meus irmãos e estou esperando "+
        "um aventureiro corajoso para acabar com a maldição do reino, você parece a pessoa certa!\n");
        
        System.out.println("\nVocê: Como eu posso acreditar em você\n");
        System.out.println("O desconhecido agarra sua cabeça e com seu poder revela o seu passado divino.\n ");

        System.out.println("divindade: Qual o seu nome?");
        String nome = scanner.nextLine();
        
        System.out.println("divindade : Olá "+nome+", qual é a sua idade?");
        int idade = scanner.nextInt();
        scanner.nextLine();
        if (idade < 18) {
             System.out.println("divindade: Essas masmorras são muito perigosas para quem ainda não provou álcool!");
             System.out.println("\nFIM de jogo");
         }
        else {
             System.out.println("divindade: Que bom que você não é criança, mas tenha cuidado com essas masmorras porque o perigo espreita cada esquina desse inferno!");
             if ( sexo.equalsIgnoreCase("m") ) {
                System.out.println("divindade: Lhe desejo sorte jovem rapaz, você vai precisar de toda ela, que os deuses te acompanhe "+nome);
              } 
             else {
                System.out.println("divindade: Lhe desejo sorte jovem dama, você vai precisar de toda ela, que os deuses te acompanhe "+nome);
               
        System.out.println(nome+" adentra a fundo no reino e encontra um dos deuses, que o faz uma proposta.");
        System.out.println("\nOutra divindade: você poderia se juntar a mim, eu realizarei todos os seus desejos.\n");
        System.out.println("[Digite aceitar ou recusar. ]");
        String escolha = scanner.nextLine();
        if (escolha.equalsIgnoreCase("aceitar")) {
             System.out.println("Por aceitar essa proposta você foi morto e a maldição vai perpetuar por toda a eternidade. ");
             System.out.println("\nFIM de jogo");
         }
         if (escolha.equalsIgnoreCase("recusar")) {
             System.out.println("\nOutra divindade: então você vai sofrer a furia dos deuses!\n");
         }

        System.out.println("\nApós entrarem em um conflito épico " +nome+" saiu vitorioso e roubou o poder do deus, "+ 
        "com o poder divino"+nome+ " o usou para acabar com a maldição e restaurar o reino. \n");
        System.out.println("FIM de jogo");

             }
        }
    }       
}
