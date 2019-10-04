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
@Table(name = "RESULTAT_ELP")
@NamedQueries({
    @NamedQuery(name = "ResultatElp.findAll", query = "SELECT r FROM ResultatElp r"),
    @NamedQuery(name = "ResultatElp.findByCodInd", query = "SELECT r FROM ResultatElp r WHERE r.resultatElpPK.codInd = :codInd"),
    @NamedQuery(name = "ResultatElp.findByCodElp", query = "SELECT r FROM ResultatElp r WHERE r.resultatElpPK.codElp = :codElp"),
    @NamedQuery(name = "ResultatElp.findByCodAnu", query = "SELECT r FROM ResultatElp r WHERE r.resultatElpPK.codAnu = :codAnu"),
    @NamedQuery(name = "ResultatElp.findByCodSes", query = "SELECT r FROM ResultatElp r WHERE r.resultatElpPK.codSes = :codSes"),
    @NamedQuery(name = "ResultatElp.findByCodAdm", query = "SELECT r FROM ResultatElp r WHERE r.resultatElpPK.codAdm = :codAdm"),
    @NamedQuery(name = "ResultatElp.findByNotElp", query = "SELECT r FROM ResultatElp r WHERE r.notElp = :notElp"),
    @NamedQuery(name = "ResultatElp.findByNotSubElp", query = "SELECT r FROM ResultatElp r WHERE r.notSubElp = :notSubElp"),
    @NamedQuery(name = "ResultatElp.findByBarNotElp", query = "SELECT r FROM ResultatElp r WHERE r.barNotElp = :barNotElp"),
    @NamedQuery(name = "ResultatElp.findByEtaNotElp", query = "SELECT r FROM ResultatElp r WHERE r.etaNotElp = :etaNotElp"),
    @NamedQuery(name = "ResultatElp.findByTemNotRptElp", query = "SELECT r FROM ResultatElp r WHERE r.temNotRptElp = :temNotRptElp"),
    @NamedQuery(name = "ResultatElp.findByEtaResElp", query = "SELECT r FROM ResultatElp r WHERE r.etaResElp = :etaResElp"),
    @NamedQuery(name = "ResultatElp.findByTemResRptElp", query = "SELECT r FROM ResultatElp r WHERE r.temResRptElp = :temResRptElp"),
    @NamedQuery(name = "ResultatElp.findByEtaMndElp", query = "SELECT r FROM ResultatElp r WHERE r.etaMndElp = :etaMndElp"),
    @NamedQuery(name = "ResultatElp.findByNotPntJurElp", query = "SELECT r FROM ResultatElp r WHERE r.notPntJurElp = :notPntJurElp"),
    @NamedQuery(name = "ResultatElp.findByNbrRngEtuElp", query = "SELECT r FROM ResultatElp r WHERE r.nbrRngEtuElp = :nbrRngEtuElp"),
    @NamedQuery(name = "ResultatElp.findByEtaRngElp", query = "SELECT r FROM ResultatElp r WHERE r.etaRngElp = :etaRngElp"),
    @NamedQuery(name = "ResultatElp.findByCodNumUtiCre", query = "SELECT r FROM ResultatElp r WHERE r.codNumUtiCre = :codNumUtiCre"),
    @NamedQuery(name = "ResultatElp.findByDatCreElp", query = "SELECT r FROM ResultatElp r WHERE r.datCreElp = :datCreElp"),
    @NamedQuery(name = "ResultatElp.findByCodNumUtiMod", query = "SELECT r FROM ResultatElp r WHERE r.codNumUtiMod = :codNumUtiMod"),
    @NamedQuery(name = "ResultatElp.findByDatModElp", query = "SELECT r FROM ResultatElp r WHERE r.datModElp = :datModElp"),
    @NamedQuery(name = "ResultatElp.findByTemIntElp", query = "SELECT r FROM ResultatElp r WHERE r.temIntElp = :temIntElp"),
    @NamedQuery(name = "ResultatElp.findByTemIaeKoElp", query = "SELECT r FROM ResultatElp r WHERE r.temIaeKoElp = :temIaeKoElp"),
    @NamedQuery(name = "ResultatElp.findByTemIpElp", query = "SELECT r FROM ResultatElp r WHERE r.temIpElp = :temIpElp"),
    @NamedQuery(name = "ResultatElp.findByTemIndCrnElp", query = "SELECT r FROM ResultatElp r WHERE r.temIndCrnElp = :temIndCrnElp"),
    @NamedQuery(name = "ResultatElp.findByTemExiNotElp", query = "SELECT r FROM ResultatElp r WHERE r.temExiNotElp = :temExiNotElp"),
    @NamedQuery(name = "ResultatElp.findByTemDstSupElp", query = "SELECT r FROM ResultatElp r WHERE r.temDstSupElp = :temDstSupElp"),
    @NamedQuery(name = "ResultatElp.findByTemCrnHerElp", query = "SELECT r FROM ResultatElp r WHERE r.temCrnHerElp = :temCrnHerElp"),
    @NamedQuery(name = "ResultatElp.findByTemOriActElp", query = "SELECT r FROM ResultatElp r WHERE r.temOriActElp = :temOriActElp"),
    @NamedQuery(name = "ResultatElp.findByTemTrtRptElp", query = "SELECT r FROM ResultatElp r WHERE r.temTrtRptElp = :temTrtRptElp"),
    @NamedQuery(name = "ResultatElp.findByCodEtuAno", query = "SELECT r FROM ResultatElp r WHERE r.codEtuAno = :codEtuAno")})
public class ResultatElp implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ResultatElpPK resultatElpPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "NOT_ELP")
    private BigDecimal notElp;
    @Size(max = 3)
    @Column(name = "NOT_SUB_ELP")
    private String notSubElp;
    @Column(name = "BAR_NOT_ELP")
    private Integer barNotElp;
    @Size(max = 1)
    @Column(name = "ETA_NOT_ELP")
    private String etaNotElp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_NOT_RPT_ELP")
    private String temNotRptElp;
    @Size(max = 1)
    @Column(name = "ETA_RES_ELP")
    private String etaResElp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_RES_RPT_ELP")
    private String temResRptElp;
    @Size(max = 1)
    @Column(name = "ETA_MND_ELP")
    private String etaMndElp;
    @Column(name = "NOT_PNT_JUR_ELP")
    private BigDecimal notPntJurElp;
    @Column(name = "NBR_RNG_ETU_ELP")
    private Short nbrRngEtuElp;
    @Size(max = 1)
    @Column(name = "ETA_RNG_ELP")
    private String etaRngElp;
    @Column(name = "COD_NUM_UTI_CRE")
    private Integer codNumUtiCre;
    @Column(name = "DAT_CRE_ELP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datCreElp;
    @Column(name = "COD_NUM_UTI_MOD")
    private Integer codNumUtiMod;
    @Column(name = "DAT_MOD_ELP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datModElp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_INT_ELP")
    private String temIntElp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_IAE_KO_ELP")
    private String temIaeKoElp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_IP_ELP")
    private String temIpElp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "TEM_IND_CRN_ELP")
    private String temIndCrnElp;
    @Size(max = 1)
    @Column(name = "TEM_EXI_NOT_ELP")
    private String temExiNotElp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_DST_SUP_ELP")
    private String temDstSupElp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_CRN_HER_ELP")
    private String temCrnHerElp;
    @Size(max = 1)
    @Column(name = "TEM_ORI_ACT_ELP")
    private String temOriActElp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_TRT_RPT_ELP")
    private String temTrtRptElp;
    @Column(name = "COD_ETU_ANO")
    private Integer codEtuAno;
    @JoinColumn(name = "COD_IND", referencedColumnName = "COD_IND", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Individu individu;

    public ResultatElp() {
    }

    public ResultatElp(ResultatElpPK resultatElpPK) {
        this.resultatElpPK = resultatElpPK;
    }

    public ResultatElp(ResultatElpPK resultatElpPK, String temNotRptElp, String temResRptElp, String temIntElp, String temIaeKoElp, String temIpElp, String temIndCrnElp, String temDstSupElp, String temCrnHerElp, String temTrtRptElp) {
        this.resultatElpPK = resultatElpPK;
        this.temNotRptElp = temNotRptElp;
        this.temResRptElp = temResRptElp;
        this.temIntElp = temIntElp;
        this.temIaeKoElp = temIaeKoElp;
        this.temIpElp = temIpElp;
        this.temIndCrnElp = temIndCrnElp;
        this.temDstSupElp = temDstSupElp;
        this.temCrnHerElp = temCrnHerElp;
        this.temTrtRptElp = temTrtRptElp;
    }

    public ResultatElp(int codInd, String codElp, String codAnu, String codSes, String codAdm) {
        this.resultatElpPK = new ResultatElpPK(codInd, codElp, codAnu, codSes, codAdm);
    }

    public ResultatElpPK getResultatElpPK() {
        return resultatElpPK;
    }

    public void setResultatElpPK(ResultatElpPK resultatElpPK) {
        this.resultatElpPK = resultatElpPK;
    }

    public BigDecimal getNotElp() {
        return notElp;
    }

    public void setNotElp(BigDecimal notElp) {
        this.notElp = notElp;
    }

    public String getNotSubElp() {
        return notSubElp;
    }

    public void setNotSubElp(String notSubElp) {
        this.notSubElp = notSubElp;
    }

    public Integer getBarNotElp() {
        return barNotElp;
    }

    public void setBarNotElp(Integer barNotElp) {
        this.barNotElp = barNotElp;
    }

    public String getEtaNotElp() {
        return etaNotElp;
    }

    public void setEtaNotElp(String etaNotElp) {
        this.etaNotElp = etaNotElp;
    }

    public String getTemNotRptElp() {
        return temNotRptElp;
    }

    public void setTemNotRptElp(String temNotRptElp) {
        this.temNotRptElp = temNotRptElp;
    }

    public String getEtaResElp() {
        return etaResElp;
    }

    public void setEtaResElp(String etaResElp) {
        this.etaResElp = etaResElp;
    }

    public String getTemResRptElp() {
        return temResRptElp;
    }

    public void setTemResRptElp(String temResRptElp) {
        this.temResRptElp = temResRptElp;
    }

    public String getEtaMndElp() {
        return etaMndElp;
    }

    public void setEtaMndElp(String etaMndElp) {
        this.etaMndElp = etaMndElp;
    }

    public BigDecimal getNotPntJurElp() {
        return notPntJurElp;
    }

    public void setNotPntJurElp(BigDecimal notPntJurElp) {
        this.notPntJurElp = notPntJurElp;
    }

    public Short getNbrRngEtuElp() {
        return nbrRngEtuElp;
    }

    public void setNbrRngEtuElp(Short nbrRngEtuElp) {
        this.nbrRngEtuElp = nbrRngEtuElp;
    }

    public String getEtaRngElp() {
        return etaRngElp;
    }

    public void setEtaRngElp(String etaRngElp) {
        this.etaRngElp = etaRngElp;
    }

    public Integer getCodNumUtiCre() {
        return codNumUtiCre;
    }

    public void setCodNumUtiCre(Integer codNumUtiCre) {
        this.codNumUtiCre = codNumUtiCre;
    }

    public Date getDatCreElp() {
        return datCreElp;
    }

    public void setDatCreElp(Date datCreElp) {
        this.datCreElp = datCreElp;
    }

    public Integer getCodNumUtiMod() {
        return codNumUtiMod;
    }

    public void setCodNumUtiMod(Integer codNumUtiMod) {
        this.codNumUtiMod = codNumUtiMod;
    }

    public Date getDatModElp() {
        return datModElp;
    }

    public void setDatModElp(Date datModElp) {
        this.datModElp = datModElp;
    }

    public String getTemIntElp() {
        return temIntElp;
    }

    public void setTemIntElp(String temIntElp) {
        this.temIntElp = temIntElp;
    }

    public String getTemIaeKoElp() {
        return temIaeKoElp;
    }

    public void setTemIaeKoElp(String temIaeKoElp) {
        this.temIaeKoElp = temIaeKoElp;
    }

    public String getTemIpElp() {
        return temIpElp;
    }

    public void setTemIpElp(String temIpElp) {
        this.temIpElp = temIpElp;
    }

    public String getTemIndCrnElp() {
        return temIndCrnElp;
    }

    public void setTemIndCrnElp(String temIndCrnElp) {
        this.temIndCrnElp = temIndCrnElp;
    }

    public String getTemExiNotElp() {
        return temExiNotElp;
    }

    public void setTemExiNotElp(String temExiNotElp) {
        this.temExiNotElp = temExiNotElp;
    }

    public String getTemDstSupElp() {
        return temDstSupElp;
    }

    public void setTemDstSupElp(String temDstSupElp) {
        this.temDstSupElp = temDstSupElp;
    }

    public String getTemCrnHerElp() {
        return temCrnHerElp;
    }

    public void setTemCrnHerElp(String temCrnHerElp) {
        this.temCrnHerElp = temCrnHerElp;
    }

    public String getTemOriActElp() {
        return temOriActElp;
    }

    public void setTemOriActElp(String temOriActElp) {
        this.temOriActElp = temOriActElp;
    }

    public String getTemTrtRptElp() {
        return temTrtRptElp;
    }

    public void setTemTrtRptElp(String temTrtRptElp) {
        this.temTrtRptElp = temTrtRptElp;
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
        hash += (resultatElpPK != null ? resultatElpPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ResultatElp)) {
            return false;
        }
        ResultatElp other = (ResultatElp) object;
        if ((this.resultatElpPK == null && other.resultatElpPK != null) || (this.resultatElpPK != null && !this.resultatElpPK.equals(other.resultatElpPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.appo.restouf.entities.ResultatElp[ resultatElpPK=" + resultatElpPK + " ]";
    }
    
}
