package problemsolving;

import java.util.HashMap;

public class LemonadeChange {
    public boolean lemonadeChangeHashMap(int[] bills) {
        if(bills[0] != 5)
            return false;
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i = 0; i < bills.length; i++){
            if(bills[i] == 5){
                hm.put("five", hm.getOrDefault("five", 0) + 5);
            }else if(bills[i] == 10){
                hm.put("five", hm.get("five") - 5);
                hm.put("ten", hm.getOrDefault("ten", 0) + 10);
            }else{
                if(hm.getOrDefault("ten", 0) > 0){
                    hm.put("ten", hm.get("ten") - 10);
                    hm.put("five", hm.get("five") - 5);
                }else{
                    hm.put("five", hm.get("five") - 15);
                }
            }
            if(hm.get("five") < 0){
                return false;
            }
        }

        return true;
    }

    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for(int i = 0; i < bills.length; i++){
            if(bills[i] == 5){
                five++;
            }else if(bills[i] == 10){
                five--;
                ten++;
            }else{
                if(five < 0)
                    return false;
                if(ten > 0){
                    ten--;
                    five--;
                }else{
                    five -= 3;
                }

            }
            if(five < 0){
                return false;
            }

        }
        return true;
    }
}
