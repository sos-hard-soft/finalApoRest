/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soshs.appo.restouf.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author master05
 */
@Entity
@Table(name = "INS_ADM_ETP")
@NamedQueries({
    @NamedQuery(name = "InsAdmEtp.findAll", query = "SELECT i FROM InsAdmEtp i"),
    @NamedQuery(name = "InsAdmEtp.findByCodAnu", query = "SELECT i FROM InsAdmEtp i WHERE i.insAdmEtpPK.codAnu = :codAnu"),
    @NamedQuery(name = "InsAdmEtp.findByCodInd", query = "SELECT i FROM InsAdmEtp i WHERE i.insAdmEtpPK.codInd = :codInd"),
    @NamedQuery(name = "InsAdmEtp.findByCodEtp", query = "SELECT i FROM InsAdmEtp i WHERE i.insAdmEtpPK.codEtp = :codEtp"),
    @NamedQuery(name = "InsAdmEtp.findByCodVrsVet", query = "SELECT i FROM InsAdmEtp i WHERE i.insAdmEtpPK.codVrsVet = :codVrsVet"),
    @NamedQuery(name = "InsAdmEtp.findByNumOccIae", query = "SELECT i FROM InsAdmEtp i WHERE i.insAdmEtpPK.numOccIae = :numOccIae"),
    @NamedQuery(name = "InsAdmEtp.findByDatCreIae", query = "SELECT i FROM InsAdmEtp i WHERE i.datCreIae = :datCreIae"),
    @NamedQuery(name = "InsAdmEtp.findByDatModIae", query = "SELECT i FROM InsAdmEtp i WHERE i.datModIae = :datModIae"),
    @NamedQuery(name = "InsAdmEtp.findByDatAccIae", query = "SELECT i FROM InsAdmEtp i WHERE i.datAccIae = :datAccIae"),
    @NamedQuery(name = "InsAdmEtp.findByEtaIae", query = "SELECT i FROM InsAdmEtp i WHERE i.etaIae = :etaIae"),
    @NamedQuery(name = "InsAdmEtp.findByEtaPmtIae", query = "SELECT i FROM InsAdmEtp i WHERE i.etaPmtIae = :etaPmtIae"),
    @NamedQuery(name = "InsAdmEtp.findByNbrInsCyc", query = "SELECT i FROM InsAdmEtp i WHERE i.nbrInsCyc = :nbrInsCyc"),
    @NamedQuery(name = "InsAdmEtp.findByNbrInsEtp", query = "SELECT i FROM InsAdmEtp i WHERE i.nbrInsEtp = :nbrInsEtp"),
    @NamedQuery(name = "InsAdmEtp.findByTemTlsIae", query = "SELECT i FROM InsAdmEtp i WHERE i.temTlsIae = :temTlsIae"),
    @NamedQuery(name = "InsAdmEtp.findByTemIaePrm", query = "SELECT i FROM InsAdmEtp i WHERE i.temIaePrm = :temIaePrm"),
    @NamedQuery(name = "InsAdmEtp.findByTemChgSurEtp", query = "SELECT i FROM InsAdmEtp i WHERE i.temChgSurEtp = :temChgSurEtp"),
    @NamedQuery(name = "InsAdmEtp.findByZblEtb1", query = "SELECT i FROM InsAdmEtp i WHERE i.zblEtb1 = :zblEtb1"),
    @NamedQuery(name = "InsAdmEtp.findByZblEtb2", query = "SELECT i FROM InsAdmEtp i WHERE i.zblEtb2 = :zblEtb2"),
    @NamedQuery(name = "InsAdmEtp.findByNumBrsEtu", query = "SELECT i FROM InsAdmEtp i WHERE i.numBrsEtu = :numBrsEtu"),
    @NamedQuery(name = "InsAdmEtp.findByLibRefAcc", query = "SELECT i FROM InsAdmEtp i WHERE i.libRefAcc = :libRefAcc"),
    @NamedQuery(name = "InsAdmEtp.findByTemInsElpAtmqIae", query = "SELECT i FROM InsAdmEtp i WHERE i.temInsElpAtmqIae = :temInsElpAtmqIae"),
    @NamedQuery(name = "InsAdmEtp.findByCodNatTitAccIae", query = "SELECT i FROM InsAdmEtp i WHERE i.codNatTitAccIae = :codNatTitAccIae"),
    @NamedQuery(name = "InsAdmEtp.findByNbrInsDip", query = "SELECT i FROM InsAdmEtp i WHERE i.nbrInsDip = :nbrInsDip"),
    @NamedQuery(name = "InsAdmEtp.findByTemDipIae", query = "SELECT i FROM InsAdmEtp i WHERE i.temDipIae = :temDipIae"),
    @NamedQuery(name = "InsAdmEtp.findByCodSesIae", query = "SELECT i FROM InsAdmEtp i WHERE i.codSesIae = :codSesIae"),
    @NamedQuery(name = "InsAdmEtp.findByDatObsSisIae", query = "SELECT i FROM InsAdmEtp i WHERE i.datObsSisIae = :datObsSisIae")})
public class InsAdmEtp implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InsAdmEtpPK insAdmEtpPK;
    @Column(name = "DAT_CRE_IAE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datCreIae;
    @Column(name = "DAT_MOD_IAE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datModIae;
    @Column(name = "DAT_ACC_IAE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datAccIae;
    @Size(max = 1)
    @Column(name = "ETA_IAE")
    private String etaIae;
    @Size(max = 1)
    @Column(name = "ETA_PMT_IAE")
    private String etaPmtIae;
    @Column(name = "NBR_INS_CYC")
    private Short nbrInsCyc;
    @Column(name = "NBR_INS_ETP")
    private Short nbrInsEtp;
    @Size(max = 1)
    @Column(name = "TEM_TLS_IAE")
    private String temTlsIae;
    @Size(max = 1)
    @Column(name = "TEM_IAE_PRM")
    private String temIaePrm;
    @Size(max = 1)
    @Column(name = "TEM_CHG_SUR_ETP")
    private String temChgSurEtp;
    @Size(max = 100)
    @Column(name = "ZBL_ETB_1")
    private String zblEtb1;
    @Size(max = 100)
    @Column(name = "ZBL_ETB_2")
    private String zblEtb2;
    @Size(max = 13)
    @Column(name = "NUM_BRS_ETU")
    private String numBrsEtu;
    @Size(max = 100)
    @Column(name = "LIB_REF_ACC")
    private String libRefAcc;
    @Size(max = 1)
    @Column(name = "TEM_INS_ELP_ATMQ_IAE")
    private String temInsElpAtmqIae;
    @Size(max = 1)
    @Column(name = "COD_NAT_TIT_ACC_IAE")
    private String codNatTitAccIae;
    @Column(name = "NBR_INS_DIP")
    private Short nbrInsDip;
    @Size(max = 1)
    @Column(name = "TEM_DIP_IAE")
    private String temDipIae;
    @Size(max = 1)
    @Column(name = "COD_SES_IAE")
    private String codSesIae;
    @Column(name = "DAT_OBS_SIS_IAE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datObsSisIae;

    public InsAdmEtp() {
    }

    public InsAdmEtp(InsAdmEtpPK insAdmEtpPK) {
        this.insAdmEtpPK = insAdmEtpPK;
    }

    public InsAdmEtp(String codAnu, int codInd, String codEtp, short codVrsVet, short numOccIae) {
        this.insAdmEtpPK = new InsAdmEtpPK(codAnu, codInd, codEtp, codVrsVet, numOccIae);
    }

    public InsAdmEtpPK getInsAdmEtpPK() {
        return insAdmEtpPK;
    }

    public void setInsAdmEtpPK(InsAdmEtpPK insAdmEtpPK) {
        this.insAdmEtpPK = insAdmEtpPK;
    }

    public Date getDatCreIae() {
        return datCreIae;
    }

    public void setDatCreIae(Date datCreIae) {
        this.datCreIae = datCreIae;
    }

    public Date getDatModIae() {
        return datModIae;
    }

    public void setDatModIae(Date datModIae) {
        this.datModIae = datModIae;
    }

    public Date getDatAccIae() {
        return datAccIae;
    }

    public void setDatAccIae(Date datAccIae) {
        this.datAccIae = datAccIae;
    }

    public String getEtaIae() {
        return etaIae;
    }

    public void setEtaIae(String etaIae) {
        this.etaIae = etaIae;
    }

    public String getEtaPmtIae() {
        return etaPmtIae;
    }

    public void setEtaPmtIae(String etaPmtIae) {
        this.etaPmtIae = etaPmtIae;
    }

    public Short getNbrInsCyc() {
        return nbrInsCyc;
    }

    public void setNbrInsCyc(Short nbrInsCyc) {
        this.nbrInsCyc = nbrInsCyc;
    }

    public Short getNbrInsEtp() {
        return nbrInsEtp;
    }

    public void setNbrInsEtp(Short nbrInsEtp) {
        this.nbrInsEtp = nbrInsEtp;
    }

    public String getTemTlsIae() {
        return temTlsIae;
    }

    public void setTemTlsIae(String temTlsIae) {
        this.temTlsIae = temTlsIae;
    }

    public String getTemIaePrm() {
        return temIaePrm;
    }

    public void setTemIaePrm(String temIaePrm) {
        this.temIaePrm = temIaePrm;
    }

    public String getTemChgSurEtp() {
        return temChgSurEtp;
    }

    public void setTemChgSurEtp(String temChgSurEtp) {
        this.temChgSurEtp = temChgSurEtp;
    }

    public String getZblEtb1() {
        return zblEtb1;
    }

    public void setZblEtb1(String zblEtb1) {
        this.zblEtb1 = zblEtb1;
    }

    public String getZblEtb2() {
        return zblEtb2;
    }

    public void setZblEtb2(String zblEtb2) {
        this.zblEtb2 = zblEtb2;
    }

    public String getNumBrsEtu() {
        return numBrsEtu;
    }

    public void setNumBrsEtu(String numBrsEtu) {
        this.numBrsEtu = numBrsEtu;
    }

    public String getLibRefAcc() {
        return libRefAcc;
    }

    public void setLibRefAcc(String libRefAcc) {
        this.libRefAcc = libRefAcc;
    }

    public String getTemInsElpAtmqIae() {
        return temInsElpAtmqIae;
    }

    public void setTemInsElpAtmqIae(String temInsElpAtmqIae) {
        this.temInsElpAtmqIae = temInsElpAtmqIae;
    }

    public String getCodNatTitAccIae() {
        return codNatTitAccIae;
    }

    public void setCodNatTitAccIae(String codNatTitAccIae) {
        this.codNatTitAccIae = codNatTitAccIae;
    }

    public Short getNbrInsDip() {
        return nbrInsDip;
    }

    public void setNbrInsDip(Short nbrInsDip) {
        this.nbrInsDip = nbrInsDip;
    }

    public String getTemDipIae() {
        return temDipIae;
    }

    public void setTemDipIae(String temDipIae) {
        this.temDipIae = temDipIae;
    }

    public String getCodSesIae() {
        return codSesIae;
    }

    public void setCodSesIae(String codSesIae) {
        this.codSesIae = codSesIae;
    }

    public Date getDatObsSisIae() {
        return datObsSisIae;
    }

    public void setDatObsSisIae(Date datObsSisIae) {
        this.datObsSisIae = datObsSisIae;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (insAdmEtpPK != null ? insAdmEtpPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InsAdmEtp)) {
            return false;
        }
        InsAdmEtp other = (InsAdmEtp) object;
        if ((this.insAdmEtpPK == null && other.insAdmEtpPK != null) || (this.insAdmEtpPK != null && !this.insAdmEtpPK.equals(other.insAdmEtpPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.appo.restouf.entities.InsAdmEtp[ insAdmEtpPK=" + insAdmEtpPK + " ]";
    }
    
}
