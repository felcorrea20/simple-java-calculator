public class Divisao {

    void dividir(float n1, float n2){
        if(n2 == 0){
            System.out.println("Erro! Divisor não pode ser zero!");
        }else{
            System.out.printf("Resultado da Divisão: %.2f \n", (n1/n2) );
        }
    }
}
