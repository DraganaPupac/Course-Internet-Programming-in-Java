CREATE DATABASE students;

USE students;

CREATE TABLE student_record (student_id INT NOT NULL AUTO_INCREMENT, student_name VARCHAR(100), student_email VARCHAR(50), student_password VARCHAR(20), student_gender VARCHAR(1), student_address VARCHAR, student_yearstudy INT, student_budget boolean, student_pay INT, PRIMARY KEY (student_id));

OR 

CREATE TABLE student_record (student_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, student_name VARCHAR(100), student_email VARCHAR(50), student_password VARCHAR(20), student_gender VARCHAR(1), student_address VARCHAR(100))student_yearstudy INT, student_budget boolean, student_pay INT, ;

INSERT INTO student_record (student_name, student_email, student_password, student_gender, student_address, student_yearstudy, student_budget, student_pay) VALUES ('John', 'john@jcg.com', 'access@123', 'M', 'America', '2', '', '123');
INSERT INTO student_record (student_name, student_email, student_password, student_gender, student_address, student_yearstudy, student_budget, student_pay) VALUES ('Monica', 'monica@jcg.com', 'access@123', 'F', 'Iceland', '2', '', '123');
INSERT INTO student_record (student_name, student_email, student_password, student_gender, student_address, student_yearstudy, student_budget, student_pay) VALUES ('Raymond', 'raymond@jcg.com', 'access@123', 'M', 'Greece', '2', '', '123');
INSERT INTO student_record (student_name, student_email, student_password, student_gender, student_address, student_yearstudy, student_budget, student_pay) VALUES ('Jane', 'jane@jcg.com', 'access@123', 'F', 'Norway', '2', '', '123');
INSERT INTO student_record (student_name, student_email, student_password, student_gender, student_address, student_yearstudy, student_budget, student_pay) VALUES ('Rachel', 'rachel@jcg.com', 'access@123', 'F', 'France', '2', '', '123');

SELECT * FROM student_record;