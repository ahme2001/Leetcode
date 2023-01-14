public class CanPlaceFlowers605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length == 1){
            return ((flowerbed[0] == 0) && ((n == 1) || (n == 0))) || ((flowerbed[0] == 1) && (n == 0));
        }
        if ((flowerbed[0] == 0) && (flowerbed[1] == 0)) {
            n--;
            flowerbed[0] = 1;
        }
        for (int i=1;i<(flowerbed.length-1)&& n>0;i++){
            if((flowerbed[i]==0)&&(flowerbed[i-1]==0)&&(flowerbed[i+1]==0)) {
                flowerbed[i] = 1;
                n--;
            }
        }
        if (n == 0)
            return true;
        else {
            if ((flowerbed[flowerbed.length-2] == 0) && (flowerbed[flowerbed.length-1] == 0)){
                n--;
                flowerbed[flowerbed.length-1] = 1;
            }
        }
        return n == 0;
    }
}
