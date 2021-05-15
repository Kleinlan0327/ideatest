package com.xshxy.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @author ls
 * @date 2021/5/14 - 18:17
 */
public class JdbcUtil {
    private static JdbcTemplate jdbcTemplate = null;
    private static DataSource dataSource = null;
    static {
        dataSource = new ComboPooledDataSource();
    }
    public static JdbcTemplate getTemplate(){
        if (jdbcTemplate == null){
            synchronized (JdbcUtil.class){
                if(jdbcTemplate == null)
                    jdbcTemplate = new JdbcTemplate(dataSource);
            }
        }
        return jdbcTemplate;
    }
}
