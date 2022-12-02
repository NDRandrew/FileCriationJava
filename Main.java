class Main {
  public static void main(String[] args) {
    Arquivos File = new Arquivos();
    String path = "exercicios/teste1.txt";
    String texto = "\n Aula de criar arquivo e escrever em existente.";
    File.createFile(path);
    File.writeFile(path,texto);
    File.readFile(path);
    File.deleteFile(path);
    File.createDir("exercicios");
    File.listDir("exercicios");
  }
}