package decorator;

//Decorador para empréstimo
public class EmprestimoDecorator extends ItemDecorator {
 private boolean emprestado;

 public EmprestimoDecorator(BibliotecaItem item) {
     super(item);
     this.emprestado = false;
 }

 public String emprestar() {
     if (!emprestado) {
         emprestado = true;
         return "Item emprestado com sucesso.";
     }
     return "Item já está emprestado.";
 }

 public String devolver() {
     if (emprestado) {
         emprestado = false;
         return "Item devolvido com sucesso.";
     }
     return "Item não está emprestado.";
 }

 @Override
 public String descricao() {
     String status = emprestado ? "Emprestado" : "Disponível";
     return super.descricao() + " (" + status + ")";
 }
}
