import java.util.*;

public class Example4
{
    public static void main(String[] args)
    {
       double                 leftOperand, result, rightOperand;
       String                 leftString, operator, rightString;
       StringTokenizer        tokenizer,tokenminus,tokenkobeitu,tokenbolu;
       Scanner in = new Scanner(System.in);
       String s=in.nextLine();

       tokenizer = new StringTokenizer(s, "+", true);
       tokenminus= new StringTokenizer(s, "-", true);
       tokenkobeitu= new StringTokenizer(s, "*", true);
       tokenbolu= new StringTokenizer(s, "/", true);

       try
       {
          leftString   = tokenizer.nextToken();
          operator     = tokenizer.nextToken();
          rightString  = tokenizer.nextToken();

          leftOperand  = Double.parseDouble(leftString);
          rightOperand = Double.parseDouble(rightString);

          if (operator.equals("+"))
             result = leftOperand + rightOperand;
          else if(tokenminus.nextToken().equals("-"))
        	     result = leftOperand-rightOperand;
          else if(operator.equals("*"))
     	     result = leftOperand * rightOperand;
          else  if(operator.equals("/"))
     	     result = leftOperand / rightOperand;
          else
             result = 0.0;

          System.out.println("Result: " + result);
       }
       
       catch (NoSuchElementException nsee)
       {
          System.out.println("Invalid syntax");
       }
       catch (NumberFormatException nfe)
       {
          System.out.println("One or more operands is not a number");
       }


    }
}
