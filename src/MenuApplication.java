public class MenuApplication {


    public static void main(String[] args) {

        System.out.println("Menu de profissões --------------");
        mostrarEhfProfissional();
        mostrarJgmaProfissional();
        System.out.println("--------------");
    }

    public static void mostrarEhfProfissional() {
        EhfProfissional ehfProfissional = new EhfProfissional();
        System.out.println(ehfProfissional.seuNome());
        System.out.println(ehfProfissional.suaAreaAtuacao());
    }
        public static void mostrarJgmaProfissional() {
            JgmaProfissional JgmaProfissional = new JgmaProfissional();
            System.out.println(JgmaProfissional.seuNome());
            System.out.println(JgmaProfissional.suaAreaAtuacao());

    }
     public abstract class Profissional {
        public abstract String seuNome();
        public abstract String suaAreaAtuacao();

        public String getInfoCompleta() {
            return seuNome() + " | Área: " + suaAreaAtuacao();
    }
}