package ua.goit;

import ua.goit.service.DatabaseQueryService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        DatabaseQueryService service = new DatabaseQueryService();
        System.out.println("service.findMaxProjectsClient() = " + service.findMaxProjectsClient());
        System.out.println("--------------------------------------------------------------------");
        System.out.println("service.findMaxSalaryWorker() = " + service.findMaxSalaryWorker());
        System.out.println("--------------------------------------------------------------------");
        System.out.println("service.findLongestProject() = " + service.findLongestProject());
        System.out.println("--------------------------------------------------------------------");
        System.out.println("service.findYongestOldestWorker() = " + service.findYongestOldestWorker());
        System.out.println("--------------------------------------------------------------------");
        System.out.println("service.getProjectPrices() = " + service.getProjectPrices());
    }
}
