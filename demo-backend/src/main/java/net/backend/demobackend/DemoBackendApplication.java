package net.backend.demobackend;

import net.backend.demobackend.entity.Employee;
import net.backend.demobackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(DemoBackendApplication.class, args);

		System.out.println("hello world");
	}
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee1 = Employee.builder()
				.firstName("sean")
				.lastName("kim")
				.email("sk.kim@mountain-info.co.jp")
				.build();

		Employee employee2 = Employee.builder()
				.firstName("sean")
				.lastName("kim")
				.email("sk.kim@mountain-info.co.jp")
				.build();

		Employee employee3 = Employee.builder()
				.firstName("sean")
				.lastName("kim")
				.email("sk.kim@mountain-info.co.jp")
				.build();

		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
	}
}
