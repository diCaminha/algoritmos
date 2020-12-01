# Insertion Sort

## É a ordenação que muitas pessoas relacionam com a ordenação que custumamos fazer no baralho:
### A lógica desse algorítmo é irmos ordenando carta por cara, da esquerda para direita, comparando a carta da vez com as demais cartas a sua esquerda. Equanto encontramos cartas a esquerda que são maiores que o valor da carta da vez, a gente faz a troca: a carta da vez vai caminha pra esquerda e a carta maior passa pra posição anterior da carta da vez.

### O passo a passo seria mais ou menos o abaixo:
- recebemos um conjunto de cartas, por exemplo: c5 c2 c1 c7 c4
- a carta da vez no caso começaria sendo a 2, que fica na posição 2 da sequência. (não começamos com a c5 porque ela é a primeira e não teria nenhuma carta a esquerda para comparar).
- comparamos a carta c2 com a carta mais prox a esquerda, que no caso é a carta c5. Como c2 é menor que c5, então faremos a troca: c2 c5 c1 c7 c4
- como não há mais carta a esquerda para comparar com a carta da vez (c2), então paramos o loop e vamos para a próxima posição a ser iniciado o processo e achamremos a carta a ser tida como a carta da vez: posição 3 que no caso é a carta c1 (que fica na posição 3 da sequência).
- trocamos c1 com c5: c2 c1 c5 c7 c4
- trocamos c1 com c2: c1 c2 c5 c7 c4
- próxima posição: 4, que encontra-se a carta c7.
- na primiera comparação já vimos que c7 não é menor que a carta a esquerda mais próxima (c5). Então já paramos as comparações da carta c7 por aqui. Ela não irá a lugar nenhum.
- passamos para a próxima posição: 5, que encontra-se a carta c4.
- trocamos c4 com c7: c1 c2 c5 c4 c7
- trocamos c4 com c5: c1 c2 c4 c5 c7
- como c4 não é menor que c2, então paramos as comparações da carta c4, e essa será sua posição final.
- Nesse momento já temos as cartas todas ordenadas corretamente.
