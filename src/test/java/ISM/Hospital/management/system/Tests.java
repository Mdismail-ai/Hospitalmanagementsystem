package ISM.Hospital.management.system;

import ISM.Hospital.management.system.Repository.appointmentsRepository;
import ISM.Hospital.management.system.Repository.insuranceRepository;
import ISM.Hospital.management.system.Repository.patientsRepository;
import ISM.Hospital.management.system.Service.appointmentService;
import ISM.Hospital.management.system.Service.insuranceService;
import ISM.Hospital.management.system.Service.patientsservice;
import ISM.Hospital.management.system.entity.appointment;
import ISM.Hospital.management.system.entity.insurance;
import ISM.Hospital.management.system.entity.patients;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
public class Tests {
    @Autowired
    private  patientsRepository patientsRepository;
    @Autowired
    private  patientsservice patientsservice;
    @Autowired
    private  insuranceService insuranceService;
    @Autowired
    private  insuranceRepository insuranceRepository;
    @Autowired
    appointmentsRepository appointmentRepository;
    @Autowired
    appointmentService appointmentService;
    @Disabled
    @Test
    void Test1(){
        List<patients> all = patientsRepository.findAll();
        System.out.println(all);

    }
    @Disabled
    @Test
    void Test2(){
        patients byId = patientsservice.findById(2L);
        System.out.println(byId);
    }
    @Disabled
    @Test
    public void Test3(){
        patients byName =  patientsRepository.findByName("Diya Patel");
        System.out.println(byName);
    }
    @Disabled
    @Test
    public void Test4(){
        List<patients> all= patientsRepository.findByBirthDateOrEmail(LocalDate.of(1990, 5, 10),"kabir.singh@example.com");
        System.out.println(all);
    }
    @Disabled
    @Test
    public void Test5(){
        List<patients> all= patientsRepository.findByBirthDate(LocalDate.of(1990, 5, 10));
        System.out.println(all);
    }
    @Disabled
    @Test
    public void Test6(){
        Page<patients> all = patientsRepository.findByBirthDate(
                LocalDate.of(1992, 12, 01),
                PageRequest.of(0, 5));
        System.out.println(all);
        System.out.println(all.getContent());     // prints data
        System.out.println(all.getTotalElements()); // prints count
        System.out.println(all.getTotalPages());
    }
    @Disabled
    @Test
    public void Test7() {
        insurance insurances = insurance.builder()
                .policyNumber("HDFC_123")
                .provider("HDFC")
                .validUntil(LocalDate.of(2030,12,12))
                .build();
        patients patients = insuranceService.assignInsuranceToPatients(insurances, 1l);
        System.out.println(patients);

        patients newpatients = insuranceService.removeInsuranceFromPatients(patients.getId());
        System.out.println(newpatients);
    }
    @Test
    public void Test8(){
        appointment appointments = appointment.builder()
                .appointmentTime(LocalDateTime.of(2020,12,12,12,23,23))
                .reason("Cancer")
                .build();
        appointment newappointment = appointmentService.createAnewAppointment(appointments, 1l, 2l);
        appointment reassignappointment = appointmentService.reassignNewAppointment(newappointment.getId(), 3l);
        System.out.println(reassignappointment);
    }

}

