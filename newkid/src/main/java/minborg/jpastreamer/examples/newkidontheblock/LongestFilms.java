package minborg.jpastreamer.examples.newkidontheblock;

import com.speedment.jpastreamer.application.JPAStreamer;
import com.speedment.jpastreamer.streamconfiguration.StreamConfiguration;
import minborg.jpastreamer.examples.newkidontheblock.model.Film;
import minborg.jpastreamer.examples.newkidontheblock.model.Film$;

public class LongestFilms {

    public static void main(String[] args) {

        final JPAStreamer jpaStreamer = JPAStreamer.of("sakila");

        jpaStreamer.stream(Film.class)
                .sorted(Film$.length.reversed())
                .limit(15)
                .map(f -> String.format("%3d %s", f.getLength(), f.getTitle()))
                .forEach(System.out::println);

        jpaStreamer.close();

    }

}