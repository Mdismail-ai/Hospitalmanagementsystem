package ISM.Hospital.management.system.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false,length = 60)
    String name;
    @OneToOne
    Doctor headDoctorName;
    @ManyToMany
            @JoinTable(
                    name = "my_dpt_doctor",
                    joinColumns = @JoinColumn(name = "dpt_id"),
                    inverseJoinColumns = @JoinColumn(name="doctor_id")
            )
    Set<Doctor> doctors = new HashSet<>();
}
