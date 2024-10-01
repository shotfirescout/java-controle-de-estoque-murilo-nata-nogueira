/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uniensinojavaswing.murilo.swing.controle.de.estoque.murilo.nata.nogueira.DAO;

import com.uniensinojavaswing.murilo.swing.controle.de.estoque.murilo.nata.nogueira.model.Conector;
import com.uniensinojavaswing.murilo.swing.controle.de.estoque.murilo.nata.nogueira.model.JsonConnect;
import com.uniensinojavaswing.murilo.swing.controle.de.estoque.murilo.nata.nogueira.model.Produto;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author muril
 */
public class ProdutosDAO {
    
    private Connection connection;
    
    public ProdutosDAO() throws SQLException{
        Conector conexao = JsonConnect.criaConector("jsonsettings.json");
        if(conexao != null){
            String url = "jdbc:mysql://" + conexao.getServer() + "/" + conexao.getDatabase();
            connection = DriverManager.getConnection(url,conexao.getUid(), conexao.getPassword());
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível pegar conexao");
        }
    }
    
    
    public List<Produto> listarProdutos() throws SQLException{
        List<Produto> dados = new ArrayList<>();
        
        String query = "SELECT * FROM produtos";
        
        try (Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(query) ){

            while(rs.next()){
                Produto produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setPreco(rs.getBigDecimal("preco"));
                dados.add(produto);
            }
        }
        return dados;
    }
    
    public void adicionar(Produto produto) throws SQLException{
        String query = "INSERT INTO produtos values (?,?,?,?)";
        
        try(PreparedStatement statement = connection.prepareStatement(query);){
            statement.setInt(1, produto.getId());
            statement.setString(2, produto.getNome());
            statement.setInt(3, produto.getQuantidade());
            statement.setBigDecimal(4, produto.getPreco());
            statement.executeUpdate();
            
        }
    }
    
    public void editar(Produto produto) throws SQLException{
        String query = "UPDATE produtos SET nome = ?, quantidade = ?, preco = ? where id = ?";
        
        try(PreparedStatement statement = connection.prepareStatement(query);){
            
            statement.setString(1, produto.getNome());
            statement.setInt(2, produto.getQuantidade());
            statement.setBigDecimal(3, produto.getPreco());
            statement.setInt(4, produto.getId());
            statement.executeUpdate();
        }
    }
    
    public void remover(int id)throws SQLException{
        String query = "DELETE produtos where id = ?";
        try(PreparedStatement statement = connection.prepareStatement(query)){
            statement.setInt(1, id);
        }
    }
    
    public List<Produto> pesquisar(String pesquisa, String tipo){
        List<Produto> listaPesquisa = new ArrayList<>();
        String query = "";
        
        switch (tipo) {
            case "nome":
                query = "SELECT * FROM produtos WHERE nome LIKE ?";
                break;
            case "quantidade":
                query = "SELECT * FROM produtos WHERE quantidade = ?";
                break;
                case "preco":
                query = "SELECT * FROM produtos WHERE preco = ?";
                break;
            default:
                throw new AssertionError();
        }
        try{
                PreparedStatement statement = connection.prepareStatement(query);
                if (tipo.equals("nome")) {
                    statement.setString(1, "%" + pesquisa + "%");
                } else if (tipo.equalsIgnoreCase("quantidade")) {
                    statement.setInt(1, Integer.parseInt(pesquisa));
                } else if (tipo.equalsIgnoreCase("preco")) {
                    statement.setBigDecimal(1, new BigDecimal(pesquisa));
                }
                ResultSet rs = statement.executeQuery();
                while(rs.next()){
                Produto produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setPreco(rs.getBigDecimal("preco"));
                listaPesquisa.add(produto);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
        }
        return listaPesquisa;
    }
}
