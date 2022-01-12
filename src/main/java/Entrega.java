import lombok.Getter;
import lombok.Setter;

@Getter
//CLASSE QUE DEFINE OS ATRIBUTOS DAS ENTREGAS. GETTER = para poder buscar as informações. Setter = para poder escrever uma informação
public class Entrega {
    @Setter
    private String nomeDaEmpresa;
    @Setter
    private Integer quantidade;

    private double valor;


    public void setValor() {
        this.valor = quantidade * 4.50;
    }

}
