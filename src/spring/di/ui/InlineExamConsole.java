package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {
	private Exam exam;
	public InlineExamConsole() {
		// TODO Auto-generated constructor stub
	}
	public InlineExamConsole(Exam exam) {
		super();
		this.exam = exam;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.printf("total is %d, avg is %f\n",exam.total(),exam.avg());
	}

	public Exam getExam() {
		return exam;
	}
	@Autowired
	@Qualifier("exam2")
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	
	

}
