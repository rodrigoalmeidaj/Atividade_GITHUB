public class App {
    public static void main(String[] args) throws Exception {

        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome =  "Zeus";
        cachorro1.raca =  "Labrador";
        cachorro1.cor =  "Preto";
        cachorro1.adulto = false;
        
        Cachorro cachorro2 = new Cachorro();
        cachorro2.nome =  "Odin";
        cachorro2.raca =  "Bull Terrier";
        cachorro2.cor =  "Preto";
        cachorro2.adulto = false;

        System.out.println("--- Meus dogs ---");
        System.out.println("Nome: "+cachorro1.nome);
        System.out.println("Raça: "+cachorro1.raca);
        System.out.println("Cor: "+cachorro1.cor);
        System.out.println("Adulto: "+cachorro1.adulto);

        cachorro1.latir();

        System.out.println("-----------------");
        System.out.println("Nome: "+cachorro2.nome);
        System.out.println("Raça: "+cachorro2.raca);
        System.out.println("Cor: "+cachorro2.cor);
        System.out.println("Adulto: "+cachorro2.adulto);

        cachorro1.comer();

        Gato gato1 = new Gato();
        gato1.nome = "Meggie";
        gato1.raca = "Vira-lata";
        gato1.cor = "Tricolor";
        gato1.adulto = true;

        System.out.println("------------------");
        System.out.println("--- Minha Gata ---");
        System.out.println("Nome: "+gato1.nome);
        System.out.println("Raça: "+gato1.raca);
        System.out.println("Cor: "+gato1.cor);
        System.out.println("Adulto: "+gato1.adulto);

        gato1.miar();
        gato1.brincar();
    }

}
