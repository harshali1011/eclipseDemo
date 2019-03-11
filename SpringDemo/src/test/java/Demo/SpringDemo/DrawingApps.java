package Demo.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle t= new Triangle();
		//String path= System.getProperty("user.dir")+"/src/test/java/Demo/SpringDemo/Spring.xml";
ApplicationContext context= new ClassPathXmlApplicationContext("Spring.xml");
Triangle triangle = (Triangle) context.getBean("triangle");
triangle.draw();
	}

}
