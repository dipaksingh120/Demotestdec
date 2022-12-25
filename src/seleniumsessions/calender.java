package seleniumsessions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class calender {

	public static void main(String[] args) {
		DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
         Date CurDate = new Date();
         System.out.println(format.format(CurDate));
         Calendar C = Calendar.getInstance();
         C.setTime(CurDate);
         C.add(Calendar.DATE, 3);
         System.out.println(C.getTime());
         System.out.println(format.format(C.getTime()));
	}

}
