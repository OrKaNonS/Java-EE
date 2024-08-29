package simpledi.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import simpledi.bean.Hello;
import simpledi.service.Printer;

public class HelloTest {
	
	public static void main(String[] args) {
		 
		// BeanFactory�� ��ӹ��� ApplicationContext�� ����
		// conf/beans.xml(�� ���� ����)�� �о ApplicationContext�� ����
		ApplicationContext context = 
				new GenericXmlApplicationContext("conf/beans.xml");
		
		// hello��� id�� ���� �� ��ü�� ����
		Hello hello = (Hello)context.getBean("hello");
		System.out.println(hello);
		
		// �� ��ü�� ���� ��ü
		// Ư���� ������ ���� ������ �������� ��ü�� �̱���(Ŭ�������� ��ü�� �ϳ��� ����� ����)���� ����
		// �� �����ÿ� scope="prototype"���� �ϸ� ��ü �����ø��� �ٸ� ��ü�� ����
		Hello hello2 = (Hello)context.getBean("hello");
		System.out.println(hello==hello2);
		
		// stringPrinter��� id�� ���� �� ��ü�� ã�Ƽ� StringPringer ��ü�� ����
		Printer stringPrinter = (Printer)context.getBean("stringPrinter");
		stringPrinter.print("stringPrinter");
		System.out.println(stringPrinter.toString());
		
		// stringPrinter��� id�� ���� �� ��ü�� ã�Ƽ� ConsolePringer ��ü�� ����
		Printer consolePrinter = (Printer)context.getBean("consolePrinter");
		consolePrinter.print("consolePrinter");
		
	} // main

} // class
