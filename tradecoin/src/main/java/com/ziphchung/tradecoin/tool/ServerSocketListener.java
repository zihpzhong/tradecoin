package com.ziphchung.tradecoin.tool;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServerSocketListener implements ServletContextListener {
    private EchoServerThread echoServerThread;

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("111111111111111111");
		//echoServerThread.run();
		EchoServerThread th = new EchoServerThread();  
		th.run();
		
	}


	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("22222222222222222222222");
		
	}


}