package br.com.realstate.domain;

import br.com.realstate.domain.commons.DomainModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo", length = 1, discriminatorType = DiscriminatorType.STRING)
public class Pessoa extends DomainModel<Pessoa> {

    @Column(insertable=false, updatable=false)
    private String tipo;
    @NotBlank(message = "Nome é obrigatório.")
    private String nome;
    private String telFixo;
    private String email;
    private String telCel;
    @NotBlank(message = "Cidade é obrigatório.")
    private String cidade;
    @NotBlank(message = "Logradouro é obrigatório.")
    private String logradouro;
    @NotBlank(message = "Bairro é obrigatório.")
    private String bairro;
    @NotBlank(message = "Cep é obrigatório.")
    private String cep;
    @NotBlank(message = "Número é obrigatório.")
    private String numero;
    @SuppressWarnings("unused")
    private String complemento;
    @NotBlank(message = "Uf é obrigatório.")
    private String uf;
    @JsonIgnore
    @NotBlank(message = "User é obrigatório.")
    private String user;
}
