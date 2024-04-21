package Helpy;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias das classes
        Cliente cliente = new Cliente();
        Veiculo veiculo = new Veiculo();
        Seguro seguro = new Seguro();

        // Definindo alguns dados de exemplo para teste
        cliente.nome = "John Doe";
        veiculo.modelo = new ModeloCarro();
        veiculo.modelo.nomeModelo = "Sedan";
        veiculo.ano = 2022;
        seguro.Cliente = cliente;
        seguro.veiculo = veiculo;
        seguro.tipoCobertura = "Comprehensive";
        seguro.custo = 1200.0;

        // Imprimindo informações
        System.out.println("Cliente: " + cliente.nome);
        System.out.println("Veículo: " + veiculo.modelo.nomeModelo + " " + veiculo.ano);
        System.out.println("Tipo de Cobertura: " + seguro.tipoCobertura);
        System.out.println("Custo do Seguro: $" + seguro.custo);
    }
}
