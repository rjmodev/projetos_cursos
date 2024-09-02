//const nomeVisitante = ["João", "Ana", "Beatriz", "Camila", "Karla"]
const anoNascVisitante = ["1995", "2000", "1988","2005", "1993"]

calcularIdadeVisitantes(getNomeVisitantes(nomeVisitante),getNomeVisitantes(anoNascVisitante));

function calcularIdadeVisitantes(nome, anoNascimento) {
    let idade = 2023 - anoNascimento;
    console.log(nome + " tem " + idade + " anos!");
}
  
function getNomeVisitantes(nomeVisitante, anoNascVisitante){
    for (i = 0; i < nomeVisitante.length; i++) {
      const nomeIdade = []

      let visitante = nomeVisitante[i]
      let nascVisitante = anoNascVisitante[i]
      let idade = 2023 - nascVisitante;
      console.log(visitante + " tem " + idade + " anos!");

      return nomeIdade
    }
    
}  

  //calcularIdadeVisitantes(getNomeVisitantes(nomeVisitante), 2008); // Vai mostrar Pedrinho tem 13 anos!
  //calcularIdadeVisitantes("Mariana", 2008); // Vai mostrar Mariana tem 15 anos!
  
