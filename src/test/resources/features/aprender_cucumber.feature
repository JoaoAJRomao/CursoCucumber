# language: pt
@unitário
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

  @Ciclo1
  Cenário: Deve calcular atraso na entrega
    Dado que a entrega é dia 05/04/2018
    Quando a entrega atrasar em 2 dias
    Então a entrega será efetuada em 07/04/2018

  @Ciclo2
  Cenário: Deve calcular atraso na entrega da china
    Dado que a entrega é dia 05/04/2018
    Quando a entrega atrasar em 2 meses
    Então a entrega será efetuada em 05/06/2018

  @Ciclo1 @Ciclo2
  Cenário: Deve criar steps genéricos para estes passos
    Dado que o ticket é AF345
    Dado que o valor da passagem é R$ 230,45
    E que o nome do passageiro é "Fulano da Silva"
    Mas que o telefone do passageiro é 9999-9999
    Quando criar os steps
    Então o teste vai funcionar

  Cenário: Deve reaproveitar os steps "Dado" do cenário anterior
    * que o ticket é AB167
    * que o ticket especial é AB167
    * que o valor da passagem é R$ 1120,23
    * que o nome do passageiro é "Cicrano de Oliveira"
    * que o telefone do passageiro é 9888-8888

  @Ignora
  Cenário: Deve negar todos os steps "Dado" dos cenários anteriores
    Dado que o ticket é CD123
    Dado que o ticket é AG1234
    Dado que o valor da passagem é R$ 1.1345,56
    Dado que o nome do passageiro é "Beltrano Souza Matos de Alcântara Azevedo"
    Dado que o telefone do passageiro é 1234-5678
    Dado que o telefone do passageiro é 999-2223
