package com.example.ej17;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    public static void main(String[] args) {
        // Crear un TreeMap para almacenar las fechas y los eventos
        TreeMap<String, String> agenda = new TreeMap<>();

        // Agregar eventos a la agenda
        agenda.put("2025-03-01", "Reunión con el equipo");
        agenda.put("2025-03-05", "Conferencia de tecnología");
        agenda.put("2025-02-28", "Cena con clientes");
        agenda.put("2025-03-10", "Entrega de proyecto");
        agenda.put("2025-02-25", "Revisión médica");

        // Mostrar los eventos en orden cronológico
        System.out.println("Agenda de eventos en orden cronológico:");
        for (Map.Entry<String, String> entrada : agenda.entrySet()) {
            System.out.println("Fecha: " + entrada.getKey() + ", Evento: " + entrada.getValue());
        }

        // Obtener y mostrar el evento más próximo
        String proximaFecha = agenda.firstKey();
        String proximoEvento = agenda.get(proximaFecha);
        System.out.println("\nEvento más próximo:");
        System.out.println("Fecha: " + proximaFecha + ", Evento: " + proximoEvento);
    }
}

