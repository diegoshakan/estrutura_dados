package revisao;
public class Fila {
    private int[] senhas;
    private int inicio;
    private int fim;
    private int total;
    
    public Fila(){
        senhas = new int[5];
        inicio = 0;
        fim = 0;
        total = 0;
    }
    
    public void inserir(int elemento){
        senhas[fim] = elemento;
        fim = fim + 1;
        if (fim == 5){
            fim = 0;
        }
        total++;
    }
    
    public int retirar(){
        int elemento = senhas[inicio];
        inicio = inicio + 1;
        if (inicio == 5){
            inicio = 0;
        }
        total--;
        return elemento;
    }
    
    public int front(){
        return senhas[inicio];
    }
    
    public int size(){
        return senhas.length;
    }
    
    public boolean isEmpty(){
        return (total == 0);
    }
    
    public static void main(String[] args) {
        Fila fila;
        fila = new Fila();
        
        fila.inserir(55); //como este número é o primeiro, então ele é removido,
        // e não aparece na listagem de chamada. retirar()
        fila.inserir(176);
        fila.inserir(914);
        fila.inserir(9);
        fila.inserir(14);
        fila.inserir(764);
        
        System.out.println("Tamanho da fila: " + fila.size()); //Fila está cheia
        //retorna o tamanho da fila.
        
        System.out.println("Fila está vazia: " + fila.isEmpty()); //a Fila está
        // cheia, por isso mostrará False, porém fiz outra chamada abaixo...
        
        fila.retirar(); //fila: retirar o primeiro que entrou segunda o algoritmo
        
        
        
        
        System.out.println("Senha de Atendimento");
        while (!fila.isEmpty()){
            System.out.println("Próxima senha " + fila.retirar());
            //método remover, chama o elemento e o remove, e a outra posição se torna
            //a primeira posição, até não existir mais nenhum elemento.
        }
        
        System.out.println("Primeiro da fila é: " + fila.front());// mostra a primeira posição
        System.out.println("Fila está vazia: " + fila.isEmpty()); //Aqui mostrará
        //que a fila é True, por causa que todas as senhas foram chamadas e não 
        //há mais nenhuma senha a ser chamada na fila.
        
    }
    
}

    
