// AND ( && )
let idade = 18
let vistoVerificado = true
let resultado = (idade >= 18) && (vistoVerificado === true)
console.log(resultado)

//outro exemplo - 100 moedas coletadas e 1 item estrela
// OPERADOR TERNARIO
let moedasColetadas = 100
let item = "estrela"
let jogoCompleto = (moedasColetadas >= 100) && (item === "estrela")
console.log(jogoCompleto === true ? 
    "A fase está completada? Sim"
 :  "A Fase está completada? Não")

