programa {
  funcao inicio() {
    inteiro fatorial = 1
    inteiro numero

  escreva("Digite o número: ")
  leia(numero)

  se((numero % 2)==1) {
    escreva("e impar")
  } senao {
    escreva("É par")
  }      
        
   enquanto (numero > 1) {
    fatorial = fatorial * numero
    numero = numero-1
   }        

   escreva(fatorial)

}
}