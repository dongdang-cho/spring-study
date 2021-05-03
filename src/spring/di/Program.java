package spring.di;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

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
		//ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
		
		 
	}

}
