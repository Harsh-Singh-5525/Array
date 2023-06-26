package array;

public class array2d {

    public static void main(String[] args) {
        String [][]room  = new String [2][3];


        room[0][0] = "harsh";
        room[0][1] = "sushant";
        room[0][2] = "faruk";
        room[1][0] = "anant";
        room[1][1] = "sid";
        room[1][2] = "rachit";
        System.out.print("Students in Room 0,1 :\n");
for(int i=0;i< room.length;i++){
    for(int j=0;j<room[i].length;j++)
    {
        System.out.print(room [i][j]);
        System.out.print(" ");
    }
    System.out.print("\n");

}

    }
}



