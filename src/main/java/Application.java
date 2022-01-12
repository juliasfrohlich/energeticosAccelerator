import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String [] args) {
        //Cria scanner para receber os dados de entrada
        Scanner sc = new Scanner(System.in);

        //Cria uma nova lista de entregas de mercadoria
        List<Entrega> listaDeEntregas =  new ArrayList<>();

        // Inicializa classe de entrega que tem como atrivuto o nome da empresa, a quantidade e o valor total;
        Entrega entrega1 = new Entrega();
        Entrega entrega2 = new Entrega();

        System.out.println("Insira o nome do estabelecimento 1: ");
        //Define o nome da empresa a partir do parametro de entrada
        entrega1.setNomeDaEmpresa(sc.nextLine());
        System.out.println("Insira a quantidade: ");
        //Define a quantidade de produto a partir do parametro de entrada
        entrega1.setQuantidade(sc.nextInt());
        // Adiciona a entrega 1 a lista de entregas
        listaDeEntregas.add(entrega1);

        // Avança linha para iniciar nova leitura
        sc.nextLine();

        //Define o nome da empresa a partir do parametro de entrada
        System.out.println("Insira o nome do estabelecimento 2: ");
        entrega2.setNomeDaEmpresa(sc.nextLine());
        System.out.println("Insira a quantidade: ");
        //Define a quantidade de produto a partir do parametro de entrada
        entrega2.setQuantidade(sc.nextInt());
// Adiciona a entrega 2 a lista de entregas
        listaDeEntregas.add(entrega2);

        // Percorre o ARRAY(lista) listaDeEntregas, para cada(FOR EACH) entrega ele seta o valor (metodo setValor na classe Entrega) e imprime os valores.
        listaDeEntregas.forEach(entrega -> {
            entrega.setValor();
            // Faz a soma dos valores totais, cada multiplicação é um imposto diferente
            double icms = entrega.getValor() * 0.18;
            double ipi = entrega.getValor() * 0.04;
            double pis = entrega.getValor() *  0.0186;
            double cofins = entrega.getValor() *  0.0854;
            double valorTotal = entrega.getValor()
                    +  icms + ipi + pis  + cofins;

            System.out.println("Cliente: " + entrega.getNomeDaEmpresa());
            System.out.println("ICMS: R$ " + icms
                    + "; IPI: R$ " + ipi
                    + "; PIS: R$ " + pis
                    + "; COFINS: R$ " + cofins
                    + "; Total: R$ " +  valorTotal);
        });

        double totalImpostosEntrega1 = entrega1.getValor() * 0.18 + entrega1.getValor() * 0.04 + entrega1.getValor() *  0.0186 + entrega1.getValor() *  0.0854;
        double totalImpostosEntrega2 = entrega2.getValor() * 0.18 + entrega2.getValor() * 0.04 + entrega2.getValor() *  0.0186 + entrega2.getValor() *  0.0854;
        // Faz o GET(busca) dos valores da primeira entrega e soma com os valores da segunda entrega
        double totalMercadorias = listaDeEntregas.get(0).getValor() + listaDeEntregas.get(1).getValor();
        double totalGeral = totalMercadorias + totalImpostosEntrega1 + totalImpostosEntrega2;

        System.out.println("Total Impostos: R$ " + (totalImpostosEntrega1 + totalImpostosEntrega2));
        System.out.println("Total Mercadorias: R$ " + totalMercadorias);
        System.out.println("Total Geral: R$ " + totalGeral);
    }


}
