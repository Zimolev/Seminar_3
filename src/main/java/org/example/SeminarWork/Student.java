package org.example.SeminarWork;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Student {
    private String FIO;
    private Integer salary;
    private Integer group;
    private List<Integer> marks;
}

