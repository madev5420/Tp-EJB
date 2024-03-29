/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.ejb.sessionbeans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import tp.ejb.entity.Author;

/**
 *
 * @author Eddie
 */
@Stateless
public class AuthorFacade extends AbstractFacade<Author> implements AuthorFacadeLocal {

    @PersistenceContext(unitName = "Carine2-ejbPU2")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AuthorFacade() {
        super(Author.class);
    }
    
}
