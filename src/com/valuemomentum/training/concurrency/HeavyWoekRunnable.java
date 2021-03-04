package com.valuemomentum.training.concurrency;

import javax.imageio.IIOException;

public class HeavyWoekRunnable implements Runnable{
	
	@Override
	public void run()
	{
		System.out.println("doing heavy processing-start"+Thread.currentThread().getName());
		try
		{
			Thread.sleep(1000);
			doDBProcessing();
			
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		} catch (IIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("doing heavy processing-end"+Thread.currentThread().getName());
	}
        private void doDBProcessing() throws IIOException, InterruptedException
        {
        	Thread.sleep(5000);
        }
}
