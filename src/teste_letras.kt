fun main(){
    val entrada = readLine()!!;
    val listpalavras = entrada.split(" ");//Transforma a frase em um array de palavras
    var resultado = "";
    var palavra = "";
    for(i in listpalavras){
        var listletras = i.toList();//Transforma cada palavra em um array de letras
        var result = listletras.distinct();//Elimina letras duplicadas
        for (i in listpalavras){//Para cada índice de palavra
            resultado = palavra;
            for (i in result){
                val palavra = i;
            }
        }
        print(resultado);
        //print("$result");//oo ratoato roeuoeu aa roupaoupa dodo reiei dee romaoma -> o rato roeu a roupa do rei de roma
    }
}