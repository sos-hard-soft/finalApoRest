/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soshs.appo.restouf.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author master05
 */
@Entity
@Table(name = "IND_BAC")
@NamedQueries({
    @NamedQuery(name = "IndBac.findAll", query = "SELECT i FROM IndBac i"),
    @NamedQuery(name = "IndBac.findByCodInd", query = "SELECT i FROM IndBac i WHERE i.indBacPK.codInd = :codInd"),
    @NamedQuery(name = "IndBac.findByCodBac", query = "SELECT i FROM IndBac i WHERE i.indBacPK.codBac = :codBac"),
    @NamedQuery(name = "IndBac.findByDaaObtBacIba", query = "SELECT i FROM IndBac i WHERE i.daaObtBacIba = :daaObtBacIba"),
    @NamedQuery(name = "IndBac.findByTemInsAdm", query = "SELECT i FROM IndBac i WHERE i.temInsAdm = :temInsAdm")})
public class IndBac implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected IndBacPK indBacPK;
    @Size(max = 4)
    @Column(name = "DAA_OBT_BAC_IBA")
    private String daaObtBacIba;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_INS_ADM")
    private String temInsAdm;
    @JoinColumn(name = "COD_IND", referencedColumnName = "COD_IND", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Individu individu;

    public IndBac() {
    }

    public IndBac(IndBacPK indBacPK) {
        this.indBacPK = indBacPK;
    }

    public IndBac(IndBacPK indBacPK, String temInsAdm) {
        this.indBacPK = indBacPK;
        this.temInsAdm = temInsAdm;
    }

    public IndBac(int codInd, String codBac) {
        this.indBacPK = new IndBacPK(codInd, codBac);
    }

    public IndBacPK getIndBacPK() {
        return indBacPK;
    }

    public void setIndBacPK(IndBacPK indBacPK) {
        this.indBacPK = indBacPK;
    }

    public String getDaaObtBacIba() {
        return daaObtBacIba;
    }

    public void setDaaObtBacIba(String daaObtBacIba) {
        this.daaObtBacIba = daaObtBacIba;
    }

    public String getTemInsAdm() {
        return temInsAdm;
    }

    public void setTemInsAdm(String temInsAdm) {
        this.temInsAdm = temInsAdm;
    }

    public Individu getIndividu() {
        return individu;
    }

    public void setIndividu(Individu individu) {
        this.individu = individu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (indBacPK != null ? indBacPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IndBac)) {
            return false;
        }
        IndBac other = (IndBac) object;
        if ((this.indBacPK == null && other.indBacPK != null) || (this.indBacPK != null && !this.indBacPK.equals(other.indBacPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.appo.restouf.entities.IndBac[ indBacPK=" + indBacPK + " ]";
    }
    
}
