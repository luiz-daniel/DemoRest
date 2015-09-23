package br.com.demo.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.demo.rest.model.Pessoa;
import br.com.demo.rest.repositorio.RepositorioPessoa;

@Path("pessoa")
public class RSPessoa {


  @GET
  @Produces({MediaType.APPLICATION_JSON})
  public List<Pessoa> getTodasPessoas() {
    return new RepositorioPessoa().getTodasPessoas();
  }


  @GET
  @Path("{nome}")
  @Produces(MediaType.APPLICATION_JSON)
  public Pessoa getPessoaPorNome(@PathParam("nome")String nome) {
    return new RepositorioPessoa().getPessoaPorNome(nome);
  }


}
