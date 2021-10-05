/*  Programa: Removedor de duplicata
    Autor: Jefferson Batista
    Versão: 1.0
    Conclusão: 05/10/2021
    Breve descrição:
        Este programa tem como objetivo analisar uma frase
        a fim de remover letras duplicadas de cada palavra.
 */

fun main(){
    val entrada = readLine()!!;
    val listpalavras = entrada.split(" ");//Transforma a frase em um array de palavras
    var retorno = "";
    for(i in listpalavras){
        val listletras = i.toList();//Transforma cada palavra em um array de letras
        val result = listletras.distinct(); //Elimina letras duplicadas
        var palavra = result.joinToString("");//Transforma o array em uma String
        palavra += " ";//Atribui cada palavra separada por espaço
        retorno += palavra;
    }
    retorno = retorno.trim() + ".";//Formata a string removendo espaços desnecessários
    print(retorno)
}
