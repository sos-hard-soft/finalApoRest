/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soshs.appo.restouf.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name = "INDIVIDU")
@NamedQueries({
    @NamedQuery(name = "Individu.findAll", query = "SELECT i FROM Individu i"),
    @NamedQuery(name = "Individu.findByCodInd", query = "SELECT i FROM Individu i WHERE i.codInd = :codInd"),
    @NamedQuery(name = "Individu.findByCodNneInd", query = "SELECT i FROM Individu i WHERE i.codNneInd = :codNneInd"),
    @NamedQuery(name = "Individu.findByDateNaiInd", query = "SELECT i FROM Individu i WHERE i.dateNaiInd = :dateNaiInd"),
    @NamedQuery(name = "Individu.findByLibNomPatInd", query = "SELECT i FROM Individu i WHERE i.libNomPatInd = :libNomPatInd"),
    @NamedQuery(name = "Individu.findByLibNomUsuInd", query = "SELECT i FROM Individu i WHERE i.libNomUsuInd = :libNomUsuInd"),
    @NamedQuery(name = "Individu.findByLibPr1Ind", query = "SELECT i FROM Individu i WHERE i.libPr1Ind = :libPr1Ind"),
    @NamedQuery(name = "Individu.findByLibPr2Ind", query = "SELECT i FROM Individu i WHERE i.libPr2Ind = :libPr2Ind"),
    @NamedQuery(name = "Individu.findByLibPr3Ind", query = "SELECT i FROM Individu i WHERE i.libPr3Ind = :libPr3Ind"),
    @NamedQuery(name = "Individu.findByLibNomIndArb", query = "SELECT i FROM Individu i WHERE i.libNomIndArb = :libNomIndArb"),
    @NamedQuery(name = "Individu.findByLibPrnIndArb", query = "SELECT i FROM Individu i WHERE i.libPrnIndArb = :libPrnIndArb"),
    @NamedQuery(name = "Individu.findByCinInd", query = "SELECT i FROM Individu i WHERE i.cinInd = :cinInd"),
    @NamedQuery(name = "Individu.findByLibVilNaiEtuArb", query = "SELECT i FROM Individu i WHERE i.libVilNaiEtuArb = :libVilNaiEtuArb")})
public class Individu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_IND")
    private Integer codInd;
    @Size(max = 10)
    @Column(name = "COD_NNE_IND")
    private String codNneInd;
    @Column(name = "DATE_NAI_IND")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateNaiInd;
    @Size(max = 30)
    @Column(name = "LIB_NOM_PAT_IND")
    private String libNomPatInd;
    @Size(max = 30)
    @Column(name = "LIB_NOM_USU_IND")
    private String libNomUsuInd;
    @Size(max = 20)
    @Column(name = "LIB_PR1_IND")
    private String libPr1Ind;
    @Size(max = 20)
    @Column(name = "LIB_PR2_IND")
    private String libPr2Ind;
    @Size(max = 20)
    @Column(name = "LIB_PR3_IND")
    private String libPr3Ind;
    @Column(name = "COD_ETU")
    private Integer codEtu;
    @Size(max = 1)
    @Column(name = "COD_SEX_ETU")
    private String codSexEtu;
    @Size(max = 13)
    @Column(name = "COD_NNI_ETU")
    private String codNniEtu;
    @Size(max = 30)
    @Column(name = "LIB_VIL_NAI_ETU")
    private String libVilNaiEtu;
    @Size(max = 30)
    @Column(name = "LIB_NOM_IND_ARB")
    private String libNomIndArb;
    @Size(max = 20)
    @Column(name = "LIB_PRN_IND_ARB")
    private String libPrnIndArb;
    @Size(max = 10)
    @Column(name = "CIN_IND")
    private String cinInd;
    @Size(max = 30)
    @Column(name = "LIB_VIL_NAI_ETU_ARB")
    private String libVilNaiEtuArb;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "individu", fetch=FetchType.EAGER)
    private Collection<ResultatVdi> resultatVdiCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "individu", fetch=FetchType.EAGER)
    private Collection<ResultatElp> resultatElpCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "individu", fetch=FetchType.EAGER)
    private Collection<ResultatVet> resultatVetCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "individu", fetch=FetchType.EAGER)
    private PhoEtu phoEtu;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "individu", fetch=FetchType.EAGER)
    private Collection<IndBac> indBacCollection;

    public Individu() {
    }

    public Individu(Integer codInd, String codNneInd, Date dateNaiInd, String libNomPatInd, String libNomUsuInd, String libPr1Ind, String libPr2Ind, String libPr3Ind, Integer codEtu, String codSexEtu, String codNniEtu, String libVilNaiEtu, String libNomIndArb, String libPrnIndArb, String cinInd, String libVilNaiEtuArb, Collection<ResultatVdi> resultatVdiCollection, Collection<ResultatElp> resultatElpCollection, Collection<ResultatVet> resultatVetCollection, PhoEtu phoEtu, Collection<IndBac> indBacCollection) {
        this.codInd = codInd;
        this.codNneInd = codNneInd;
        this.dateNaiInd = dateNaiInd;
        this.libNomPatInd = libNomPatInd;
        this.libNomUsuInd = libNomUsuInd;
        this.libPr1Ind = libPr1Ind;
        this.libPr2Ind = libPr2Ind;
        this.libPr3Ind = libPr3Ind;
        this.codEtu = codEtu;
        this.codSexEtu = codSexEtu;
        this.codNniEtu = codNniEtu;
        this.libVilNaiEtu = libVilNaiEtu;
        this.libNomIndArb = libNomIndArb;
        this.libPrnIndArb = libPrnIndArb;
        this.cinInd = cinInd;
        this.libVilNaiEtuArb = libVilNaiEtuArb;
        this.resultatVdiCollection = resultatVdiCollection;
        this.resultatElpCollection = resultatElpCollection;
        this.resultatVetCollection = resultatVetCollection;
        this.phoEtu = phoEtu;
        this.indBacCollection = indBacCollection;
    }
    

    public Individu(Integer codInd) {
        this.codInd = codInd;
    }

    public Integer getCodInd() {
        return codInd;
    }

    public void setCodInd(Integer codInd) {
        this.codInd = codInd;
    }

    public String getCodNneInd() {
        return codNneInd;
    }

    public void setCodNneInd(String codNneInd) {
        this.codNneInd = codNneInd;
    }

    public Date getDateNaiInd() {
        return dateNaiInd;
    }

    public void setDateNaiInd(Date dateNaiInd) {
        this.dateNaiInd = dateNaiInd;
    }

    public String getLibNomPatInd() {
        return libNomPatInd;
    }

    public void setLibNomPatInd(String libNomPatInd) {
        this.libNomPatInd = libNomPatInd;
    }

    public String getLibNomUsuInd() {
        return libNomUsuInd;
    }

    public void setLibNomUsuInd(String libNomUsuInd) {
        this.libNomUsuInd = libNomUsuInd;
    }

    public String getLibPr1Ind() {
        return libPr1Ind;
    }

    public void setLibPr1Ind(String libPr1Ind) {
        this.libPr1Ind = libPr1Ind;
    }

    public String getLibPr2Ind() {
        return libPr2Ind;
    }

    public void setLibPr2Ind(String libPr2Ind) {
        this.libPr2Ind = libPr2Ind;
    }

    public String getLibPr3Ind() {
        return libPr3Ind;
    }

    public void setLibPr3Ind(String libPr3Ind) {
        this.libPr3Ind = libPr3Ind;
    }

    public Integer getCodEtu() {
        return codEtu;
    }

    public void setCodEtu(Integer codEtu) {
        this.codEtu = codEtu;
    }

    public String getCodSexEtu() {
        return codSexEtu;
    }

    public void setCodSexEtu(String codSexEtu) {
        this.codSexEtu = codSexEtu;
    }

    public String getCodNniEtu() {
        return codNniEtu;
    }

    public void setCodNniEtu(String codNniEtu) {
        this.codNniEtu = codNniEtu;
    }

    public String getLibVilNaiEtu() {
        return libVilNaiEtu;
    }

    public void setLibVilNaiEtu(String libVilNaiEtu) {
        this.libVilNaiEtu = libVilNaiEtu;
    }

    public String getLibNomIndArb() {
        return libNomIndArb;
    }

    public void setLibNomIndArb(String libNomIndArb) {
        this.libNomIndArb = libNomIndArb;
    }

    public String getLibPrnIndArb() {
        return libPrnIndArb;
    }

    public void setLibPrnIndArb(String libPrnIndArb) {
        this.libPrnIndArb = libPrnIndArb;
    }

    public String getCinInd() {
        return cinInd;
    }

    public void setCinInd(String cinInd) {
        this.cinInd = cinInd;
    }

    public String getLibVilNaiEtuArb() {
        return libVilNaiEtuArb;
    }

    public void setLibVilNaiEtuArb(String libVilNaiEtuArb) {
        this.libVilNaiEtuArb = libVilNaiEtuArb;
    }

    @JsonbTransient
    public Collection<ResultatVdi> getResultatVdiCollection() {
        return resultatVdiCollection;
    }

    @JsonbTransient
    public void setResultatVdiCollection(Collection<ResultatVdi> resultatVdiCollection) {
        this.resultatVdiCollection = resultatVdiCollection;
    }

    @JsonbTransient
    public Collection<ResultatElp> getResultatElpCollection() {
        return resultatElpCollection;
    }

    @JsonbTransient
    public void setResultatElpCollection(Collection<ResultatElp> resultatElpCollection) {
        this.resultatElpCollection = resultatElpCollection;
    }

    @JsonbTransient
    public Collection<ResultatVet> getResultatVetCollection() {
        return resultatVetCollection;
    }

    @JsonbTransient
    public void setResultatVetCollection(Collection<ResultatVet> resultatVetCollection) {
        this.resultatVetCollection = resultatVetCollection;
    }

    public PhoEtu getPhoEtu() {
        return phoEtu;
    }

    public void setPhoEtu(PhoEtu phoEtu) {
        this.phoEtu = phoEtu;
    }

    @JsonbTransient
    public Collection<IndBac> getIndBacCollection() {
        return indBacCollection;
    }

    @JsonbTransient
    public void setIndBacCollection(Collection<IndBac> indBacCollection) {
        this.indBacCollection = indBacCollection;
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
        if (!(object instanceof Individu)) {
            return false;
        }
        Individu other = (Individu) object;
        if ((this.codInd == null && other.codInd != null) || (this.codInd != null && !this.codInd.equals(other.codInd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.appo.restouf.entities.Individu[ codInd=" + codInd + " ]";
    }

}
