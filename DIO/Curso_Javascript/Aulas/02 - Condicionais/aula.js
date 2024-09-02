//Conceito Operadores Booleanos

const camisetaCaioPreto = true;
const camisetaVitoriaRoxo = false;

//Exemplo

const numero = 34;

const numeroPar = (numero % 2) === 0;

console.log(numeroPar)

//Condição IF

if(numeroPar){
    console.log(`Par`);
}

//Condição IF Com negação

if(!numeroPar){
    console.log(`Impar`);
}

//Condição IF / ELSE

if(numeroPar){
    console.log(`Par`);
}else{
    console.log(`Impar`);
}

//Outro Exemplo com ELSE IF

const verificarNumero = 60;

const numeroDivisivelPor5 = (verificarNumero % 5) === 0;

if(numero ===  0){
    console.log(`O número é invalido`);
} else if (numeroDivisivelPor5){
    console.log(`${verificarNumero} é divisivel por 5`);
} else {
    console.log(`${verificarNumero} não é divisivel por 5`);
}