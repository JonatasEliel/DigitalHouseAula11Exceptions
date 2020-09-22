package digitalhouse.exceptions

fun main() {
    val produto1 = Produto(4.0, "t1")
    val produto2 = Produto(5.0, "t2")
    val produtoComboSimples1 = ComboSimples(5.5, "c1")
    val produtoComboSimples2 = ComboSimples(10.0, "c2")

    val carrinho = Carrinho()
    carrinho.adicionar(produto1, produto2, produtoComboSimples1, produtoComboSimples2)

    println(carrinho.getValorTotal())
}