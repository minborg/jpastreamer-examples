package minborg.jpastreamer.examples.newkidontheblock;

import minborg.jpastreamer.examples.newkidontheblock.model.Actor;
import minborg.jpastreamer.examples.newkidontheblock.model.Film;

import javax.persistence.EntityManagerFactory;
import java.util.List;
import java.util.Map;

public interface Filmography {

    /**
     * Creates and returns a new Map of all actors and
     * the corresponding films each actor appeared in.
     *
     * @param entityManagerFactory to use
     * @return Creates and returns a new Map of all actors and
     *         the corresponding films each actor appeared in
     */
    Map<Actor, List<Film>> create(EntityManagerFactory entityManagerFactory);

}