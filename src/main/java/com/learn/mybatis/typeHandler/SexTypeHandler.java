package com.learn.mybatis.typeHandler;

import com.learn.mybatis.enums.Sex;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Description:
 *
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/1/15 11:19
 * @version : 1.0
 */
public class SexTypeHandler implements TypeHandler<Sex> {
    public void setParameter(PreparedStatement preparedStatement, int i, Sex sex, JdbcType jdbcType) throws SQLException {
        preparedStatement.setInt(i, sex.getId());
    }

    public Sex getResult(ResultSet resultSet, String s) throws SQLException {
        int id = resultSet.getInt(s);
        return Sex.getSexById(id);
    }

    public Sex getResult(ResultSet resultSet, int i) throws SQLException {
        int id = resultSet.getInt(i);
        return Sex.getSexById(id);
    }

    public Sex getResult(CallableStatement callableStatement, int i) throws SQLException {
        int id = callableStatement.getInt(i);
        return Sex.getSexById(id);
    }
}
