package ua.edu.ucu.apps.task3;

public class Main {
    
    public static void main(String[] args) {
        CompanyReaderFacade crf = new CompanyReaderFacade();
        Company company = crf.fetch("Apple");
        System.out.println(company);
    }
}
