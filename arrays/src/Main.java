import static java.lang.IO.*;
void main() {
    String[] teste; //usando apenas add e tamanho especifico
    List<String> nomes = new ArrayList<>(); //dinamico, pode criar com infinitos elementos e remover tambem
    Set<String> setes = new HashSet<>(); //lista com valores que nao vao se repetir
    Map<String, Integer> maps = new HashMap<>();//chave e valor

    maps.put("Fiama", 2);
    maps.put("Vitor", 3);
    maps.put("Nicolas", 5);
    maps.put("Nicolas", 6); //altera o primeiro igual

    println(maps);

//    for(String s : maps){
//        println(s);
//    }
}
