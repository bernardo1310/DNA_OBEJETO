package trabalhopoo;

public class Fita {
	//OBEJTO - SUBSTITUICAO
    private String sequencia;

    public Fita(String sequencia) {
        this.sequencia = sequencia;
    }

    public boolean validacao() {
    	for(char nucleo : sequencia.toCharArray()) {
    		if (nucleo!='G' && nucleo!='A' && nucleo!='T' && nucleo!='C') {
    			return false;
    		}
    	}
        return true;
    }

    public String getComplementar() {
    	StringBuilder fitaComplementar = new StringBuilder();
    	//FAZER A SUBSTITUICAP
    	for(char nucleo : sequencia.toCharArray()) {
    		switch(nucleo) {
    		case 'G':
                fitaComplementar.append('C');
                break;
    		case 'C':
    			fitaComplementar.append('G');
    			break;
    		case 'T':
    			fitaComplementar.append('A');
    			break;
    		case 'A':
    			fitaComplementar.append('T');
    			break;
    	}
        }
        return fitaComplementar.toString();
    }
    
    public String getSequencia() {
    	return sequencia;
    } 
}
