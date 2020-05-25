public class ShiftAlgorithm implements AlgorithmStrategy {


    private String perform(String data,String mode,int key){
        StringBuilder sb = new StringBuilder();
        String abc = "abcdefghijklmnopqrstuvwxyz";
        String abcCapital = abc.toUpperCase();
        String result;
        if ((mode.equals("enc"))){
            for (char c : data.toCharArray()) {
                if (abc.contains(String.valueOf(c))) {
                    int index = abc.indexOf(c);
                    result = String.valueOf(abc.charAt((index+key)%26));
                    sb.append(result);
                }
                if (abcCapital.contains(String.valueOf(c))) {
                    int index = abcCapital.indexOf(c);
                    result = String.valueOf(abcCapital.charAt((index+key)%26));
                    sb.append(result);
                }
                else if (!abcCapital.contains(String.valueOf(c))&& !abc.contains(String.valueOf(c))){
                    sb.append(c);
                }
            }
            return sb.toString();
        }
        if ((mode.equals("dec"))){
            for (char c : data.toCharArray()) {
                if (abc.contains(String.valueOf(c))) {
                    int index = abc.indexOf(c);
                    if (index-key <0){
                        result = String.valueOf(abc.charAt(25+((index-key)%25)));
                        sb.append(result);
                    }
                    else {
                        result = String.valueOf(abc.charAt((index-key)%25));
                        sb.append(result);
                    }

                }
                if (abcCapital.contains(String.valueOf(c))) {
                    int index = abcCapital.indexOf(c);
                    if (index-key <0){
                        result = String.valueOf(abcCapital.charAt(25+((index-key)%25)));
                        sb.append(result);
                    }
                    else {
                        result = String.valueOf(abcCapital.charAt((index-key)%25));
                        sb.append(result);
                    }
                }
                else if (!abcCapital.contains(String.valueOf(c))&& !abc.contains(String.valueOf(c))){
                    sb.append(c);
                }
            }
            return sb.toString();
        }
        return "Wrong mode on Shift alg";
    }

    @Override
    public String encrypt(String data,String mode, int key) {
        return perform(data,mode,key);
    }

    @Override
    public String decrypt(String data,String mode, int key) {
        return perform(data,mode,key);
    }
}
