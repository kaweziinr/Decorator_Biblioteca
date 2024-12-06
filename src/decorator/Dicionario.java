package decorator;

//Implementação concreta de Dicionário
public class Dicionario implements BibliotecaItem {
 @Override
 public String descricao() {
     return "Dicionário";
 }
}
