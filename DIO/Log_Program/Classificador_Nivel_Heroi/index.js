// Reginaldo J.M. de Oliveira 

let heroDbz = ["João", "Mr. Satan" , "kuririn" , "Piccolo", "Gohan", "Vegeta", 
              "Goku", "Bills" , "Whis" , "Zeno"] 
let xpHero = [-1, 500, 1877, 3650, 6600, 7580, 7988, 8888, 9790, 9999999];
let statusHero = [""]; 

for (let i = 0; i < heroDbz.length; i++) {
  let hero = heroDbz[i];
  let xp = xpHero[i];
  let status = statusHero[i];

  switch (true) {
    case xp >= 0 && xp <= 1000:
      status = "Ferro";
      break;

    case xp >= 1001 && xp <= 2000:
      status = "Bronze";
      break;

    case xp >= 2001 && xp <= 5000:
      status = "Prata";
      break;

    case xp >= 5001 && xp <= 7000:
      status = "Ouro";
      break;

    case xp >= 7001 && xp <= 8000:
      status = "Platina";
      break;

    case xp >= 8001 && xp <= 9000:
      status = "Ascendente";
      break;

    case xp >= 9001 && xp <= 10000:
      status = "Imortal";
      break;

    case xp >= 10001:
      status = "Radiante";
      break;

    default:
      status = "Sem ki suficiente";
      console.log(`O Herói ${hero} ainda é aprendiz.`);
  }
  console.log(`O Herói ${hero} está com status ${status}.`);
}