package jogodeadvinhação;
import java.util.Random;
import java.util.Scanner;
/**
 * @author thiago.barrera
 */
public class JogodeAdvinhação {
    public static void main(String[] args){
    int nível,chance; 
    int resposta = 1, resp;
    int contf = 0;
    int valor;
    do{
    int senha = new Random().nextInt(100) + 1;
    Scanner in = new Scanner(System.in);
        System.out.println(senha);
        System.out.println("|----------------------------------------|");
        System.out.println("|    BEM VINDO AO JOGO DE ADVINHAÇÃO!    |");
        System.out.println("|----------------------------------------|");
        System.out.println("|Escolha seu nível:                      |");
        System.out.println("|Nível 1 - Fácil                         |");
        System.out.println("|Nível 2 - Médio                         |");
        System.out.println("|Nível 3 - Díficil                       |");
        System.out.println("|----------------------------------------|");
        System.out.println("Digite seu nível:");
        nível=in.nextInt();
        while(nível != 1 && nível !=2 && nível != 3){
            System.out.println("Valor inválido, favor digitar apenas '1', '2' ou '3'");
            nível=in.nextInt();
        }
        switch (nível) {
            case 1:
               chance = 15;
               jogar(chance,senha);
               break;
            case 2:
               chance = 10;
               jogar(chance,senha);
               break;
            default:
               chance = 5;
               jogar(chance,senha);
               break;
       }
        System.out.println("Voce deseja jogar novamente? digite 1 para sim ou 0 para nao");
        resp = in.nextInt();
        }while(resposta == resp);{
        System.out.println("Bye Bye!");
        }
    }
    public static void jogar(int chances,int NumeroSorteado)
    {
        int contador = 0,NumeroEscolhido,max=100,min=1;
        Scanner scan = new Scanner(System.in); 
        while(contador < chances){
            System.out.println("Digite o valor entre "+min+" e "+max);
            NumeroEscolhido=scan.nextInt();
            if(NumeroEscolhido > NumeroSorteado){
               max = NumeroEscolhido;
            }else if(NumeroEscolhido < NumeroSorteado){
               min = NumeroEscolhido;
            }else{
            System.out.println("Parabéns, você ganhou !! Com "+(contador+1)+" tentativas!");
               break;       
            }contador++;
        }
        if(contador == chances){
        System.out.println("Infelizmente, você perdeu.");
        }
    }         
}