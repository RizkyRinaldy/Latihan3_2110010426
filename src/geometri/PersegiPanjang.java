package geometri;

public class PersegiPanjang {
    double bil1, bil2;

    public PersegiPanjang(double bil1, double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }
    
    double setLuas(){
       return bil1 * bil2;
   }
     double setKeliling(){
       return 2*(bil1+bil2);
   }
     
     public static void main(String[] args) {
        PersegiPanjang luas = new PersegiPanjang(2,6);
        PersegiPanjang keliling = new PersegiPanjang(2,6);
        
         System.out.println("Hasil    ="+luas.setLuas());
         System.out.println("Hasil P  ="+keliling.setKeliling());
    }
}
