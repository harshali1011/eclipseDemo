package PkgInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Demo.SpringDemo.Triangle;

public class ConstructorInjectionDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TriangleConst t= new TriangleConst();
		//String path= System.getProperty("user.dir")+"/src/test/java/Demo/SpringDemo/Spring.xml";
ApplicationContext context= new ClassPathXmlApplicationContext("Spring2.xml");
TriangleConst triangle = (TriangleConst) context.getBean("triangle");
triangle.draw();
	}

}
