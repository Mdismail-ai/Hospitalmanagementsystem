package ISM.Hospital.management.system.entity;

import ISM.Hospital.management.system.type.BloodGroup;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@ToString
@Data
@Table(
        name="patients",
        uniqueConstraints = {
                @UniqueConstraint( name ="unique_patient_name_birth_date", columnNames = {"name", "birth_date"} )
        },
        indexes = {@Index(name = "idx_patient_birth_date",columnList = "birth_date")}
)
public class patients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Column(nullable = false,length = 70)
    private  String name;
    @Column(unique = true,nullable = false)
    private  String email;
    @ToString.Exclude
    private  LocalDate birthDate;
    private  String gender;
    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;
    @Enumerated(EnumType.STRING)
    private BloodGroup bloodGroup;


    @OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER,orphanRemoval = true)
    private  insurance insurance;
    @OneToMany(mappedBy = "patients",cascade = CascadeType.REMOVE,orphanRemoval = true, fetch = FetchType.EAGER)
    //@ToString.Exclude
    private List<appointment> appointment = new ArrayList<>();

}
