/*Code for logic gates*/

class LogicGates{
	// find how to pass variable length arg in java it is three
	// ... example: func(int ...a)
	
	int or_gate(int in1, int in2){
		
		int a,b;
		a=in1;
		b=in2;
		int ans;
		int or_ans;
		// using the | operator
		or_ans= a|b;
		return or_ans;
	}
	
	int nor_gate(int in1, int in2){
		
		int a,b;
		a=in1;
		b=in2;
		
		int ans;
		int nor_ans;
		if(a==0 && b==0 )   // Assignment operator in JAVA will retuen error 
			nor_ans=1;
		else 
			nor_ans=0;
		
		return nor_ans;
	}

	public static void main(String args[]){
	
		int inp1=0; // inputs to the code
		int inp2=1;
		
		LogicGates lg = new LogicGates();
		
		int result_or= lg.or_gate(inp1,inp2);
		int result_nor=lg.nor_gate(inp1,inp2);
		
		System.out.println("The result of or_gate: "+result_or);
		System.out.println("The result of nor_gate: "+result_nor);
	}
}	
		
		
		
		
		