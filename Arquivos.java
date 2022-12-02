import java.io.*;
import java.util.*;

class Arquivos{ //Creation of class the class that will be used for file creation in Main.java
  public void createFile(String path){ // create method
    try{
      File arq = new File(path);
      if(arq.createNewFile()){
        System.out.println("Arquivo criado " + arq.getName());
      }
      else{
        System.out.println("Aquivo existente ou pasta não é gravável.");
      }

      
    }catch(Exception e){
      System.out.println("Erro");
      e.printStackTrace();
    }
    
  }
  public void writeFile(String path, String texto){ //Write in file method
    try{
      FileWriter arq1 = new FileWriter(path,true);
      arq1.write(texto);
      arq1.close(); //necessario fechar o arquivo para que "salve"
    } catch(Exception e){
      System.out.println("Arquivo nao pode ser escrito ");
    }
  }
  public void readFile(String path){ //Read method
    try{
      FileReader arq2 = new FileReader(path);
      Scanner scr = new Scanner(arq2);
      while(scr.hasNextLine()){
        String linha = scr.nextLine();
        System.out.println(linha);
      }
      
    }catch(Exception e){
      e.printStackTrace();
    }
  }
  public void deleteFile(String path){ //Delete file method
    try{
      File arq = new File(path);
      if(arq.delete()){
        System.out.println("Arquivo deletado: " + arq.getName());
      }
      else{
        System.out.println("Arquivo nao pode ser apagado. ");
      }
    }catch(Exception e){
      e.printStackTrace();  
    }
  }
  public void createDir(String path){ //Create directory method
    try{
      File dir = new File(path);
      if(dir.mkdir()){
        System.out.println("Diretorio criado: "+ dir.getName());
      }
      else{System.out.println("Nao foi possivel criar diretorio");}
    }catch(Exception e){
      e.printStackTrace();
    }
  }
  public void listDir(String path){ //Use contents of directory and array them
    try{
      File arq = new File(path);
      String lista[] = arq.list();
      for (int i=0; i<lista.length;i++){
        System.out.println(lista[i]+"\n");
      }
        
    }catch(Exception e){
      e.printStackTrace();
    }
  }
  public void readFileArray(String path){ //Read Array contents inside a file
    ArrayList items = new ArrayList<String>();
    try{
      FileReader arq2 = new FileReader(path);
      Scanner scr = new Scanner(arq2);
      while(scr.hasNextLine()){
        String linha = scr.nextLine();
        System.out.println(linha);
        items.add(linha);
      }
      
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}
