public class User extends Pessoa{
    private int login;
    private int totAssistidos;

    //método
    public void viuMaisUm(){

    }

    //sobrescrevendo o método da mother class
    @Override
    public void ganharExp() {

    }

    //métodos acessores
    public int getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
    }

    public int getTotAssistidos() {
        return totAssistidos;
    }

    public void setTotAssistidos(int totAssistidos) {
        this.totAssistidos = totAssistidos;
    }
}
