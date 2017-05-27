package sjsjsj;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestConnectionPool {
	
	private static ExecutorService es = Executors.newFixedThreadPool(11);
	
	public static void main(String[] args) {
		ConnectionPool cp = new ConnectionPool(30);
		Long begin = new Date().getTime();
		System.out.println(begin);
		for (int i = 0; i < 1000; i++) {
			es.execute(new WorkingThread("Working thread"+i,cp));
		}
		es.shutdown();
		Long end = new Date().getTime();
		System.out.println(end-begin);
	}
}	

