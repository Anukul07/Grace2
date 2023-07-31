/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.IPDModel;
import DAO.IpdDao;
import org.junit.Assert;
import org.junit.Test;

public class IpdDaoTest {
    
    @Test
    public void test() {
        IPDModel model = new IPDModel("1023","Charlie","29","B-","Internal Medicine","1027");
        IpdDao ipdDao = new IpdDao();
        
        try {
            Assert.assertTrue(ipdDao.insert(model));
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
