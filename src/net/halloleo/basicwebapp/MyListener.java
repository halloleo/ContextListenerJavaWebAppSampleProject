package net.halloleo.basicwebapp;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletContextEvent;

public class MyListener implements ServletContextListener {

	
	private MyDataStore myStore;


    public void contextInitialized(ServletContextEvent e){
		ServletContext cntxt = e.getServletContext();

		myStore = new MyDataStore();
		cntxt.setAttribute("yourStore", myStore);
	}
	
	
	public void contextDestroyed(ServletContextEvent e) {
		myStore.close();
	}
}
