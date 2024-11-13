package id.my.hendisantika.vaadincrud;

import id.my.hendisantika.vaadincrud.model.Person;
import id.my.hendisantika.vaadincrud.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootVaadinCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootVaadinCrudApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadData(PersonRepository repository) {
        return (args) -> {
            // Add some data to database
            repository.save(new Person("Itadori", "Yuji"));
            repository.save(new Person("Megumi", "Fushiguro"));
            repository.save(new Person("Gojo", "Satoru"));
            repository.save(new Person("Ryoumen", "Sukuna"));
        };
    }
}
