package demo;

import demo.Services.ProjectService;
import demo.Services.SpecialtyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {
    private static ProjectService projectService;
    private static SpecialtyService specialtyService;


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        projectService = context.getBean(ProjectService.class);
        projectService.testProject();
        specialtyService = context.getBean(SpecialtyService.class);
        specialtyService.testSpecialty();
    }
}