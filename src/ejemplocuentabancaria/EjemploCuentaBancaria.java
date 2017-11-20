package ejemplocuentabancaria;

import java.util.Scanner;

public class EjemploCuentaBancaria {
/* Codifica un programa para gestionar una cuenta bancaria. Para eso crea una clase cuenta con 3 atributos:
   Numero de cuenta y saldo(double). Constructores por defecto y con parametros. 
   Metodos de acceso para el numero de cuenta.
   Metodo para recibir el nombre de la cuenta y para mudar el saldo. 
   Metodo, que reciba una cantidad de dinero, y los ingrese en nuestra cuenta y devuelva el saldo final. 
   Metodo que reciba una cantidad de dinero y lo retire de nuestra cuenta devolviendo el saldo total.
   (Aunque no tenga dinero en la cuenta, el banco da el dinero y queda el saldo en negativo.   
*/
    
    public static void main(String[] args) {
        
        Scanner retorno = new Scanner(System.in);
        
        //Libreta 1
        cuenta libreta1 = new cuenta();
        System.out.println(libreta1.toString());
        String retornoa = retorno.nextLine();
        libreta1.setSaldo(6000000);
        libreta1.setNumCuenta("ES59 6434 43 4898 3438 2388");
        retornoa= retorno.nextLine();
        System.out.println(libreta1.toString());
        retornoa= retorno.nextLine();
        //Libreta 2
        cuenta libreta2 = new cuenta();
        System.out.println(libreta2.toString());
        retornoa= retorno.nextLine();
        libreta2.setSaldo(7889224);
        libreta2.setNumCuenta("ES59 6434 43 4548 0000 0006");
        retornoa= retorno.nextLine();
        System.out.println(libreta2.toString());
        retornoa= retorno.nextLine();
      
        //Libreta 3

        Scanner sc= new Scanner(System.in);
        
        System.out.println("Nombre: ");
        String nomCuenta=  sc.nextLine();
        
        System.out.println("Numero de cuenta: ");
        String numCuenta= sc.nextLine();
        
        double salCuenta= 0;
        
        
        cuenta libreta3 = new cuenta(nomCuenta,numCuenta,salCuenta);
        
        System.out.println(libreta3.toString());
        retornoa= retorno.nextLine();
        System.out.println("Pulsa enter si quieres ingresar dinero");
        retornoa= retorno.nextLine();
        
        //Insertar dinero
        System.out.println("Inserta la cantidad que quieres ingresar: ");
        salCuenta= sc.nextDouble();        
        double cant = libreta3.ingresar(salCuenta);   
       
        System.out.println(libreta3.toString());
        retornoa= retorno.nextLine();
        System.out.println("Pulsa enter si quieres retirar dinero");
        retornoa= retorno.nextLine();
        //Retirar dinero
        System.out.println("Inserta la cantidad que quieres retirar: ");
        salCuenta= sc.nextDouble();        
        double cant2= libreta3.retirar(salCuenta); 
      
        System.out.println(libreta3.toString());
        
        libreta3.anularCuenta();
        
        
    }
    
}
