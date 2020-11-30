var cartas = [3,4,1,2,7,5]
let comparacoes = 0;
let trocas = 0;

for (let k = 1; k < cartas.length; k++) {
    for (let i = k-1; i >= 0 ; i--) {
        comparacoes++;
        if (cartas[i] < cartas[i-1]) {
            console.log(cartas[i] + " <> " + cartas[i-1]);
            let aux = cartas[i-1];
            cartas[i-1] = cartas[i];
            cartas[i] = aux;
            
            trocas+=1;
        } else {
            break;
        }
    }
}

console.log("array ordenado: ");
console.log(cartas);
console.log("comparacoes: " + comparacoes);
console.log("trocas: " + trocas);