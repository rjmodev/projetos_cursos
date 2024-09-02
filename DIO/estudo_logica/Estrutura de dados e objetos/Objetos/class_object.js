class formaDeBolo{
    //Função principal dentro de uma classe (principal metodo)
    constructor(saborDaMassa, saborRecheio){
        this.saborDaMassa = saborDaMassa
        this.saborRecheio = saborRecheio
    }
//Funções dispensa a palavra "function" dentro de class
    escrever(){
        console.log(`Um delicioso bolo de ${this.saborDaMassa} com recheio de ${this.saborRecheio}`)
    }
    assar(){
        console.log(`Bolo assando de ${this.saborDaMassa}`)
    }
}

//Instanciando Objetos
let boloFesta = new formaDeBolo("chocolate", "nutella")
let boloPremium = new formaDeBolo("baunilha", "coco")

//Chamando um objeto dentro de uma function
boloFesta.escrever()
boloPremium.escrever()
boloPremium.assar()

//console.log(boloFesta.saborDaMassa)