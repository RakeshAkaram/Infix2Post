import java.util.Stack;

public class Infix2Postfix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner s=new Scanner(System.in);
		String infix="a-b*c*d+e*f";
		String postFix=ToPostFix(infix);
		System.out.println("Infix :" +infix+"\nPostFix :"+postFix);
		
	}
	
	public static String ToPostFix(String infix){
		char chars[]=infix.toCharArray();
		Stack<Character> s= new Stack<Character>();
		String postFix="";
		boolean flag=true;
		OperatorPrecedence op=new OperatorPrecedence();
		for (char c : chars) {
			if (flag) {
				flag=false;
				postFix+=c;
			}
			else{
				flag=true;
				if(s.isEmpty()){
					s.push(c);
				}
				else{
					char top=s.peek();
					int i=op.operator.indexOf(top);
					int j=op.operator.indexOf(c);
					if(op.getPrecedence(i, j)=='<'){
						s.push(c);
					}
					else{
						postFix+=s.pop();
						top=s.peek();
						i=op.operator.indexOf(top);
						
						while(op.getPrecedence(i, j)=='>' && !s.isEmpty()){
							postFix+=s.pop();
							if(!s.isEmpty()){
							top=s.peek();
							i=op.operator.indexOf(top);
							}
							else
								break;
						}
						s.push(c);
					}
				}
			}
		}
		
		while(!s.isEmpty()){
			postFix+=s.pop();
		}
		
		return postFix;
	}

}
