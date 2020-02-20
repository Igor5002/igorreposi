
package com.mycompany.revisaojava;


public class Exercicio1 {
    public static void main (String[]arqs){
      
      int[] array = {1,2,3,5,656,123,213};
      int resultado = soma(array);
      
      
      System.out.println("SOMA: " + resultado);
    }
     
    
    private static int soma(int[] numeros){
    int resultado = 0;
    for(int i =0; i <= numeros.length;i++){
        resultado += numeros[i];
    }
    
    
    resultado = 0;
    for (int i : numeros){
        resultado += i;
    }
    
        return resultado;
       
     

}
}