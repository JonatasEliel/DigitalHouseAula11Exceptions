package digitalhouse.exceptions

fun main() {
    val produto1 = Produto(4.0, "t1")
    val produto2 = Produto(5.0, "t2")

    val carrinho = Carrinho()
    carrinho.adicionar(produto1, produto2)

    println(carrinho.getValorTotal())
}