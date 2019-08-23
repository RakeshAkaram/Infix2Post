import java.util.ArrayList;

public class OperatorPrecedence {

	//public char[] operator={'+','-','*'};
	ArrayList<Character> operator=new ArrayList<>();
	
			//new char[4];
	public char[][] precedence=new char[3][3];
	public char getPrecedence(int i,int j) {
		return precedence[i][j];
	}
	public void setPrecedence(char[][] precedence) {
		this.precedence = precedence;
	}
	public OperatorPrecedence() {
		/***
		 * Using the Advantage of ArrayList i.e. Random Access
		 */
		operator.add('+');
		operator.add('-');
		operator.add('*');
		//operator.add('');
		
		// TODO Auto-generated constructor stub
		precedence[0][0]='>';
		precedence[0][1]='>';
		precedence[0][2]='<';
		
		precedence[1][0]='>';
		precedence[1][1]='>';
		precedence[1][2]='<';
		
		precedence[2][0]='>';
		precedence[2][1]='>';
		precedence[2][2]='>';
	}
}