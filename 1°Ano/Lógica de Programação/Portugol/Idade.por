programa
{
	inclua biblioteca Calendario --> c
	
	inteiro dd = c.DIA_DOMINGO
	funcao inicio()
	{
		inteiro nasc
		inteiro ano = c.ano_atual()
		escreva("qual o ano de seu nascimento ? \n")
		leia(nasc)
		inteiro idade = ano-nasc
		escreva("A sua idade ",idade,"\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 268; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */