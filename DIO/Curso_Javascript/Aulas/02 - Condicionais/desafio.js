const precoEtanol = 3.19;
const precoGasolina = 5.30;
const tipoCombustivel = 'Etanol';
const kmPorLitro = 10;
const distanciaViagem = 650;

const quantidadeCombustivel = distanciaViagem / kmPorLitro;

if (tipoCombustivel === "gasolina") {
    let valorTotal = quantidadeCombustivel * precoGasolina;
    console.log(valorTotal.toFixed(2))
} else {
    let valorTotal = quantidadeCombustivel * precoEtanol;
    console.log(valorTotal.toFixed(2))
}
//let quantidadeCombustivel = distanciaViagem / kmPorLitro;
//let valorTotal = quantidadeCombustivel * precoGasolina;
//console.log(valorTotal.toFixed(2))