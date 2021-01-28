package util;


	public class Query {
		  public static String adminAuthentication = "select * from admin where name=? and password=?";
		  public static String addBooking = "insert into booking values(?,?,?,?)";
		  public static String viewBooking = "select * from booking";
		  public static String editBooking = "update booking set name=?,date=?,seatno=? where mobile=?";
		  public static String removeBooking = "delete from booking where mobile=?";
		}

