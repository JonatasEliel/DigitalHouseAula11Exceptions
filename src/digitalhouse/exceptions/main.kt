package digitalhouse.exceptions

fun main() {
    val produto1 = Produto(4.0, "t1")
    val produto2 = Produto(5.0, "t2")
    val produtoComboSimples1 = ComboSimples(5.5, "c1")
    val produtoComboSimples2 = ComboSimples(10.0, "c2")
    val produtoComboFamiliar = ComboFamiliar(12.0, "F1", mutableListOf(produtoComboSimples1, produtoComboSimples2))

    val carrinho1 = Carrinho()
    val carrinho2 = Carrinho()
    carrinho1.adicionar(produto1, produto2, produtoComboSimples1, produtoComboSimples2)
    carrinho2.adicionar(produtoComboFamiliar)

    println("Carrinho 1: ${carrinho1.getValorTotal()}")
    carrinho1.produtos.forEach { println("  - $it") }
    println("Carrinho 2: ${carrinho2.getValorTotal()}")
    carrinho2.produtos.forEach { println("  - $it") }
}