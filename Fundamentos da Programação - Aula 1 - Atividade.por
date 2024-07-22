programa {
funcao inicio() {

  real saia 
  real blusa 
  real sapato
  real compras 
  real desconto 
  real cheque


  escreva("Digite o valor da saia: ")
  leia(saia)

  escreva("Digite o valor da blusa: ")
  leia(blusa)

  escreva("Digite o valor do sapato: ")
  leia(sapato)

  compras = saia + blusa + sapato
  desconto = compras * 0.1
  cheque = compras - desconto

  escreva("O valor final a pagar é: ", cheque)
   
  }
}