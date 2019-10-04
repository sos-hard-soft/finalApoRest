/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soshs.appo.restouf.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author master05
 */
@Entity
@Table(name = "RESULTAT_VET")
@NamedQueries({
    @NamedQuery(name = "ResultatVet.findAll", query = "SELECT r FROM ResultatVet r"),
    @NamedQuery(name = "ResultatVet.findByCodInd", query = "SELECT r FROM ResultatVet r WHERE r.resultatVetPK.codInd = :codInd"),
    @NamedQuery(name = "ResultatVet.findByCodEtp", query = "SELECT r FROM ResultatVet r WHERE r.resultatVetPK.codEtp = :codEtp"),
    @NamedQuery(name = "ResultatVet.findByCodVrsVet", query = "SELECT r FROM ResultatVet r WHERE r.resultatVetPK.codVrsVet = :codVrsVet"),
    @NamedQuery(name = "ResultatVet.findByCodAnu", query = "SELECT r FROM ResultatVet r WHERE r.resultatVetPK.codAnu = :codAnu"),
    @NamedQuery(name = "ResultatVet.findByCodSes", query = "SELECT r FROM ResultatVet r WHERE r.resultatVetPK.codSes = :codSes"),
    @NamedQuery(name = "ResultatVet.findByCodAdm", query = "SELECT r FROM ResultatVet r WHERE r.resultatVetPK.codAdm = :codAdm"),
    @NamedQuery(name = "ResultatVet.findByNotVet", query = "SELECT r FROM ResultatVet r WHERE r.notVet = :notVet"),
    @NamedQuery(name = "ResultatVet.findByNotSubVet", query = "SELECT r FROM ResultatVet r WHERE r.notSubVet = :notSubVet"),
    @NamedQuery(name = "ResultatVet.findByBarNotVet", query = "SELECT r FROM ResultatVet r WHERE r.barNotVet = :barNotVet"),
    @NamedQuery(name = "ResultatVet.findByEtaNotVet", query = "SELECT r FROM ResultatVet r WHERE r.etaNotVet = :etaNotVet"),
    @NamedQuery(name = "ResultatVet.findByEtaResVet", query = "SELECT r FROM ResultatVet r WHERE r.etaResVet = :etaResVet"),
    @NamedQuery(name = "ResultatVet.findByEtaMndVet", query = "SELECT r FROM ResultatVet r WHERE r.etaMndVet = :etaMndVet"),
    @NamedQuery(name = "ResultatVet.findByNotPntJurVet", query = "SELECT r FROM ResultatVet r WHERE r.notPntJurVet = :notPntJurVet"),
    @NamedQuery(name = "ResultatVet.findByNbrRngEtuVet", query = "SELECT r FROM ResultatVet r WHERE r.nbrRngEtuVet = :nbrRngEtuVet"),
    @NamedQuery(name = "ResultatVet.findByEtaRngVet", query = "SELECT r FROM ResultatVet r WHERE r.etaRngVet = :etaRngVet"),
    @NamedQuery(name = "ResultatVet.findByCodNumUtiCre", query = "SELECT r FROM ResultatVet r WHERE r.codNumUtiCre = :codNumUtiCre"),
    @NamedQuery(name = "ResultatVet.findByDatCreVet", query = "SELECT r FROM ResultatVet r WHERE r.datCreVet = :datCreVet"),
    @NamedQuery(name = "ResultatVet.findByCodNumUtiMod", query = "SELECT r FROM ResultatVet r WHERE r.codNumUtiMod = :codNumUtiMod"),
    @NamedQuery(name = "ResultatVet.findByDatModVet", query = "SELECT r FROM ResultatVet r WHERE r.datModVet = :datModVet"),
    @NamedQuery(name = "ResultatVet.findByTemIntVet", query = "SELECT r FROM ResultatVet r WHERE r.temIntVet = :temIntVet"),
    @NamedQuery(name = "ResultatVet.findByTemIaeKoVet", query = "SELECT r FROM ResultatVet r WHERE r.temIaeKoVet = :temIaeKoVet"),
    @NamedQuery(name = "ResultatVet.findByTemIndCrnVet", query = "SELECT r FROM ResultatVet r WHERE r.temIndCrnVet = :temIndCrnVet"),
    @NamedQuery(name = "ResultatVet.findByTemIpVet", query = "SELECT r FROM ResultatVet r WHERE r.temIpVet = :temIpVet"),
    @NamedQuery(name = "ResultatVet.findByTemExiNotVet", query = "SELECT r FROM ResultatVet r WHERE r.temExiNotVet = :temExiNotVet"),
    @NamedQuery(name = "ResultatVet.findByTemDstSupVet", query = "SELECT r FROM ResultatVet r WHERE r.temDstSupVet = :temDstSupVet"),
    @NamedQuery(name = "ResultatVet.findByTemCrnHerVet", query = "SELECT r FROM ResultatVet r WHERE r.temCrnHerVet = :temCrnHerVet"),
    @NamedQuery(name = "ResultatVet.findByTemOriActVet", query = "SELECT r FROM ResultatVet r WHERE r.temOriActVet = :temOriActVet"),
    @NamedQuery(name = "ResultatVet.findByTemTrtRptVet", query = "SELECT r FROM ResultatVet r WHERE r.temTrtRptVet = :temTrtRptVet"),
    @NamedQuery(name = "ResultatVet.findByCodEtuAno", query = "SELECT r FROM ResultatVet r WHERE r.codEtuAno = :codEtuAno")})
public class ResultatVet implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ResultatVetPK resultatVetPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "NOT_VET")
    private BigDecimal notVet;
    @Size(max = 3)
    @Column(name = "NOT_SUB_VET")
    private String notSubVet;
    @Column(name = "BAR_NOT_VET")
    private Integer barNotVet;
    @Size(max = 1)
    @Column(name = "ETA_NOT_VET")
    private String etaNotVet;
    @Size(max = 1)
    @Column(name = "ETA_RES_VET")
    private String etaResVet;
    @Size(max = 1)
    @Column(name = "ETA_MND_VET")
    private String etaMndVet;
    @Column(name = "NOT_PNT_JUR_VET")
    private BigDecimal notPntJurVet;
    @Column(name = "NBR_RNG_ETU_VET")
    private Short nbrRngEtuVet;
    @Size(max = 1)
    @Column(name = "ETA_RNG_VET")
    private String etaRngVet;
    @Column(name = "COD_NUM_UTI_CRE")
    private Integer codNumUtiCre;
    @Column(name = "DAT_CRE_VET")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datCreVet;
    @Column(name = "COD_NUM_UTI_MOD")
    private Integer codNumUtiMod;
    @Column(name = "DAT_MOD_VET")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datModVet;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_INT_VET")
    private String temIntVet;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_IAE_KO_VET")
    private String temIaeKoVet;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "TEM_IND_CRN_VET")
    private String temIndCrnVet;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_IP_VET")
    private String temIpVet;
    @Size(max = 1)
    @Column(name = "TEM_EXI_NOT_VET")
    private String temExiNotVet;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_DST_SUP_VET")
    private String temDstSupVet;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_CRN_HER_VET")
    private String temCrnHerVet;
    @Size(max = 1)
    @Column(name = "TEM_ORI_ACT_VET")
    private String temOriActVet;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_TRT_RPT_VET")
    private String temTrtRptVet;
    @Column(name = "COD_ETU_ANO")
    private Integer codEtuAno;
    @JoinColumn(name = "COD_IND", referencedColumnName = "COD_IND", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Individu individu;

    public ResultatVet() {
    }

    public ResultatVet(ResultatVetPK resultatVetPK) {
        this.resultatVetPK = resultatVetPK;
    }

    public ResultatVet(ResultatVetPK resultatVetPK, String temIntVet, String temIaeKoVet, String temIndCrnVet, String temIpVet, String temDstSupVet, String temCrnHerVet, String temTrtRptVet) {
        this.resultatVetPK = resultatVetPK;
        this.temIntVet = temIntVet;
        this.temIaeKoVet = temIaeKoVet;
        this.temIndCrnVet = temIndCrnVet;
        this.temIpVet = temIpVet;
        this.temDstSupVet = temDstSupVet;
        this.temCrnHerVet = temCrnHerVet;
        this.temTrtRptVet = temTrtRptVet;
    }

    public ResultatVet(int codInd, String codEtp, short codVrsVet, String codAnu, String codSes, String codAdm) {
        this.resultatVetPK = new ResultatVetPK(codInd, codEtp, codVrsVet, codAnu, codSes, codAdm);
    }

    public ResultatVetPK getResultatVetPK() {
        return resultatVetPK;
    }

    public void setResultatVetPK(ResultatVetPK resultatVetPK) {
        this.resultatVetPK = resultatVetPK;
    }

    public BigDecimal getNotVet() {
        return notVet;
    }

    public void setNotVet(BigDecimal notVet) {
        this.notVet = notVet;
    }

    public String getNotSubVet() {
        return notSubVet;
    }

    public void setNotSubVet(String notSubVet) {
        this.notSubVet = notSubVet;
    }

    public Integer getBarNotVet() {
        return barNotVet;
    }

    public void setBarNotVet(Integer barNotVet) {
        this.barNotVet = barNotVet;
    }

    public String getEtaNotVet() {
        return etaNotVet;
    }

    public void setEtaNotVet(String etaNotVet) {
        this.etaNotVet = etaNotVet;
    }

    public String getEtaResVet() {
        return etaResVet;
    }

    public void setEtaResVet(String etaResVet) {
        this.etaResVet = etaResVet;
    }

    public String getEtaMndVet() {
        return etaMndVet;
    }

    public void setEtaMndVet(String etaMndVet) {
        this.etaMndVet = etaMndVet;
    }

    public BigDecimal getNotPntJurVet() {
        return notPntJurVet;
    }

    public void setNotPntJurVet(BigDecimal notPntJurVet) {
        this.notPntJurVet = notPntJurVet;
    }

    public Short getNbrRngEtuVet() {
        return nbrRngEtuVet;
    }

    public void setNbrRngEtuVet(Short nbrRngEtuVet) {
        this.nbrRngEtuVet = nbrRngEtuVet;
    }

    public String getEtaRngVet() {
        return etaRngVet;
    }

    public void setEtaRngVet(String etaRngVet) {
        this.etaRngVet = etaRngVet;
    }

    public Integer getCodNumUtiCre() {
        return codNumUtiCre;
    }

    public void setCodNumUtiCre(Integer codNumUtiCre) {
        this.codNumUtiCre = codNumUtiCre;
    }

    public Date getDatCreVet() {
        return datCreVet;
    }

    public void setDatCreVet(Date datCreVet) {
        this.datCreVet = datCreVet;
    }

    public Integer getCodNumUtiMod() {
        return codNumUtiMod;
    }

    public void setCodNumUtiMod(Integer codNumUtiMod) {
        this.codNumUtiMod = codNumUtiMod;
    }

    public Date getDatModVet() {
        return datModVet;
    }

    public void setDatModVet(Date datModVet) {
        this.datModVet = datModVet;
    }

    public String getTemIntVet() {
        return temIntVet;
    }

    public void setTemIntVet(String temIntVet) {
        this.temIntVet = temIntVet;
    }

    public String getTemIaeKoVet() {
        return temIaeKoVet;
    }

    public void setTemIaeKoVet(String temIaeKoVet) {
        this.temIaeKoVet = temIaeKoVet;
    }

    public String getTemIndCrnVet() {
        return temIndCrnVet;
    }

    public void setTemIndCrnVet(String temIndCrnVet) {
        this.temIndCrnVet = temIndCrnVet;
    }

    public String getTemIpVet() {
        return temIpVet;
    }

    public void setTemIpVet(String temIpVet) {
        this.temIpVet = temIpVet;
    }

    public String getTemExiNotVet() {
        return temExiNotVet;
    }

    public void setTemExiNotVet(String temExiNotVet) {
        this.temExiNotVet = temExiNotVet;
    }

    public String getTemDstSupVet() {
        return temDstSupVet;
    }

    public void setTemDstSupVet(String temDstSupVet) {
        this.temDstSupVet = temDstSupVet;
    }

    public String getTemCrnHerVet() {
        return temCrnHerVet;
    }

    public void setTemCrnHerVet(String temCrnHerVet) {
        this.temCrnHerVet = temCrnHerVet;
    }

    public String getTemOriActVet() {
        return temOriActVet;
    }

    public void setTemOriActVet(String temOriActVet) {
        this.temOriActVet = temOriActVet;
    }

    public String getTemTrtRptVet() {
        return temTrtRptVet;
    }

    public void setTemTrtRptVet(String temTrtRptVet) {
        this.temTrtRptVet = temTrtRptVet;
    }

    public Integer getCodEtuAno() {
        return codEtuAno;
    }

    public void setCodEtuAno(Integer codEtuAno) {
        this.codEtuAno = codEtuAno;
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
        hash += (resultatVetPK != null ? resultatVetPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ResultatVet)) {
            return false;
        }
        ResultatVet other = (ResultatVet) object;
        if ((this.resultatVetPK == null && other.resultatVetPK != null) || (this.resultatVetPK != null && !this.resultatVetPK.equals(other.resultatVetPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.appo.restouf.entities.ResultatVet[ resultatVetPK=" + resultatVetPK + " ]";
    }
    
}
