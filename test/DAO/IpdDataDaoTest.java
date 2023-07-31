/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import DAO.IpdDataDao;
import View.IpdDataView;
import org.junit.Assert;
import org.junit.Test;

public class IpdDataDaoTest {

    @Test
    public void test() {
        IpdDataDao iDataDao = new IpdDataDao();
        IpdDataView iDataView = new IpdDataView();
        
        try {
            Assert.assertTrue(iDataDao.viewAll(iDataView)); 
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
