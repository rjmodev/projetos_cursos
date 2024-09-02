//guardar o valor em uma variável de resultado TRUE/FALSE
//SISTEMA DE VOO OPERADOR IGUAL PARA CONFIRMAR CADASTRO

let cpfBloqueado = "012.345.678-90"
let cpfUsuario = "123.456.789-01"
let ehCpfBloqueado = cpfUsuario === cpfBloqueado

console.log ("O usuario está barrado ? " + ehCpfBloqueado)

//guardar o valor em uma variável de resultado TRUE/FALSE
//SISTEMA DE VOO OPERADOR DIFERENTE PARA CONFIRMAR CADASTRO

let cpfPermitido = "123.456.789-01"
let cpfDoUsuario = "123.456.789-02"
let ehBloqueado = cpfDoUsuario !== cpfPermitido
console.log ("É um usuario invalido ? " + ehBloqueado)