public class IndustriaConsube extends IndustriaMateriaPrima {
    public IndustriaConsube(String uf, String descricao) {

        this.uf = uf;
        this.descricao = descricao;
        System.out.println("Pedido de" + descricao +
                " cadastrado na Industria Consube\nRegião de entrega:" +
                uf + "\n");
    }
}
