public class Operacion{ 
  public static void main(String args[]){
   int operacion = 1;
   int num_uno = 8;
   int num_dos = 4;
   int resultado = 0;
   
   if(operacion == 1){
    resultado = num_uno + num_dos;
    System.out.println("El resultado de la suma: " + resultado);
  } else (operacion == 2){
    resultado = num_uno - num_dos;
    System.out.println("El resultado de la resta: " + resultado);
  } else (operacion == 3){
    resultado = num_uno * num_dos;
    System.out.println("El resultado de la multiplicacion: " + resultado);
  } else (operacion == 4){
    resultado = num_uno / num_dos;
    System.out.println("El resultado de la division: " + resultado);
  } else {
    System.out.println("La opcion que elegiste no existe.");    
  }
 }
}
}