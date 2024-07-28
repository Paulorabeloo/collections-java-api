## Collection Framework API

https://data-flair.training/blogs/collection-framework-in-java/

- Uma coleção (collection) é uma estrutura de dados que serve para agrupar muitos elementos em uma única unidade; estes elementos precisam ser objetos.
- Uma Collection pode ter coleções homogêneas e heterogêneas, normalmente utilizamos coleções homogêneas de um tipo específico.
- O núcleo principal das coleções é formado pelas interfaces da figura abaixo; essas interfaces permitem manipular a coleção independentemente do nível de detalhe que elas representam.
- Temos quatro grandes tipos de coleções: List (lista), Set (conjunto), Queue (fila) e Map (mapa). A partir dessas interfaces, temos muitas subclasses concretas que implementam várias formas diferentes de se trabalhar com cada coleção.

![image](https://github.com/user-attachments/assets/71f9faa1-c24c-4926-9dbb-aafbefce836e)

- Todas as interfaces e classes são encontradas dentro do pacote (package) java.util.
- Embora a interface Map não seja filha direta da interface Collection, ela também é considerada uma coleção devido à sua função.

![image](https://github.com/user-attachments/assets/c77a5f46-1841-43b2-b09c-294d7a004634)

## List Interface

![image](https://github.com/user-attachments/assets/a7881716-f07f-4ac4-9392-12e36d5cc748)

- A interface List é uma coleção ordenada que permite a inclusão de elementos duplicados.
= É um dos tipos de coleção mais utilizados em Java, e as classes de implementação comuns são ArrayList e LinkedList.
- A List se assemelha a uma matriz com comprimento dinâmico, permitindo adicionar ou remover elementos.
- A interface List fornece métodos úteis para adicionar elementos em posições específicas, remover ou substituir elementos com base no índice e obter sublistas usando índices.
- A classe Collections fornece algoritmos úteis para manipulação de List, como ordenação (sort), embaralhamento (shuffle), reversão (reverse) e busca binária (binarySearch).

#### ArrayList: O ArrayList é uma implementação da interface List que armazena os elementos em uma estrutura de array redimensionável. Isso significa que ele pode crescer automaticamente à medida que novos elementos são adicionados. A principal vantagem do ArrayList é o acesso rápido aos elementos por meio de índices, o que permite recuperar um elemento específico de forma eficiente. No entanto, adicionar ou remover elementos no meio da lista pode ser mais lento, pois requer a realocação de elementos.

#### LinkedList: O LinkedList é uma implementação da interface List que armazena os elementos em uma lista duplamente vinculada. Cada elemento contém referências para o elemento anterior e próximo na lista. A principal vantagem do LinkedList é a eficiência na adição ou remoção de elementos no início ou no final da lista, pois não é necessário realocar elementos. No entanto, o acesso aos elementos por meio de índices é mais lento, pois requer percorrer a lista até o elemento desejado.

#### Vector: O Vector é uma implementação antiga da interface List que é semelhante ao ArrayList, mas é sincronizada, ou seja, é thread-safe. Isso significa que várias threads podem manipular um objeto Vector ao mesmo tempo sem causar problemas de concorrência. No entanto, essa sincronização adiciona uma sobrecarga de desempenho, tornando o Vector menos eficiente do que o ArrayList em cenários em que a concorrência não é um problema. Por esse motivo, o uso do Vector é menos comum em aplicações modernas.

Exercícios:

1.Operações Básicas com List

2.Pesquisa em List

3.Ordenação nas List

## Set

![image](https://github.com/user-attachments/assets/934c7bcb-2151-4a62-ab57-17e33dd51dfb)

- A interface Set é uma coleção que não pode conter elementos duplicados.
- Essa interface representa o conceito matemático de um conjunto e é usada para representar conjuntos, como um baralho de cartas.
- A plataforma Java possui três implementações de Set de uso geral: HashSet, TreeSet e LinkedHashSet.
- A interface Set não permite acesso aleatório a um elemento na coleção.
- Para percorrer os elementos de um Set, você pode usar um iterador ou um loop foreach.

#### HashSet: O HashSet é uma implementação da interface Set que armazena os elementos em uma tabela hash. Ele não mantém uma ordem específica dos elementos. A principal vantagem do HashSet é que ele oferece um desempenho de busca muito eficiente, pois usa funções hash para indexar os elementos. No entanto, a ordem em que os elementos são adicionados pode não ser preservada ao percorrer o conjunto.

#### TreeSet: O TreeSet é uma implementação da interface Set que armazena os elementos em uma árvore binária balanceada. Isso significa que os elementos são armazenados em uma ordem classificada e são mantidos automaticamente em ordem crescente. A principal vantagem do TreeSet é que os elementos são sempre retornados na ordem classificada, o que facilita a obtenção de elementos em uma determinada ordem. No entanto, a busca e a inserção são um pouco mais lentas em comparação com o HashSet.

#### LinkedHashSet: O LinkedHashSet é uma implementação da interface Set que mantém a ordem de inserção dos elementos, além de usar uma tabela hash para obter um bom desempenho de busca. Ele é semelhante ao HashSet, mas também mantém uma lista duplamente vinculada que preserva a ordem de inserção. Isso permite que os elementos sejam percorridos na ordem em que foram adicionados. O LinkedHashSet é útil quando você precisa manter a ordem de inserção dos elementos e também ter um bom desempenho de busca.

Exercícios:

1.Operações Básicas com Set

2.Pesquisa em Set

3.Ordenação nas Set

## Map

![image](https://github.com/user-attachments/assets/abb7902e-bb38-4a70-89e6-d5ef941b9097)

- A interface Map é usada para mapear dados na forma de chaves e valores.
- O Map do Java é um objeto que mapeia chaves para valores.
- Um Map não pode conter chaves duplicadas: cada chave pode mapear no máximo um valor.
- A plataforma Java possui três implementações gerais de Map: HashMap, TreeMap e LinkedHashMap.
- As operações básicas do Map são: put (inserir ou atualizar), get (obter), containsKey (verificar se contém uma chave), containsValue (verificar se contém um valor), size (obter o tamanho) e isEmpty (verificar se está vazio).

#### HashTable é uma implementação antiga da interface Map no Java que é sincronizada e thread-safe, tornando-a adequada para uso em ambientes concorrentes. Ela não permite chaves ou valores nulos e os elementos não são mantidos em uma ordem específica.

#### LinkedHashMap, por outro lado, é uma implementação da interface Map que preserva a ordem de inserção dos elementos. Cada elemento possui referências ao próximo e ao anterior, formando uma lista encadeada. Isso permite que os elementos sejam iterados na ordem em que foram inseridos. Além disso, o LinkedHashMap também permite chaves ou valores nulos.

#### HashMap é uma implementação da interface Map que não mantém uma ordem específica dos elementos. Ele armazena os elementos internamente usando uma função de hash para melhorar a eficiência das operações de pesquisa e acesso. O HashMap também permite chaves ou valores nulos.

Exercícios:

1.Operações Básicas com Map

2.Pesquisa em Map

3.Ordenação nas Map

