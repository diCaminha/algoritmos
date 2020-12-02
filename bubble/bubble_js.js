const { performance } = require("perf_hooks");

var cartas = [
  50,
  49,
  48,
  47,
  46,
  45,
  44,
  43,
  42,
  42,
  41,
  40,
  39,
  38,
  37,
  36,
  35,
  34,
  33,
  32,
  31,
  30,
  29,
  28,
  27,
  26,
  25,
  24,
  23,
  22,
  21,
  20,
  19,
  18,
  17,
  16,
  15,
  14,
  13,
  12,
  11,
  10,
  9,
  8,
  7,
  6,
  5,
  4,
  3,
  2,
  1,
];
let comparacoes = 0;
let trocas = 0;

const start = performance.now();
sort(cartas);
const end = performance.now();
console.log(`time: ${end - start} miliseconds`);

function sort(cartas) {
  for (let k = 0; k < cartas.length; k++) {
    for (let i = k + 1; i < cartas.length; i++) {
      if (cartas[k] > cartas[i]) {
        let aux = cartas[k];
        cartas[k] = cartas[i];
        cartas[i] = aux;
      }
    }
  }
}
