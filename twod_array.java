public class twod_array {
    public static void main(String []args){

        // spiral matrix

    int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    // int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};

    int lr=0;
    int rl=matrix[0].length-1;
    int td=0;
    int dt=matrix.length-1;

    while(lr<=rl && td<=dt ){

        for(int i=lr;i<=rl;i++){
            System.out.print(matrix[td][i]+" ");
        }
        td++;
        for(int i=td;i<=dt;i++){
            System.out.print(matrix[i][rl]+" ");

        }
        rl--;

        // only if its in vertical bounds

        if(td<=dt){
            for(int i=rl;i>=lr;i--){
                System.out.print(matrix[dt][i]+" ");
    
            }
            dt--;

        }

        // only if its in horizontal bounds

        if(lr<=rl){
            for(int i=dt;i>=td;i--){
                System.out.print(matrix[i][lr]+" ");
    
    
            }
            lr++;

        }

        

    }

}
}
