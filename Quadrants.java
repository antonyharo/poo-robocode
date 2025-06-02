// - Autor: Turma 01 - Aprendendo POO
// - Atividade: 02\
// - Kata: Quadrants
// - Data: 06/05/2025

public class Kata {
 
  public static int quadrant(int x, int y) {
   
    // testando se x é positivo
    if(x > 0) {
      if(y > 0) {
        return 1;
      }
     
      // se y é negativo...
      return 4;
    }
   
    // aqui o x já é negativo
    if(y > 0) {
      return 2;
    }
   
    // x e y negativos
    return 3;
  }
}
