/*
- Autor: Antony Haro dos Santos
- Data: 13/05/2025
- Atividade: 04
- Kata: Basic Mathematical Operations
*/

public class BasicOperations
{
  public static Integer basicMath(String op, int v1, int v2)
  {
    Calculator calculator = new Calculator();
    int result = 0;
    
    switch (op) {
      case "+":
        result = calculator.add(v1, v2);
        break;
      
      case "-":
        result = calculator.subtract(v1, v2);
        break;
        
      case "*":
        result = calculator.multiply(v1, v2);
        break;
        
      case "/":
        result = calculator.divide(v1, v2);
        break;
    }
    
    return result;
  }
}

class Calculator {
  Integer add (int v1, int v2) {
    return v1 + v2;
  }
  
  Integer subtract (int v1, int v2) {
    return v1 - v2;
  }
  
  Integer multiply (int v1, int v2) {
    return v1 * v2;
  }
  
  Integer divide (int v1, int v2) {
    return v1 / v2;
  }
} 
