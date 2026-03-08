package ISM.Hospital.management.system.entity;

import jakarta.persistence.*;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false,length = 60)
    String name;
    @Column(nullable = false ,length = 60,unique = true)
    String email;
    @Column(nullable = false,length = 60)
    String specialisation;
    @ManyToMany(mappedBy = "doctors")
    @ToString.Exclude
    Set<Department> departmentSet = new HashSet<>();
}
