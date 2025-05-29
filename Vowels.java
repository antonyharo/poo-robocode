// - Autor: Antony Haro dos Santos - Turma 01 | Aprendendo POO
// - Atividade: 03
// - Kata: Vowel Cont
// - Data: 08/05/2025

// foreach
public class Vowels {
  public static int getCount(String str) {
    int vowels = 0;
    
    for (char c : str.toCharArray()) {
      if (c == "a" || c == "e" || c == "i" || c == "o" || c == "u") {
        vowels++;
      }
    }
      
    return vowels;
  }
}

// while
public class Vowels {
  public static int getCount(String str) {
    int index = 0;
    int vowels = 0;
    
    while (index < str.length()) {
      char c = str.charAt(index);
      
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') vowels++;
      
      index++;
    }
    
    return vowels;
  }
}

// do while
public class Vowels {
  public static int getCount(String str) {
    if (str.length() == 0) return 0; // Evita erro com string vazia

    int index = 0;
    int vowels = 0;

    do {
      char c = str.charAt(index);
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') vowels++;
      index++;
    } while (index < str.length());

    return vowels;
  }
}
