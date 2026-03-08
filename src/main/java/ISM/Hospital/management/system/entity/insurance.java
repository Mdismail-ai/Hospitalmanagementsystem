package ISM.Hospital.management.system.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDate;


@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class insurance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Column(nullable = false,length = 100)
    private  String policyNumber;
    @Column(nullable = false)
    private String provider;
    @Column(nullable = false)
    private  LocalDate validUntil;
    @CreationTimestamp
    @Column(nullable = false,updatable = false)
    private LocalDate createdAt;
    @OneToOne(mappedBy = "insurance")
    patients patients;
}
