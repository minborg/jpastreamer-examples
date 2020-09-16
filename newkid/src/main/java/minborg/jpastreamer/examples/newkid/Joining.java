package minborg.jpastreamer.examples.newkid;

import com.speedment.jpastreamer.application.JPAStreamer;
import com.speedment.jpastreamer.streamconfiguration.StreamConfiguration;
import minborg.jpastreamer.examples.newkid.model.Film;
import minborg.jpastreamer.examples.newkid.model.Film$;

import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public final class Joining {

    public static void main(String[] args) {

        final JPAStreamer jpaStreamer = JPAStreamer.of("sakila");

        StreamConfiguration<Film> configuration = StreamConfiguration.of(Film.class)
                .joining(Film$.actors)
                .joining(Film$.language);

        jpaStreamer.stream(configuration)
                .filter(Film$.rating.in("G", "PG"))
                .forEach(System.out::println);

        jpaStreamer.close();


        System.exit(0);

    }

}
