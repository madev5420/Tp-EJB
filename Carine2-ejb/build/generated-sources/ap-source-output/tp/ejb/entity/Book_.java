package tp.ejb.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tp.ejb.entity.Author;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-13T18:30:39")
@StaticMetamodel(Book.class)
public class Book_ { 

    public static volatile SingularAttribute<Book, Float> price;
    public static volatile SingularAttribute<Book, Integer> isbn;
    public static volatile SingularAttribute<Book, String> title;
    public static volatile CollectionAttribute<Book, Author> authors;

}