package digitalhouse.exceptions

class Carrinho {
    val produtos = mutableListOf<Produto>()

    fun adicionar(vararg produto: Produto) = produtos.addAll(produto)

    fun getValorTotal(): Float = produtos.sumByDouble { it.preco }.toFloat()
}