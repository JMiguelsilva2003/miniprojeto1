public class personagem {
    String nome;
    int idade;  
    int vida = 100;
    String escolha;
    int energia = 100;

    void gastarenergia(int valor){
        this.energia -= valor;
        if (energia <= 0) {
            energia = 0;
            System.out.println("seu personagem morreu");
        }
    }
}
