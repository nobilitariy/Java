package seminar3_2.src.main.java.com.example;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {
    private String familia;
    private int numGryp;
    private double ctipendia;
    private List<Integer> balc;
}
