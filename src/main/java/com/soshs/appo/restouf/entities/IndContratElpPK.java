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
public class IndContratElpPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "COD_ANU")
    private String codAnu;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_IND")
    private int codInd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "COD_ETP")
    private String codEtp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_VRS_VET")
    private short codVrsVet;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "COD_ELP")
    private String codElp;

    public IndContratElpPK() {
    }

    public IndContratElpPK(String codAnu, int codInd, String codEtp, short codVrsVet, String codElp) {
        this.codAnu = codAnu;
        this.codInd = codInd;
        this.codEtp = codEtp;
        this.codVrsVet = codVrsVet;
        this.codElp = codElp;
    }

    public String getCodAnu() {
        return codAnu;
    }

    public void setCodAnu(String codAnu) {
        this.codAnu = codAnu;
    }

    public int getCodInd() {
        return codInd;
    }

    public void setCodInd(int codInd) {
        this.codInd = codInd;
    }

    public String getCodEtp() {
        return codEtp;
    }

    public void setCodEtp(String codEtp) {
        this.codEtp = codEtp;
    }

    public short getCodVrsVet() {
        return codVrsVet;
    }

    public void setCodVrsVet(short codVrsVet) {
        this.codVrsVet = codVrsVet;
    }

    public String getCodElp() {
        return codElp;
    }

    public void setCodElp(String codElp) {
        this.codElp = codElp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codAnu != null ? codAnu.hashCode() : 0);
        hash += (int) codInd;
        hash += (codEtp != null ? codEtp.hashCode() : 0);
        hash += (int) codVrsVet;
        hash += (codElp != null ? codElp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IndContratElpPK)) {
            return false;
        }
        IndContratElpPK other = (IndContratElpPK) object;
        if ((this.codAnu == null && other.codAnu != null) || (this.codAnu != null && !this.codAnu.equals(other.codAnu))) {
            return false;
        }
        if (this.codInd != other.codInd) {
            return false;
        }
        if ((this.codEtp == null && other.codEtp != null) || (this.codEtp != null && !this.codEtp.equals(other.codEtp))) {
            return false;
        }
        if (this.codVrsVet != other.codVrsVet) {
            return false;
        }
        if ((this.codElp == null && other.codElp != null) || (this.codElp != null && !this.codElp.equals(other.codElp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.appo.restouf.entities.IndContratElpPK[ codAnu=" + codAnu + ", codInd=" + codInd + ", codEtp=" + codEtp + ", codVrsVet=" + codVrsVet + ", codElp=" + codElp + " ]";
    }
    
}
