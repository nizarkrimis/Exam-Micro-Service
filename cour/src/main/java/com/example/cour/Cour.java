package com.example.cour;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cour {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer studentId;

}
