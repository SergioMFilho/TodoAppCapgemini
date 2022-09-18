/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import model.Task;
import util.ConnectionFactory;

/**
 *
 * @author Sérgio
 */
public class TaskController {
        
    public void save(Task task){  // recebendo a task que quero salvar
        
        String sql = "INSERT INTO tasks (idProject"
               + "name,"
               + "description,"
               + "completed,"
               + "notes,"
               + "deadLine,"
               + "createAt,"
               + "updateAt) VALUES ()";
        Connection connection = null;
        PreparedStatement statement = null;
    }
    
    public void update(Task task){ // recebendo a task que quero atualizar
        
    }
    
    public void removeByYd(int taskId) throws SQLException {
        
        String sql = "DELETE FROM tasks WHERE id = ?";
        
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = ConnectionFactory.getConnection(); // Pediu conexão
            statement = conn.prepareStatement(sql); // Preparou SQL
            statement.setInt(1, taskId); // Settar um valor
            statement.execute();  // Comando executado no banco de dados
            
        } catch (SQLException e) {
            throw new SQLException("Erro ao deletar a tarefa");
            
        }finally {
            ConnectionFactory.closeConnection(conn);
        }
    }
    
    public List<Task> getAll(int idProject){ // buscar todas as tarefas com base no projeto
        return null;
     
    }
}
