programa
{
	inclua biblioteca Util --> u
	
	funcao inicio() {
		inteiro numeros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6}
		
		Ordenar(numeros)
		Tarefas()
	}


	funcao Ordenar(inteiro vetor[]) {
		inteiro tamanho = u.numero_elementos(vetor)

		Mostrar(vetor, tamanho, "Números da entrada:")

		para (inteiro i = 0; i < tamanho - 1; i++) {
			inteiro mIndex = i
			
			para (inteiro j = i + 1; j < tamanho; j++) {
				se (vetor[j] < vetor[mIndex]) {
					mIndex = j
				}
			}
			
			inteiro temporario = vetor[i]
			vetor[i] = vetor[mIndex]
			vetor[mIndex] = temporario
		}

		Mostrar(vetor, tamanho, "\nNúmeros ordenados:")
	}


	funcao Tarefas() {
		const inteiro tamanho = 10
		inteiro entrada
		inteiro somaNum = 0
		inteiro media = 0
		inteiro vetor[tamanho]
		
		escreva("\n\nDigite uma sequência de 10 números inteiros\n\n")

		para (inteiro i = 0; i < tamanho; i++) {
			escreva("Número ", i+1, ": ")
			leia(entrada)
			vetor[i] = entrada
		}
		
		MostrarImpares(vetor, tamanho, "\nElementos nos índices ímpares:")
		MostrarPares(vetor, tamanho, "\nElementos pares no vetor:")
		SomarNumeros(vetor, tamanho, somaNum, "\nSoma: ")
		CalcularMedia(vetor, tamanho, somaNum, "\nMédia: ")
	}


	funcao Mostrar(inteiro vetor[], inteiro tamanho, cadeia frase) {
		escreva(frase)
		
		para (inteiro x = 0; x < tamanho; x++) {
			escreva(" ", vetor[x])
		}
	}

	funcao MostrarImpares(inteiro vetor[], inteiro tamanho, cadeia frase) {
		escreva(frase)
		
		para (inteiro x = 0; x < tamanho; x++) {
			se (x%2 != 0){
				escreva(" ", vetor[x])
			}
		}
	}

	funcao MostrarPares(inteiro vetor[], inteiro tamanho, cadeia frase) {
		escreva(frase)
		
		para (inteiro x = 0; x < tamanho; x++) {
			se (vetor[x]%2 == 0){
				escreva(" ", vetor[x])
			}
		}
	}

	funcao SomarNumeros(inteiro vetor[], inteiro tamanho, inteiro soma, cadeia frase) {
		para (inteiro x = 0; x < tamanho; x++) {
			soma += vetor[x]
		}
		
		escreva(frase, soma)
	}

	funcao CalcularMedia(inteiro vetor[], inteiro tamanho, inteiro soma, cadeia frase) {
		para (inteiro x = 0; x < tamanho; x++) {
			soma += vetor[x]
		}

		soma = soma/tamanho
		
		escreva(frase, soma, "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 990; 
 * @DOBRAMENTO-CODIGO = [57, 65, 75, 85, 93];
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */