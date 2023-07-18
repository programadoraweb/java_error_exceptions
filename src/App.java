import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      
        Scanner s = new Scanner(System.in); //objeto que capta entrada
        try {
            // intente executar o seguinte codigo: 
            // o qual solicita para o usuario
            // digitar um valor e o sistema armazena este valor de Numero Inteiro
            // na variavel s.
            System.out.println("Digite um valor");
            int numero1 = s.nextInt();
            System.out.println(numero1);
            
        } catch (Exception e) {
            // TODO: handle exception
            // Mensagem amigavel para o usuario, para que ele entenda qual eh o erro
            // que ele cometeu: 
            // Caso ele digite por exemplo uma letra, vai receber esta mensagem. 
            System.out.println("ERRO - Valor nao eh um numero !!!");
        }





        /* Throwable - eh uma superclasse de todos os erros e excecoes na linguaguem java */

/* Error, Exception - RuntimeException, IOEXEPTION - sao classes que escutam os atributos e os metodos da super classe Throwable. 

Erro - representam condicoes irrecuperaveis. ex: perdeu a conexao com o servidor.

Exceptions - podem ser capturadas e devem ser tratadas pelo programador ej: erro de digitacao na entrada do usuario. 
O programador tem que colocar bloqueio para evitar, ex: validacao do campo.
 

Bloco TRY/CATCH usado para TRATAMENTO DE EXCECOES no java: 


try {
    //codigo
} catch (Exception e) {
    // TODO: handle exception
    //Mostre uma mensagem para o usuario, para que ele entendar o erro que ele comenteu. 
}

Voce Da um Feedback para o usuario para que ele saiba porque ele errou. 

*/

    }
}
