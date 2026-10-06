import static java.lang.IO.*;
import java.util.*;

void main() {
    Map<Integer, Pessoas> banco = new HashMap<>();
    List<Pessoas> cache = new ArrayList<>();

    banco.put(1, new Pessoas(1, "Carlos", 20));
    banco.put(2, new Pessoas(2, "Maria", 25));
    banco.put(3, new Pessoas(3, "Joao", 30));
    banco.put(4, new Pessoas(4, "Ana", 18));
    banco.put(5, new Pessoas(5, "Pedro", 40));
    banco.put(6, new Pessoas(6, "Joana", 40));
    banco.put(7, new Pessoas(7, "Jhonatan", 12));
    banco.put(8, new Pessoas(8, "Matheus", 42));
    banco.put(9, new Pessoas(9, "Pietro", 68));
    banco.put(10, new Pessoas(10, "Vitor", 99));


    cache.add(new Pessoas(1, "Carlos", 20));

    while (true) {
        int id = Integer.parseInt(readln("Digite o ID: "));
        if (id == 40) {
            break;
        }
        boolean idExiste = false;
        //   if (idExiste) {
        for (Pessoas p : cache) {
            if (p.getId() == id) {
                idExiste = true;
                println("Pessoa encontrada no cache: " + p);
                break;
            }
        }

        if (!idExiste) {
            Pessoas pessoaBanco = banco.get(id);

            if (pessoaBanco != null) {
                if (cache.size() == 10) {
                    cache.remove(0);
                }
                cache.add(pessoaBanco);
                println("Pessoa buscada no banco e adicionada ao cache: " + pessoaBanco);
            } else {
                println("Pessoa não encontrada no banco");
            }
        }
//   boolean idExiste = false;
//
//        for(Pessoas p : cache)
//            if (p.getId() == id) {
//                idExiste = true;
//                println("Ja existe alguem com esse ID");
//                break;
//            }
//
//    if (!idExiste){
//        String nome = readln("Digite o Nome: ");
//        int idade = Integer.parseInt(readln("Digite a Idade: "));
//
//        cache.add(new Pessoas(id, nome, idade));
//        println("Pessoa criada com sucesso!");
//    }
    }
    println("Banco: " + banco);
    println("Cache: " + cache);

}

//
//    println("Banco: " + banco);
//    println("Cache: " + cache);
//}
//
