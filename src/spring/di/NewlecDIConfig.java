package spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.InlineExamConsole;

@ComponentScan({"speing.di.ui","spring.di.entitiy"})
@Configuration
public class NewlecDIConfig {
	@Bean
	public Exam exam() {
		return new NewlecExam();
	}
	
	
}
