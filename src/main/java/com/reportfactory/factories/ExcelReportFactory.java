package com.reportfactory.factories;

import com.reportfactory.reports.ExcelReport;

import com.reportfactory.reports.Report;

public class ExcelReportFactory implements ReportFactory {
    @Override
    public Report createReport() {
        return new ExcelReport();
    }
}