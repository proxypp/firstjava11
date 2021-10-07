package co.micol.dbprj;

import co.micol.dbprj.db.DataService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     //   DataSource dao = new DataSource();
    	DataService dao = new DataService(); 
    	dao.selectList();
    }
}
