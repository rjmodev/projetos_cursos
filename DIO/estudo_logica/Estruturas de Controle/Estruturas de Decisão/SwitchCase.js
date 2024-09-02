// estrutura de decisão
// switch/case/break/default
let fruta = "mamão"

switch (fruta){
    case "laranja" :
    console.log("Suco de Laranja")
    console.log("Tem promoção com salgado!!")
    break

    case "banana":
    case "morango":
    case "mamão":
    console.log("Vitamina de frutas")
    console.log("Vitamina de " + fruta)
    break

    case "maça" :
    console.log("Suco de maça")
    break

    default:
    console.log("Suco genérico")
}