package ISM.Hospital.management.system.Service;

import ISM.Hospital.management.system.Repository.patientsRepository;
import ISM.Hospital.management.system.entity.patients;
import jakarta.transaction.Transactional;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Data
@Service
public class patientsservice {
    @Autowired
    patientsRepository patientsRepository;
    @Transactional
    public patients findById(Long id){
        patients patients1 = patientsRepository.findById(id).orElseThrow();
        patients patients2 = patientsRepository.findById(id).orElseThrow();
        return patients1;
    }
}
