package Q1;

public class Matrix {
    private int n,m ;
    private int mat[][] ;

    Matrix(int n, int m, int v) {
        this.n = n;
        this.m = m;
        mat = new int[n][m];
        for(int i = 0; i < n ;i++){
            for(int j = 0; j < m; j++){
                mat[i][j] = v;
            }
        }
        /* 
         * TODO: Complete this constructor
         * Initialize a matrix of size n x m with all elements equal to v
         */ 

    }

    Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        mat = new int[n][m];
        for(int i = 0; i < n ;i++){
            for(int j = 0; j < m; j++){
                mat[i][j] = 0;
            }
        }
        /* 
         * TODO: Complete this constructor 
         * Initialize a matrix of size n x m with all elements equal to 0
         */
    }

    static Matrix add(Matrix A, Matrix B) {
        Matrix result;
        if(A.n == B.n && A.m == B.m){
            result = new Matrix(A.n,A.m);
            for(int i = 0; i < A.n; i++){
                for(int j = 0; j<A.m; j++){
                    result.mat[i][j] = A.mat[i][j] + B.mat[i][j];
                }
                 
            }
        }
        else{
            result = new Matrix(1,1);   
        }
        return result;
        /*
         * TODO: Complete this method
         * Add two matrices and return the result
         * and return a zero matrix of size 1 x 1
         */
        
    
    }

    static Matrix matmul(Matrix A, Matrix B) {
        Matrix result;
        if(A.m==B.n){
            result = new Matrix(A.n,B.m);
            for(int i = 0; i < A.n; i++){
                for(int j = 0; j < B.m; j++){
                    for(int k = 0; k < A.m; k++){
                        result.mat[i][j]+=A.mat[i][k]*B.mat[k][j];
                    }
                }
            }
        }
        else{
            result = new Matrix(1,1); 
        }
        return result;
        /*
         * TODO: Complete this method
         * Multiply two matrices and return the result
         * and return a zero matrix of size 1 x 1
         */
         
    }

    void scalarmul(int k) {
        for(int i = 0 ;i < n ;i++){
            for(int j = 0 ;j < m ;j++){
                mat[i][j] = k * mat[i][j];
            }
        }
        /*
         * TODO: Complete this method
         * Multiply all elements of the matrix by k
         */
    }

    int getrows() {
        return n;
        /*
         * TODO: Complete this method
         * Return the number of rows in the matrix
         */
    }

    int getcols() {
        return m;
        /*
         * TODO: Complete this method
         * Return the number of columns in the matrix
         */
    }

    int getelem(int i,int j) {
        return mat[i][j];
        /*
         * TODO: Complete this method
         * Return the element at row i and column j
         * If i or j is out of bounds, return -1
         */
    }

    void setelem(int i,int j, int v) {
        mat[i][j] = v;
        /*
         * TODO: Complete this method
         * Set the element at row i and column j to v
         * If i or j is out of bounds, don't change anything
         */
    }

    void printmatrix() {
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(j!=0) System.out.print(" ");
                System.out.print(mat[i][j]);
            }
            System.out.print("\n") ;
        }
    }
}

