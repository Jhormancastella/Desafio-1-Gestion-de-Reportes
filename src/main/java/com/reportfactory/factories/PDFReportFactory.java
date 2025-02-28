package com.reportfactory.factories;

import com.reportfactory.reports.PDFReport;
import com.reportfactory.reports.Report;

public class PDFReportFactory implements ReportFactory {
    @Override
    public Report createReport() {
        return new PDFReport();
    }
}