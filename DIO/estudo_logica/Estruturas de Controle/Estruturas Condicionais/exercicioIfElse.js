//Exemplo 1 IF/Else
let idade = 18
let vistoVerificado = true
if((idade >= 18) && (vistoVerificado === true)){
    resultado = "Está habilitado para viagens"
}
else{
    resultado = "Não atende os requisitos para viagens"
}
console.log(resultado)

//Exemplo 2 IF/Else
let tempo = "chuva"
let item = "bicicleta"
if((tempo !== "chuva") || (item === "guarda chuva")){
    podeSair = "Sim, está em condições adequadas para sair!"
}
else{
    podeSair = "Não está em condições adequadas para sair"
}
console.log("Nosso personagem pode sair ? " + podeSair) 