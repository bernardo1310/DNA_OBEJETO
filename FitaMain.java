package trabalhopoo;

import java.io.IOException;

public class FitaMain {
    public static void main(String[] args) {
        String caminhoArquivoOriginal = "C:\\Users\\alunos\\Desktop\\trabalhoPOO\\trabalhopoo\\src\\trabalhopoo\\DNA.txt";
        //MOSTRAR ARQUIVO RESPOSTA
        String caminhoArquivoSaida = "C:\\Users\\alunos\\Desktop\\trabalhoPOO\\trabalhopoo\\src\\trabalhopoo\\DNAfinal.txt";

        FitaManager manager = new FitaManager(caminhoArquivoOriginal, caminhoArquivoSaida);
        try {
			manager.processarFitas();
		} catch (IOException e) {
			System.out.println("Error no arquivo");
			e.printStackTrace();
		}
    }
}
