package com.reportfactory;

import java.util.Scanner;

import com.reportfactory.factories.CSVReportFactory;
import com.reportfactory.factories.ExcelReportFactory;
import com.reportfactory.factories.PDFReportFactory;
import com.reportfactory.factories.ReportFactory;
import com.reportfactory.reports.Report;

public class Client {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Seleccione el formato del reporte (PDF, Excel, CSV): ");
        String formato = scanner.nextLine().trim().toLowerCase();

        ReportFactory factory = null;

        switch (formato) {
            case  "pdf":
                factory = new PDFReportFactory();
                break;
            case "excel":
                factory = new ExcelReportFactory();
                break;
            case  "csv":
                factory = new CSVReportFactory();
                break;
            default:
                System.out.println("Formato no válido.");
                return;
        }

        Report report = factory.createReport();
        report.generateReport();

        System.out.print("¿Desea descargar el reporte? (S/N): ");
        String respuesta = scanner.nextLine().trim().toLowerCase();

        if (respuesta.equals("s")) {
            report.downloadReport();
        } else {
            System.out.println("Reporte generado pero no descargado.");
        }

        scanner.close();
    }
}