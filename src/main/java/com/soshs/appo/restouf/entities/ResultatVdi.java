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
@Table(name = "RESULTAT_VDI")
@NamedQueries({
    @NamedQuery(name = "ResultatVdi.findAll", query = "SELECT r FROM ResultatVdi r"),
    @NamedQuery(name = "ResultatVdi.findByCodInd", query = "SELECT r FROM ResultatVdi r WHERE r.resultatVdiPK.codInd = :codInd"),
    @NamedQuery(name = "ResultatVdi.findByCodDip", query = "SELECT r FROM ResultatVdi r WHERE r.resultatVdiPK.codDip = :codDip"),
    @NamedQuery(name = "ResultatVdi.findByCodVrsVdi", query = "SELECT r FROM ResultatVdi r WHERE r.resultatVdiPK.codVrsVdi = :codVrsVdi"),
    @NamedQuery(name = "ResultatVdi.findByCodAnu", query = "SELECT r FROM ResultatVdi r WHERE r.resultatVdiPK.codAnu = :codAnu"),
    @NamedQuery(name = "ResultatVdi.findByCodSes", query = "SELECT r FROM ResultatVdi r WHERE r.resultatVdiPK.codSes = :codSes"),
    @NamedQuery(name = "ResultatVdi.findByCodAdm", query = "SELECT r FROM ResultatVdi r WHERE r.resultatVdiPK.codAdm = :codAdm"),
    @NamedQuery(name = "ResultatVdi.findByNotVdi", query = "SELECT r FROM ResultatVdi r WHERE r.notVdi = :notVdi"),
    @NamedQuery(name = "ResultatVdi.findByNotSubVdi", query = "SELECT r FROM ResultatVdi r WHERE r.notSubVdi = :notSubVdi"),
    @NamedQuery(name = "ResultatVdi.findByBarNotVdi", query = "SELECT r FROM ResultatVdi r WHERE r.barNotVdi = :barNotVdi"),
    @NamedQuery(name = "ResultatVdi.findByEtaNotVdi", query = "SELECT r FROM ResultatVdi r WHERE r.etaNotVdi = :etaNotVdi"),
    @NamedQuery(name = "ResultatVdi.findByEtaResVdi", query = "SELECT r FROM ResultatVdi r WHERE r.etaResVdi = :etaResVdi"),
    @NamedQuery(name = "ResultatVdi.findByEtaMndVdi", query = "SELECT r FROM ResultatVdi r WHERE r.etaMndVdi = :etaMndVdi"),
    @NamedQuery(name = "ResultatVdi.findByNotPntJurVdi", query = "SELECT r FROM ResultatVdi r WHERE r.notPntJurVdi = :notPntJurVdi"),
    @NamedQuery(name = "ResultatVdi.findByNbrRngEtuVdi", query = "SELECT r FROM ResultatVdi r WHERE r.nbrRngEtuVdi = :nbrRngEtuVdi"),
    @NamedQuery(name = "ResultatVdi.findByEtaRngVdi", query = "SELECT r FROM ResultatVdi r WHERE r.etaRngVdi = :etaRngVdi"),
    @NamedQuery(name = "ResultatVdi.findByCodNumUtiCre", query = "SELECT r FROM ResultatVdi r WHERE r.codNumUtiCre = :codNumUtiCre"),
    @NamedQuery(name = "ResultatVdi.findByDatCreVdi", query = "SELECT r FROM ResultatVdi r WHERE r.datCreVdi = :datCreVdi"),
    @NamedQuery(name = "ResultatVdi.findByCodNumUtiMod", query = "SELECT r FROM ResultatVdi r WHERE r.codNumUtiMod = :codNumUtiMod"),
    @NamedQuery(name = "ResultatVdi.findByDatModVdi", query = "SELECT r FROM ResultatVdi r WHERE r.datModVdi = :datModVdi"),
    @NamedQuery(name = "ResultatVdi.findByDatObtVdi", query = "SELECT r FROM ResultatVdi r WHERE r.datObtVdi = :datObtVdi"),
    @NamedQuery(name = "ResultatVdi.findByNumObtVdi", query = "SELECT r FROM ResultatVdi r WHERE r.numObtVdi = :numObtVdi"),
    @NamedQuery(name = "ResultatVdi.findByTemIntVdi", query = "SELECT r FROM ResultatVdi r WHERE r.temIntVdi = :temIntVdi"),
    @NamedQuery(name = "ResultatVdi.findByTemIaeKoVdi", query = "SELECT r FROM ResultatVdi r WHERE r.temIaeKoVdi = :temIaeKoVdi"),
    @NamedQuery(name = "ResultatVdi.findByTemIndCrnVdi", query = "SELECT r FROM ResultatVdi r WHERE r.temIndCrnVdi = :temIndCrnVdi"),
    @NamedQuery(name = "ResultatVdi.findByTemExiNotVdi", query = "SELECT r FROM ResultatVdi r WHERE r.temExiNotVdi = :temExiNotVdi"),
    @NamedQuery(name = "ResultatVdi.findByTemDstSupVdi", query = "SELECT r FROM ResultatVdi r WHERE r.temDstSupVdi = :temDstSupVdi"),
    @NamedQuery(name = "ResultatVdi.findByTemCrnHerVdi", query = "SELECT r FROM ResultatVdi r WHERE r.temCrnHerVdi = :temCrnHerVdi"),
    @NamedQuery(name = "ResultatVdi.findByTemDlvAutVdi", query = "SELECT r FROM ResultatVdi r WHERE r.temDlvAutVdi = :temDlvAutVdi"),
    @NamedQuery(name = "ResultatVdi.findByEtaDlvAutVdi", query = "SELECT r FROM ResultatVdi r WHERE r.etaDlvAutVdi = :etaDlvAutVdi"),
    @NamedQuery(name = "ResultatVdi.findByTemOriActVdi", query = "SELECT r FROM ResultatVdi r WHERE r.temOriActVdi = :temOriActVdi"),
    @NamedQuery(name = "ResultatVdi.findByTemTrtRptVdi", query = "SELECT r FROM ResultatVdi r WHERE r.temTrtRptVdi = :temTrtRptVdi"),
    @NamedQuery(name = "ResultatVdi.findByTemIngMai", query = "SELECT r FROM ResultatVdi r WHERE r.temIngMai = :temIngMai"),
    @NamedQuery(name = "ResultatVdi.findByTemVrsEur", query = "SELECT r FROM ResultatVdi r WHERE r.temVrsEur = :temVrsEur"),
    @NamedQuery(name = "ResultatVdi.findByCodEtuAno", query = "SELECT r FROM ResultatVdi r WHERE r.codEtuAno = :codEtuAno")})
public class ResultatVdi implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ResultatVdiPK resultatVdiPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "NOT_VDI")
    private BigDecimal notVdi;
    @Size(max = 3)
    @Column(name = "NOT_SUB_VDI")
    private String notSubVdi;
    @Column(name = "BAR_NOT_VDI")
    private Integer barNotVdi;
    @Size(max = 1)
    @Column(name = "ETA_NOT_VDI")
    private String etaNotVdi;
    @Size(max = 1)
    @Column(name = "ETA_RES_VDI")
    private String etaResVdi;
    @Size(max = 1)
    @Column(name = "ETA_MND_VDI")
    private String etaMndVdi;
    @Column(name = "NOT_PNT_JUR_VDI")
    private BigDecimal notPntJurVdi;
    @Column(name = "NBR_RNG_ETU_VDI")
    private Short nbrRngEtuVdi;
    @Size(max = 1)
    @Column(name = "ETA_RNG_VDI")
    private String etaRngVdi;
    @Column(name = "COD_NUM_UTI_CRE")
    private Integer codNumUtiCre;
    @Column(name = "DAT_CRE_VDI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datCreVdi;
    @Column(name = "COD_NUM_UTI_MOD")
    private Integer codNumUtiMod;
    @Column(name = "DAT_MOD_VDI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datModVdi;
    @Column(name = "DAT_OBT_VDI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datObtVdi;
    @Column(name = "NUM_OBT_VDI")
    private Integer numObtVdi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_INT_VDI")
    private String temIntVdi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_IAE_KO_VDI")
    private String temIaeKoVdi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "TEM_IND_CRN_VDI")
    private String temIndCrnVdi;
    @Size(max = 1)
    @Column(name = "TEM_EXI_NOT_VDI")
    private String temExiNotVdi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_DST_SUP_VDI")
    private String temDstSupVdi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_CRN_HER_VDI")
    private String temCrnHerVdi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_DLV_AUT_VDI")
    private String temDlvAutVdi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "ETA_DLV_AUT_VDI")
    private String etaDlvAutVdi;
    @Size(max = 1)
    @Column(name = "TEM_ORI_ACT_VDI")
    private String temOriActVdi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_TRT_RPT_VDI")
    private String temTrtRptVdi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_ING_MAI")
    private String temIngMai;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_VRS_EUR")
    private String temVrsEur;
    @Column(name = "COD_ETU_ANO")
    private Integer codEtuAno;
    @JoinColumn(name = "COD_IND", referencedColumnName = "COD_IND", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Individu individu;

    public ResultatVdi() {
    }

    public ResultatVdi(ResultatVdiPK resultatVdiPK) {
        this.resultatVdiPK = resultatVdiPK;
    }

    public ResultatVdi(ResultatVdiPK resultatVdiPK, String temIntVdi, String temIaeKoVdi, String temIndCrnVdi, String temDstSupVdi, String temCrnHerVdi, String temDlvAutVdi, String etaDlvAutVdi, String temTrtRptVdi, String temIngMai, String temVrsEur) {
        this.resultatVdiPK = resultatVdiPK;
        this.temIntVdi = temIntVdi;
        this.temIaeKoVdi = temIaeKoVdi;
        this.temIndCrnVdi = temIndCrnVdi;
        this.temDstSupVdi = temDstSupVdi;
        this.temCrnHerVdi = temCrnHerVdi;
        this.temDlvAutVdi = temDlvAutVdi;
        this.etaDlvAutVdi = etaDlvAutVdi;
        this.temTrtRptVdi = temTrtRptVdi;
        this.temIngMai = temIngMai;
        this.temVrsEur = temVrsEur;
    }

    public ResultatVdi(int codInd, String codDip, short codVrsVdi, String codAnu, String codSes, String codAdm) {
        this.resultatVdiPK = new ResultatVdiPK(codInd, codDip, codVrsVdi, codAnu, codSes, codAdm);
    }

    public ResultatVdiPK getResultatVdiPK() {
        return resultatVdiPK;
    }

    public void setResultatVdiPK(ResultatVdiPK resultatVdiPK) {
        this.resultatVdiPK = resultatVdiPK;
    }

    public BigDecimal getNotVdi() {
        return notVdi;
    }

    public void setNotVdi(BigDecimal notVdi) {
        this.notVdi = notVdi;
    }

    public String getNotSubVdi() {
        return notSubVdi;
    }

    public void setNotSubVdi(String notSubVdi) {
        this.notSubVdi = notSubVdi;
    }

    public Integer getBarNotVdi() {
        return barNotVdi;
    }

    public void setBarNotVdi(Integer barNotVdi) {
        this.barNotVdi = barNotVdi;
    }

    public String getEtaNotVdi() {
        return etaNotVdi;
    }

    public void setEtaNotVdi(String etaNotVdi) {
        this.etaNotVdi = etaNotVdi;
    }

    public String getEtaResVdi() {
        return etaResVdi;
    }

    public void setEtaResVdi(String etaResVdi) {
        this.etaResVdi = etaResVdi;
    }

    public String getEtaMndVdi() {
        return etaMndVdi;
    }

    public void setEtaMndVdi(String etaMndVdi) {
        this.etaMndVdi = etaMndVdi;
    }

    public BigDecimal getNotPntJurVdi() {
        return notPntJurVdi;
    }

    public void setNotPntJurVdi(BigDecimal notPntJurVdi) {
        this.notPntJurVdi = notPntJurVdi;
    }

    public Short getNbrRngEtuVdi() {
        return nbrRngEtuVdi;
    }

    public void setNbrRngEtuVdi(Short nbrRngEtuVdi) {
        this.nbrRngEtuVdi = nbrRngEtuVdi;
    }

    public String getEtaRngVdi() {
        return etaRngVdi;
    }

    public void setEtaRngVdi(String etaRngVdi) {
        this.etaRngVdi = etaRngVdi;
    }

    public Integer getCodNumUtiCre() {
        return codNumUtiCre;
    }

    public void setCodNumUtiCre(Integer codNumUtiCre) {
        this.codNumUtiCre = codNumUtiCre;
    }

    public Date getDatCreVdi() {
        return datCreVdi;
    }

    public void setDatCreVdi(Date datCreVdi) {
        this.datCreVdi = datCreVdi;
    }

    public Integer getCodNumUtiMod() {
        return codNumUtiMod;
    }

    public void setCodNumUtiMod(Integer codNumUtiMod) {
        this.codNumUtiMod = codNumUtiMod;
    }

    public Date getDatModVdi() {
        return datModVdi;
    }

    public void setDatModVdi(Date datModVdi) {
        this.datModVdi = datModVdi;
    }

    public Date getDatObtVdi() {
        return datObtVdi;
    }

    public void setDatObtVdi(Date datObtVdi) {
        this.datObtVdi = datObtVdi;
    }

    public Integer getNumObtVdi() {
        return numObtVdi;
    }

    public void setNumObtVdi(Integer numObtVdi) {
        this.numObtVdi = numObtVdi;
    }

    public String getTemIntVdi() {
        return temIntVdi;
    }

    public void setTemIntVdi(String temIntVdi) {
        this.temIntVdi = temIntVdi;
    }

    public String getTemIaeKoVdi() {
        return temIaeKoVdi;
    }

    public void setTemIaeKoVdi(String temIaeKoVdi) {
        this.temIaeKoVdi = temIaeKoVdi;
    }

    public String getTemIndCrnVdi() {
        return temIndCrnVdi;
    }

    public void setTemIndCrnVdi(String temIndCrnVdi) {
        this.temIndCrnVdi = temIndCrnVdi;
    }

    public String getTemExiNotVdi() {
        return temExiNotVdi;
    }

    public void setTemExiNotVdi(String temExiNotVdi) {
        this.temExiNotVdi = temExiNotVdi;
    }

    public String getTemDstSupVdi() {
        return temDstSupVdi;
    }

    public void setTemDstSupVdi(String temDstSupVdi) {
        this.temDstSupVdi = temDstSupVdi;
    }

    public String getTemCrnHerVdi() {
        return temCrnHerVdi;
    }

    public void setTemCrnHerVdi(String temCrnHerVdi) {
        this.temCrnHerVdi = temCrnHerVdi;
    }

    public String getTemDlvAutVdi() {
        return temDlvAutVdi;
    }

    public void setTemDlvAutVdi(String temDlvAutVdi) {
        this.temDlvAutVdi = temDlvAutVdi;
    }

    public String getEtaDlvAutVdi() {
        return etaDlvAutVdi;
    }

    public void setEtaDlvAutVdi(String etaDlvAutVdi) {
        this.etaDlvAutVdi = etaDlvAutVdi;
    }

    public String getTemOriActVdi() {
        return temOriActVdi;
    }

    public void setTemOriActVdi(String temOriActVdi) {
        this.temOriActVdi = temOriActVdi;
    }

    public String getTemTrtRptVdi() {
        return temTrtRptVdi;
    }

    public void setTemTrtRptVdi(String temTrtRptVdi) {
        this.temTrtRptVdi = temTrtRptVdi;
    }

    public String getTemIngMai() {
        return temIngMai;
    }

    public void setTemIngMai(String temIngMai) {
        this.temIngMai = temIngMai;
    }

    public String getTemVrsEur() {
        return temVrsEur;
    }

    public void setTemVrsEur(String temVrsEur) {
        this.temVrsEur = temVrsEur;
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
        hash += (resultatVdiPK != null ? resultatVdiPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ResultatVdi)) {
            return false;
        }
        ResultatVdi other = (ResultatVdi) object;
        if ((this.resultatVdiPK == null && other.resultatVdiPK != null) || (this.resultatVdiPK != null && !this.resultatVdiPK.equals(other.resultatVdiPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.appo.restouf.entities.ResultatVdi[ resultatVdiPK=" + resultatVdiPK + " ]";
    }
    
}
