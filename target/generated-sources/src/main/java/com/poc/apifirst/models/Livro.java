package com.poc.apifirst.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Esse é o modelo de dados de um livro
 */
@ApiModel(description = "Esse é o modelo de dados de um livro")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-12T13:54:00.294216-03:00[America/Bahia]")
public class Livro   {
  @JsonProperty("nome")
  private String nome = null;

  @JsonProperty("author")
  private String author = null;

  public Livro nome(String nome) {
    this.nome = nome;
    return this;
  }

  /**
   * Nome do Livro
   * @return nome
  **/
  @ApiModelProperty(value = "Nome do Livro")
  
    public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Livro author(String author) {
    this.author = author;
    return this;
  }

  /**
   * Nome do Autor
   * @return author
  **/
  @ApiModelProperty(value = "Nome do Autor")
  
    public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Livro livro = (Livro) o;
    return Objects.equals(this.nome, livro.nome) &&
        Objects.equals(this.author, livro.author);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, author);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Livro {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
