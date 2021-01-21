//package telran.timing.model;
//
//import java.time.*;
//import java.time.format.DateTimeFormatter;
//import java.time.temporal.ChronoUnit;
//import java.util.Arrays;
//import java.util.Comparator;
//
//public class DateOperation {
//	
//	static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("[dd/MM/yyyy] [yyyy-MM-dd]");
//	static Comparator<String>comp = (d1,d2)->{
//		return LocalDate.parse(d1, dtf).compareTo(LocalDate.parse(d2,dtf));
//	};
//	
//	public static String[] sortStringDates(String[] dates) {
//		String[] res = Arrays.copyOf(dates, dates.length);
//		Arrays.sort(res, comp);
//		return res;	
//	}
//
//	public static int getAge(String birthDate) {
//		return (int)ChronoUnit.YEARS.between(LocalDate.parse(birthDate, dtf), LocalDate.now());
//	}
//
//}

package telran.timing.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DateOperation {

	public static String[] sortStringDates(String[] dates) {
		List<LocalDate> list = new ArrayList<>();
	for (int i = 0; i < dates.length; i++) {
		LocalDate sort = LocalDate.parse(dates[i], DateTimeFormatter.ISO_DATE);
		list.add(sort);
	}
	
	List<LocalDate> l = list.stream().sorted((x,y) -> x.compareTo(y)).collect(Collectors.toList());
	String[] d = new String[l.size()];
	for (int i = 0; i < d.length; i++) {
		d[i] = l.get(i).toString(); 
		System.out.println(d[i]);
	}
		return d;
	}
	
	public static int getAge(String birthDay) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyy");
		LocalDate cosmos = LocalDate.parse("1961/4/12", dtf);
		
		int period = (int) ChronoUnit.YEARS.between(cosmos, LocalDate.now());
		return period;
	}
	
}
