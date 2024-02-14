package by.javaguru.spring;

import by.javaguru.spring.config.ApplicationConfiguration;
import by.javaguru.spring.service.CompanyService;
import by.javaguru.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class)) {
            var userService = context.getBean("userService", UserService.class);
            var user = userService.findUserById(2);
            System.out.println(user);
            var companyService = context.getBean("companyService", CompanyService.class);
            var company = companyService.findCompanyById(2);
            System.out.println(company);
        }
    }
}
