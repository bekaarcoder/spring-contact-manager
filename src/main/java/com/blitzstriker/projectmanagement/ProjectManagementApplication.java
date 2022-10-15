package com.blitzstriker.projectmanagement;

import com.blitzstriker.projectmanagement.entities.Employee;
import com.blitzstriker.projectmanagement.entities.Project;
import com.blitzstriker.projectmanagement.entities.Stage;
import com.blitzstriker.projectmanagement.repositories.EmployeeRepository;
import com.blitzstriker.projectmanagement.repositories.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
@RequiredArgsConstructor
public class ProjectManagementApplication {

    private final ProjectRepository projectRepository;
    private final EmployeeRepository employeeRepository;

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    public static void main(String[] args) {
        SpringApplication.run(ProjectManagementApplication.class, args);
    }

    /*@Override
    public void run(String... args) throws Exception {
        try {
            Employee emp1 = Employee.builder().firstName("John").lastName("Doe").email("john@gmail.com").build();
            Employee emp2 = Employee.builder().firstName("Sheila").lastName("Hallaways").email("shallaways1@gmail.com").build();
            Employee emp3 = Employee.builder().firstName("Nappie").lastName("Honnicott").email("nhonnicott2@gmail.com").build();
            Employee emp4 = Employee.builder().firstName("Rockey").lastName("Micheli").email("rmicheli3@gmail.com").build();
            Employee emp5 = Employee.builder().firstName("Tasia").lastName("Strand").email("tstrand4@gmail.com").build();
            Employee emp6 = Employee.builder().firstName("Joanne").lastName("Levington").email("jlevington5@gmail.com").build();
            Employee emp7 = Employee.builder().firstName("Luis").lastName("Garrod").email("lgarrod6@gmail.com").build();
            Employee emp8 = Employee.builder().firstName("Aubine").lastName("Sinson").email("asinson7@gmail.com").build();
            Employee emp9 = Employee.builder().firstName("Sydell").lastName("Jentgens").email("sjentgens8@gmail.com").build();

            Project p1 = Project.builder().name("Develop Web App").stage(Stage.COMPLETED).description("Developing the web application").build();
            Project p2 = Project.builder().name("Deploy Web App").stage(Stage.INPROGRESS).description("Deploy the web application").build();
            Project p3 = Project.builder().name("Production Support").stage(Stage.NOTSTARTED).description("Production support for the web application").build();
            Project p4 = Project.builder().name("Build Mobile Application").stage(Stage.NOTSTARTED).description("Building the mobile application").build();

            p1.addEmployee(emp1);
            p1.addEmployee(emp2);
            p2.addEmployee(emp3);
            p2.addEmployee(emp4);
            p3.addEmployee(emp1);
            p3.addEmployee(emp6);
            p1.addEmployee(emp7);
            p1.addEmployee(emp4);
            p2.addEmployee(emp7);

            emp1.setProjects(Arrays.asList(p1, p3));
            emp2.setProjects(Arrays.asList(p1));
            emp3.setProjects(Arrays.asList(p2));
            emp4.setProjects(Arrays.asList(p1, p2));
            emp6.setProjects(Arrays.asList(p3));
            emp7.setProjects(Arrays.asList(p1, p2));

            employeeRepository.save(emp1);
            employeeRepository.save(emp2);
            employeeRepository.save(emp3);
            employeeRepository.save(emp4);
            employeeRepository.save(emp5);
            employeeRepository.save(emp6);
            employeeRepository.save(emp7);
            employeeRepository.save(emp8);
            employeeRepository.save(emp9);

            projectRepository.save(p1);
            projectRepository.save(p2);
            projectRepository.save(p3);
            projectRepository.save(p4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
}
