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
}
