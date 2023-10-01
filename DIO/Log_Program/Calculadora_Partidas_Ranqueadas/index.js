
// Array de jogadores e nomes de heróis
const jogadores = [
  { vitorias: 65, derrotas: 25 },
  { vitorias: 10, derrotas: 15 },
  { vitorias: 110, derrotas: 20 },
  { vitorias: 99, derrotas: 25 },
  { vitorias: 95, derrotas: 2 },
  { vitorias: 250, derrotas: 10 },
  { vitorias: 70, derrotas: 20 },
];

const nomeHeroi = ["Batman",  "Aquaman", "Hulk", "Thor",  
                    "Ironman",  "Superman",  "Flash"];

const resultados = calcularNiveisDeJogadores(jogadores, nomeHeroi);

// Função para calcular o nível com base nas vitórias e derrotas
function calcularNivelElo(vitorias, derrotas) {
    const saldoVitorias = vitorias - derrotas;
    let nivel = "";
  
    switch (true) {
      case saldoVitorias >= 0 && saldoVitorias < 10:
        nivel = "Ferro";
        break;
      case saldoVitorias >= 10 && saldoVitorias <= 20:
        nivel = "Bronze";
        break;
      case saldoVitorias >= 21 && saldoVitorias <= 50:
        nivel = "Prata";
        break;
      case saldoVitorias >= 51 && saldoVitorias <= 80:
        nivel = "Ouro";
        break;
      case saldoVitorias >= 81 && saldoVitorias <= 90:
        nivel = "Diamante";
        break;
      case saldoVitorias >= 91 && saldoVitorias <= 100:
        nivel = "Lendário";
        break;
      case saldoVitorias >= 101 && saldoVitorias <= 1000:
        nivel = "Imortal";
        break;
      default:
        nivel = "Iniciante";
    }
  
    return nivel;
}
  
// Função para calcular o nível de vários jogadores
function calcularNiveisDeJogadores(jogadores, nomeHeroi) {
  const resultados = [];

  for (let i = 0; i < nomeHeroi.length; i++) {
    const jogador = jogadores[i];
    const hero = nomeHeroi[i];
    const nivel = calcularNivelElo(jogador.vitorias, jogador.derrotas);
    resultados.push(`O Herói ${hero} tem um saldo de ${jogador.vitorias - jogador.derrotas} e está no nível de ${nivel}`);
  }

  return resultados;
}

for (let i = 0; i < resultados.length; i++) {
    console.log(resultados[i]);
}
  
