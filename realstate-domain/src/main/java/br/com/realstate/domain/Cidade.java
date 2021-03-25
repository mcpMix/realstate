package br.com.realstate.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cidade")
public class Cidade extends DomainModel<Cidade>{

    @Column(nullable = false)
    private String cidade;

    @Column(nullable = false)
    private String uf;

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
