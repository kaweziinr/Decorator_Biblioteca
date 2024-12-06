package decorator;

//Implementação concreta de Romance
public class Romance implements BibliotecaItem {
 @Override
 public String descricao() {
     return "Romance";
 }
}
