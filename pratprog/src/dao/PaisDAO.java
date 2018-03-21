package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import model.Pais;
import dao.ConnectionFactory;

public class PaisDAO {

	public Pais maiorHabitante() {
		Pais pais = new Pais();
		String sqlSelect = "SELECT * FROM PAIS " + "WHERE populacao = " + "(select max(populacao) from PAIS)";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			stm.setInt(1, pais.getId());
			try (ResultSet rs = stm.executeQuery();) {
				if (rs.next()) {
					pais.setId(rs.getInt("id"));
					pais.setNome(rs.getString("nome"));
					pais.setPopulacao(rs.getLong("populacao"));
					pais.setArea(rs.getDouble("area"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		return pais;
	}

	public Pais menoArea() {
		Pais pais = new Pais();
		String sqlSelect = "SELECT * FROM PAIS" + " WHERE area = (select min(area) from PAIS)";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			stm.setInt(1, pais.getId());
			try (ResultSet rs = stm.executeQuery();) {
				if (rs.next()) {
					pais.setId(rs.getInt("id"));
					pais.setNome(rs.getString("nome"));
					pais.setPopulacao(rs.getLong("populacao"));
					pais.setArea(rs.getDouble("area"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		return pais;
	}

	public Pais[] paises33() {
		Pais paises[] = new Pais[3];
		String sqlSelect = "SELECT * FROM PAIS LIMIT 3";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);) {

			try (ResultSet rs = stm.executeQuery();) {

				int contador = 0;
				ResultSet resultSet = stm.executeQuery();
				while (resultSet.next()) {

					Pais pais = new Pais();
					pais.setArea(resultSet.getDouble("area"));
					pais.setNome(resultSet.getString("nome"));
					pais.setId(resultSet.getInt("id"));
					pais.setPopulacao(resultSet.getLong("populacao"));

					paises[contador] = pais;
					contador++;

				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		return paises;
	}
}
