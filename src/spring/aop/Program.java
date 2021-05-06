package spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.aop.support.NameMatchMethodPointcut;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.entity.Exam;
import spring.aop.entity.NewlecExam;
import spring.di.NewlecDIConfig;

public class Program {
	public static void main(String[] args) {
		ApplicationContext context = 
				//new AnnotationConfigApplicationContext(NewlecDIConfig.class);
				new ClassPathXmlApplicationContext("spring/aop/setting.xml");
		Exam exam = new NewlecExam(1,1,1,1);
		Exam proxy = (Exam) context.getBean("proxy");
//		Exam proxy = (Exam) Proxy.newProxyInstance(NewlecExam.class.getClassLoader(), new Class[] {Exam.class}, new InvocationHandler() {
//			
//			@Override
//			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//				// TODO Auto-generated method stub
//				long start = System.currentTimeMillis();
//				Object result = method.invoke(exam, args);
//				long end = System.currentTimeMillis();
//				String message = (end-start)+"ms �ð��� �ɷȽ��ϴ�.";
//				System.out.println(message);
//				return result;
//			}
//		});
		System.out.printf("total is %d\n",proxy.total());
		System.out.printf("avg is %f\n",proxy.avg());
	}
}
