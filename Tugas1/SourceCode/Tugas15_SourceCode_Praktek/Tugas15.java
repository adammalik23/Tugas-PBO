/* 13020200049, Adam Malik, Jum'at/23-02-2024, 22.40 */

/* Operator terner */ 
public class Tugas15 { 
 
    public static void main(String[] args) { 
    // TODO Auto-generated method stub 
    /* KAMUS */ 
     
    int i = 0; /* perhatikan int i,j=0 bukan seperti ini */ 
    int j = 0; 
     
    char c = 8; char d = 10; 
    int e = (((int)c > (int)d) ? c: d); 
    int k = ((i>j) ? i: j); 
    /* ALGORITMA */ 
     
    System.out.print ("Nilai e = "+ e); 
    System.out.print ("\nNilai k = "+ k);  
    i = 2; 
    j = 3; 
    k = ((i++>j++) ? i: j) ; 
    System.out.print ("\nNilai k = "+ k); 
      } 
    } 
    