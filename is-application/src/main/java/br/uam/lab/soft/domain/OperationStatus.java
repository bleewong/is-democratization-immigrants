package br.uam.lab.soft.domain;

import lombok.Getter;
import lombok.Value;

public class OperationStatus {

    public enum Status {
        SD("Envio de Documentos", "SD"),
        SPB("Envio de Documentos en la entidad publica de brasil", "SPB"),
        S("Planificacion", "S"),
        QPE("Cotizar con la entidad publica", "QPE"),
        Status("Cita con la entidad publica", "SD"),
        DW("Retiro de documentos", "DW"),
        DH("Envio a domicilio", "DH"),
        F("Finalizado", "F");

        private String description;
        private String abbreviation;

        Status(final String description, final String abbreviation) {
            this.description = description;
            this.abbreviation = abbreviation;
        }

        public String getDescription() {
            return description;
        }

        public String getAbbreviation() {
            return abbreviation;
        }
    }

    @Getter private OperationStatusId id;
    @Getter private String name;
    @Getter private String abbreviation;

    @Value
    public static class OperationStatusId {
        private long value;
    }

}
