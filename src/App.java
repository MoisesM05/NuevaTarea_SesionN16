//Moises Isaias Mendez Sanchez
//2024-1687

import java.util.Scanner;
import java.util.InputMismatchException;

public class App {  //Variables globales
    Scanner leer = new Scanner(System.in);
    int suma, resta;
    int num1, num2, num3, menor1, menor2, mayor1, mayor2;
    boolean continuar = true;

    public static void main(String [] args){    //main

    
        App Mayor_menor = new App(); //Instancia del metodo para determinar los numeros menores y mayores.
        Mayor_menor.Calcular(); //Metodo

        
       
    }
   
    public static int sumaMenores(int menor1, int menor2){    //metodo para sumar los numeros menores.
        return menor1+menor2;
    }

    public static int resta_mayores(int mayor1, int mayor2){   //metodo para restar los mayores.
        return mayor1-mayor2;
    }
    

    public void Calcular(){  //metodo para determinar los numeros menores y mayores.

        do{ //Incio del bucle
            try{
                System.out.println("Digite el primer numero: ");    //Introduccion de datos
                num1 = leer.nextInt();
                System.out.println("Digite el segundo numero: ");
                num2 = leer.nextInt();
                System.out.println("Digite el ultimo numero: ");
                num3 = leer.nextInt();

            if(num1 != num2 && num2 != num3 && num3 != num1){   //verificar si los numero son ! diferentes.
                System.out.println("Numero correctos.");
                continuar = false;

            }else{
                System.out.println("Los numeros no pueden ser iguales."); //Mensaje si no son diferentes
                
            }

            }catch(InputMismatchException InputMismatchException){  //captura de excepcion si escribe un string en ves de un entero.
                System.out.println(InputMismatchException);
                leer.nextLine();
                System.out.println("Solo puede introducir numeros.");
            }

        }while(continuar);


        if(num1<num2 && num2<num3){ /*Condiciones para determinar la suma de los numeros menores y la resta
            de los numeros mayores y el numero mayor de los 3 */
            System.out.println("Los numeros menores son: "+num1+" y "+num2);
            System.out.println("La suma de los menores es: "+sumaMenores(num1,num2));   //llamado del metodo sumaMenores para realizar la suma.
            System.out.println("Los numeros mayores son: "+num2+" y "+num3);
            System.out.println("La resta de los mayores es: "+resta_mayores(num3,num2));    //llamado al metodo resta_mayores para restar los numeros mayores.
            System.out.println("El numero mayor de los 3 ingresados es: "+num3);
            menor1 = num1;
            menor2 = num2;
            mayor1 = num2;
            mayor2 = num3;

        }else if(num1<num3 && num3<num2){
            System.out.println("Los numeros menores son: "+num1+" y "+num3);
            System.out.println("La suma de los menores es: "+sumaMenores(num1,num3));
            System.out.println("Los numero mayores son: "+num3+" y "+num2);
            System.out.println("La resta de los mayores es: "+resta_mayores(num2,num3));
            System.out.println("El numero mayor de los 3 ingresados es: "+num2);
            menor1 = num1;
            menor2 = num3;
            mayor1 = num3;
            mayor2 = num2;
        }else if(num2<num3 && num3<num1){
            System.out.println("Los numeros menores son: "+num2+" y "+num3);
            System.out.println("La suma de los menores es: "+sumaMenores(num2,num3));
            System.out.println("Los numeros mayores son: "+num3+" y "+num1);
            System.out.println("La resta de los mayores es: "+resta_mayores(num1,num3));
            System.out.println("El numero mayor de los 3 ingresados es: "+num1);
            menor1 = num2;
            menor2 = num3;
            mayor1 = num3;
            mayor2 = num1;
        }else if(num2<num1 && num1<num3){
            System.out.println("Los numeros menores son: "+num2+" y "+num1);
            System.out.println("La suma de los menores es: "+sumaMenores(num2,num1));
            System.out.println("Los numeros mayores son: "+num1+" y "+num3);
            System.out.println("La resta de los mayores es: "+resta_mayores(num3,num1));
            System.out.println("El numero mayor de los 3 ingresados es: "+num3);
            menor1 = num2;
            menor2 = num1;
            mayor1 = num1;
            mayor2 = num3;
        }else if(num3<num1 && num1<num2){
            System.out.println("Los numeros menores son: "+num3+" y "+num1);
            System.out.println("La suma de los menores es: "+sumaMenores(num3,num1));
            System.out.println("Los numeros mayores son: "+num1+" y "+num2);
            System.out.println("La resta de los mayores es: "+resta_mayores(num2,num1));
            System.out.println("El numero mayor de los 3 ingresados es: "+num2);
            menor1 = num3;
            menor2 = num1;
            mayor1 = num1;
            mayor2 = num2;
        }else{
            System.out.println("Los numeros menores son: "+num3+" y "+num2);
            System.out.println("La suma de los menores es: "+sumaMenores(num3,num2));
            System.out.println("Los numeros mayores son: "+num2+" y "+num1);
            System.out.println("La resta de los mayores es: "+resta_mayores(num1,num2));
            System.out.println("El numero mayor de los 3 ingresados es: "+num1);
            menor1 = num3;
            menor2 = num2;
            mayor1 = num2;
            mayor2 = num1;
        }

    }


    


}
