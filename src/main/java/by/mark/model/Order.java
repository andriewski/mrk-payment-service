package by.mark.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private UUID id;

    private String title;

    private Double price;

    private User user;
}
