package sukkiri_java.chapter15;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Practice15 {
	
	public static void main(String[] args) {
		Practice15_4.main(args);
		System.out.println("==========");
		Practice15_5.main(args);
	}
	public static void practice15_1(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < 101; i++) {
			sb.append(i + ",");
		}
		String a = sb.toString();
	}
	
    public static void pratice15_2(String folder, String file) {
		folder = folder.endsWith("\\") ? folder : folder.concat("\\");
		String path = folder.concat(file);
	}
    
    public static void practice15_3() {
		String pattern1 = ".*";
		String pattern2 = "A%d[^%d]";
		String pattern3 = "U[A-Z]{3}";
	}
	
    public static void pratice15_4() {
		
	}
}

class Practice15_4 {
	public static void main(String[] args) {
		Date now = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		int day = c.get(Calendar.DAY_OF_MONTH);
		c.set(Calendar.DAY_OF_MONTH, day + 100);
		Date newDate = c.getTime();
		System.out.println(newDate);
		
		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
		String formatDate = f.format(newDate);
		System.out.println(formatDate);
	}
}

class Practice15_5 {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		Period period = Period.ofDays(100);
		LocalDateTime newDate = now.plus(period);
		DateTimeFormatter f = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		System.out.println(newDate.format(f));
	}
}