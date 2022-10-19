package app_de_baixar;

import java.io.File;

public class Main {

	public static void main(String[] args) { // insira o link do pdf que você deseja
		String link = "https://www.tiktok.com/@flowpdc/video/7156040916967410949?is_from_webapp=1&sender_device=pc";
		File out = new File("C:\\Users\\Vituuuu\\Desktop\\aqui\\Livro.pdf"); // cole o diretorio do e o nome do arquivo.pdf 
		
		new Thread(new Download(link, out )).start();
	}

}
