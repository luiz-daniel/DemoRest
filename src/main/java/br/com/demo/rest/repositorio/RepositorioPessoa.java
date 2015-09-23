package br.com.demo.rest.repositorio;

import java.util.List;
import java.util.ArrayList;

import br.com.demo.rest.model.Pessoa;

public class RepositorioPessoa {
  
  List<Pessoa> listaPessoas = new ArrayList<>();

  public RepositorioPessoa() {
    
    listaPessoas.add(new Pessoa("Alexandre", 28));
    listaPessoas.add(new Pessoa("Daniel", 28));
    listaPessoas.add(new Pessoa("Gabriel", 22));
    listaPessoas.add(new Pessoa("Renato", 39));
    
  }

  public Pessoa getPessoaPorNome(String nome) {
    
    for (Pessoa p : listaPessoas) {
      if(p.getNome().equalsIgnoreCase(nome)) return p;
    }
    
    return new Pessoa(null,null);
  }

  public List<Pessoa> getTodasPessoas() {
    return listaPessoas;
  }
  
}
