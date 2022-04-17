package test;

import static org.junit.Assert.*;

import domain.Student;
import domain.Tema;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import repository.NotaXMLRepo;
import repository.StudentXMLRepo;
import repository.TemaXMLRepo;
import service.Service;
import validation.NotaValidator;
import validation.StudentValidator;
import validation.TemaValidator;
import validation.ValidationException;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class AppTest {

	// test add student functionality
	@Test
	public void test_addStudentWithEmptyID_throwValidationException() {
		String filenameStudent = "src/main/resources/Studenti.xml";
		String filenameTema = "src/main/resources/Teme.xml";
		String filenameNota = "src/main/resources/Note.xml";
		StudentValidator studentValidator = new StudentValidator();
		TemaValidator temaValidator = new TemaValidator();
		TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
		StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
		NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
		NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
		Student student = new Student("1", "Bogdan Zavo", 937, "boboz@team.com");
		Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);

		student.setID("");
		ValidationException exception =
				Assertions.assertThrows(ValidationException.class, () -> service.addStudent(student));
		Assertions.assertEquals("Id incorect!", exception.getMessage());
	}

	@Test
	public void test_addStudentWithValidID_addStudent() {
		String filenameStudent = "src/main/resources/Studenti.xml";
		String filenameTema = "src/main/resources/Teme.xml";
		String filenameNota = "src/main/resources/Note.xml";
		StudentValidator studentValidator = new StudentValidator();
		TemaValidator temaValidator = new TemaValidator();
		TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
		StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
		NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
		NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
		Student student = new Student("1", "Bogdan Zavo", 937, "boboz@team.com");
		Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);

		student.setID("0");
		assertDoesNotThrow(() -> service.addStudent(student));
	}

	@Test
	public void test_addStudentWithNameEmpty_throwValidationException() {
		String filenameStudent = "src/main/resources/Studenti.xml";
		String filenameTema = "src/main/resources/Teme.xml";
		String filenameNota = "src/main/resources/Note.xml";
		StudentValidator studentValidator = new StudentValidator();
		TemaValidator temaValidator = new TemaValidator();
		TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
		StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
		NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
		NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
		Student student = new Student("1", "Bogdan Zavo", 937, "boboz@team.com");
		Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);

		student.setNume("");
		ValidationException exception = Assertions.assertThrows(ValidationException.class, () -> service.addStudent(student));
		Assertions.assertEquals("Nume incorect!", exception.getMessage());
	}

	@Test
	public void test_addStudentWithValidName_addStudent() {
		String filenameStudent = "src/main/resources/Studenti.xml";
		String filenameTema = "src/main/resources/Teme.xml";
		String filenameNota = "src/main/resources/Note.xml";
		StudentValidator studentValidator = new StudentValidator();
		TemaValidator temaValidator = new TemaValidator();
		TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
		StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
		NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
		NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
		Student student = new Student("1", "Bogdan Zavo", 937, "boboz@team.com");
		Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);

		student.setNume("Poco Loco");
		Assertions.assertDoesNotThrow(() -> service.addStudent(student));
	}

	@Test
	public void test_addStudentWithEmptyEmail_throwValidationException() {
		String filenameStudent = "src/main/resources/Studenti.xml";
		String filenameTema = "src/main/resources/Teme.xml";
		String filenameNota = "src/main/resources/Note.xml";
		StudentValidator studentValidator = new StudentValidator();
		TemaValidator temaValidator = new TemaValidator();
		TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
		StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
		NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
		NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
		Student student = new Student("1", "Bogdan Zavo", 937, "boboz@team.com");
		Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);

		student.setEmail("");
		ValidationException exception =
				Assertions.assertThrows(ValidationException.class, () -> service.addStudent(student));
		Assertions.assertEquals("Email incorect!", exception.getMessage());
	}

	@Test
	public void test_addStudentWithValidEmail_addStudent() {
		String filenameStudent = "src/main/resources/Studenti.xml";
		String filenameTema = "src/main/resources/Teme.xml";
		String filenameNota = "src/main/resources/Note.xml";
		StudentValidator studentValidator = new StudentValidator();
		TemaValidator temaValidator = new TemaValidator();
		TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
		StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
		NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
		NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
		Student student = new Student("1", "Bogdan Zavo", 937, "boboz@team.com");
		Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);

		Assertions.assertDoesNotThrow(() -> service.addStudent(student));
	}

	@Test
	public void test_addStudentWithNegativeGroupNumber_throwValidationException() {
		String filenameStudent = "src/main/resources/Studenti.xml";
		String filenameTema = "src/main/resources/Teme.xml";
		String filenameNota = "src/main/resources/Note.xml";
		StudentValidator studentValidator = new StudentValidator();
		TemaValidator temaValidator = new TemaValidator();
		TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
		StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
		NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
		NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
		Student student = new Student("1", "Bogdan Zavo", 937, "boboz@team.com");
		Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);

		student.setGrupa(-1);
		ValidationException exception = Assertions.assertThrows(ValidationException.class, () -> service.addStudent(student));
		Assertions.assertEquals("Grupa incorecta!", exception.getMessage());
	}

	@Test
	public void test_addStudentWithPositiveGroupNumber_addStudent() {
		String filenameStudent = "src/main/resources/Studenti.xml";
		String filenameTema = "src/main/resources/Teme.xml";
		String filenameNota = "src/main/resources/Note.xml";
		StudentValidator studentValidator = new StudentValidator();
		TemaValidator temaValidator = new TemaValidator();
		TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
		StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
		NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
		NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
		Student student = new Student("1", "Bogdan Zavo", 937, "boboz@team.com");
		Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);

		Assertions.assertDoesNotThrow(() -> service.addStudent(student));
	}

	// test add tema functionality
	@Test
	public void test_addAssigmentWithEmptyID_throwValidationException() {
		String filenameStudent = "src/main/resources/Studenti.xml";
		String filenameTema = "src/main/resources/Teme.xml";
		String filenameNota = "src/main/resources/Note.xml";
		StudentValidator studentValidator = new StudentValidator();
		TemaValidator temaValidator = new TemaValidator();
		TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
		StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
		NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
		NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
		Tema tema = new Tema("1", "Echipa Team este aici si vom reusi sa terminam facultatea", 3, 2);
		Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);

		tema.setID("");
		ValidationException exception =
				Assertions.assertThrows(ValidationException.class, () -> service.addTema(tema));
		Assertions.assertEquals("Numar tema invalid!", exception.getMessage());
	}

	@Test
	public void test_addAssigmentWithValidID_addAssigment() {
		String filenameStudent = "src/main/resources/Studenti.xml";
		String filenameTema = "src/main/resources/Teme.xml";
		String filenameNota = "src/main/resources/Note.xml";
		StudentValidator studentValidator = new StudentValidator();
		TemaValidator temaValidator = new TemaValidator();
		TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
		StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
		NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
		NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
		Tema tema = new Tema("1", "Echipa Team este aici si vom reusi sa terminam facultatea", 3, 2);
		Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);

		Assertions.assertDoesNotThrow(() -> service.addTema(tema));
	}

	@Test
	public void test_addAssigmentWithDescriptionEmpty_throwValidationException() {
		String filenameStudent = "src/main/resources/Studenti.xml";
		String filenameTema = "src/main/resources/Teme.xml";
		String filenameNota = "src/main/resources/Note.xml";
		StudentValidator studentValidator = new StudentValidator();
		TemaValidator temaValidator = new TemaValidator();
		TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
		StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
		NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
		NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
		Tema tema = new Tema("1", "Echipa Team este aici si vom reusi sa terminam facultatea", 3, 2);
		Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);

		tema.setDescriere("");
		ValidationException exception =
				Assertions.assertThrows(ValidationException.class, () -> service.addTema(tema));
		Assertions.assertEquals("Descriere invalida!", exception.getMessage());
	}

	@Test
	public void test_addAssigmentWithValidDescription_addAssigment() {
		String filenameStudent = "src/main/resources/Studenti.xml";
		String filenameTema = "src/main/resources/Teme.xml";
		String filenameNota = "src/main/resources/Note.xml";
		StudentValidator studentValidator = new StudentValidator();
		TemaValidator temaValidator = new TemaValidator();
		TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
		StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
		NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
		NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
		Tema tema = new Tema("1", "Echipa Team este aici si vom reusi sa terminam facultatea", 3, 2);
		Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);

		Assertions.assertDoesNotThrow(() -> service.addTema(tema));
	}

	@Test
	public void test_addAssigmentWithDeadlineUnderValueOne_throwValidationException() {
		String filenameStudent = "src/main/resources/Studenti.xml";
		String filenameTema = "src/main/resources/Teme.xml";
		String filenameNota = "src/main/resources/Note.xml";
		StudentValidator studentValidator = new StudentValidator();
		TemaValidator temaValidator = new TemaValidator();
		TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
		StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
		NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
		NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
		Tema tema = new Tema("1", "Echipa Team este aici si vom reusi sa terminam facultatea", 3, 2);
		Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);

		tema.setDeadline(-1);
		ValidationException exception =
				Assertions.assertThrows(ValidationException.class, () -> service.addTema(tema));
		Assertions.assertEquals("Deadlineul trebuie sa fie intre 1-14.", exception.getMessage());
	}

	@Test
	public void test_addAssigmentWithDeadlineLargerThenValueFourteen_throwValidationException() {
		String filenameStudent = "src/main/resources/Studenti.xml";
		String filenameTema = "src/main/resources/Teme.xml";
		String filenameNota = "src/main/resources/Note.xml";
		StudentValidator studentValidator = new StudentValidator();
		TemaValidator temaValidator = new TemaValidator();
		TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
		StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
		NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
		NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
		Tema tema = new Tema("1", "Echipa Team este aici si vom reusi sa terminam facultatea", 3, 2);
		Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);

		tema.setDeadline(15);
		ValidationException exception =
				Assertions.assertThrows(ValidationException.class, () -> service.addTema(tema));
		Assertions.assertEquals("Deadlineul trebuie sa fie intre 1-14.", exception.getMessage());
	}

	@Test
	public void test_addAssigmentWithValidDeadline_throwValidationException() {
		String filenameStudent = "src/main/resources/Studenti.xml";
		String filenameTema = "src/main/resources/Teme.xml";
		String filenameNota = "src/main/resources/Note.xml";
		StudentValidator studentValidator = new StudentValidator();
		TemaValidator temaValidator = new TemaValidator();
		TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
		StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
		NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
		NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
		Tema tema = new Tema("1", "Echipa Team este aici si vom reusi sa terminam facultatea", 3, 2);
		Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);

		tema.setDeadline(5);
		Assertions.assertDoesNotThrow(() -> service.addTema(tema));
	}

	@Test
	public void test_addAssigmentWithPrimireUnderValue1_throwValidationException() {
		String filenameStudent = "src/main/resources/Studenti.xml";
		String filenameTema = "src/main/resources/Teme.xml";
		String filenameNota = "src/main/resources/Note.xml";
		StudentValidator studentValidator = new StudentValidator();
		TemaValidator temaValidator = new TemaValidator();
		TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
		StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
		NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
		NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
		Tema tema = new Tema("1", "Echipa Team este aici si vom reusi sa terminam facultatea", 3, 2);
		Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);

		tema.setPrimire(-1);
		ValidationException exception = Assertions.assertThrows(ValidationException.class, () -> service.addTema(tema));
		Assertions.assertEquals("Saptamana primirii trebuie sa fie intre 1-14.", exception.getMessage());
	}

	@Test
	public void test_addAssigmentWithPrimireLargerThenValueFourteen_throwValidationException() {
		String filenameStudent = "src/main/resources/Studenti.xml";
		String filenameTema = "src/main/resources/Teme.xml";
		String filenameNota = "src/main/resources/Note.xml";
		StudentValidator studentValidator = new StudentValidator();
		TemaValidator temaValidator = new TemaValidator();
		TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
		StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
		NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
		NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
		Tema tema = new Tema("1", "Echipa Team este aici si vom reusi sa terminam facultatea", 3, 2);
		Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);

		tema.setPrimire(16);
		ValidationException exception = Assertions.assertThrows(ValidationException.class, () -> service.addTema(tema));
		Assertions.assertEquals("Saptamana primirii trebuie sa fie intre 1-14.", exception.getMessage());
	}

	@Test
	public void test_addAssigmentWithValidPrimire_throwValidationException() {
		String filenameStudent = "src/main/resources/Studenti.xml";
		String filenameTema = "src/main/resources/Teme.xml";
		String filenameNota = "src/main/resources/Note.xml";
		StudentValidator studentValidator = new StudentValidator();
		TemaValidator temaValidator = new TemaValidator();
		TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
		StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
		NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
		NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
		Tema tema = new Tema("1", "Echipa Team este aici si vom reusi sa terminam facultatea", 3, 2);
		Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);

		tema.setPrimire(12);
		Assertions.assertDoesNotThrow(() -> service.addTema(tema));
	}

}