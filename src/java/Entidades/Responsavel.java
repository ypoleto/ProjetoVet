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
@Table(name = "responsavel")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Responsavel.findAll", query = "SELECT r FROM Responsavel r"),
    @NamedQuery(name = "Responsavel.findByNome", query = "SELECT r FROM Responsavel r WHERE r.nome = :nome"),
    @NamedQuery(name = "Responsavel.findByEmail", query = "SELECT r FROM Responsavel r WHERE r.email = :email"),
    @NamedQuery(name = "Responsavel.findByTelefone", query = "SELECT r FROM Responsavel r WHERE r.telefone = :telefone"),
    @NamedQuery(name = "Responsavel.findByUsuario", query = "SELECT r FROM Responsavel r WHERE r.usuario = :usuario"),
    @NamedQuery(name = "Responsavel.findBySenha", query = "SELECT r FROM Responsavel r WHERE r.senha = :senha"),
    @NamedQuery(name = "Responsavel.findByIdResponsavel", query = "SELECT r FROM Responsavel r WHERE r.idResponsavel = :idResponsavel")})
public class Responsavel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "nome")
    private String nome;
    @Column(name = "email")
    private String email;
    @Column(name = "telefone")
    private String telefone;
    @Basic(optional = false)
    @Column(name = "usuario")
    private String usuario;
    @Basic(optional = false)
    @Column(name = "senha")
    private String senha;
    @Id
    @Basic(optional = false)
    @Column(name = "idResponsavel")
    private Integer idResponsavel;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "responsavel")
    private List<Animal> animalList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "responsavel")
    private List<Consulta> consultaList;

    public Responsavel() {
    }

    public Responsavel(Integer idResponsavel) {
        this.idResponsavel = idResponsavel;
    }

    public Responsavel(Integer idResponsavel, String usuario, String senha) {
        this.idResponsavel = idResponsavel;
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getIdResponsavel() {
        return idResponsavel;
    }

    public void setIdResponsavel(Integer idResponsavel) {
        this.idResponsavel = idResponsavel;
    }

    @XmlTransient
    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
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
        hash += (idResponsavel != null ? idResponsavel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Responsavel)) {
            return false;
        }
        Responsavel other = (Responsavel) object;
        if ((this.idResponsavel == null && other.idResponsavel != null) || (this.idResponsavel != null && !this.idResponsavel.equals(other.idResponsavel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Responsavel[ idResponsavel=" + idResponsavel + " ]";
    }

}
