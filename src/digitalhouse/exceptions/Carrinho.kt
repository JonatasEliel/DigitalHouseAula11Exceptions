package digitalhouse.exceptions

class Carrinho {
    val produtos = mutableListOf<Produto>()

    fun adicionar(vararg produto: Produto) = produtos.addAll(produto)

    fun getValorTotal(): Float = produtos.sumByDouble {
        if (it is ComboSimples)
            it.precoPromocional
        else
            it.preco
    }.toFloat()
}