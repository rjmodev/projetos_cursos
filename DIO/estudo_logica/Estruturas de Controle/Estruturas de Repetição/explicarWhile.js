//COMENTAR PARA DESATIVAR OS EXEMPLOS
// WHILE

let i = 0
while(i < 3){
    console.log("olá")
    //não esquecer de incrementar pois se torna um loop infinito sem incremento
    i++
} 

//Exemplo WHILE

let jogadas = 0;
let cara = false;

while(!cara) {
  jogadas++;
  cara = Math.random() < 0.5;
}

console.log(`A moeda caiu cara após ${jogadas} jogadas!`);
