package dao;


	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;
	import java.util.List;

	import model.Booking;
	import util.Db;
	import util.Query;

	public class BookingImpl implements IBooking {
	  PreparedStatement pst = null;
	  ResultSet rs = null;
	  int result = 0;

	  @Override
	  public int addBooking(Booking booking) {
	    try {
	      pst = Db.getCon().prepareStatement(Query.addBooking);
	      pst.setString(1, booking.getName());
	      pst.setString(2, booking.getMobile());
	      pst.setDate(3, booking.getDate());
	      pst.setString(4, booking.getSeatno());
	      result = pst.executeUpdate();
	    } catch (ClassNotFoundException | SQLException e) {
	      result = 0;
	    } finally {
	      try {
	        Db.getCon().close();
	        pst.close();
	      } catch (ClassNotFoundException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	      } catch (SQLException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	      }
	    }
	    return result;
	  }

	  @Override
	  public List<Booking> viewBooking() {
	    List<Booking> booking = new ArrayList<Booking>();
	    try {
	      pst = Db.getCon().prepareStatement(Query.viewBooking);
	      rs = pst.executeQuery();
	      while (rs.next()) {
	    	  Booking b = new Booking(rs.getString(1), rs.getString(2), rs.getDate(3), rs.getString(4));
	    	  booking.add(b);
	      }

	    } catch (ClassNotFoundException | SQLException e) {
	      try {
	        Db.getCon().close();
	        pst.close();
	        rs.close();
	      } catch (ClassNotFoundException e1) {
	        // TODO Auto-generated catch block
	        e1.printStackTrace();
	      } catch (SQLException e1) {
	        // TODO Auto-generated catch block
	        e1.printStackTrace();
	      }

	    }
	    return booking;
	  }

	  @Override
	  public int editBooking(Booking booking) {
	    try {
	      pst = Db.getCon().prepareStatement(Query.editBooking);
	      pst.setString(4, booking.getName());
	      pst.setString(1, booking.getMobile());
	      pst.setDate(2,booking.getDate());
	      pst.setString(3, booking.getSeatno());
	      result = pst.executeUpdate();
	    } catch (ClassNotFoundException | SQLException e) {
	      result = 0;
	    } finally {
	      try {
	        Db.getCon().close();
	        pst.close();
	      } catch (ClassNotFoundException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	      } catch (SQLException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	      }
	    }
	    return result;
	  }

	  @Override
	  public int removeBooking(Booking booking) {
	    try {
	      pst = Db.getCon().prepareStatement(Query.removeBooking);
	      pst.setString(1, booking.getMobile());
	      result = pst.executeUpdate();
	    } catch (ClassNotFoundException | SQLException e) {
	      result = 0;
	    } finally {
	      try {
	        Db.getCon().close();
	        pst.close();
	      } catch (ClassNotFoundException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	      } catch (SQLException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	      }
	    }
	    return result;
	  }

	

	}


