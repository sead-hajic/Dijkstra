package Dijkstra_algorithm;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Stack<String> operator  = new Stack<String>(); 
	      Stack<Double> operand = new Stack<Double>(); 
	      Scanner input = new Scanner(System.in);  
	      String[] tokens = input.nextLine().split(" ");  
	      for (int i=0;i<tokens.length;i++) 
	      {  
	        if (tokens[i].equals("(")); 
	         else if (tokens[i].equals("+")) operator.push(tokens[i]); 
	         else if (tokens[i].equals("-")) operator.push(tokens[i]);
	         else if (tokens[i].equals("*")) operator.push(tokens[i]);
	         else if (tokens[i].equals("/")) operator.push(tokens[i]);
	         else if (tokens[i].equals("sqrt")) operator.push(tokens[i]);
	         else if (tokens[i].equals("^")) operator.push(tokens[i]);
	         else if (tokens[i].equals(")")) 
	         {  
	            String op = operator.pop(); 
	            double a = operand.pop();
	        if (op.equals("+")) a = operand.pop() + a;
	            else if (op.equals("-")) a = operand.pop() - a;
	            else if (op.equals("*")) a = operand.pop() * a;
	            else if (op.equals("/")) a = operand.pop() / a;
	            else if (op.equals("sqrt")) a = Math.sqrt(a); 
	            else if(op.equals("^")) a=Math.pow(operand.pop(),a); 
	        	operand.push(a); 
	         } 
	         else operand.push(Double.parseDouble(tokens[i]));  
	      }
	      System.out.println(operand.pop());
		

	}

}
