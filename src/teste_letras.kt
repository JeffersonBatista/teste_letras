fun main(){
    val entrada = readLine()!!;
    val listpalavras = entrada.split(" ");//Transforma a frase em um array de palavras
    for(i in listpalavras){
        val listletras = i.toList();//Transforma cada palavra em um array de letras
        val result = listletras.distinct();//Elimina letras duplicadas
        print("$result");
        //print("$result");//oo ratoato roeuoeu aa roupaoupa dodo reiei dee romaoma -> o rato roeu a roupa do rei de roma
    }

}