package digitalhouse.exceptions

class ComboSimples(preco: Double, nome: String) : Produto(preco, nome) {
    var precoPromocional: Double = preco * 0.9
}