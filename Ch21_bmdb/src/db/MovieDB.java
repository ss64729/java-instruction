package db;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;

import business.Movie;

public class MovieDB extends BaseDb {
	public List<Movie> list() {
		List<Movie> movieList = new ArrayList<>();
		String sql = "select * from movie";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			// Statement stmt = getConnection().createStatement();
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Movie m = getMovieFromResultSet(rs);
				movieList.add(m);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return movieList;
	}

	public Movie get(int id) {
		Movie movie = null;

		String sql = "select * from movie where movieid = ?";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				movie = getMovieFromResultSet(rs);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return movie;
	}

	public int addMovie(Movie m) {

		int rowCount = 0;
		String sql = "INSERT INTO Movie (title, rating, year, director) " + "VALUES (?, ?, ?, ?)";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			ps.setString(1, m.getTitle());
			ps.setString(2, m.getRating());
			ps.setInt(3, m.getYear());
			ps.setString(4, m.getDirector());
			rowCount = ps.executeUpdate();
		} catch (SQLException se) {
			System.out.println(se);
		}

		return rowCount;
	}

	public int updateMovie(Movie m) {

		int rowCount = 0;
		String sql = "update Movie set year = ? where movieid = ?";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			ps.setInt(1, m.getYear());
			ps.setInt(2, m.getMovieid());
			rowCount = ps.executeUpdate();
		} catch (SQLException se) {
			System.out.println(se);
		}

		return rowCount;
	}

	public int deleteMovie(Movie m) {

		int rowCount = 0;
		String sql = "delete from movie where movieid = ?";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			ps.setInt(1, m.getMovieid());
			rowCount = ps.executeUpdate();
		} catch (SQLException se) {
			System.out.println(se);
		}

		return rowCount;
	}

	private Movie getMovieFromResultSet(ResultSet rs) throws SQLException {
		// get movie from result set
		int id = rs.getInt(1); // 1st result of query
		String title = rs.getString(2);
		String rating = rs.getString(3);
		int year = rs.getInt(4);

		String director = rs.getString(5);
		Movie m = new Movie(id, title, rating, year, director);
		return m;
	}

}
