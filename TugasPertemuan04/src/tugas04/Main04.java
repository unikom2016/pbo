package tugas04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main04 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scr = new Scanner(System.in);
        BookRental br = new BookRental();

        System.out.println("=== SISTEM PENGEMBALIAN BARANG ===");
        System.out.print("Nama \t\t\t\t: ");
        br.setName(scr.next());

        System.out.print("ID Member \t\t\t: ");
        br.setId(scr.next());

        // Current date
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        System.out.print("Hari Pinjam \t\t: ");
        cal.set(Calendar.DAY_OF_WEEK, scr.nextInt());
        System.out.print("Tanggal Pinjam \t\t: ");
        br.setDateBorrow(sdf.format(cal.getTime()));
        System.out.println(br.getDateBorrow());

        System.out.print("Tanggal Kembali \t: ");
        br.setDateReturn(sdf.format(date));
        System.out.println(br.getDateReturn());

        System.out.println();
        System.out.println("Nama \t\t\t\t\t\t\t: "+br.getName());
        System.out.println("ID member \t\t\t\t\t\t: "+br.getId());
        System.out.println("Tanggal Pinjam (dd-mm-yyyy) \t: "+br.getDateBorrow());
        System.out.println("Tanggal Kembali (dd-mm-yyyy) \t: "+br.getDateReturn());
        Date dt1;
        Date dt2;
        try {
            dt1 = sdf.parse(br.getDateBorrow());
            dt2 = sdf.parse(br.getDateReturn());
            long duration = dt2.getTime() - dt1.getTime();
            Long diff = TimeUnit.DAYS.convert(duration, TimeUnit.MILLISECONDS);
            br.setDuration(diff.intValue());

            if (diff > 2) {
                br.setLate(br.getDuration()-2);
                br.setPenalty(br.getLate()*2500);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("Lama Peminjaman \t\t\t\t: "+br.getDuration()+" Hari");
        System.out.println("Telat \t\t\t\t\t\t\t: "+br.getLate()+" Hari");
        System.out.println("Denda \t\t\t\t\t\t\t: Rp. "+br.getPenalty());
    }
}
