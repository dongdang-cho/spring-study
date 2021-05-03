package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;

@Component
public class InlineExamConsole implements ExamConsole {
	@Autowired(required = false)
	//@Qualifier("exam2")
	private Exam exam;
	public InlineExamConsole() {
		// TODO Auto-generated constructor stub
		System.out.println("default constructor");
	}
	public InlineExamConsole(Exam exam) {
		super();
		System.out.println("overloaded constructor");
		this.exam = exam;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		if(exam == null) 
			System.out.printf("total is %d, avg is %f\n",0, 0f);
		else 
			System.out.printf("total is %d, avg is %f\n",exam.total(),exam.avg());
		
		
	}

	public Exam getExam() {
		return exam;
	}
	
	public void setExam(Exam exam) {
		this.exam = exam;
		System.out.println("setter");
	}
	
	

}
