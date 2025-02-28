package com.reportfactory.reports;

public class ExcelReport implements Report {
    @Override
    public void generateReport() {
        
        System.out.println("\n Generando reporte en formato Excel...");
    }

    @Override
    public void downloadReport() {

        System.out.println("\n Descargando reporte Excel...");
    }
}