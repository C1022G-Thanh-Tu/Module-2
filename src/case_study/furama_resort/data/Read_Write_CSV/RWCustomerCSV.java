package case_study.furama_resort.data.Read_Write_CSV;

import case_study.furama_resort.model.person.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RWCustomerCSV {

    public static final String FILES_CUSTOMER_CSV = "src\\case_study\\furama_resort\\data\\CSV_Files\\customer.csv";

    public List<Customer> readCustomerCSV() {
        List<Customer> customerList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(FILES_CUSTOMER_CSV));
            String line;
            String[] temp;
            Customer customer;
            try {
                while ((line = bufferedReader.readLine()) != null) {
                    temp = line.split(",");
                    String fullName = temp[0];
                    String dateOfBirth = temp[1];
                    String gender = temp[2];
                    String indentityCardNumber = temp[3];
                    String phoneNumber = temp[4];
                    String email = temp[5];
                    int customerId = Integer.parseInt(temp[6]);
                    String customerType = temp[7];
                    String customerAddress = temp[8];
                    customer = new Customer(fullName, dateOfBirth, gender, indentityCardNumber, phoneNumber, email, customerId,
                            customerType, customerAddress);
                    customerList.add(customer);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return customerList;
    }

    public void writeAppendCustomerCSV(List<Customer> customerList) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(FILES_CUSTOMER_CSV, true));
            for (Customer customer : customerList) {
                bufferedWriter.write(customer.getFullName() + "," + customer.getDateOfBirth() + "," + customer.getGender()
                        + "," + customer.getIndentityCardNumber() + "," + customer.getPhoneNumber() + "," + customer.getEmail()
                        + "," + customer.getCustomerId() + "," + customer.getCustomerType() + "," + customer.getCustomerAddress() + "\n");
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void writeOverrideCustomerCSV(List<Customer> customerList) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(FILES_CUSTOMER_CSV));
            for (Customer customer : customerList) {
                bufferedWriter.write(customer.getFullName() + "," + customer.getDateOfBirth() + "," + customer.getGender()
                        + "," + customer.getIndentityCardNumber() + "," + customer.getPhoneNumber() + "," + customer.getEmail()
                        + "," + customer.getCustomerId() + "," + customer.getCustomerType() + "," + customer.getCustomerAddress() + "\n");
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
