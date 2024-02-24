enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }
data class Usuario(val nome: String, val idade: Int)
data class Matricula(val usuario: Usuario, val formacao: Formacao, val nivel: Nivel)
data class Formacao(var formacao: String,var conteudo: List<String>, val duracao: Int, val tempo: String)

  

    
fun Matriculados(inscritos: List<Usuario>, matriculados: List<Matricula>) {
        
    println("Total de inscritos: "+inscritos.size)
    var indice=0
    println("Lista de Matriculados: ")
     for(alunos in matriculados){
          println("Nome:"+alunos.usuario.nome+" Idade:"+alunos.usuario.idade)  
    }
   
}

fun main() {
    val usuarios = mutableListOf<Usuario>()
    val matriculados=mutableListOf<Matricula>()
    
    val conteudoEducacional=mutableListOf("P.O.O.", "Funções","Coleções","Estruturas de Repetição")
    val formacao=Formacao("Kotlin Web", conteudoEducacional, 30,"dias")

    usuarios+=Usuario("JP",21)
    usuarios+=Usuario("PC",22)
   
    for(users in usuarios){
  
        matriculados+=Matricula(users,formacao,Nivel.BASICO)
        
    }
    
  Matriculados(usuarios,matriculados)    
    
    
}
