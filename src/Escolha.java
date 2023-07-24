public class Escolha {
    String texto;
    capitulo proximo;
    public Escolha(String texto, capitulo proximo) {
        this.texto = texto;
        this.proximo = proximo;
        
    }
    public void executar() {
        proximo.executar();

    }

    
}
