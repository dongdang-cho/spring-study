package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.di.entity.Exam;
import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Exam  exam = new NewlecExam();
		ExamConsole console = new GridExamConsole();
		console.setExam(exam);
		*/
		ApplicationContext context = new AnnotationConfigApplicationContext(NewlecDIConfig.class);
		ExamConsole console = (ExamConsole)context.getBean("console");
		Exam exam2 = (Exam)context.getBean("exam2");
		System.out.println("exam2->"+exam2.total());
		//ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
		
		 
	}

}
