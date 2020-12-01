const { performance } = require('perf_hooks');

var cartas = [15,76,78,28,47,71,69,37,81,10,66,91,32,64,34,41,54,51,50,18,3,29,5,2,17,59,82,77,62,100,74,57,11,7,21,70,80,68,35];
let comparacoes = 0;
let trocas = 0;

const start = performance.now();
insertion(cartas);
const end = performance.now();
console.log(`time: ${end-start} miliseconds`); 

function insertion(cartas) {
  for (let k = 1; k < cartas.length; k++) {
    for (let i = k - 1; i >= 0; i--) {
      comparacoes++;
      if (cartas[i] < cartas[i - 1]) {
        let aux = cartas[i - 1];
        cartas[i - 1] = cartas[i];
        cartas[i] = aux;

        trocas += 1;
      } else {
        break;
      }
    }
  }
}
