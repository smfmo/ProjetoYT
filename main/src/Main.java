public class Main {
    public static void main(String[] args) {
        Video[] v = new Video[3];
        v[0] = new Video("Aula 01 de POO");
        v[1] = new Video("Aula 02 de SpringBoot");
        v[2] = new Video("Aula de Java ");

        User[] u = new User[3];

        u[0] = new User(
                "Samuel Monteiro",
                20, "Masc",
                1, "sam");

        u[1] = new User("Maria Clara",
                18, "Fem",
                2, "Clarinha");

        Visualizacao[] view = new Visualizacao[5];

        view[0] = new Visualizacao(u[0], v[0]); // Samuel assiste aula de POO
        view[0].avaliar();
        System.out.println(view[0].toString());

        view[1] = new Visualizacao(u[0], v[1]); //Samuel assiste aula de Springboot
        view[1].avaliar(87.0);
        System.out.println(view[0].toString());



        /*System.out.println("===============VÍDEOS================ \n");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());

        System.out.println("===============ESPECS=============== \n");
        System.out.println(u[0].toString());
        System.out.println(u[1].toString());*/
    }
}