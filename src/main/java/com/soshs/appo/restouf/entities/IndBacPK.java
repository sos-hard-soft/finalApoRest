/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soshs.appo.restouf.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author master05
 */
@Embeddable
public class IndBacPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_IND")
    private int codInd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "COD_BAC")
    private String codBac;

    public IndBacPK() {
    }

    public IndBacPK(int codInd, String codBac) {
        this.codInd = codInd;
        this.codBac = codBac;
    }

    public int getCodInd() {
        return codInd;
    }

    public void setCodInd(int codInd) {
        this.codInd = codInd;
    }

    public String getCodBac() {
        return codBac;
    }

    public void setCodBac(String codBac) {
        this.codBac = codBac;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codInd;
        hash += (codBac != null ? codBac.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IndBacPK)) {
            return false;
        }
        IndBacPK other = (IndBacPK) object;
        if (this.codInd != other.codInd) {
            return false;
        }
        if ((this.codBac == null && other.codBac != null) || (this.codBac != null && !this.codBac.equals(other.codBac))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.appo.restouf.entities.IndBacPK[ codInd=" + codInd + ", codBac=" + codBac + " ]";
    }
    
}
