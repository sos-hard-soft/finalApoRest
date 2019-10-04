/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soshs.appo.restouf.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author master05
 */
@Entity
@Table(name = "PHO_ETU")
@NamedQueries({
    @NamedQuery(name = "PhoEtu.findAll", query = "SELECT p FROM PhoEtu p"),
    @NamedQuery(name = "PhoEtu.findByCodInd", query = "SELECT p FROM PhoEtu p WHERE p.codInd = :codInd")})
public class PhoEtu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_IND")
    private Integer codInd;
    @Lob
    @Column(name = "PHO_ETU")
    private byte[] phoEtu;
    @JoinColumn(name = "COD_IND", referencedColumnName = "COD_IND", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Individu individu;

    public PhoEtu() {
    }

    public PhoEtu(Integer codInd) {
        this.codInd = codInd;
    }

    public Integer getCodInd() {
        return codInd;
    }

    public void setCodInd(Integer codInd) {
        this.codInd = codInd;
    }

    public byte[] getPhoEtu() {
        return phoEtu;
    }

    public void setPhoEtu(byte[] phoEtu) {
        this.phoEtu = phoEtu;
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
        hash += (codInd != null ? codInd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PhoEtu)) {
            return false;
        }
        PhoEtu other = (PhoEtu) object;
        if ((this.codInd == null && other.codInd != null) || (this.codInd != null && !this.codInd.equals(other.codInd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.appo.restouf.entities.PhoEtu[ codInd=" + codInd + " ]";
    }
    
}
