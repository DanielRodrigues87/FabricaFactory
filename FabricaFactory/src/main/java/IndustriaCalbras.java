public class IndustriaCalbras extends IndustriaMateriaPrima {
    public IndustriaCalbras(String uf, String descricao) {
        this.uf = uf;
        this.descricao = descricao;
        System.out.println("Pedido de" + descricao +
                " cadastrado na Industria Calbras\nRegião de entrega:" +
                uf + "\n");
    }
}
