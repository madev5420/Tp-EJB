package tp.ejb.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tp.ejb.entity.Book;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-13T18:30:39")
@StaticMetamodel(Author.class)
public class Author_ { 

    public static volatile SingularAttribute<Author, String> firstname;
    public static volatile CollectionAttribute<Author, Book> books;
    public static volatile SingularAttribute<Author, Integer> id;
    public static volatile SingularAttribute<Author, String> lastname;

}