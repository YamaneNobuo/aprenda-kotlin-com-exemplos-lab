// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario (val nome: String)

class ConteudoEducacional<E>(vararg items: E) {              // 1

  private val elements = items.toMutableList()

  fun push(element: E) = elements.add(element)        // 2

  fun peek(): E = elements.last()                     // 3

  fun pop(): E = elements.removeAt(elements.size - 1)

  fun isEmpty() = elements.isEmpty()

  fun size() = elements.size

  override fun toString() = "ConteudoEducacional(${elements.joinToString()})"
}

data class Formacao(val nome: String, val duracao: Int, var conteudos: String) {
    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario): String {
        println (usuario)
        println (inscritos)
        return ("Matricula para usuario $usuario efetuada.")
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    val usuario = Usuario("BONGO")
    println(usuario.nome)
    
    val tipoConteudo: Int = 3  // informar qual o conteúdo da formação
    println(tipoConteudo)
    
    val conteudoEducacional = ConteudoEducacional("Classes CSS", "HTML")
    if (tipoConteudo == 1) {
       conteudoEducacional.push("Java")
    }
    if (tipoConteudo == 2) {
       conteudoEducacional.push(".Net")
    }
    if (tipoConteudo == 3) {
       conteudoEducacional.push("kotlin")
    }
       
    println(conteudoEducacional)
    
    val conteudo = conteudoEducacional
    println(conteudo)
    
}
