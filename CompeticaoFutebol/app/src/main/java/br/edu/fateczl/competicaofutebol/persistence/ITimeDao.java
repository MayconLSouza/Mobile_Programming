package br.edu.fateczl.competicaofutebol.persistence;

import java.sql.SQLException;

public interface ITimeDao {

    public TimeDao open() throws SQLException;
    public void close();
}
