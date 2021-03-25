package br.com.realstate.domain;

import br.com.realstate.domain.commons.DomainModel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "cidade")
public class Cidade extends DomainModel<Cidade> {

    @Column(nullable = false)
    private String cidade;

    @Column(nullable = false)
    private String uf;
}
