import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    private final Student student;
    private static final String INSERT_QUERY = "INSERT INTO tb_categories(category_name) VALUES(?)";
    private static final String FIND_ALl_QUERY = "SELECT * FROM tb_categories";
    private static final String FIND_BY_ID_QUERY = "SELECT * FROM tb_categories WHERE category_id = ?";
    private static final String UPDATE_QUERY = "UPDATE tb_categories SET category_name = ? WHERE category_id = ?";
    private static final String DELETE_QUERY = "DELETE FROM tb_categories WHERE category_id = ?";

    public StudentDAO(){

    }

    public void save(Student student){
        Connection conn = null;
        PreparedStatement pstm = null;
        try {

        }

    }

    public void update(Student student){

    }
    public void delete(Student student){

    }
    public void deleteById(int studentId){

    }

    public List<Student> findAll(){

    }
}