package controller;


	import java.sql.Date;
	import java.util.List;

	import dao.BookingImpl;
	import dao.IBooking;
	import model.Booking;

	
		public class BookingController {
	  IBooking BImpl = new BookingImpl();

	  public int addBooking(String name, String mobile, Date date, String seatno) {
      Booking booking = new Booking(name,mobile, date, seatno);
	    return BImpl.addBooking(booking);
	  }

	  public List< Booking> viewBooking() {
	    return BImpl.viewBooking();
	  }

	  public int editBooking(String name, String mobile, Date date, String seatno) {
		  Booking  booking = new  Booking(name, mobile, date, seatno);
	    return BImpl.editBooking( booking);
	  }

	  public int removeBooking(String mobile) {
		  Booking booking = new  Booking();
		  booking.setMobile(mobile);
	    return BImpl.removeBooking( booking);
	  }

	}

