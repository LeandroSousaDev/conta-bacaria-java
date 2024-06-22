
public class DadosCliente {
    private Integer numero;
    private String agencia;
    private String nomeCliente;
    private Double saldo;

    public DadosCliente(Integer numero, String agencia, String nomeClinete, Double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeClinete;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {

        return "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.";
    }
}