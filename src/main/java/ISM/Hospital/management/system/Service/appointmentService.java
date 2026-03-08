package ISM.Hospital.management.system.Service;

import ISM.Hospital.management.system.Repository.DoctorRepository;
import ISM.Hospital.management.system.Repository.appointmentsRepository;
import ISM.Hospital.management.system.Repository.patientsRepository;
import ISM.Hospital.management.system.entity.Doctor;
import ISM.Hospital.management.system.entity.appointment;
import ISM.Hospital.management.system.entity.patients;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class appointmentService {

    @Autowired
    private appointmentsRepository  appointmentsRepository;
    @Autowired
    DoctorRepository doctorRepository;
    @Autowired
    patientsRepository patientsRepository;
    @Transactional
    public appointment createAnewAppointment(appointment appointment ,Long doctorId , Long patientsId){
        Doctor doctor = doctorRepository.findById(doctorId).orElseThrow();
        patients patients = patientsRepository.findById(patientsId).orElseThrow();
        if(appointment.getId()!=null)throw new IllegalArgumentException("not valid appointment ");
        appointment.setPatients(patients);
        appointment.setDoctor(doctor);
        return appointmentsRepository.save(appointment);
    }
    @Transactional
    public appointment reassignNewAppointment(Long appointmentId ,Long doctorId ){
        appointment appointment = appointmentsRepository.findById(appointmentId).orElseThrow();
        Doctor doctor = doctorRepository.findById(doctorId).orElseThrow();
        appointment.setDoctor(doctor);
        return appointment;

    }
}
