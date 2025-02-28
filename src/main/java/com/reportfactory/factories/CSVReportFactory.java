package com.reportfactory.factories;

import com.reportfactory.reports.CSVReport;

import com.reportfactory.reports.Report;

public class CSVReportFactory implements ReportFactory {
    @Override
    public Report createReport() {
        return new CSVReport();
    }
}