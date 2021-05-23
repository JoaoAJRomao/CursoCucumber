# language: pt
Funcionalidade: Aprendendo Cucumber
	
	
	Cenario: Deve executar especificação
		Dado que criei o arquivo corretamente
		Quando executa-lo
		Então a especificação deve finalizar com sucesso
		
	Cenário: Deve incrementar contador
		Dado que o valor do contador é 15
		Quando eu incrementar em 3
		Então o valor do contador sera 18