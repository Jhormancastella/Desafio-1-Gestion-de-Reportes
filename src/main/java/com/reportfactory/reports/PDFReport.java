package com.reportfactory.reports;

public class PDFReport implements Report {
    @Override
    public void generateReport() {
        System.out.println("Generando reporte en formato PDF...");
    }

    @Override
    public void downloadReport() {
        System.out.println("Descargando reporte PDF...");
    }
}