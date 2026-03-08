package ISM.Hospital.management.system.Repository;

import ISM.Hospital.management.system.entity.insurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface insuranceRepository extends JpaRepository<insurance,Long> {
}
