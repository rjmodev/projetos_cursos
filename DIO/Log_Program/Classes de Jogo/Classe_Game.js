class Hero {
    constructor(name, age, type){
        this.name = name;
        this.age = age;
        this.type = type;
    }
    atack(){
        let atacker;
        if(this.type === "mago"){
            atacker = "usa magia";
        } else if (this.type === "guerreiro"){
            atacker = "usa espada";
        } else if (this.type === "monge"){
            atacker = "usa artes marciais"
        } else if (this.type === "ninja"){
            atacker = "usa shuriken"
        } else {
            atacker = "usa ataque"
        }

        console.log(`O ${this.type} ${this.name} tem ${this.age} anos. Ele ataca e ${atacker}.`);
    }
}
const heroA = new Hero("Merlin", 1000, "mago");
const heroB = new Hero("Lancelot", 43, "guerreiro");
const heroC = new Hero("Benkei", 65, "monge");
const heroD = new Hero("Rikimaru", 50, "ninja");

heroA.atack()
heroB.atack()
heroC.atack()
heroD.atack()
