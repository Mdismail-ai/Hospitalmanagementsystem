package ISM.Hospital.management.system.Repository;

import ISM.Hospital.management.system.entity.patients;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
@Repository
public interface  patientsRepository extends JpaRepository<patients,Long> {
    patients findByName(String name);

    List<patients> findByBirthDateOrEmail(LocalDate localDate, String email);
    @Query("SELECT p FROM patients p WHERE p.birthDate < :birthDate")
    List<patients> findByBirthDate(@Param("birthDate") LocalDate localDate);
    @Query("SELECT p FROM patients p WHERE p.birthDate > :birthDate")
    Page<patients> findByBirthDate(@Param("birthDate")LocalDate birthDate, Pageable pageable);

}
