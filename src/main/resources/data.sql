INSERT INTO patients (name, gender, birth_date, email, blood_group) VALUES
('Aarav Sharma', 'MALE', '1990-05-10', 'aarav.sharma@example.com', 'O_POSITIVE'),
('Diya Patel', 'FEMALE', '1995-08-20', 'diya.patel@example.com', 'A_POSITIVE'),
('Dishant Verma', 'MALE', '1988-03-15', 'dishant.verma@example.com', 'A_POSITIVE'),
('Neha Iyer', 'FEMALE', '1992-12-01', 'neha.iyer@example.com', 'AB_POSITIVE'),
('Kabir Singh', 'MALE', '1993-07-11', 'kabir.singh@example.com', 'O_POSITIVE'),
('Riya Kapoor', 'FEMALE', '1996-09-05', 'riya.kapoor@example.com', 'B_POSITIVE'),
('Ankit Mehta', 'MALE', '1985-11-23', 'ankit.mehta@example.com', 'O_NEGATIVE'),
('Sanya Reddy', 'FEMALE', '1991-02-14', 'sanya.reddy@example.com', 'A_NEGATIVE'),
('Vikram Joshi', 'MALE', '1989-06-30', 'vikram.joshi@example.com', 'B_POSITIVE'),
('Tanya Sharma', 'FEMALE', '1994-04-18', 'tanya.sharma@example.com', 'AB_NEGATIVE');

INSERT INTO doctor (name, specialisation, email) VALUES
('Dr. Rakesh Mehta', 'Cardiology', 'rakesh.mehta@example.com'),
('Dr. Sneha Kapor', 'Dermatology', 'sneha.kapoor@example.com'),
('Dr. Arjun Nair', 'Orthopedics', 'arjun.nair@example.com'),
('Dr. Priya Sharma', 'Neurology', 'priya.sharma@example.com'),
('Dr. Amit Vera', 'Pediatrics', 'amit.verma@example.com'),
('Dr. Kavita Joshi', 'Gynecology', 'kavita.joshi@example.com'),
('Dr. Rohit Singh', 'General Medicine', 'rohit.singh@example.com'),
('Dr. Nisha Xenon', 'Radiology', 'nisha.menon@example.com'),
('Dr. Vivek Kumar', 'Psychiatry', 'vivek.kumar@example.com'),
('Dr. Alok Patel', 'ENT', 'alok.patil@example.com');




INSERT INTO appointment (appointment_time, doctor_id, patients_id, reason) VALUES
('2025-07-01 09:00:00', 1, 1, 'Flu'),
('2025-07-02 10:30:00', 2, 2, 'Headache'),
('2025-07-03 11:15:00', 3, 3, 'Knee Pain'),
('2025-07-04 14:00:00', 1, 4, 'Back Pain'),
('2025-07-05 15:30:00', 2, 5, 'Cough'),
('2025-07-06 09:45:00', 3, 1, 'Fever'),
('2025-07-07 13:20:00', 1, 2, 'Sore Throat'),
('2025-07-08 10:10:00', 2, 3, 'Joint Pain'),
('2025-07-09 16:00:00', 3, 4, 'Fatigue'),
('2025-07-10 12:30:00', 1, 5, 'Nausea');
