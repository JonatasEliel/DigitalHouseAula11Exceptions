package digitalhouse.exceptions

class ComboSimples(nome: String, preco: Double) : Produto(nome, preco) {
    var precoPromocional: Double = preco * 0.9
    override fun getPreco(): Double { return precoPromocional }
}