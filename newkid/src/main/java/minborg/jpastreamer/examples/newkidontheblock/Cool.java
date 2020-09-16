package minborg.jpastreamer.examples.newkidontheblock;

import com.speedment.jpastreamer.application.JPAStreamer;
import com.speedment.jpastreamer.streamconfiguration.StreamConfiguration;
import minborg.jpastreamer.examples.newkidontheblock.model.Actor;
import minborg.jpastreamer.examples.newkidontheblock.model.Film;
import minborg.jpastreamer.examples.newkidontheblock.model.Film$;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summarizingInt;

public class Cool {

    public static void main(String[] args) {

        final JPAStreamer jpaStreamer = JPAStreamer.createJPAStreamerBuilder("sakila").build();

        jpaStreamer.stream(StreamConfiguration.of(Film.class).joining(Film$.actors).joining(Film$.language))
                .filter(Film$.rating.in("G", "PG"))
                .forEach(System.out::println);


        jpaStreamer.close();

    }

}
