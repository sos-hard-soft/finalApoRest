/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soshs.appo.restouf.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author master05
 */
@Entity
@Table(name = "INS_PEDAGOGI_ETP")
@NamedQueries({
    @NamedQuery(name = "InsPedagogiEtp.findAll", query = "SELECT i FROM InsPedagogiEtp i"),
    @NamedQuery(name = "InsPedagogiEtp.findByCodAnu", query = "SELECT i FROM InsPedagogiEtp i WHERE i.insPedagogiEtpPK.codAnu = :codAnu"),
    @NamedQuery(name = "InsPedagogiEtp.findByCodInd", query = "SELECT i FROM InsPedagogiEtp i WHERE i.insPedagogiEtpPK.codInd = :codInd"),
    @NamedQuery(name = "InsPedagogiEtp.findByCodEtp", query = "SELECT i FROM InsPedagogiEtp i WHERE i.insPedagogiEtpPK.codEtp = :codEtp"),
    @NamedQuery(name = "InsPedagogiEtp.findByCodVrsVet", query = "SELECT i FROM InsPedagogiEtp i WHERE i.insPedagogiEtpPK.codVrsVet = :codVrsVet"),
    @NamedQuery(name = "InsPedagogiEtp.findByCodTypIpe", query = "SELECT i FROM InsPedagogiEtp i WHERE i.codTypIpe = :codTypIpe"),
    @NamedQuery(name = "InsPedagogiEtp.findByDatCreIpe", query = "SELECT i FROM InsPedagogiEtp i WHERE i.datCreIpe = :datCreIpe"),
    @NamedQuery(name = "InsPedagogiEtp.findByDatModIpe", query = "SELECT i FROM InsPedagogiEtp i WHERE i.datModIpe = :datModIpe"),
    @NamedQuery(name = "InsPedagogiEtp.findByDatAccIpe", query = "SELECT i FROM InsPedagogiEtp i WHERE i.datAccIpe = :datAccIpe"),
    @NamedQuery(name = "InsPedagogiEtp.findByLibRefAcc", query = "SELECT i FROM InsPedagogiEtp i WHERE i.libRefAcc = :libRefAcc"),
    @NamedQuery(name = "InsPedagogiEtp.findByTemInsElpAtmqIpe", query = "SELECT i FROM InsPedagogiEtp i WHERE i.temInsElpAtmqIpe = :temInsElpAtmqIpe")})
public class InsPedagogiEtp implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InsPedagogiEtpPK insPedagogiEtpPK;
    @Size(max = 1)
    @Column(name = "COD_TYP_IPE")
    private String codTypIpe;
    @Column(name = "DAT_CRE_IPE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datCreIpe;
    @Column(name = "DAT_MOD_IPE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datModIpe;
    @Column(name = "DAT_ACC_IPE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datAccIpe;
    @Size(max = 100)
    @Column(name = "LIB_REF_ACC")
    private String libRefAcc;
    @Size(max = 1)
    @Column(name = "TEM_INS_ELP_ATMQ_IPE")
    private String temInsElpAtmqIpe;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "insPedagogiEtp")
    private Collection<IndContratElp> indContratElpCollection;

    public InsPedagogiEtp() {
    }

    public InsPedagogiEtp(InsPedagogiEtpPK insPedagogiEtpPK) {
        this.insPedagogiEtpPK = insPedagogiEtpPK;
    }

    public InsPedagogiEtp(String codAnu, int codInd, String codEtp, short codVrsVet) {
        this.insPedagogiEtpPK = new InsPedagogiEtpPK(codAnu, codInd, codEtp, codVrsVet);
    }

    public InsPedagogiEtpPK getInsPedagogiEtpPK() {
        return insPedagogiEtpPK;
    }

    public void setInsPedagogiEtpPK(InsPedagogiEtpPK insPedagogiEtpPK) {
        this.insPedagogiEtpPK = insPedagogiEtpPK;
    }

    public String getCodTypIpe() {
        return codTypIpe;
    }

    public void setCodTypIpe(String codTypIpe) {
        this.codTypIpe = codTypIpe;
    }

    public Date getDatCreIpe() {
        return datCreIpe;
    }

    public void setDatCreIpe(Date datCreIpe) {
        this.datCreIpe = datCreIpe;
    }

    public Date getDatModIpe() {
        return datModIpe;
    }

    public void setDatModIpe(Date datModIpe) {
        this.datModIpe = datModIpe;
    }

    public Date getDatAccIpe() {
        return datAccIpe;
    }

    public void setDatAccIpe(Date datAccIpe) {
        this.datAccIpe = datAccIpe;
    }

    public String getLibRefAcc() {
        return libRefAcc;
    }

    public void setLibRefAcc(String libRefAcc) {
        this.libRefAcc = libRefAcc;
    }

    public String getTemInsElpAtmqIpe() {
        return temInsElpAtmqIpe;
    }

    public void setTemInsElpAtmqIpe(String temInsElpAtmqIpe) {
        this.temInsElpAtmqIpe = temInsElpAtmqIpe;
    }

    public Collection<IndContratElp> getIndContratElpCollection() {
        return indContratElpCollection;
    }

    public void setIndContratElpCollection(Collection<IndContratElp> indContratElpCollection) {
        this.indContratElpCollection = indContratElpCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (insPedagogiEtpPK != null ? insPedagogiEtpPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InsPedagogiEtp)) {
            return false;
        }
        InsPedagogiEtp other = (InsPedagogiEtp) object;
        if ((this.insPedagogiEtpPK == null && other.insPedagogiEtpPK != null) || (this.insPedagogiEtpPK != null && !this.insPedagogiEtpPK.equals(other.insPedagogiEtpPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.appo.restouf.entities.InsPedagogiEtp[ insPedagogiEtpPK=" + insPedagogiEtpPK + " ]";
    }
    
}
