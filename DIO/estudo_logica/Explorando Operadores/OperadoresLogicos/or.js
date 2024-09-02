// OR ( || ) - nosso boneco só pode sair se tiver sem chuva OU com guarda-chuva
let tempo = "chuva"
let item = "Bicicleta"
let podeSair = (tempo !== "chuva") || (item === "guarda chuva")
// Condição IF
if(podeSair){
    podeSair = "Sim, está em condições adequadas para sair!"
}
else{
    podeSair = "Não está em condições adequadas para sair"
}
console.log("Nosso personagem pode sair ? " + podeSair) 

