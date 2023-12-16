programa
{
	
	funcao inicio()
	{
		escreva("qual o nome do funcionário ? \n")
		cadeia nome
		leia(nome)
		escreva("qual o seu salário fixo ? \n")
		real salf
		leia(salf)
		escreva("qual o total de vendas (em dinherio) ? \n")
		real venda
		leia(venda)
		real sal
		sal = salf + (venda/100)*15
		escreva(nome," possui o salário ",salf," e o seu salário no final do mês é ",sal)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 176; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */