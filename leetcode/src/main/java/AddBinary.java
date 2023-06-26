public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        String remain = "0";
        int lena = a.length()-1,lenb = b.length()-1;
        while(lena >= 0 && lenb >= 0){
            if(remain.equals("0")){
                if(a.charAt(lena) == '1' && b.charAt(lenb) == '1'){
                    res.append(0);
                    remain = "1";
                }else if(a.charAt(lena)=='1' && b.charAt(lenb) == '0'){
                    res.append(1);
                }else if(a.charAt(lena)=='0' && b.charAt(lenb) == '1'){
                    res.append(1);
                }else{
                    res.append(0);
                }
            }else{
                if(a.charAt(lena) == '1' && b.charAt(lenb) == '1'){
                    res.append(1);
                    remain = "1";
                }else if(a.charAt(lena)=='1' && b.charAt(lenb) == '0'){
                    res.append(0);
                    remain = "1";
                }else if(a.charAt(lena)=='0' && b.charAt(lenb) == '1'){
                    res.append(0);
                    remain = "1";
                }else{
                    res.append(1);
                    remain = "0";
                }
            }
            lena--;lenb--;
        }
        while(lenb >= 0){
            if(b.charAt(lenb) == '1' && remain.equals("1")){
                res.append(0);
                remain = "1";
            }else if(b.charAt(lenb) == '0' && remain.equals("1")){
                res.append(1);
                remain = "0";
            }else{
                res.append(b.charAt(lenb));
            }
            lenb--;
        }
        while(lena >= 0){
            if(a.charAt(lena) == '1' && remain.equals("1")){
                res.append(0);
                remain = "1";
            }else if(a.charAt(lena) == '0' && remain.equals("1")){
                res.append(1);
                remain = "0";
            }else{
                res.append(a.charAt(lena));
            }
            lena--;
        }

        if(remain.equals("1"))
            return res.append(1).reverse().toString();
        else
            return res.reverse().toString();
    }
}
