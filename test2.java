
/**
 *comprueba como funciona los metodos de la clase calculadora
 */
public class test2
{
    /**
     * comprueba la suma de los intervalos entre dos numeros, 6 veces con parametros diferentes  y acaba indicando si el metodo funciona o no
     */
    public void testSumValuesInterval()
    {
        boolean correcto = true;
        Calculadora calculad1 = new Calculadora(); 
        if (calculad1.sumValuesInterval(0,10)==55)
        {
            System.out.println("Comprobando testSumValuesInterval(0,10)... resultado correcto 55 / resultado metodo "+(calculad1.sumValuesInterval(0,10)+".. OK"));
        }
        else 
        {
            System.out.println("Comprobando isPrime(0,10)... resultado correcto 55 / resultado metodo"+(calculad1.sumValuesInterval(0,10)+".. ERROR"));
            correcto = false;
        }
        if (calculad1.sumValuesInterval(0,1)== 1)
        {
            System.out.println("Comprobando testSumValuesInterval(0,1)... resultado correcto 1 / resultado metodo"+(calculad1.sumValuesInterval(0,1)+".. OK"));
        }

        else 
        {
            System.out.println("Comprobando isPrime(0,1)... resultado correcto 1 / resultado metodo"+(calculad1.sumValuesInterval(0,10)+".. ERROR"));
            correcto = false;
        }
        if (calculad1.sumValuesInterval(-1,10)== -1)
        {
            System.out.println("Comprobando testSumValuesInterval(-1,10)... resultado correcto -1 / resultado metodo "+(calculad1.sumValuesInterval(-1,10)+".. OK"));
        }
        else 
        {
            System.out.println("Comprobando isPrime(-1,10)... resultado correcto -1 / resultado metodo"+(calculad1.sumValuesInterval(-1,10)+".. ERROR"));
            correcto = false;
        }
        if (calculad1.sumValuesInterval(15,10)==75)
        {
            System.out.println("Comprobando testSumValuesInterval(15,10)... resultado correcto 75 / resultado metodo "+(calculad1.sumValuesInterval(15,10)+".. OK"));
        }
        else 
        {
            System.out.println("Comprobando isPrime(15,10)... resultado correcto 75 / resultado metodo"+(calculad1.sumValuesInterval(15,10)+".. ERROR"));
            correcto = false;
        }
        if (calculad1.sumValuesInterval(0,100)==5050)
        {
            System.out.println("Comprobando testSumValuesInterval(0,100)... resultado correcto 5050 / resultado metodo "+(calculad1.sumValuesInterval(0,100)+".. OK"));
        }
        else 
        {
            System.out.println("Comprobando isPrime(0,100)... resultado correcto 5050 / resultado metodo"+(calculad1.sumValuesInterval(0,100)+".. ERROR"));
            correcto = false;
        }
        if (calculad1.sumValuesInterval(5,5)==5)
        {
            System.out.println("Comprobando testSumValuesInterval(5,5)... resultado correcto 5 / resultado metodo "+(calculad1.sumValuesInterval(5,5)+".. OK"));
        }
        else 
        {
            System.out.println("Comprobando isPrime(5,5)... resultado correcto 5 / resultado metodo"+(calculad1.sumValuesInterval(5,5)+".. ERROR"));
            correcto = false;
        }
         if(correcto)
        {
            System.out.println("El metodo funciona correctamente");
        }
        else 
        {
            System.out.println("El metodo no funciona correctamente, ERROR");
        }
    }

    
    /**
     *Comprueba si los 6 numeros a comprobar   son primos y indica si el metodo funciona o no 
     */
    public void testIsPrime()
    {
        Calculadora calculad1 = new Calculadora(); 
        boolean correcto = true;
        if(calculad1.isPrime(-1) == false)
        {
            System.out.println("Comprobando testIsPrime(-1)... resultado correcto false / resultado "+calculad1.isPrime(-1)+" ... OK");
        }
        else 
        {
            System.out.println("Comprobando testIsPrime(-1)... resultado correcto false / resultado "+calculad1.isPrime(-1)+" ... ERROR");
        }
        if(calculad1.isPrime(0) ==false)
        {
            System.out.println("Comprobando testIsPrime(0)... resultado correcto false / resultado "+calculad1.isPrime(0)+" ... OK");
        }
        else 
        {
            System.out.println("Comprobando testIsPrime(0)... resultado correcto false / resultado "+calculad1.isPrime(0)+" ... ERROR");
        }
        if(calculad1.isPrime(1) == false)
        {
            System.out.println("Comprobando testIsPrime(0)... resultado correcto false / resultado "+calculad1.isPrime(0)+" ... OK");
        }
        else 
        {
            System.out.println("Comprobando testIsPrime(0)... resultado correcto false / resultado "+calculad1.isPrime(0)+" ... ERROR");
        }
        if(calculad1.isPrime(2) == true)
        {
            System.out.println("Comprobando testIsPrime(2)... resultado correcto true / resultado "+calculad1.isPrime(2)+" ... OK");
        }
        else 
        {
            System.out.println("Comprobando testIsPrime(2)... resultado correcto true / resultado "+calculad1.isPrime(2)+" ... ERROR");
        }
        if(calculad1.isPrime(3) == true)
        {
            System.out.println("Comprobando testIsPrime(3)... resultado correcto true / resultado "+calculad1.isPrime(2)+" ... OK");
        }
        else 
        {
            System.out.println("Comprobando testIsPrime(3)... resultado correcto true / resultado "+calculad1.isPrime(2)+" ... ERROR");
        }
        if(calculad1.isPrime(19) == true)
        {
            System.out.println("Comprobando testIsPrime(19)... resultado correcto true / resultado "+calculad1.isPrime(19)+" ... OK");
        }
        else 
        {
            System.out.println("Comprobando testIsPrime(19)... resultado correcto true / resultado "+calculad1.isPrime(19)+" ... ERROR");
        }
        if(correcto)
        {
            System.out.println("El metodo funciona correctamente");
        }
        else 
        {
            System.out.println("El metodo no funciona correctamente, ERROR");
        }



    }
}

