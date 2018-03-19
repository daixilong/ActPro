package demo.helloworld;

import org.beetl.sql.core.*;
import org.beetl.sql.core.db.*;
import org.beetl.sql.ext.*;
/**
 * Created by a on 2018/3/19.
 */
public class CodeGen {
    public static void main(String[] args) throws Exception {
        final String driver="com.mysql.jdbc.Driver";
        final String url="jdbc:mysql://localhost:3306/act_test?useUnicode=true&characterEncoding=UTF-8&serverTimezone=GMT%2B8&useSSL=false";
        final String userName="root";
        final String pass="daixilong";
        ConnectionSource cs= ConnectionSourceHelper.getSimple(driver,url,userName,pass);
        UnderlinedNameConversion um=new UnderlinedNameConversion();
        SQLLoader sqlLoader=new ClasspathLoader("/sql");
        DBStyle dbStyle=new MySqlStyle();
        SQLManager sqlManager=new SQLManager(dbStyle, sqlLoader,cs,um,new Interceptor[]{new DebugInterceptor()});
        sqlManager.genPojoCode("User","demo.helloworld.model");
        sqlManager.genSQLFile("User");
    }
}
