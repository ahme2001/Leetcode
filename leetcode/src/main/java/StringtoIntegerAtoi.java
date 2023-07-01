public class StringtoIntegerAtoi {
    public int myAtoi(String s) {
        s = s.trim();
        boolean flag = false;
        boolean flagpos = false;

        StringBuilder res = new StringBuilder();
        int t;
        for(int i=0;i<s.length();i++){
            t = s.charAt(i) - 48;
            if(t >= 0 && t <= 9)
                res.append(s.charAt(i));
            else if(i == 0 && t == -3 && !flag && !flagpos)
                flag = true;
            else if(t == -5 && i == 0){
                flagpos = true;
            }else
                break;
        }
        String str = res.toString();
        long convert = 0;
        for(int i=str.length()-1,j=0;i>=0;i--,j++){
            convert += ((str.charAt(i)%48) * Math.pow(10,j));
        }
        convert = flag?-1*convert:convert;
        if(convert < -2147483648 || convert > 2147483647)
            return flag?-2147483648:2147483647;
        return (int) convert;
    }
}
