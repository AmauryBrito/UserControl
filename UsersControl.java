
import java.util.Scanner;

public class UsersControl {
 public static void main(String[] args){
  Scanner rd = new Scanner(System.in);
  String teclado;
  int resp =  1;
  User user1 = new User();


  while(resp != 1234) {
  System.out.println("  acrescente uma opção:  ");
  System.out.println("      1 - Add      ");
  System.out.println("      2 - List      ");
  System.out.println("      3 - RM        ");
  System.out.println("      4 - Export    ");
  System.out.println("      5 - Import    ");

  resp = rd.nextInt();
  if(resp  > 5){
   System.out.println("Opcao incorreta, tente novamente");
  }
  switch(resp){
   case 1:

    System.out.println("digite seu nome: ");
    
    
    System.out.println("digite seu e-mail: ");
    teclado = rd.nextLine();
    user1.setEmail(teclado);

    user1.setId();

     
        

  }

 }
 }
}