/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soshs.appo.restouf.services;

import com.soshs.appo.restouf.entities.InsAdmEtp;
import com.soshs.appo.restouf.entities.InsAdmEtpPK;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.PathSegment;

/**
 *
 * @author master05
 */
@Stateless
@Path("wsinsadmetp")
public class InsAdmEtpFacadeREST extends AbstractFacade<InsAdmEtp> {

    @PersistenceContext(unitName = "apoPU")
    private EntityManager em;

    private InsAdmEtpPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;codAnu=codAnuValue;codInd=codIndValue;codEtp=codEtpValue;codVrsVet=codVrsVetValue;numOccIae=numOccIaeValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        com.soshs.appo.restouf.entities.InsAdmEtpPK key = new com.soshs.appo.restouf.entities.InsAdmEtpPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> codAnu = map.get("codAnu");
        if (codAnu != null && !codAnu.isEmpty()) {
            key.setCodAnu(codAnu.get(0));
        }
        java.util.List<String> codInd = map.get("codInd");
        if (codInd != null && !codInd.isEmpty()) {
            key.setCodInd(new java.lang.Integer(codInd.get(0)));
        }
        java.util.List<String> codEtp = map.get("codEtp");
        if (codEtp != null && !codEtp.isEmpty()) {
            key.setCodEtp(codEtp.get(0));
        }
        java.util.List<String> codVrsVet = map.get("codVrsVet");
        if (codVrsVet != null && !codVrsVet.isEmpty()) {
            key.setCodVrsVet(new java.lang.Short(codVrsVet.get(0)));
        }
        java.util.List<String> numOccIae = map.get("numOccIae");
        if (numOccIae != null && !numOccIae.isEmpty()) {
            key.setNumOccIae(new java.lang.Short(numOccIae.get(0)));
        }
        return key;
    }

    public InsAdmEtpFacadeREST() {
        super(InsAdmEtp.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(InsAdmEtp entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") PathSegment id, InsAdmEtp entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        com.soshs.appo.restouf.entities.InsAdmEtpPK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public InsAdmEtp find(@PathParam("id") PathSegment id) {
        com.soshs.appo.restouf.entities.InsAdmEtpPK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<InsAdmEtp> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<InsAdmEtp> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
