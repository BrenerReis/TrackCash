package dao;

import java.sql.PreparedStatement;
import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import modelo.Login;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import modelo.CanaisDTO;

public class UsuarioDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<CanaisDTO> lista = new ArrayList<>();

    public ResultSet autenticacaoUsuario(Login objlogin) {
        conn = new ConnectionFactory().getConnection();

        try {
            String sql = "select * from administrador where senha = ? ";

            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objlogin.getSenha());

            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
            return null;
        }

    }

    public void cadastrarCanal(CanaisDTO objcanaisDTO) {

        String sql = "insert into canais (nome ,canal, usuario, senha, token, tipo) values (?, ?, ?, ?, ?, ?)";

        conn = new ConnectionFactory().getConnection();

        try {

            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, objcanaisDTO.getNome());
            pstm.setString(2, objcanaisDTO.getCanal());
            pstm.setString(3, objcanaisDTO.getUsuario());
            pstm.setString(4, objcanaisDTO.getSenha());
            pstm.setString(5, objcanaisDTO.getToken());
            pstm.setString(6, objcanaisDTO.getTipo());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "cadastrarCanal" + erro);
        }

    }

    public ArrayList<CanaisDTO> listarCanais() {

        String sql = "select * from canais ";
        conn = new ConnectionFactory().getConnection();

        try {
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                CanaisDTO objcanaisDTO = new CanaisDTO();
                objcanaisDTO.setId(rs.getInt("id"));
                objcanaisDTO.setNome(rs.getString("nome"));
                objcanaisDTO.setCanal(rs.getString("canal"));
                objcanaisDTO.setSenha(rs.getString("senha"));
                objcanaisDTO.setToken(rs.getString("token"));
                objcanaisDTO.setTipo(rs.getString("tipo"));
                objcanaisDTO.setUsuario(rs.getString("usuario"));

                lista.add(objcanaisDTO);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "CanaisDAO" + erro);
        }
        return lista;
    }
    
    
 public void excluirCadastros(CanaisDTO objcanaisDTO){
      String sql = "delete from canais where id = ?";
      conn = new ConnectionFactory().getConnection();
      
      
      try {

            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setInt(1, objcanaisDTO.getId());

            pstm.execute();
            pstm.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "cadastrarCanal" + erro);
        }

    }
 
 
 public void alterarCadastro(CanaisDTO objcanaisdto){
    String sql = "update canais set nome = ?,  canal = ?, tipo = ?, usuario = ?, senha = ?, token = ? where id = ?";
    conn = new ConnectionFactory().getConnection();
    
      try {

           pstm = (PreparedStatement) conn.prepareStatement(sql);
           pstm.setString(1, objcanaisdto.getNome());
           pstm.setString(2, objcanaisdto.getCanal());
           pstm.setString(3, objcanaisdto.getTipo());
           pstm.setString(4, objcanaisdto.getUsuario());
           pstm.setString(5, objcanaisdto.getSenha());
           pstm.setString(6, objcanaisdto.getToken());
           pstm.setInt(7, objcanaisdto.getId());
            

           pstm.execute();
           pstm.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "AlterarCanal" + erro);
        }
 
 }
public Vector  pesquisar(String pesq) throws Exception {
     Vector  tb = new Vector ();
     
     conn = new ConnectionFactory().getConnection();
     String sql = "select * from canais where nome like '" + pesq + "%'";
     PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
     
     
     ResultSet rs = ps.executeQuery();
     while(rs.next()){
         Vector nl = new Vector();
         nl.add(rs.getInt("id"));
         nl.add(rs.getString("nome"));
         nl.add(rs.getString("canal"));
         nl.add(rs.getString("senha"));
         nl.add(rs.getString("token"));
         nl.add(rs.getString("tipo"));
         nl.add(rs.getString("usuario"));
         tb.add(nl);
         
     }
     return tb;
 }
   
    

public void cadastrarCanaladm(CanaisDTO objcanaisDTO) {

        String sql = "insert into canaladm (canalamd ,tipoadm, autentica) values (?, ?, ?)";

        conn = new ConnectionFactory().getConnection();

        try {

            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, objcanaisDTO.getCanalamd());
            pstm.setString(2, objcanaisDTO.getTipoadm());
            pstm.setString(3, objcanaisDTO.getAutentica());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "cadastrarCanalADM  " + erro);
        }

    }


}