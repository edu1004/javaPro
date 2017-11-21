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
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss.SSS초");
		System.out.println(sdf.format(new Date()));
		
		
	}

}
