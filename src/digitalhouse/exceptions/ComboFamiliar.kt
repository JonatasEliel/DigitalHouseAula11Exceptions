package digitalhouse.exceptions

class ComboFamiliar(preco: Double, nome: String, val combos: MutableList<ComboSimples>) : Produto(nome = nome, preco = preco)