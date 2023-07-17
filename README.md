# DESAFIO: Componentes e injeção de dependência

Você deve criar um sistema para calcular o valor total de um pedido, considerando uma porcentagem de desconto e o frete. O cálculo do valor total do pedido consiste em aplicar o desconto ao valor básico do pedido, e adicionar o valor do frete. A regra para cálculo do frete é a seguinte:

![image](https://github.com/Djalves424/ProjetoComponentes/assets/108296040/707f633c-6eb9-45cd-af67-9d762175604a)

Sua solução deverá seguir as seguintes especificações:

################################################################################################

Um pedido deve ser representado por um objeto conforme projeto abaixo:

![image](https://github.com/Djalves424/ProjetoComponentes/assets/108296040/b160a8bb-d03a-4081-a012-6955658e3bf0)

A lógica do cálculo do valor total do pedido deve ser implementada por componentes (serviços), cada um com sua responsabilidade, conforme projeto abaixo:

![image](https://github.com/Djalves424/ProjetoComponentes/assets/108296040/8fb422ff-f84b-447d-8dea-66d470bf1094)

Serviço OrderService: responsável por operações referentes a pedidos. Serviço ShippingService: responsável por operações referentes a frete.

Sua solução deverá ser implementada em Java com Spring Boot. A saída deverá ser mostrada no log do terminal da aplicação. Cada serviço deve ser implementado como um componente registrado com @Service.



