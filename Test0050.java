

public class Test0050
{
    public Test0050()
    {
        
    }
    public int multiplicar(int numero, int multiplicador)
    {
        int inicial= numero;
        for (int i = 1 ;i<multiplicador; i++)
        {
            numero= inicial+numero;
        }
        return numero;
    }
    public int dividir(int numero, int divisor)
    {
        int acumulador = numero;
        int contador=0;
        while(acumulador >= divisor)
        {
            acumulador = acumulador - divisor;
            contador++;
        }
        return contador;
    }
    public int potencia(int base, int exponente)
    {
        int inicial=0;
        int acumulador=0;
        for (int i=0; i<exponente; i++)
        {
            inicial= multiplicar(base,base);
        }
        return inicial;
    }
    public int pontencia1(int base, int exponente)
    {
        while(acumulador>=divisor)
        }
   
       }
}
