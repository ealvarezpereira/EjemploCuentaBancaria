package ejemplocuentabancaria;

/* Codifica un programa para gestionar una cuenta bancaria. Para eso crea una clase cuenta con 3 atributos:
   Nombre, Numero de cuenta y saldo(double). 
   Constructores por defecto y con parametros. 
   Metodos de acceso para el numero de cuenta. (Setters y Etters)
   Metodo para recibir el nombre de la cuenta y para mudar el saldo. 
   Metodo, que reciba una cantidad de dinero, y los ingrese en nuestra cuenta y devuelva el saldo final. 
   Metodo que reciba una cantidad de dinero y lo retire de nuestra cuenta devolviendo el saldo total.
   (Aunque no tenga dinero en la cuenta, el banco da el dinero y queda el saldo en negativo.   
*/

public class cuenta {
    
    //Atributos de la clase cuenta   
    private String numCuenta, nomCuenta;
    private double salCuenta;
    
    //Constructores por defecto y con parametros   
    public cuenta (){ 
    }
    public cuenta (String nomCuenta, String numCuenta, double salCuenta){    
        this.nomCuenta = nomCuenta;
        this.numCuenta = numCuenta;
        this.salCuenta = salCuenta;     
    }
    
    //Metodos de acceso para el numero de cuenta
    public String getNumCuenta (){
        return numCuenta;
    }    
    public void setNumCuenta (String numCuenta){
        this.numCuenta = numCuenta;  
    }
    
    
    //Metodo para recibir el nombre de cuenta    
    public String getNomCuenta () {
        return nomCuenta;
    }
    
    //Metodo para mudar el saldo
    public void setSaldo (double mudsld){  
        salCuenta = mudsld;  
    }
    
    //Metodo que recibe una cantidad de dinero, y lo ingresa en nuestra cuenta y devuelve el saldo final. 
    public double ingresar (double cantidad){
        salCuenta = salCuenta + cantidad;
        return salCuenta;
        
    }

    //Metodo que recibe una cantidad de dinero, y lo retira de nuestra cuenta y devuelve el saldo total. 
    public double retirar (double cantidad) {
        salCuenta = salCuenta - cantidad;
        return salCuenta;
    }
    
    public void anularCuenta() {
        
        nomCuenta="null";
        numCuenta="null";
        salCuenta=0.0;
        
    }
    
    
    @Override
    public String toString (){
        return ("Nombre= "+nomCuenta+"  Numero de cuenta= "+numCuenta+"  Saldo= "+salCuenta);
    }
    
}

