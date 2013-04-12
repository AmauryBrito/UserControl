import javax.swing.JOptionPane;

public class Main {
public static void main(String[] args){
int resp = 1;
User user1 = new User();
 while(resp != 12345) {
  String resposta = JOptionPane.showInputDialog("acrescente uma opção: \n1 - Add \n2 - List \n3 - RM \n4 - Export \n5 - Import");
  resp = Integer.parseInt(resposta);
 if(resp > 7){
  JOptionPane.showMessageDialog(null, "Opcao incorreta, tente novamente");
  }
  switch(resp){
   case 6:

    String nome = JOptionPane.showInputDialog("digite seu nome: ");
    user1.setName(nome);

    String email = JOptionPane.showInputDialog("digite seu e-mail: ");
    user1.setEmail(email);

    user1.setId();
   
    JOptionPane.showMessageDialog(null, "Cadastro efetuado");


    break;

   case 2:

    break;

   case 3:
    break;

   case 4:
    user1.criar();
    user1.escrever(user1);
    break;

   case 5:
    break;
   }
  if (JOptionPane.showConfirmDialog(null,"Deseja Sair do Controle de Usuarios?", "Sair?", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
   break;
   }
  }
 }
}