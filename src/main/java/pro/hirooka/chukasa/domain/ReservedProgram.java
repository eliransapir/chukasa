package pro.hirooka.chukasa.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class ReservedProgram {
    @Id
    private int id;
    private int ch;
    private String genre;
    private long begin;
    private long end;
    private long start;
    private long stop;
    private int duration;
    private String title;
    private String summury;
}