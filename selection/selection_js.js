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
selection(cartas);
const end = performance.now();
console.log(`time: ${end - start} miliseconds`);

function selection(cartas) {
  for (let i = 0; i < cartas.length; i++) {
    let posMenor = -99;
    let menor = cartas[i];
    for (let aux = i + 1; aux < cartas.length; aux++) {
      if (cartas[aux] < menor) {
        menor = cartas[aux];
        posMenor = aux;
      }
    }
    if (posMenor > 0) {
      let aux = cartas[i];
      cartas[i] = menor;
      cartas[posMenor] = aux;
    }
  }
}
