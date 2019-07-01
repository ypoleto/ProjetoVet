/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Yasmin
 */
@Embeddable
public class ConsultaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "id_consulta")
    private int idConsulta;
    @Basic(optional = false)
    @Column(name = "responsavel_idResponsavel")
    private int responsavelidResponsavel;
    @Basic(optional = false)
    @Column(name = "animal_idAnimal")
    private int animalidAnimal;

    public ConsultaPK() {
    }

    public ConsultaPK(int idConsulta, int responsavelidResponsavel, int animalidAnimal) {
        this.idConsulta = idConsulta;
        this.responsavelidResponsavel = responsavelidResponsavel;
        this.animalidAnimal = animalidAnimal;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public int getResponsavelidResponsavel() {
        return responsavelidResponsavel;
    }

    public void setResponsavelidResponsavel(int responsavelidResponsavel) {
        this.responsavelidResponsavel = responsavelidResponsavel;
    }

    public int getAnimalidAnimal() {
        return animalidAnimal;
    }

    public void setAnimalidAnimal(int animalidAnimal) {
        this.animalidAnimal = animalidAnimal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idConsulta;
        hash += (int) responsavelidResponsavel;
        hash += (int) animalidAnimal;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConsultaPK)) {
            return false;
        }
        ConsultaPK other = (ConsultaPK) object;
        if (this.idConsulta != other.idConsulta) {
            return false;
        }
        if (this.responsavelidResponsavel != other.responsavelidResponsavel) {
            return false;
        }
        if (this.animalidAnimal != other.animalidAnimal) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.ConsultaPK[ idConsulta=" + idConsulta + ", responsavelidResponsavel=" + responsavelidResponsavel + ", animalidAnimal=" + animalidAnimal + " ]";
    }

}
