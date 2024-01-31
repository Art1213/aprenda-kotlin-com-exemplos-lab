// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class ConteudoEducacional(var nome: String, val duracao: Int)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>)

class Usuario(var nome: String, val matricula: String, var formacao: Formacao, var conteudos: List<ConteudoEducacional>)

class Matricula {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(nome: String, matricula: String, formacao: Formacao, conteudos: List<ConteudoEducacional>): Usuario {
        val usuario = Usuario(nome, matricula, formacao, conteudos)
        inscritos.add(usuario)
        return usuario
    }
}

fun main() {
    val formacao = Formacao("Back-End", listOf(ConteudoEducacional("Python", 60), ConteudoEducacional("Java", 45)))
    val usuarioCadastrado = Matricula().matricular("Artur", "04112515", formacao, formacao.conteudos)

    println("${usuarioCadastrado.nome}, ${usuarioCadastrado.matricula}, ${usuarioCadastrado.formacao.nome}")

    usuarioCadastrado.conteudos.forEach {
        println("Conteúdo: ${it.nome}, ${it.duracao} horas")
    }
}
