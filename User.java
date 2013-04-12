import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class User {

 private User[] vetor = new User[4321];
 private String[] name = new String[2345];
 private String[] email= new String[6789];

 private int id = 0;
 private int i = 1;
 private int j = 1;
 
 public String getName() {
  return name[i];
 }

 public void setName(String nome) {
  this.name[i] = nome;
 }
 
 public String getEmail() {
  return email[i];
 }

 public void setEmail(String email) {
  this.email[i] = email;
 }

 public int getId() {
  return id;
 }

 public void setId() {

  this.id = i;
  i += 1;
 }

 void criar(){
  java.io.File diretorio = new java.io.File("/home/user78/workspace/github");

  boolean statusDir = diretorio.mkdir();
  System.out.println(statusDir);

  String arq = "arquivo.txt";

  java.io.File arquivo = new java.io.File(diretorio,arq);

  try {
   boolean statusArq = arquivo.createNewFile();
   System.out.println(statusArq);
  }
  catch (IOException e) {
   e.printStackTrace();
  }
 
 }


 void escrever(User user){
  File dir = new File("/home/user78/workspace/github");
  File arq = new File(dir,"User.txt");

  try{
   arq.createNewFile();
   FileWriter fileWriter = new FileWriter(arq, false);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            
            
            while(j < i){
             printWriter.println(name[j]);
             printWriter.println(user.getId());   
                printWriter.println(user.getEmail());
             j++;
            }
            
            
            printWriter.flush();
            printWriter.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
 
 }


 void ler() {
        File dir = new File("/home/user78/workspace/github");
        File arq = new File(dir, "User.txt");
 
        try {
            FileReader fileReader = new FileReader(arq);
 
            BufferedReader bufferedReader = new BufferedReader(fileReader);
 
            String linha = "";
            while ( ( linha = bufferedReader.readLine() ) != null) {
                System.out.println(linha);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
   
 }

} 

