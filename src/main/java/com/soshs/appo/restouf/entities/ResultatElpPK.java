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
public class ResultatElpPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_IND")
    private int codInd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "COD_ELP")
    private String codElp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "COD_ANU")
    private String codAnu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "COD_SES")
    private String codSes;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "COD_ADM")
    private String codAdm;

    public ResultatElpPK() {
    }

    public ResultatElpPK(int codInd, String codElp, String codAnu, String codSes, String codAdm) {
        this.codInd = codInd;
        this.codElp = codElp;
        this.codAnu = codAnu;
        this.codSes = codSes;
        this.codAdm = codAdm;
    }

    public int getCodInd() {
        return codInd;
    }

    public void setCodInd(int codInd) {
        this.codInd = codInd;
    }

    public String getCodElp() {
        return codElp;
    }

    public void setCodElp(String codElp) {
        this.codElp = codElp;
    }

    public String getCodAnu() {
        return codAnu;
    }

    public void setCodAnu(String codAnu) {
        this.codAnu = codAnu;
    }

    public String getCodSes() {
        return codSes;
    }

    public void setCodSes(String codSes) {
        this.codSes = codSes;
    }

    public String getCodAdm() {
        return codAdm;
    }

    public void setCodAdm(String codAdm) {
        this.codAdm = codAdm;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codInd;
        hash += (codElp != null ? codElp.hashCode() : 0);
        hash += (codAnu != null ? codAnu.hashCode() : 0);
        hash += (codSes != null ? codSes.hashCode() : 0);
        hash += (codAdm != null ? codAdm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ResultatElpPK)) {
            return false;
        }
        ResultatElpPK other = (ResultatElpPK) object;
        if (this.codInd != other.codInd) {
            return false;
        }
        if ((this.codElp == null && other.codElp != null) || (this.codElp != null && !this.codElp.equals(other.codElp))) {
            return false;
        }
        if ((this.codAnu == null && other.codAnu != null) || (this.codAnu != null && !this.codAnu.equals(other.codAnu))) {
            return false;
        }
        if ((this.codSes == null && other.codSes != null) || (this.codSes != null && !this.codSes.equals(other.codSes))) {
            return false;
        }
        if ((this.codAdm == null && other.codAdm != null) || (this.codAdm != null && !this.codAdm.equals(other.codAdm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.appo.restouf.entities.ResultatElpPK[ codInd=" + codInd + ", codElp=" + codElp + ", codAnu=" + codAnu + ", codSes=" + codSes + ", codAdm=" + codAdm + " ]";
    }
    
}
