/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soshs.appo.restouf.entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author master05
 */
@Entity
@Table(name = "NATURE_ELP")
@NamedQueries({
    @NamedQuery(name = "NatureElement.findAll", query = "SELECT n FROM NatureElement n"),
    @NamedQuery(name = "NatureElement.findByCodNel", query = "SELECT n FROM NatureElement n WHERE n.codNel = :codNel"),
    @NamedQuery(name = "NatureElement.findByLibNel", query = "SELECT n FROM NatureElement n WHERE n.libNel = :libNel"),
    @NamedQuery(name = "NatureElement.findByLicNel", query = "SELECT n FROM NatureElement n WHERE n.licNel = :licNel")
    })
public class NatureElement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "COD_NEL")
    private String codNel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "LIB_NEL")
    private String libNel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "LIC_NEL")
    private String licNel;
     @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "TEM_EN_SVE_NEL")
    private String temEnSveNel;

    public NatureElement() {
    }

    public NatureElement(String codNel, String libNel, String licNel, String temEnSveNel) {
        this.codNel = codNel;
        this.libNel = libNel;
        this.licNel = licNel;
        this.temEnSveNel = temEnSveNel;
    }

    public String getCodNel() {
        return codNel;
    }

    public void setCodNel(String codNel) {
        this.codNel = codNel;
    }

    public String getLibNel() {
        return libNel;
    }

    public void setLibNel(String libNel) {
        this.libNel = libNel;
    }

    public String getLicNel() {
        return licNel;
    }

    public void setLicNel(String licNel) {
        this.licNel = licNel;
    }

    public String getTemEnSveNel() {
        return temEnSveNel;
    }

    public void setTemEnSveNel(String temEnSveNel) {
        this.temEnSveNel = temEnSveNel;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.codNel);
        hash = 61 * hash + Objects.hashCode(this.libNel);
        hash = 61 * hash + Objects.hashCode(this.licNel);
        hash = 61 * hash + Objects.hashCode(this.temEnSveNel);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NatureElement other = (NatureElement) obj;
        if (!Objects.equals(this.codNel, other.codNel)) {
            return false;
        }
        if (!Objects.equals(this.libNel, other.libNel)) {
            return false;
        }
        if (!Objects.equals(this.licNel, other.licNel)) {
            return false;
        }
        if (!Objects.equals(this.temEnSveNel, other.temEnSveNel)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NatureElement{" + "libNel=" + libNel + '}';
    }
    
     
}
