programa {
	inclua biblioteca Matematica --> mat 
	funcao inicio() {
		inteiro a,b,c
		 escreva("Operadores Aritméticos \n")
		 escreva("digite um número \n")
		 leia(a)
		 escreva("digite outro número \n")
		 leia(b)
		 escreva("digite um último valor \n")
		 leia(c)
		 escreva("\n", a ," + ", b , " = ", a + b)
		 escreva("\n", a ," - ", b , " = ", a - b)
		 escreva("\n", a ," * ", b , " = ", a * b)
		 escreva("\n", a ," / ", b , " = ", a / b)
		 escreva("\n", a ," ^ ", b , " = ", mat.potencia(a,b))
		 escreva("\n", a ," % ", b , " = ",  a % b, "\n")
		 escreva("Operadores Relacionais \n")
		 escreva(a , " = " , b ," " ,a==b,  "\n")
		 escreva(a , " > " , b , " " ,a>b,"\n")
		 escreva(a , " < " , b , " " ,a<b, "\n")
		 escreva(a , " <= " , b , " " ,a<=b, "\n")
		 escreva(a , " > " , b ," " ,a>b,"\n")
		 escreva(a , " >= " , b ," "  ,a>=b, "\n")
		 escreva(a , " =/= " , b ," " ,a!=b, "\n")
		 escreva("Operadores Lógicos \n")
		 escreva(a , " = " , b, " e b > c " , (a == b) e (b >c), " \n")
		 escreva(a , " =/= " , b, " ou b < c " , (a != b) ou (b < c), " \n")
		 escreva(a , " > " , b, " nao " , (nao( a > b)), "\n")
		 escreva(a , " < " , b, "ou b = c " , ((a >= b) ou (b == c)), " \n")
		 escreva(a , " >= " , b, " nao " ,(nao(a <= b))," \n") 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1261; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */