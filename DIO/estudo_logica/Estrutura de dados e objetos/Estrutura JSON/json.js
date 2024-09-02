//JSON - JavaScript Object Notation
//Chave e valor com o objetivo de transferir dados

let invoice = {
    name: "Reginaldo",
    age: 37,
    products: {
        0: ["mouse 2xwm", 29.9], 
        1: ["teclado mecânico", 129.99], 
        2: ["monitor", 899.99],
        3: ["TV 100 polegadas", 10000.65], 
    },
    taxes: 98.90
}

generateInvoice(invoice)

function generateInvoice(invoice){
    console.log(`O comprador é  ${invoice.name}`)
    console.log(`A idade é  ${invoice.age}`)
    console.log("_________________________")

    for(let i in invoice.products){
        let [productName, productPrice] = invoice.products[i]
        console.log(`- ${productName}: R$ ${productPrice}`)
    }

    //console.log(`Os produtos são ${invoice.products[1]}`)
}
