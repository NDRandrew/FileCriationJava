class Main {
  public static void main(String[] args) {
    Arquivos File = new Arquivos();
    String path = "exercicios/teste1.txt"; //Where file will be created
    String texto = "\n Aula de criar arquivo e escrever em existente."; //Text that will be added inside the existing or created file
    File.createFile(path); //Create a file in Path
    File.writeFile(path,texto); //Write method
    File.readFile(path); //Read Method
    File.deleteFile(path); //Delete file method
    File.createDir("exercicios"); //Create directory
    File.listDir("exercicios"); // Add directory into an array
  }
} 
// ALL METHODS ARE BEING USED FOR THE SAKE OF TESTING.
// You could remove delete for the file only be created for example
// Software is still in it starting point, can be refined
