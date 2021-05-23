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
		
	Cenário: Deve incrementar contador
		Dado que o valor do contador é 123
		Quando eu incrementar em 35
		Então o valor do contador sera 158
		
	Cenário: Deve calcular atraso na entrega
		Dado que a entrega é dia 05/04/2018
		Quando a entrega atrasar em 2 dias
		Então a entrega será efetuada em 07/04/2018
		
	Cenário: Deve calcular atraso na entrega da china
		Dado que a entrega é dia 05/04/2018
		Quando a entrega atrasar em 2 meses
		Então a entrega será efetuada em 05/06/2018