/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Yasmin
 */
@Entity
@Table(name = "consulta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Consulta.findAll", query = "SELECT c FROM Consulta c"),
    @NamedQuery(name = "Consulta.findByIdConsulta", query = "SELECT c FROM Consulta c WHERE c.consultaPK.idConsulta = :idConsulta"),
    @NamedQuery(name = "Consulta.findByData", query = "SELECT c FROM Consulta c WHERE c.data = :data"),
    @NamedQuery(name = "Consulta.findByHora", query = "SELECT c FROM Consulta c WHERE c.hora = :hora"),
    @NamedQuery(name = "Consulta.findByDescricao", query = "SELECT c FROM Consulta c WHERE c.descricao = :descricao"),
    @NamedQuery(name = "Consulta.findByResponsavelidResponsavel", query = "SELECT c FROM Consulta c WHERE c.consultaPK.responsavelidResponsavel = :responsavelidResponsavel"),
    @NamedQuery(name = "Consulta.findByAnimalidAnimal", query = "SELECT c FROM Consulta c WHERE c.consultaPK.animalidAnimal = :animalidAnimal")})
public class Consulta implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ConsultaPK consultaPK;
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Column(name = "hora")
    @Temporal(TemporalType.TIME)
    private Date hora;
    @Column(name = "descricao")
    private String descricao;
    @JoinTable(name = "medico_has_consulta", joinColumns = {
        @JoinColumn(name = "consulta_id_consulta", referencedColumnName = "id_consulta"),
        @JoinColumn(name = "consulta_responsavel_idResponsavel", referencedColumnName = "responsavel_idResponsavel"),
        @JoinColumn(name = "consulta_animal_idAnimal", referencedColumnName = "animal_idAnimal")}, inverseJoinColumns = {
        @JoinColumn(name = "medico_id_medico", referencedColumnName = "id_medico")})
    @ManyToMany
    private List<Medico> medicoList;
    @JoinColumn(name = "animal_idAnimal", referencedColumnName = "idAnimal", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Animal animal;
    @JoinColumn(name = "responsavel_idResponsavel", referencedColumnName = "idResponsavel", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Responsavel responsavel;

    public Consulta() {
    }

    public Consulta(ConsultaPK consultaPK) {
        this.consultaPK = consultaPK;
    }

    public Consulta(int idConsulta, int responsavelidResponsavel, int animalidAnimal) {
        this.consultaPK = new ConsultaPK(idConsulta, responsavelidResponsavel, animalidAnimal);
    }

    public ConsultaPK getConsultaPK() {
        return consultaPK;
    }

    public void setConsultaPK(ConsultaPK consultaPK) {
        this.consultaPK = consultaPK;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @XmlTransient
    public List<Medico> getMedicoList() {
        return medicoList;
    }

    public void setMedicoList(List<Medico> medicoList) {
        this.medicoList = medicoList;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (consultaPK != null ? consultaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consulta)) {
            return false;
        }
        Consulta other = (Consulta) object;
        if ((this.consultaPK == null && other.consultaPK != null) || (this.consultaPK != null && !this.consultaPK.equals(other.consultaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Consulta[ consultaPK=" + consultaPK + " ]";
    }

}
