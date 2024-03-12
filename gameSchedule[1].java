import java.sql.Time;
import java.util.Date;

public class gameSchedule extends Teammembers {
private String venue;
private Date matchdate;
private Time time;
public gameSchedule(String playersname, int age, String type, String venue, Date matchdate, Time time) {
	super(playersname, age, type);
	this.venue = venue;
	this.matchdate = matchdate;
	this.time = time;
}
public String getVenue() {
	return venue;
}
public void setVenue(String venue) {
	this.venue = venue;
}
public Date getMatchdate() {
	return matchdate;
}
public void setMatchdate(Date matchdate) {
	this.matchdate = matchdate;
}
public Time getTime() {
	return time;
}
public void setTime(Time time) {
	this.time = time;
}



	

}
