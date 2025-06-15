public class A3Retorno {
    private double valor;
    private String tipo;
    private String data;
    private int cpfCliente;
    private int cpfGolpista2;
    
    public A3Retorno( double valor, String tipo, String data, int cpfCliente, int cpfGolpista2) {
        this.valor = valor;
        this.tipo = tipo;
        this.data = data;
        this.cpfCliente = cpfCliente;
        this.cpfGolpista2 = cpfGolpista2;
}
public double getValor() {
    return valor;
}            
public void setValor(double valor) {
    this.valor = valor;
}
public String getTipo() {
    return tipo;
}
public void setTipo(String tipo) {
    this.tipo = tipo;
}
public String getData() {
    return data;
}
public void setData(String data) {
    this.data = data;
}
public int getCpfCliente() {
    return cpfCliente;
}
public void setCpfCliente(int cpfCliente) {
    this.cpfCliente = cpfCliente;
}
public int getCpfGolpista2() {
    return cpfGolpista2;
}
}
