package revisao;
public class RecursividadeFatorial {
       
    public static int somaAte(int x){
        if (x == 0){
            return 0;
        }else {
            return x + (somaAte(x-1));
        }
    }
    
    public static int fatorial(int x){
            if (x == 0){
                return 1;
        } else {
                return x * (fatorial(x-1));
            }
    }
    
    public static int potencia(int x, int y){
        if (y == 1){
            return x;
        }
        else{
            return x * potencia(x, y-1);
        }
        
    
       
    }
        //5. Desenvolva um algoritmo que calcule a soma dos elementos 
        //(inteiros) de um arranjo (array) de tamanho N
    
        
    public static void main(String[] args) {
        //System.out.println(recFatorial(2));
        System.out.println(somaAte(3));
        System.out.println(fatorial(5));
        System.out.println(potencia(3,2));       
        
        
    }
    
    
}
