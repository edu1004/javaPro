package test.com;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class Test02SimpleDateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("DateFormat...");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		sdf = new SimpleDateFormat("yyyy�� MM�� dd�� HH�� mm�� ss.SSS��");
		System.out.println(sdf.format(new Date()));
		
		
	}

}
