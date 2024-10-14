package trabalhopoo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FitaManager {
	//OBEJTO - MANUSEIO DOS DADOS
    private String caminhoArquivoEntrada;
    private String caminhoArquivoSaida;

    public FitaManager(String caminhoArquivoEntrada, String caminhoArquivoSaida) {
        this.caminhoArquivoEntrada = caminhoArquivoEntrada;
        this.caminhoArquivoSaida = caminhoArquivoSaida;
    }
    //ATRIBUTOS
    public void processarFitas() throws IOException {
    	int totalFitas = 0, totalFitasValidas = 0, totalFitasInvalidas = 0;
    	List<Integer> linhasInvalidas = new ArrayList<>();
    	try {
    		File arquivoEntrada = new File(caminhoArquivoEntrada);
    		PrintWriter arquivoSaida = new PrintWriter(caminhoArquivoSaida, "UTF-8");
    		Scanner leitor = new Scanner(arquivoEntrada);
    		//LER LINHAS
    		while(leitor.hasNextLine()) {
    			String linha = leitor.nextLine();
    			Fita fita = new Fita(linha);
    			totalFitas++;
    			//VERIFICAR SE É VALIDA
                if (fita.validacao()) {
                    arquivoSaida.println(fita.getComplementar());
                    totalFitasValidas++;
                } else {
                    arquivoSaida.println("***FITA INVÁLIDA - " + fita.getSequencia());
                    totalFitasInvalidas++;
                    linhasInvalidas.add(totalFitas);
                }
    		}


            leitor.close();
            arquivoSaida.close();
            
            //GRAVAR ARQUIVO RESPOSTA
            
            System.out.println("O total de fitas é: " + totalFitas);
            System.out.println("O total de fitas válidas é: " + totalFitasValidas);
            System.out.println("O total de fitas inválidas é: " + totalFitasInvalidas);
            System.out.println("As linhas inválidas são: " + linhasInvalidas);

        } catch (FileNotFoundException e) {
            System.out.println("Um erro ocorreu no arquivo");
            e.printStackTrace();
        }
    }
}
