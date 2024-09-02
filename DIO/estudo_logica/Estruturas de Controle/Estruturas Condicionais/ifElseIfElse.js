//COMENTAR PARA DESATIVAR OS EXEMPLOS
//Exemplo de IF
let ehLigado = false

if(ehLigado !== true){
    console.log("Está Desligado")
}
/*
//Exemplo de IF
let possuiOvos = false
let itensComprados = ""

if(possuiOvos !== true){
    itensComprados = "Leite"
}

    console.log("Item comprado: " + itensComprados)
*/
//Exemplo de IF/Else
let possuiOvos = true
let itensComprados = ""

if(possuiOvos !== false){
    itensComprados = "Leite"
}
else{
    console.log("Passou na seção de congelados")
    itensComprados = "Lasanha congelada"
}

    console.log("Item comprado: " + itensComprados)

//Exemplo de IF/ElseIf/Else
let nivelDeFome = 5

if(nivelDeFome === 0){
    console.log("Você está sem fome")
}else if(nivelDeFome === 1){
    console.log("Pouca fome")
}else if(nivelDeFome === 2){
    console.log("Muita fome")
}else{
    console.log("Você comeria mais que o pica pau")
}

