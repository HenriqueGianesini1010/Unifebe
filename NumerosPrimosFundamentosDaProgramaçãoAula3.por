programa
{
    funcao inicio()
    {
        inteiro numero, i, contador
        escreva("Digite um número: ")
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
            escreva("O número ", numero, " é primo.")
        }
        senao
        {
            escreva("O número ", numero, " não é primo.")
        }
    }
}