
package exercpoo6;

public class ExercPOO6 {

    public static void main(String[] args) {
      
               ContaEnergia conta = new ContaEnergia("João Silva", 12345, 350.0, 200.0);
        conta.setConsumoKwh(400.0);

        System.out.println("Nome do cliente: " + conta.getNomeCliente());
        System.out.println("Número da instalação: " + conta.getNumeroInstalacao());
        System.out.println("Consumo (kWh): " + conta.getConsumoKwh());
        System.out.println("Valor da conta: R$ " + conta.getValorConta());
        
    }
    
}
