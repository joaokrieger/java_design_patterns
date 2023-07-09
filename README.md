# Padrões de Projeto
Este projeto implementa uma série de padrões de projeto em Java. Cada padrão de projeto é aplicado a um contexto específico e fornece soluções comprovadas para problemas recorrentes de design de software. Os padrões de projeto implementados neste projeto são:

- **Singleton:** Este padrão garante que uma classe tenha apenas uma instância e fornece um ponto de acesso global para essa instância.

- **MVC (Model-View-Controller):** O padrão MVC separa a lógica de negócios (modelo), a apresentação (visualização) e a interação do usuário (controlador), permitindo uma melhor organização e manutenção do código.

- **Observer:** O padrão Observer define uma relação um-para-muitos entre objetos, de modo que quando um objeto muda de estado, todos os seus observadores são notificados e atualizados automaticamente.

- **Prototype:** O padrão Prototype permite criar novos objetos por meio da clonagem de um objeto existente, evitando assim a criação direta de objetos e melhorando o desempenho.

- **Factory Method:** O padrão Factory Method fornece uma interface para criar objetos, mas permite que as subclasses decidam quais classes concretas instanciar.

- **Template Method:** O padrão Template Method define o esqueleto de um algoritmo em uma classe base e permite que as subclasses substituam etapas específicas desse algoritmo sem alterar sua estrutura geral.

- **Command:** O padrão Command encapsula uma solicitação como um objeto, permitindo que você parametrize clientes com diferentes solicitações, faça fila ou registre solicitações e suporte operações desfazer.

- **Builder:** O padrão Builder fornece uma maneira de construir objetos complexos passo a passo, permitindo que você crie diferentes representações do mesmo objeto.

- **State:** O padrão State permite que um objeto altere seu comportamento quando seu estado interno muda, encapsulando cada estado em uma classe separada e permitindo que o objeto mude de estado dinamicamente.

- **Visitor:** O padrão Visitor permite adicionar novas operações a uma hierarquia de classes sem modificar essas classes, separando as operações em classes visitantes.

- **Composite:** O padrão Composite agrupa objetos em uma estrutura de árvore, permitindo que os clientes tratem objetos individuais e composições de objetos de maneira uniforme.

- **Decorator:** O padrão Decorator adiciona responsabilidades adicionais a um objeto de forma dinâmica, fornecendo uma alternativa flexível à criação de subclasses para estender funcionalidades.

#Estrutura do Projeto
O projeto está organizado em pacotes, cada um correspondendo a um padrão de projeto específico. Cada pacote contém as classes e interfaces relacionadas à implementação desse padrão de projeto.

Os pacotes disponíveis são:

- singleton: Implementação do padrão Singleton.
- mvc: Implementação do padrão MVC.
- observer: Implementação do padrão Observer.
- prototype: Implementação do padrão Prototype.
- factorymethod: Implementação do padrão Factory Method.
- templatemethod: Implementação do padrão Template Method.
- command: Implementação do padrão Command.
- builder: Implementação do padrão Builder.
- state: Implementação do padrão State.
- visitor: Implementação do padrão Visitor.
- composite: Implementação do padrão Composite.
- decorator: Implementação do padrão Decorator.

# Como Executar
- Clone este repositório.
- Abra o projeto em sua IDE preferida.
- Navegue até a classe principal relacionada ao padrão de projeto que deseja executar.
- Execute a classe principal para ver a demonstração do padrão de projeto em ação.
- Sinta-se à vontade para explorar o código-fonte em cada pacote e estudar as implementações detalhadamente.

Espero que este projeto seja útil para entender e aplicar os padrões de projeto mencionados. Fique à vontade para contribuir, fornecer feedback ou fazer melhorias adicionais. Divirta-se explorando os padrões de projeto!
