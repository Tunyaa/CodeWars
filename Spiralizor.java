public class Spiralizor {

    public static int[][] spiralize(int size) {
        
        int[][] spiral = new int[size][size];
        int count = size;
        int index1 = 0;
        int index2 = size -1;
        int n1,n2,n3,n4;
        n1 = n3 = 0;
        n2 = 1;
        n4 = 2;
        for (int i = 0; i < size; i++) {
            if (i%4==0) {
                for (int j = n1; j < count; j++) spiral[index1][j] = 1;
                n1 += 1;
               if(i>7)n1++;
                continue;}
            if (i%4==1) {
                for (int j = n2; j < count; j++) spiral[j][index2] = 1;
                count--;
                n2 += 2;
                continue;}
            if (i%4==2) {
                for (int j = n3; j < count; j++) spiral[index2][j] = 1;
                n3 += 2;
                continue;}
            if (i%4==3) {
                for (int j = n4; j < count; j++) spiral[j][index1] = 1;
                count--;
                index1 += 2;
                index2 -= 2;
                n4 += 2;
                continue;}
        } return spiral;
    }
}
