package minborg.jpastreamer.examples;

import com.speedment.jpastreamer.application.JPAStreamer;
import minborg.jpastreamer.examples.model.Film;
import minborg.jpastreamer.examples.model.Film$;

public final class LongFilms {

    public static void main(String[] args) {

        final JPAStreamer jpaStreamer = JPAStreamer.createJPAStreamerBuilder("sakila")
                .build();

        jpaStreamer.stream(Film.class)
                .filter(Film$.length.between(100, 120))
                .forEach(LongFilms::printFilm);

        jpaStreamer.close();


        System.exit(0);
    }

    private static void printFilm(Film f) {
        System.out.printf("%4d %-25s %-5s %d%n", f.getFilmId(), f.getTitle(), f.getRating(), f.getLength());
    }

}