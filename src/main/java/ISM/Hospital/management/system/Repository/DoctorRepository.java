package ISM.Hospital.management.system.Repository;

import ISM.Hospital.management.system.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}