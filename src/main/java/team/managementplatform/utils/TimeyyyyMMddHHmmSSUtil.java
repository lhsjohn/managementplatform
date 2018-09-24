package team.managementplatform.utils;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeyyyyMMddHHmmSSUtil {

	public static Date getCurrentTime() {
		 SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 String dateString = formatter.format(new Date());
		 ParsePosition pos = new ParsePosition(0);
		 Date currentTime = formatter.parse(dateString,pos);
		 return currentTime;
	}
}
