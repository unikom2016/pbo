package tugas04;

import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

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
        DateTime date = new DateTime();
        DateTimeFormatter fmt = DateTimeFormat.forPattern("dd-MM-yyyy");

        System.out.print("Hari Pinjam \t\t: ");
        DateTime res = date.dayOfWeek().setCopy(scr.nextInt() - 1);
        System.out.print("Tanggal Pinjam \t\t: ");
        br.setDateBorrow(fmt.print(res));
        System.out.println(br.getDateBorrow());

        System.out.print("Tanggal Kembali \t: ");
        br.setDateReturn(fmt.print(date));
        System.out.println(br.getDateReturn());

        System.out.println();
        System.out.println("Nama \t\t\t\t\t\t\t: " + br.getName());
        System.out.println("ID member \t\t\t\t\t\t: " + br.getId());
        System.out.println("Tanggal Pinjam (dd-mm-yyyy) \t: " + br.getDateBorrow());
        System.out.println("Tanggal Kembali (dd-mm-yyyy) \t: " + br.getDateReturn());

        DateTime dt1 = fmt.parseDateTime(br.getDateBorrow());
        DateTime dt2 = fmt.parseDateTime(br.getDateReturn());
        Interval intv = new Interval(dt1, dt2);
        long duration = intv.toDurationMillis();
        Long diff = TimeUnit.MILLISECONDS.convert(duration, TimeUnit.MILLISECONDS);
        br.setDuration(diff.intValue());

        if (diff > 2) {
            br.setLate(br.getDuration() - 2);
            br.setPenalty(br.getLate() * 2500);
        }

        System.out.println("Lama Peminjaman \t\t\t\t: " + br.getDuration() + " Hari");
        System.out.println("Telat \t\t\t\t\t\t\t: " + br.getLate() + " Hari");
        System.out.println("Denda \t\t\t\t\t\t\t: Rp. " + br.getPenalty());
    }
}
