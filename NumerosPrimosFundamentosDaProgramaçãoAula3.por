programa
{
    funcao inicio()
    {
        inteiro numero, i, contador
        escreva("Digite um n�mero: ")
        leia(numero)
        
        contador = 0
        para (i = 1; i <= numero; i++)
        {
            se (numero % i == 0)
            {
                contador = contador + 1
            }
        }
        
        se (contador == 2)
        {
            escreva("O n�mero ", numero, " � primo.")
        }
        senao
        {
            escreva("O n�mero ", numero, " n�o � primo.")
        }
    }
}