public class Exe1038 {

    private int cod;
    private int qua;
    
    public Exe1038(int cod, int qua){
	setCod(cod);
	setQua(qua);
	
    }
    public void setCod(int cod){
	this.cod = cod;
    }
    public int getCod(){
	return cod;
    }
    public void setQua(int qua){
	this.qua = qua;
    }
    public int getQua(){
	return qua;
    }
    public double menu(double total ){
      
	switch(cod){
	case 1:
	    total = 4.00 * qua;
	    break;
	case 2:
	    total = 4.50 * qua;
	    break;
	case 3:
	    total = 5.00 * qua;
	    break;
	case 4:
	    total = 2.00 * qua;
	    break;
	case 5:
	    total = 1.50 * qua;
	    break;
	default:
	    System.out.println("Fora de escopo");
	}
	
	return total;
    }
    
}
