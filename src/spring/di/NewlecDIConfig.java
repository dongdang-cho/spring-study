package spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.InlineExamConsole;

@ComponentScan({"spring.di.ui"})
@Configuration
public class NewlecDIConfig {
	@Bean
	public Exam exam2() {
		Exam exam = new NewlecExam(100, 50, 40, 20);
		return exam;
	}
	@Bean
	public ExamConsole console(@Autowired Exam exam2) {
		return new InlineExamConsole(exam2);
	}
}
