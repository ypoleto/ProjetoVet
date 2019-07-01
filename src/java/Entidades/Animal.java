/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Yasmin
 */
@Entity
@Table(name = "animal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Animal.findAll", query = "SELECT a FROM Animal a"),
    @NamedQuery(name = "Animal.findByIdAnimal", query = "SELECT a FROM Animal a WHERE a.idAnimal = :idAnimal"),
    @NamedQuery(name = "Animal.findByNomeAnimal", query = "SELECT a FROM Animal a WHERE a.nomeAnimal = :nomeAnimal"),
    @NamedQuery(name = "Animal.findByRacaAnimal", query = "SELECT a FROM Animal a WHERE a.racaAnimal = :racaAnimal"),
    @NamedQuery(name = "Animal.findByPorteAnimal", query = "SELECT a FROM Animal a WHERE a.porteAnimal = :porteAnimal"),
    @NamedQuery(name = "Animal.findByIdadeAnimal", query = "SELECT a FROM Animal a WHERE a.idadeAnimal = :idadeAnimal")})
public class Animal implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idAnimal")
    private Integer idAnimal;
    @Column(name = "nome_animal")
    private String nomeAnimal;
    @Column(name = "raca_animal")
    private String racaAnimal;
    @Column(name = "porte_animal")
    private String porteAnimal;
    @Column(name = "idade_animal")
    private Integer idadeAnimal;
    @JoinColumn(name = "responsavel", referencedColumnName = "idResponsavel")
    @ManyToOne(optional = false)
    private Responsavel responsavel;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "animal")
    private List<Consulta> consultaList;

    public Animal() {
    }

    public Animal(Integer idAnimal) {
        this.idAnimal = idAnimal;
    }

    public Integer getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Integer idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getRacaAnimal() {
        return racaAnimal;
    }

    public void setRacaAnimal(String racaAnimal) {
        this.racaAnimal = racaAnimal;
    }

    public String getPorteAnimal() {
        return porteAnimal;
    }

    public void setPorteAnimal(String porteAnimal) {
        this.porteAnimal = porteAnimal;
    }

    public Integer getIdadeAnimal() {
        return idadeAnimal;
    }

    public void setIdadeAnimal(Integer idadeAnimal) {
        this.idadeAnimal = idadeAnimal;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    @XmlTransient
    public List<Consulta> getConsultaList() {
        return consultaList;
    }

    public void setConsultaList(List<Consulta> consultaList) {
        this.consultaList = consultaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAnimal != null ? idAnimal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Animal)) {
            return false;
        }
        Animal other = (Animal) object;
        if ((this.idAnimal == null && other.idAnimal != null) || (this.idAnimal != null && !this.idAnimal.equals(other.idAnimal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Animal[ idAnimal=" + idAnimal + " ]";
    }

}
