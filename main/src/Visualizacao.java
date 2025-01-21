public class Visualizacao {
    //atributos de relacionamento entre classe
    private User espectador;
    private Video filme;

    //construtor
    public Visualizacao(User espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistidos(this.espectador.getTotAssistidos() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    //metodos de sobrecarga
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota){
        System.out.println("=====NOTA DO VIDEO=====");
        this.filme.setAvaliacao(nota);

    }

    public void avaliar(double porc){
        int tot = 0;

        System.out.println("=====porcentagem de avaliação do vídeo====");
        if (porc <= 20) {
            tot = 3;
        } else if (porc <= 50) {
            tot = 5;
        } else if (porc <= 90) {
            tot = 8;
        }else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }

    //metodos acessores
    public User getEspectador() {
        return espectador;
    }

    public void setEspectador(User espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{\n" +
                "espectador=" + espectador +
                "\n filme=" + filme +
                '}';
    }
}
