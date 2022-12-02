/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.Bill_DAO;
import DTO.BillDetails_DTO;
import DTO.Bill_DTO;
import java.util.ArrayList;

/**
 *
 * @author DLCH
 */
public class Bill_BUS {
    Bill_DAO dao = new Bill_DAO();
    
    public boolean insertBill(Bill_DTO bill) {
        return dao.insertBill(bill);
    }
    
    public boolean deleteBill(int id) {
        return dao.deleteBill(id);
    }
    
    public boolean insertBillDetail(BillDetails_DTO detail) {
        return dao.insertBillDetail(detail);
    }
    
    public int getLatestBillID () {
        return dao.getLatestBillID();
    }
    
    public ArrayList<Bill_DTO> list() {
        return dao.list();
    }
    
    public ArrayList<BillDetails_DTO> getDetails(int billID) {
        return dao.getDetails(billID);
    }
    
    public ArrayList<Bill_DTO> search (int key, String filter, ArrayList<Bill_DTO> list) {
        ArrayList<Bill_DTO> result = new ArrayList();
        
        if (filter.equalsIgnoreCase("Mã hóa đơn")) {
            for (Bill_DTO bill : list) {
                if (bill.getId() == key) {
                    result.add(bill);
                }
            }
        }//if filter == ma hoa don
        else if (filter.equalsIgnoreCase("Mã nhân viên")) {
            for (Bill_DTO bill : list) {
                if (bill.getStaffID() == key) {
                    result.add(bill);
                }
            }
        }
        return result;
    }//search
}
