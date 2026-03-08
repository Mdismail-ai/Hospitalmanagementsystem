package ISM.Hospital.management.system.Service;

import ISM.Hospital.management.system.Repository.insuranceRepository;
import ISM.Hospital.management.system.Repository.patientsRepository;
import ISM.Hospital.management.system.entity.insurance;
import ISM.Hospital.management.system.entity.patients;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
public class insuranceService {
    @Autowired
    patientsRepository patientsRepository;
    @Autowired
    insuranceRepository insuranceRepository;
    @Transactional
    public patients assignInsuranceToPatients(insurance insurance , Long patientsId)  {
        patients patients  = patientsRepository.findById(patientsId).orElseThrow(()->new EntityNotFoundException("Not found + patientsId"));
        patients.setInsurance(insurance);
        return patients;
    }
    public patients removeInsuranceFromPatients(Long patientId){
        patients patients = patientsRepository.findById(patientId).orElseThrow();
        patients.setInsurance(null);
        return patients;
    }

}
