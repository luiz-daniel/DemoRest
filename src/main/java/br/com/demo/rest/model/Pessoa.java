package br.com.demo.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Pessoa {
  
  private String nome;
  private Integer idade;
 
  public Pessoa(String nome, Integer idade) {
    super();
    this.nome = nome;
    this.idade = idade;
  }
  public String getNome() {
    return nome;
  }
  public Integer getIdade() {
    return idade;
  }

}
