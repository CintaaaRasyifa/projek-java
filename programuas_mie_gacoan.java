import javax.swing.JOptionPane;

public class programuas_mie_gacoan {
    public static void main(String[] args) {
        String nama, meja,tm;
        int pilihan,kembalian,uang,ma,si,ur,udke,lumpu,pasgor,ckr,ms,lv16,lv18;
        int total=0; int mangkukkos=0;
        int totaltm=0;
        int mieA=0;
        char bayar,toping,selesai;

        String mangkuk[]={"SIOMAY Rp. 10.000","UDANG RAMBUTAN Rp.10.000",
        "UDANG KEJU Rp. 10.000","LUMPIA UDANG Rp. 10.0000","PANGSIT GORENG Rp. 10.000","CEKER Rp. 10.000"};

        String makan[]={"Mie ANGEL Rp. 10.000","MIE SETAN lvl 1 - 4 Rp. 10.000","MIE IBLIS lvl 1-4 Rp. 10.000"
        ,"MIE SETAN lvl 6-8  Rp. 11.000"};

        String minum[]={"Air Mineral Rp. 3.000.","ES GENDERUWO Rp.9.000"," ES TUYUL Rp.6.000",
        "ES SUNDEL BOLONG Rp.6.000","ES POCONG Rp. 9.000.","TEA TARIK Rp. 6.000."};

        JOptionPane.showMessageDialog(null, "========================================\n Selamat datang di MIE GACOAN MALANG \n========================================");
        
        nama=JOptionPane.showInputDialog("Masukkan Nama Anda:");
        meja=JOptionPane.showInputDialog("Masukkan Nomor Meja");

        do {
            String tampilan="============Makanan===========\n";
            for (int i = 0; i < makan.length; i++) {
                tampilan += String.format("%d. %s. %n", i + 1, makan[i]);
            }
            pilihan=Integer.parseInt(JOptionPane.showInputDialog(null,tampilan +
            "============Minuman===========\n"+"14. "+minum[0] + "\n15. "+minum[1]+"\n16. "+
            minum[2]+"\n17. "+minum[3]+"\n18. "+minum[4]+"\n19. "+minum[5]));
            switch (pilihan) {
                case 1:
                 int mie=Integer.parseInt(JOptionPane.showInputDialog("Memesan Mie ANGEL Berapa ?(10.000)"));
                 total += mie*10.000;
                 tm=JOptionPane.showInputDialog("Apakah ingin menambah toping?(y/t)");
                 if (tm.equalsIgnoreCase("y")){
                    do {
                    int ptm=Integer.parseInt(JOptionPane.showInputDialog("Ingin menambah toping apa?"+"\n1.  SIOMAY Rp. 10.000"+"\n2. UDANG RAMBUTAN Rp.10.000"+"\n3. UDANG KEJU Rp. 10.000"+
                    "\n4. LUMPIA UDANG Rp. 10.0000"+"\n5.PANGSIT GORENG Rp. 10.000"+"\n6. CEKER Rp. 10.000"));
                    switch (ptm) {

                        case 1:
                        int bbm=Integer.parseInt(JOptionPane.showInputDialog("Ingin menambah toping siomay berapa? (10.000)"));
                        totaltm+=bbm*10000;
                        mieA = totaltm+total;
                        JOptionPane.showMessageDialog(null,"Total: Rp. "+mieA);
                        break;

                        case 2:
                        int bkm=Integer.parseInt(JOptionPane.showInputDialog("Ingin menambah UDANG RAMBUTAN berapa? (10.000)"));
                        totaltm+=bkm*10000;
                        mieA = totaltm+total;
                        JOptionPane.showMessageDialog(null,"Total: Rp. "+mieA);
                        break;

                        case 3:
                        int smm=Integer.parseInt(JOptionPane.showInputDialog("Ingin menambah UDANG KEJU berapa? (10000)"));
                        totaltm+=smm*10000;
                        mieA = totaltm+total;
                        JOptionPane.showMessageDialog(null,"Total: Rp. "+mieA);
                        break;

                        case 4:
                       int tpm=Integer.parseInt(JOptionPane.showInputDialog("Ingin menambah LUMPIA UDANG berapa? (10.000)"));
                       totaltm+=tpm*10000;
                       mieA = totaltm+total;
                       JOptionPane.showMessageDialog(null,"Total: Rp. "+mieA);
                       break;

                       case 5:
                       int tgm=Integer.parseInt(JOptionPane.showInputDialog("Ingin menambah PANGSIT GORENG  berapa? (10.000)"));
                       totaltm+=tgm*10000;
                       mieA = totaltm+total;
                       JOptionPane.showMessageDialog(null,"Total: Rp. "+mieA);
                       break;

                       case 6:
                       int ggm=Integer.parseInt(JOptionPane.showInputDialog("Ingin menambah CEKER berapa? (10.000)"));
                       totaltm+=ggm*10.000;
                       mieA = totaltm+total;
                       JOptionPane.showMessageDialog(null,"Total: Rp. "+mieA);
                       break;

                    }toping=JOptionPane.showInputDialog("Ingin menambah toping lagi?").charAt(0);
                }while (toping == 'y');
                mieA = totaltm+total;
            }else {
                JOptionPane.showMessageDialog(null,"Anda tidak memilih toping");
            }
             break;
            }
            selesai=JOptionPane.showInputDialog("Ingin memilih lagi?(y/n)").charAt(0);
       }while (selesai != 'y');
       
   bayar=JOptionPane.showInputDialog("Membayar (y)\nMemilih lagi(n)").charAt(0);
while (bayar != 'y');
   uang=Integer.parseInt(JOptionPane.showInputDialog("Total pembayaran(Masukkan jumlah uang yang ingin dibayarkan): Rp. "+mieA));
   kembalian=uang-mieA;
   JOptionPane.showMessageDialog(null, "========================================\nNama: "+nama+
   "\nMeja nomor: "+meja+"\nTotal: Rp. "+mieA+"\nUang anda: Rp. "+uang+"\nKembalian: Rp. "+kembalian+
   "\n========================================");


        }
    }