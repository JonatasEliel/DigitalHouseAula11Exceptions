package digitalhouse.exceptions

open class Produto(open var preco: Double, var nome: String){
    override fun toString(): String {
        return "$nome = R$$preco"
    }
}