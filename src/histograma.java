/**
 * Created by lotalorafox on 2/8/2017.
 */
public class histograma {
    public static void main(String[] args){
        //crea el objeto de lectura
        java.util.Scanner read = new java.util.Scanner(System.in);

        //numero de histogramas
        int numH = read.nextInt();
        //leer histogramas
        for(int j = 0;j<numH;j++){
            //numero de columnas
            int c = read.nextInt();
            //crear matriz del histograma
            double[] histo = new double[c];
            fill(histo,c);
        }
    }
    static void view(double[] a,int c){
        double[] l = new double[c];
        //llenar matriz graficadora con 0
        for(int i =0;i<c;i++){
                l[i] = 0;
        }
        //System.out.println(a[1]);
        //llenar matriz graficadora con los valores
        for(int i =0;i<c;i++){
            while(a[i]>1) {
                l[i] = l[i] + 1;
                a[i] = a[i] / 10;
            }
        }
        //System.out.print(l)
        //hallar mayor
        double m = 0;
        for(int i =1;i<c;i++){
            if(l[i]>l[i-1]){
              //  System.out.print(l[i]+"<"+l[i-1]);
                 m = l[i];
            }
        }
        m++;
        //System.out.print(m);
        //imprimir
        for(int i = (int)m;i>0;i--){
            for(int j = 0;j<c;j++) {
                if (i == l[j]){
                    System.out.print("*");
                    l[j] = l[j]-1;
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void fill(double[] h,int c) {
        java.util.Scanner read = new java.util.Scanner(System.in);
        //llenar histograma
        for (int i = 0; i < c; i++) {
            //System.out.println("ingrese los datos del histograma" + (j + 1) + "en la pos. " + (i + 1));
            h[i] = read.nextDouble();
        }
        view(h, c);
    }
}
