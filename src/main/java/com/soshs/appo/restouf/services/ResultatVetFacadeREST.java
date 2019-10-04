/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soshs.appo.restouf.services;

import com.soshs.appo.restouf.entities.ResultatVet;
import com.soshs.appo.restouf.entities.ResultatVetPK;
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
@Path("wsresultatvet")
public class ResultatVetFacadeREST extends AbstractFacade<ResultatVet> {

    @PersistenceContext(unitName = "apoPU")
    private EntityManager em;

    private ResultatVetPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;codInd=codIndValue;codEtp=codEtpValue;codVrsVet=codVrsVetValue;codAnu=codAnuValue;codSes=codSesValue;codAdm=codAdmValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        com.soshs.appo.restouf.entities.ResultatVetPK key = new com.soshs.appo.restouf.entities.ResultatVetPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
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
        java.util.List<String> codAnu = map.get("codAnu");
        if (codAnu != null && !codAnu.isEmpty()) {
            key.setCodAnu(codAnu.get(0));
        }
        java.util.List<String> codSes = map.get("codSes");
        if (codSes != null && !codSes.isEmpty()) {
            key.setCodSes(codSes.get(0));
        }
        java.util.List<String> codAdm = map.get("codAdm");
        if (codAdm != null && !codAdm.isEmpty()) {
            key.setCodAdm(codAdm.get(0));
        }
        return key;
    }

    public ResultatVetFacadeREST() {
        super(ResultatVet.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(ResultatVet entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") PathSegment id, ResultatVet entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        com.soshs.appo.restouf.entities.ResultatVetPK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public ResultatVet find(@PathParam("id") PathSegment id) {
        com.soshs.appo.restouf.entities.ResultatVetPK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<ResultatVet> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<ResultatVet> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
