public abstract class Pessoa {
    //atributos
    protected String nome;
    protected int idade;
    protected String sexo;
    protected int experiecnia;

    //método
    public abstract void ganharExp();

    //métodos acessores

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getExperiecnia() {
        return experiecnia;
    }

    public void setExperiecnia(int experiecnia) {
        this.experiecnia = experiecnia;
    }
}
