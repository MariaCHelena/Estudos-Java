# Collection Framework API
- Uma coleção (colection) é uma estrutura de dados que serve para agrupar muitos elementos em uma única unidade. Estes elementos precisam ser *Objetos*.
  Não aceita tipos primitivos, diferentemente de um Array, aceita **somente objetos**.
- Uma Collection pode ter coleções homogêneas (de mesmo tipo) ou heterogêneas (de tipos diferentes), normalmente utilizamos coleções homogêneas de um tipo específico.
- O núcleo principal das coleções é formada pelas interfaces da figura abaixo, essas interfaces permitem manipular a coleção independente do nível de detalhe que elas representam.
- Temos quatro grandes tipos de coleções: *list* (lista), *Set* (conjunto), *Queue* (fila) e *Map* (mapa), a partir dessas interfaces temos muitas subclasses concretas, que implementam várias formas diferentes de se trabalhar com cada coleção.

<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRNqeT8gU0UkWoY0gDLICNq-2cdfIToCzdaRo-pio3Q&s" width=50% align="center"/>

- Todas as intrefaces e classes são encontradas dentro do pacote (package) *java.util*.
- Embora a interface *Map* não seja filha direta da interface *Collection* ela também é considerada uma coleção devido a sua função.