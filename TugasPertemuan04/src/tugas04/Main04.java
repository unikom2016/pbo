package tugas04;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main04 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scr = new Scanner(System.in);
        BookRental br = new BookRental();

        System.out.print("Nama \t\t\t\t: ");
        br.setName(scr.next());

        System.out.print("ID Member \t\t\t: ");
        br.setId(scr.next());

        System.out.print("Tanggal Pinjam \t\t: ");
        System.out.println();

        Date dateBorrow = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        br.setDateBorrow(sdf.format(dateBorrow));

        System.out.print("Tanggal Kembali \t: ");

        // Current date
        Date dateReturn = new Date();
        br.setDateReturn(sdf.format(dateReturn));

        System.out.println(br.getDateReturn());

//        System.out.println("Nama                        :"+nama);
//        System.out.println("ID member                   :"+id);
//        System.out.println("Tanggal Pinjam (dd-mm-yyyy) :"+day+"-"+month+"-"+year);
//        System.out.println("Tanggal Kembali (dd-mm-yyyy):"+rturnday+"-"+rturnmonth+"-"+rturnyear);
//
////        int a = ch.hitungcharge(rturnday, day);
////        int d = ch.hitungdendahari(rturnday, day);
//        int a = 0;
//        int d = 0;
//        int b = rturnmonth-month;
//        int c = rturnyear-month;
//        int e = rturnday-(day+1);
//
//        //hitung denda jika peminjaman lebih dari 2 hari
//        if((a<=2) && (b==0) && (c<=0))
//        //jika tepat waktu
//        {
//            System.out.println("Telat                       : Tepat Waktu");
//            System.out.println("Denda                       : 0");
//        }
//        else if((a>=3) && (b==0))
//        //jika lebih dari 2 hari
//        {
//            int charge=2500*d;
//            System.out.println("Telat   : "+e+" hari");
//            System.out.println("Denda   : Rp."+charge);
//        }
//        else
//        {
//            System.out.println("Data yang dimasukkan harus nomor");
//        }
//        System.out.println("--------------------------------------");
    }
}
