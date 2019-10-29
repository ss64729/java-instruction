package db;

import java.sql.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import business.Actor;


public class ActorDB extends BaseDb {
	public List<Actor> list() {
		List<Actor> actorList = new ArrayList<>();
		String sql = "select * from actor";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			// Statement stmt = getConnection().createStatement();
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Actor a = getActorFromResultSet(rs);
				actorList.add(a);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return actorList;
	}
	
	public Actor get(int id) {
		Actor actor = null;
		String sql = "select * from actor where actorid = ?";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				actor = getActorFromResultSet(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return actor;
	}

	private Actor getActorFromResultSet(ResultSet rs) throws SQLException {
		// get Actor from result set
		int id = rs.getInt(1); // 1st result of query
		String firstName = rs.getString(2);
		String lastName = rs.getString(3);
		String gender = rs.getString(4);
		LocalDate dob = rs.getDate(5).toLocalDate();
	
		Actor a = new Actor(id, firstName, lastName, gender, dob);
		return a;
	}
	
	

	public int addActor(Actor a) {

		int rowCount = 0;
		String sql = "INSERT INTO Actor (firstName, lastName, gender, dob) " + "VALUES (?, ?, ?, ?)";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			ps.setString(1, a.getFirstName());
			ps.setString(2, a.getLastName());
			ps.setString(3, a.getGender());
			ps.setObject(4,a.getDob() );
		// see page 443 use get string	
		//	ps.setLocalDate(4, m.getDob());
			rowCount = ps.executeUpdate();
		} catch (SQLException se) {
			System.out.println(se);
		}

		return rowCount;
	}

	public int updateActor(Actor a) {

		int rowCount = 0;
		String sql = "update Actor set lastName = ? where actorid = ?";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			ps.setString(1, a.getLastName());
			ps.setInt(2, a.getActorId());
			rowCount = ps.executeUpdate();
		} catch (SQLException se) {
			System.out.println(se);
		}

		return rowCount;
	}

	public int deleteActor(Actor a) {

		int rowCount = 0;
		String sql = "delete from actor where actorid = ?";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			ps.setInt(1, a.getActorId());
			rowCount = ps.executeUpdate();
		} catch (SQLException se) {
			System.out.println(se);
		}

		return rowCount;
	}


}
