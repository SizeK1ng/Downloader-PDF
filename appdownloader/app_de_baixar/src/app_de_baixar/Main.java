package app_de_baixar;

import java.io.File;

public class Main {

	public static void main(String[] args) { // insira o link do pdf que você deseja
		String link = "https://livraria-camara-leg.usrfiles.com/ugd/5ca0e9_77426ca451ec4f60b14af67f925f038e.pdf";
		File out = new File("C:\\Users\\Vituuuu\\Desktop\\aqui\\Livro.pdf"); // cole o diretorio do e o nome do arquivo.pdf 
		
		new Thread(new Download(link, out )).start();
	}

}
