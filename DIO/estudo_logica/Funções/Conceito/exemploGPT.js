//COMENTAR PARA DESATIVAR OS EXEMPLOS
//Exemplo saudação
function saudacao() {
  console.log("Olá, mundo!");
}
saudacao();//Isso irá imprimir "Olá, mundo!" no console.
//-----------------------------------------------------------------------------
function saudacaoPersonalizada(nome) {
  console.log(`Olá, ${nome}!`);
}

saudacaoPersonalizada("João"); // Isso irá imprimir "Olá, João!" no console.
saudacaoPersonalizada("Maria"); // Isso irá imprimir "Olá, Maria!" no console.

//Exemplo área do retangulo
function calcularAreaRetangulo(largura, altura) {
    var area = largura * altura;
    return area;
  }
  
  // Chamando a função e armazenando o resultado em uma variável
  var larguraRetangulo = 5;
  var alturaRetangulo = 10;
  var areaDoRetangulo = calcularAreaRetangulo(larguraRetangulo, alturaRetangulo);
  
  // Exibindo o resultado
  console.log("A área do retângulo é: " + areaDoRetangulo);
  