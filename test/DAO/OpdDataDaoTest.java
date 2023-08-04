/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import DAO.OpdDataDao;
import View.OpdDataView;
import org.junit.Assert;
import org.junit.Test;

public class OpdDataDaoTest {
   
    @Test
    public void test() {
        OpdDataDao oDataDao = new OpdDataDao();
        OpdDataView oDataView = new OpdDataView();
        
        try {
            Assert.assertTrue(oDataDao.viewAll(oDataView)); 
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
