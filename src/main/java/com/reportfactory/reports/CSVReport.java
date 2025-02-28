package com.reportfactory.reports;

public class CSVReport implements Report {
    @Override
    public void generateReport() {
        System.out.println("Generando reporte en formato CSV...");
    }

    @Override
    public void downloadReport() {
        System.out.println("Descargando reporte CSV...");
    }
}