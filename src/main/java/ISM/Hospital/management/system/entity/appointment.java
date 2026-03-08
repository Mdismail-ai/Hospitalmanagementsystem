package ISM.Hospital.management.system.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false,length = 70)
    LocalDateTime appointmentTime;
    @Column(nullable = false,length = 50)
    String reason;
    @ManyToOne
    @ToString.Exclude
    patients patients;
    @ManyToOne
    @JoinColumn(nullable = false)
    Doctor doctor;
}
