public class JawabanNoTiga {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("KFC (KAMIR FROM CINDE) TOUR");
        System.out.println(" DAFTAR JENIS BUS :");

        String[] InfoBus = new String[]{"01-TopLevel", "02-MiddleLevel", "03-RegularStaff", "04-Staff"};
        for (int i = 0; i < InfoBus.length; i++) {
            System.out.println(InfoBus[i]);
        }
        System.out.println("==================================================================");
        inputKaryawan();
    }
    public static void inputKaryawan(){
        System.out.println("Kelompokan bus :");
        String[] daftarNIK = {"C012020101","J022020201","C012020103","J022020102","N032020104","P042020105"};

        int busTopLevel = 0;
        int busMiddleLevel = 0;
        int busRegularStaff = 0;
        int busStaff = 0;

        for(int i=0;i< daftarNIK.length;i++) {
            String NIK = daftarNIK[i];
            char codeNIK = daftarNIK[i].charAt(0);

            pilihBus(NIK, codeNIK);
            if (codeNIK == 'C') {
                busTopLevel++;
            } else if (codeNIK == 'J') {
                busMiddleLevel++;
            } else if (codeNIK == 'N') {
                busRegularStaff++;
            } else if (codeNIK == 'P') {
                busStaff++;
            }
        }
        System.out.println("Jumlah : ");
        System.out.println("|| Bus Top Level = " +busTopLevel+ " || Bus Middle Level = " +busMiddleLevel+ " || Bus Regular Staff = " + busRegularStaff+ " || Bus Staff = " +busStaff + " ||");
    }

    public static void pilihBus(String NIK, char codeNik) {
        switch(codeNik) {
            case 'C' :
                System.out.println("Karyawan " + NIK + " masuk ke Bus 01-TopLevel");
                break;
            case 'J' :
                System.out.println("Karyawan " + NIK + " masuk ke Bus 02-MiddleLevel");
                break;
            case 'N' :
                System.out.println("Karyawan " + NIK + " masuk ke Bus 03-RegularStaff");
                break;
            case 'P' :
                System.out.println("Karyawan " + NIK + " masuk ke Bus 04-Staff");
                break;
            default:
                System.out.println("NIK " + NIK + " tidak valid ");


        }

        }
        }

    }
}




