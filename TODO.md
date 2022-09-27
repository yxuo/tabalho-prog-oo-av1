
- [x] 1. Cada classe do Diagrama de Classe, deverá possuir os atributos e métodos 
implementados conforme o princípio do Encapsulamento, bem como, novos atributos 
deverão ser inseridos para refletir suas associações; 

- [x] 2. Implemente dois métodos construtores sobrecarregados, métodos get/set e toString 
em cada Classe; 

- [x] 3. Na classe Produto implemente os métodos adicionaQtdestoque(...) e diminuiQtdestoque(...), com os devidos parâmetro(s), para que aumentem ou diminuam as quantidade em estoque, conforme sejam criados ou excluídos Itens de Pedidos com esses Produtos; 
> Pela lógica, você adiciona e remove item atraés do Pedido e não do Item.  
> Daí fica a pergunta: você vai adicionar um item diretamente no pedido? Pela lógica Orientada a Objetos, não.  
> Então você vai adicionar um item no pedido através do produto.
> O pedido terá um método para adicionar ou remover item, que atualizará o estoque do produto.

- [x] 4. Na classe Pedido implemente o atributo private ArrayList<Item> listaitem, sem itens quando o Pedido for instanciado;

- [x] 5. Implemente uma enumeração, que reflita a situação do Pedido: ANALISE, REPROVADO, APROVADO, ATENDIDO; 

- [x] 6. Toda vez que um Pedido for instanciado, seu valor deverá ser zero (0.0). Conforme sejam criados objetos da classe Item, para esse Pedido, o valor do Pedido deverá ser somado com a quantidade multiplicado pelo preço do Produto; 

- [x] 7. Implemente a classe ClienteEspecial, filha da classe Cliente, com atributo area; 

- [ ] 8. Implemente a classe Programa, tal que:

  - [x] a. Implemente dois objetos da classe Cliente, com dados inseridos pelo teclado (usar objeto da classe Scanner). Imprima esses objetos no console; 

  - [x] b. Implemente três objetos da classe Produto, com dados inseridos pelo teclado e imprima esses objetos no console; 
  
  - [x] c. Implemente dois objetos da classe Pedido, com dados inseridos pelo teclado, associados a cada cliente criado anteriormente, com a situação de ANALISE. Imprima esses objetos no console; 

  - [ ] d. Implemente dois objetos da classe Item para cada objeto Pedido, criado anteriormente (atenção para alterar o valor do pedido). Quando o primeiro item for associado ao pedido, a situação do pedido deverá ser alterada de ANALISE para APROVADO. Quando o segundo item for associado ao pedido, a situação do pedido deverá ser alterada de APROVADO para ATENDIDO, pois não será mais associado item ao pedido. Todo item associado ao pedido deverá ser adicionado à lista de itens do pedido, o qual foi criado inicialmente vazio. Através do laço for mostre esses objetos adicionados à lista.
      - [ ] 2 itens para cada 1 pedido  
      - [ ] Botar 1o item, muda status de ANALISE para APROVADO  
      - [ ] Botar 2o item, muda status de APROVADO para ATENDIDO
      - [ ] Para cada item adicionado, atualiza a lista de itens  