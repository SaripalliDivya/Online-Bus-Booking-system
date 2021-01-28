package dao;


	import java.util.List;

	import model.Booking;

	public interface IBooking {
	  public int addBooking(Booking booking);

	  public List<Booking> viewBooking();

	  public int editBooking(Booking booking);

	  public int removeBooking(Booking booking);
	}

