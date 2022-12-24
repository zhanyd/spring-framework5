package test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Appconfig.class);
		IndexDao indexDao = (IndexDao)ctx.getBean(IndexDao.class);
		indexDao.query();
	}
}
