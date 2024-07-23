// Declaração de variáveis
numero_matricula1, numero_matricula2, numero_matricula3: inteiro
nota1_aluno1, nota2_aluno1, nota1_aluno2, nota2_aluno2, nota1_aluno3, nota2_aluno3: real
media_turma, media_aluno1, media_aluno2, media_aluno3: real
melhor_aluno: inteiro

// Entrada de dados
escreva("Digite o número de matrícula do primeiro aluno: ")
leia(numero_matricula1)

escreva("Digite a primeira nota do primeiro aluno: ")
leia(nota1_aluno1)

escreva("Digite a segunda nota do primeiro aluno: ")
leia(nota2_aluno1)

escreva("Digite o número de matrícula do segundo aluno: ")
leia(numero_matricula2)

escreva("Digite a primeira nota do segundo aluno: ")
leia(nota1_aluno2)

escreva("Digite a segunda nota do segundo aluno: ")
leia(nota2_aluno2)

escreva("Digite o número de matrícula do terceiro aluno: ")
leia(numero_matricula3)

escreva("Digite a primeira nota do terceiro aluno: ")
leia(nota1_aluno3)

escreva("Digite a segunda nota do terceiro aluno: ")
leia(nota2_aluno3)

// Cálculo da média dos alunos
media_aluno1 := (nota1_aluno1 + nota2_aluno1) / 2
media_aluno2 := (nota1_aluno2 + nota2_aluno2) / 2
media_aluno3 := (nota1_aluno3 + nota2_aluno3) / 2

// Cálculo da média da turma
media_turma := (media_aluno1 + media_aluno2 + media_aluno3) / 3

// Identificação do melhor aluno
melhor_aluno := numero_matricula1

se media_aluno2 > media_aluno1 entao
  melhor_aluno := numero_matricula2
fim_se

se media_aluno3 > media_aluno2 entao
  melhor_aluno := numero_matricula3
fim_se

// Apresentação dos resultados
escreva("A média da turma é: ", media_turma)
escreva("O número de matrícula do melhor aluno é: ", melhor_aluno)