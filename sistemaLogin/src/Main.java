//void main() {
//    Usuario usuario = new Usuario("paulo","1234",LocalDate.of(1999,7,19),"paulo@senaisp.edu.br");
//
//
//    usuario.email="paulinhochamazé@senai.br";
//    IO.println(usuario);
//}

//void main() {
//    Usuario usuario = new Usuario("nicolas","0405", "nicolas@gmail.com" );
//    usuario.nome ="nicolas";
//    usuario.senha="0405";
//    usuario.email="nicolas@gmail.com";
//
//}

void main(){
    Livro livro = new Livro("Churches of Paris", "Peggy Shannon", "Acc boooks", Float.valueOf(450.0f), "https://m.media-amazon.com/images/I/81132IpcQtL._AC_UF1000,1000_QL80_.jpg");
    Usuario usuario = new Usuario("nicolas","0405", "nicolas@gmail.com" );
    IO.println(usuario);
    IO.println(livro);
}