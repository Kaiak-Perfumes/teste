//teste 
import java.util.Scanner;
public class alow {

    public static void main(String[] args) {
        
        System.out.println("Olá, qual o seu login? ");
        Scanner y = new Scanner(System.in);
        String teste = y.next();
        System.out.println("Qual sua senha? ");
        Scanner z = new Scanner(System.in);
        String pass = z.next();
        
        if (teste.equals ("kaianmesquita119") && pass.equals ("123456789")){
            System.out.println("Bem-vindo, " + teste);
            System.out.println("Deseja acessar configurações da conta?");
            String acesso = y.next();
            if(acesso.equals("sim")){
                System.out.println("Então vai toma no cukkkkk");
            }else{
                System.out.println("GAYKKKKK");
            
            }
        }else{
            System.out.println("Login ou senha inválidos. Tente novamente.");
        }
            
        
    }
}