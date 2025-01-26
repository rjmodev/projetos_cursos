package edu.java_fundamentals.learnig_sintax.methods;

public class Definition {
    public static void main(String[] args) {
        //int num1;
        //int num2;

    //Imprimindo um resultado usando outro método, dentro do método main
    int resultado = somar (10, 20);
    System.out.println ("Resultado da soma: " + resultado);
    }

    //Métodos devem ser nomeados como verbo e escrito de acordo com o padrão CamelCase
    //Métodos devem ser declarados diretamente dentro da classe e fora de outros métodos.

    //Exemplos
    public static int somar(int num1, int num2) {
        //Logica - Finalidade do metodo
        return num1 + num2;
    }



        String nomeTexto;
        public void imprimir (String nomeTexto) {
            //LOGICA - FINALIDADE DO MÉTODO
            //AQUI NÃO PRECISA DO RETURN POIS NÃO RETORNARÁ NENHUM RESULTADO
        }

        //throws Exception: indica que o method ao ser utilizado poderá gerar uma exceção
        public void dividir(int dividendo, int divisor) throws Exception {
        }

        //este método não pode ser visto por outras classes no projeto
        private void metodoPrivado() {
        }

        //Equívocos estruturais
        public void validar() {
            // Este método deveria retornar algum valor no caso boolean (true ou false)
        }
        public void calcularEnviar(){
            //um método deve representar uma única responsabilidade
        }

        public void gravarCliente (String name, String cpf, Integer telefone){
            /*este método tem a finalidade de gravar
              informações de um cliente, por que não criar
              um objeto cliente e passar como parâmetro ?
              veja abaixo
            */
        }

        public void gravarCliente ( Cliente nomeCliente) {
        }
        // ou
        public void gravar (Cliente nomeCliente) {}

    }
