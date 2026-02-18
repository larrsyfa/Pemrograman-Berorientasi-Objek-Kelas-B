public class LatihanCounter{
    public static void main(String[] args){

        int counter = 10;
        System.out.println("=== COUNTER ===");
        System.out.println("Nilai awal: " + counter);

        counter++;
        counter++;
        System.out.println("Setelah ++ (2x): " + counter);
        
        //1 kali
        counter--;
        System.out.println("Setelah --: " + counter);

        //Tambah 5
        counter += 5;
        System.out.println("Setelah += 5: " + counter);

        //Kurang 3
        counter -= 3;
        System.out.println("Setelah -= 3: " + counter);

        //Kali 2
        counter *= 2;
        System.out.println("Setelah *= 2: " + counter);
    }
}