public class TriFun {
    int triangle(int currentRow){
        if(currentRow == 1)return 1;
        else return (triangle(currentRow - 1))+currentRow;
    }
}
