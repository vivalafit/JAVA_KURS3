package Pr1;


import java.security.SecureRandom;

final public class Matrix {
    private byte M;             // number of rows
    private byte N;             // number of columns
    private byte[][] data;   // M-by-N array
    private static SecureRandom sr = new SecureRandom();
    // create M-by-N matrix of 0's
    public Matrix(byte M, byte N) {
        this.M = M;
        this.N = N;
        data = new byte[M][N];
    }

    // create matrix based on 2d array
    public Matrix(byte[][] data) {
        M = (byte)data.length;
        N = (byte)data[0].length;
        this.data = new byte[M][N];
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                this.data[i][j] = data[i][j];
    }

    // copy constructor
    private Matrix(Matrix A) { this(A.data); }

    // create and return a random M-by-N matrix with values between 0 and 1
    public static Matrix random(byte M, byte N) {
        Matrix A = new Matrix(M, N);
        byte[] rndBytes = new byte[7];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                sr.nextBytes(rndBytes);
                A.data[i][j] = rndBytes[i];
            }
        }
        return A;
    }

    // create and return the N-by-N identity matrix
    public static Matrix identity(byte N) {
        Matrix I = new Matrix(N, N);
        for (int i = 0; i < N; i++)
            I.data[i][i] = 1;
        return I;
    }

    // swap rows i and j
    private void swapRows(int i, int j) {
        byte[] temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    // swap columns i and j
    private void swapColmn(int i, int j) {
        byte temp ;
        for(byte b = 0 ; b < M;b++){
            temp = data[b][j];
            data[b][j] = data[b][i];
            data[b][i] = temp;
        }

    }

    private byte getMinElem(){
        return 0;
    }


    // print matrix to standard output
    public void show() {
        System.out.print("\t");
        for (int i = 0 ; i < M;i++){
            System.out.print("\t\t" + i);
        }
        System.out.println("\n");
        for (int i = 0; i < M; i++) {
            System.out.print(i+" | ");
            for (int j = 0; j < N; j++)
                System.out.print("\t\t" + this.data[i][j]);
            System.out.println();
        }
    }

    public byte[] getMinimumOfEveryColumn ()
    {
        byte min ;
        byte temp[] = new byte[]{Byte.MAX_VALUE,0,0};
        for ( int i = 0; i < data.length; i++ )
        {
            min = Byte.MAX_VALUE;
            for ( int j = 0; j < data [ i ].length; j++ )
                if ( data [ j ] [ i ] < min ) {
                    min = data[j][i];
                    if(min < temp[0]) {
                        temp[0] = min;
                        temp[1] = (byte) i;
                        temp[2] = (byte) j;
                    }
                }
        }
        return temp;
    }

    public void setPos(byte[] minElem,byte i, byte j) {
        swapRows(minElem[2],i);
        swapColmn(j,minElem[1]);
    }
}
