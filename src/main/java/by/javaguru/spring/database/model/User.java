package by.javaguru.spring.database.model;
import lombok.*;

@Builder
@Value
public class User {
    Integer id;
    String username;
}