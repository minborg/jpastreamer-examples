package minborg.jpastreamer.examples.newkidontheblock;

import com.speedment.jpastreamer.application.JPAStreamer;
import minborg.jpastreamer.examples.newkidontheblock.model.Actor;
import minborg.jpastreamer.examples.newkidontheblock.model.Film;

import javax.persistence.EntityManagerFactory;
import java.util.List;
import java.util.Map;

public class JPAStreamerFilmography implements Filmography {

    @Override
    public Map<Actor, List<Film>> create(EntityManagerFactory entityManagerFactory) {
        final JPAStreamer jpaStreamer = JPAStreamer.of(entityManagerFactory);

/*        jpaStreamer.stream(StreamConfiguration.of(Actor.class).joining(Actor$.films))*/


        return null;
    }
}
