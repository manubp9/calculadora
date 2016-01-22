/**
 * Calculadora
 */
public class Calculadora
{
    // instance variables - replace the example below with your own
    private int num1;
    private int num2;

    /**
     * Constructor for objects of class Calculadora
     */
    public Calculadora()
    {
        num1 = 0;
        num2= 0;

    }

    /**
    -Implementa un método llamado multiplesOfFive que imprima todos los múltiplos de 5 entre 10
    y 95 (ambos extremos no incluidos) y haz un commit.
     */
    public void multiplesOfFive()
    {
        num1 = 10;
        num2 = 95;
        while (num1 +5 < num2)
        {
            num1 = num1 +5;
            System.out.println(num1);
        }
    }

    /**
     * Implementa un método llamado sumValues que saque por pantalla la suma de los números comprendidos entre el 0 
     * y el 10 (ambos incluidos) haciendo uso de un bucle while y haz un commit.
     */
    public void sumValues()
    {
        num1 = 0;
        num2 = 10;
        int cont = 0;
        while (cont <= num2)
        {
            num1 = num1 + cont;
            cont ++;
        }
        System.out.println(num1);
    }

    /**
     * Implementa un método llamado `sumValuesInterval` que reciba dos parámetros enteros `a` y `b` 
     * y devuelva la suma de los valores comprendidos entre dichos parámetros (ambos incluidos) y haz un commit. 
     * En caso de que `b` sea menor que `a`, el programa debe intercambiarlos. En caso de que sean el mismo número, el valor que ha de retornarse es el mismo número. 
     * Se debe comprobar que ambos parámetros son positivos o 0; 
     * en caso contrario se informa por pantalla del error y se devuelve -1.
     */
    public int sumValuesInterval(int num1, int num2 )
    {
        int cont = 0;
        int suma = 0;//variable local que va representar la suma entre num1+contador + la propia suma
        if (num1 == num2)
        {
            return (num1);
        }
        else if (num1 > num2)
        {
            int num3 = num1;
            num1 = num2;
            num2 = num3;
        }
        if ( (num1 < 0) || (num2 < 0 ))
        {
            System.out.println("ERROR,uno o los dos valores son negativos");
            num1= -1;
        }else
        {
            while (num1+cont <=num2 )
            {
                suma = (num1+cont)+suma;
                cont ++;
            }
            return suma;
        }
        return num1;
    }

    /**
     * Implementa un método llamado `isPrime(int n)` que devuelva verdadero si el parámetro `n` es primo o falso en caso contrario. 
     * Debes usar un bucle while  que divida el número entre todos los valores comprendidos entre `2` y `(n -1)`. Si alguna de estas divisiones da de resto 0,
     * entonces el número no es primo. Se debe comprobar que el parámetro es mayor que 1; 
     * en caso contrario se informa por pantalla del error y se devuelve `false`.
     */
    public boolean isPrime(int num)
    {
        boolean isPrime = true;//variable local
        int cont = 2;//variable local que inicia en 2
        if(num <= 1)
        {
            System.out.println("Error , el numero introducido es menor que uno");
            isPrime = false;
        }
        else{
            while( isPrime && cont <= (num -1 ))
            {
                if (num % cont == 0)
                {
                    isPrime = false;
                }
                cont = cont + 1;
            }
            }
            return isPrime;
    }
}
