package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConexaoSQLite {

    private Connection conexao;
    private Connection con;
    private ResultSet resultSet;
    private Statement statement;

    /**
     * Conecta a um banco de dados (cria o banco se ele não existir)
     *
     * @return
     */
    public boolean conectar() {

        try {
            String url = "jdbc:sqlite:db_ireport.sql";

            this.conexao = DriverManager.getConnection(url);
            System.out.println("Conectado!");

        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }

        return true;
    }

    public boolean desconectar() {

        try {
            if (this.conexao.isClosed() == false) {
                this.conexao.close();
            }
            System.out.println("desconectado!!!");
        } catch (SQLException e) {

            System.err.println(e.getMessage());
            return false;
        }
        return true;
    }

    /**
     * Criar os statements para nossos sqls serem executados
     *
     * @return
     */
    public Statement criarStatement() {
        try {
            return this.conexao.createStatement();
        } catch (SQLException e) {
            return null;
        }
    }

    /**
     * Criar os statements para nossos sqls serem executados
     *
     * @param pSQL
     * @param RETURN_GENERATED_KEYS
     * @return
     */
    public PreparedStatement criarPreparedStatement(String pSQL, int RETURN_GENERATED_KEYS) {
        try {
            System.out.println("Executando");
            return conexao.prepareStatement(pSQL, RETURN_GENERATED_KEYS);
        } catch (SQLException e) {
            //e.printStackTrace();
            System.err.println(e.getMessage());
            return null;
        }
    }

    public Connection getConexao() {
        return this.conexao;
    }

    /**
     * Criar os statements para nossos sqls serem executados
     *
     * @param sql
     * @return
     */
    public PreparedStatement criarPreparedStatement(String sql) {
        try {
            return this.conexao.prepareStatement(sql);
        } catch (SQLException e) {
            return null;
        }
    }

    /**
     * @param resultSet the resultSet to set
     */
    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

    public int insertSQL(String pSQL) {
        int status = 0;
        try {
            //createStatement de con para criar o Statement
            this.setStatement(getCon().createStatement());

            // Definido o Statement, executamos a query no banco de dados
            this.getStatement().executeUpdate(pSQL);

            //consulta o ultimo id inserido
            this.setResultSet(this.getStatement().executeQuery("SELECT last_insert_id();"));

            //recupera o ultimo id inserido
            while (this.resultSet.next()) {
                status = this.resultSet.getInt(1);
            }

            //retorna o ultimo id inserido
            return status;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return status;
        }
    }

    /**
     * encerra a conexão corrente
     *
     * @return boolean
     */
    public boolean fecharConexao() {
        try {
            if ((this.getResultSet() != null) && (this.statement != null)) {
                this.getResultSet().close();
                this.statement.close();
            }
            this.getCon().close();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }

    public boolean executarSQL(String pSQL) {
        try {
            //createStatement de con para criar o Statement
            this.setStatement(getCon().createStatement());

            // Definido o Statement, executamos a query no banco de dados
            this.setResultSet(getStatement().executeQuery(pSQL));

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * @return the resultSet
     */
    public ResultSet getResultSet() {
        return resultSet;
    }

    /**
     * @return the con
     */
    public Connection getCon() {
        return con;
    }

    /**
     * @param statement the statement to set
     */
    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    /**
     * @return the statement
     */
    public Statement getStatement() {
        return statement;
    }
}
