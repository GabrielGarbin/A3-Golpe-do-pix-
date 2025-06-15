public class A3clientes {
    private String nome1;
    private String nome2;
    private String nome3;
    private int cpf1;
    private int cpf2;
    private int cpf3;


    public A3clientes(String nome1, int cpf1, String nome2, int cpf2 , String nome3, int cpf3) {
        this.nome1 = nome1;
        this.cpf1 = cpf1;
        this.nome2 = nome2;
        this.cpf2 = cpf2;
        this.nome3 = nome3;
        this.cpf3 = cpf3;
    }

    public String getNome1() {
        return nome1;
    }

    public int getCpf1() {
        return cpf1;
    }

    public String getNome2() {
        return nome2;
    }

    public int getCpf2() {
        return cpf2;
    }

    public String getNome3() {
        return nome3;
    }

    public int getCpf3() {
        return cpf3;
    }
    
}
