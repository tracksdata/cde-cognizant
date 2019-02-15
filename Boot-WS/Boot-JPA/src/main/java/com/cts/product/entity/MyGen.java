package com.cts.product.entity;

import java.io.Serializable;
import java.util.Calendar;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class MyGen implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		
		Calendar cl=Calendar.getInstance();
		int month,year,date;
		month=cl.get(Calendar.MONTH);
		date=cl.get(Calendar.DATE);
		year=cl.get(Calendar.YEAR);
		int secs=cl.get(Calendar.SECOND);
		month+=1;
		
		String key="ABCHYD"+year+""+month+""+date+""+secs;
		
		
		return key;
	}
	
	

}
