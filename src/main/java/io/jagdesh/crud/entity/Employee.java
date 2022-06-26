package io.jagdesh.crud.entity;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Employee_ID")
    private Long employeeId;

    @NotBlank(message = "Employee Name is empty or just whitespace in the input")
    @Length(max = 40, min = 3, message = "Length of the Department Name is not between the range of 3 and 25")
    @Column(name = "Employee_Name")
    private String employeeName;

    @Column(name = "Employee_Address")
    private String employeeAddress;

    @Column(name = "Employee_Code")
    private String employeeCode;
}
