package br.com.demo.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("mensagem")
public class RSMensagem {
  
  @GET
  public String getMensagem() {
    return "oi rest";
  }

}
