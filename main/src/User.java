public class User extends Pessoa{
    private String login;
    private int totAssistidos;

    public User(String nome, int idade, String sexo, int experiencia, String login) {
        super(nome, idade, sexo, experiencia);
        this.login = login;
        this.totAssistidos = 0;
    }

    //método
    public void viuMaisUm(){
        this.setTotAssistidos(getTotAssistidos() + 1);
    }

    //sobrescrevendo o método da mother class
    @Override
    public void ganharExp() {

    }

    //métodos acessores
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistidos() {
        return totAssistidos;
    }

    public void setTotAssistidos(int totAssistidos) {
        this.totAssistidos = totAssistidos;
    }

    @Override
    public String toString() {
        return "User{\n " +
                " login='" + login + '\'' +
                "\n totAssistidos=" + totAssistidos +
                "\n nome='" + nome + '\'' +
                "\n idade=" + idade +
                "\n sexo='" + sexo + '\'' +
                "\n experiencia=" + experiencia +
                '}';
    }
}
