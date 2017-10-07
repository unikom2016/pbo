package tugas03;

public class Customer {

    private String id;
    private String firstName;
    private String lastName;
    private String address;
    private int phone;
    private int year;

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public int getPhone() {
        return phone;
    }

    public int getYear() {
        return year;
    }

    public void setData(String id, String firstName, String lastName, String address, int phone, int year) {
        System.out.println("Nama Depan      : " + firstName);
        System.out.println("Nama Belakang   : " + lastName);
        System.out.println("ID Anggota      : " + id);
        System.out.println("Alamat          : " + address);
        System.out.println("No Telepon      : " + phone);
        System.out.println("Tahun Masuk     : " + year);
    }
}
