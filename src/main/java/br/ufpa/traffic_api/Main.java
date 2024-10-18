package br.ufpa.traffic_api;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of("America/Sao_Paulo"));
        Date date = Date.from(zonedDateTime.toInstant());

        System.out.println("Data correta com fuso horário: " + date);
    }
}