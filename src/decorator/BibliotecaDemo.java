package decorator;

//Classe principal para testar o sistema
public class BibliotecaDemo {
 public static void main(String[] args) {
     // Criar um romance
     BibliotecaItem romance = new Romance();
     System.out.println(romance.descricao()); // Romance

     // Adicionar funcionalidade de empréstimo
     BibliotecaItem romanceEmprestado = new EmprestimoDecorator(romance);
     System.out.println(romanceEmprestado.descricao()); // Romance (Disponível)

     if (romanceEmprestado instanceof EmprestimoDecorator) {
         System.out.println(((EmprestimoDecorator) romanceEmprestado).emprestar()); // Item emprestado com sucesso.
         System.out.println(romanceEmprestado.descricao()); // Romance (Emprestado)
     }

     // Adicionar funcionalidade de reserva
     BibliotecaItem romanceReservado = new ReservaDecorator(romanceEmprestado);
     System.out.println(romanceReservado.descricao()); // Romance (Emprestado) (Não reservado)

     if (romanceReservado instanceof ReservaDecorator) {
         System.out.println(((ReservaDecorator) romanceReservado).reservar()); // Item reservado com sucesso.
         System.out.println(romanceReservado.descricao()); // Romance (Emprestado) (Reservado)
     }
 }
}